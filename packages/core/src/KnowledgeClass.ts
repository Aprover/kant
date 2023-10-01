import { ValidationAcceptor } from "langium";
import { Protocol } from "./generated/ast";

class List {
  private items: Array<string>;

  constructor() {
      this.items = [];
  }

  size(): number {
      return this.items.length;
  }

  add(value: string): void {
      this.items.push(value);
  }

  get(index: number): string {
      return this.items[index] as string;
  }
  /* public includes(name: T): boolean {
    return this.items.includes(name)
  } */
}

export class KnowledgeClass {
    public _globalKnowledge: Array<List>;
    //private _principalAssociationKnowledge: Array<List<string>>;
    private _listNodePointerKnowledge: Map<string, number[]>;
    public printList: Array<List>;
    constructor() {
      this._globalKnowledge = new Array<List>;
      this.printList = new Array<List>;
      //this._principalAssociationKnowledge = new Array<List<string>>;
      this._listNodePointerKnowledge = new Map<string, number[]>();
    }
  
    // Getter and setter for globalKnowledge
    public getGlobalKnowledge() {
      return this._globalKnowledge;
    }
  
    public addNewGlobalKnowledge(name: string) {
      let newList = new List()
      newList.add(name)
      this._globalKnowledge.push(newList)
      this._listNodePointerKnowledge.set(name,[])
    }

    public addAliasGlobalKnowledge(alias: string, root: string) {
      // alias e nome parametro
      for (let i = 0; i < this._globalKnowledge.length; i++) {
        let currentList = this._globalKnowledge[i]
        if (currentList) {
          /* let first= new List
          first.add(currentList.get(currentList.size() - 1))
          first.add(root)
          this.printList.push(first) */
          if (currentList.get(currentList.size() - 1) === root) {
            currentList.add(alias)
			return i
            
		}
          
        }
      }
	  return -1
    }

    public addNodePointer(name: string, index: number){
      if(this._listNodePointerKnowledge.has(name)){
        let pointerList: number[] = []
        pointerList=this._listNodePointerKnowledge.get(name)!
        pointerList.push(index)
        this._listNodePointerKnowledge.set(name,pointerList)
      }
      
    }


    public cloneNodePoiter(alias: string, root: string, protocol: Protocol, accept: ValidationAcceptor){
		for (let j = 0; j < this._globalKnowledge.length; j++) {
			let subList = this._globalKnowledge[j]
			if (subList) {
				if (subList.get(subList.size() - 2) === root) {
					root = subList.get(0)
				}
			}
		}
		accept('info', `root: ${root}`, { node: protocol })
		if(this._listNodePointerKnowledge.has(root)){
			let tempPointer=this._listNodePointerKnowledge.get(root)!
			for (let i = 0; i < tempPointer.length; i++) {
			let currentList = this._globalKnowledge[tempPointer[i]!]!
			currentList.add(alias.concat("[" + i + "]"))
			}
		}
    }

    public print() {
      let temp: string[] = new Array<string>
      for(let i = 0; i < this._globalKnowledge.length; i++) {
        let knowledgeList = this._globalKnowledge[i]
        let temp2: string[] = []
        if (knowledgeList !== undefined) {
          for (let j = 0; j < knowledgeList.size(); j++) {
            temp2 = [...temp2, knowledgeList.get(j)]
          }
          temp = [...temp, "[" + temp2.toString() + "]"]
        }
      }
      return temp.toString().concat("\n")
    }

    public printc(current:Array<List>) {
      let temp: string[] = new Array<string>
      for(let i = 0; i < current.length; i++) {
        let knowledgeList = current[i]
        let temp2: string[] = []
        if (knowledgeList !== undefined) {
          for (let j = 0; j < knowledgeList.size(); j++) {
            temp2 = [...temp2, knowledgeList.get(j)]
          }
          temp = [...temp, "[" + temp2.toString() + "]"]
        }
      }
      return temp.toString().concat("\n")
    }

    public emptyAll() {
      this._globalKnowledge = new Array<List>;
      //this._principalAssociationKnowledge = new Array<List<string>>;
      this._listNodePointerKnowledge = new Map<string, number[]>();
    }

	public insertAliasDecrypt(paramName: string, aliasName: string, protocol: Protocol, accept: ValidationAcceptor) {
		let index = -1
		for (let i = 0; i < this._globalKnowledge.length; i++) {
			let currentList = this._globalKnowledge[i]
			if (currentList) {
				if (currentList.get(currentList.size() - 1) === paramName) {
					index = i
				}
			} 
		}
		let firstValue = this._globalKnowledge[index]?.get(0)
		accept('info', `firstValue: ${firstValue}`, { node: protocol })
		if (firstValue) {
			let currentPointerList = this._listNodePointerKnowledge.get(firstValue)
			//accept('info', `currentPointerList.length: ${currentPointerList?.length}`, { node: protocol })
			if (currentPointerList!.length > 0) {
				for (let j = 0; j < currentPointerList?.length!; j++) {
					let pointer = currentPointerList![j]
					this._globalKnowledge[pointer!]?.add(aliasName.concat("[" + j + "]"))
				}
			} 
		}
	}
  }
  