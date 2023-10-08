

import { KnowledgeFromFunction } from "./generated/ast";
import { KnowledgeNodeDescriptor } from "./validation/utility/KnowledgeNodeDescriptor";
import { List } from "./validation/utility/list";

export class KnowledgeClass {
    private _globalKnowledge: Array<List>;
    private _principalAssociationKnowledge: Array<Array<List>>;
    private _listNodePointerKnowledge: Map<string, number[]>;
    public printList: Array<List>;
    // used to track which function invocations have a correct number of parameters
    private _functionCardinalityMap: Map<KnowledgeFromFunction, boolean>;
    private _globalKnowledgeDescriptorMap: Map<string, KnowledgeNodeDescriptor>; 
    constructor() {
      this._globalKnowledge = new Array<List>;
      this.printList = new Array<List>;
      this._principalAssociationKnowledge = new Array<Array<List>>;
      this._listNodePointerKnowledge = new Map<string, number[]>();
      this._functionCardinalityMap = new Map<KnowledgeFromFunction, boolean>();
      this._globalKnowledgeDescriptorMap = new Map<string, KnowledgeNodeDescriptor>();
    }

    public getPrincipalsAssociationKnowledge() {
      return this._principalAssociationKnowledge
    }

    public getGlobalKnowledgeDescriptorMap() {
      return this._globalKnowledgeDescriptorMap
    }

    public getListNodePointerKnowledge() {
      return this._listNodePointerKnowledge;
    }
  
    // Getter and setter for globalKnowledge
    public getGlobalKnowledge() {
      return this._globalKnowledge;
    }

    public getKnowledgebyIndex(first: number, second: number) {
      return this._globalKnowledge[first]?.get(second)
    }
  
    /**
     * 
     * @param name: knowledge name
     * @param namesList: List of principals that know name
     */
    public addNewGlobalKnowledge(name: string, namesList: List, type: string) {
      let newList = new List()
      newList.add(name)
      const newLen = this._globalKnowledge.push(newList)
	    let tempArr = [namesList]
	    this._principalAssociationKnowledge.push(tempArr)
      this._listNodePointerKnowledge.set(name,[])
      this._globalKnowledgeDescriptorMap.set(name, new KnowledgeNodeDescriptor(newLen - 1, 0, type))

    }

    public addAliasGlobalKnowledge(alias: string, root: string, namesList: List, type: string) {
      // alias e nome parametro
      for (let i = 0; i < this._globalKnowledge.length; i++) {
        let currentList = this._globalKnowledge[i]
		    let currentPrincipalList = this._principalAssociationKnowledge[i]
        if (currentList) {
          /* let first= new List
          first.add(currentList.get(currentList.size() - 1))
          first.add(root)
          this.printList.push(first) */
          for (let k = 0; k < currentList.size(); k++) {
            if (currentList.get(k) === root) {
              const secondIndex = currentList.add(alias)
			        //currentPrincipalList![k]!.append(namesList)
			        currentPrincipalList!.push(namesList)
              this._globalKnowledgeDescriptorMap.set(alias, new KnowledgeNodeDescriptor(i, secondIndex - 1, type))
              return i
            }
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

	/***
	 * @param alias: alias of root
	 * @param root: first element of the list or alias of the first
	 * @param namesList: list of principals that know alias
	 */
    public cloneNodePoiter(alias: string, root: string, namesList: List){
      //let type = this._globalKnowledgeDescriptorMap.get(root)?.getType()
      for (let j = 0; j < this._globalKnowledge.length; j++) {
        let subList = this._globalKnowledge[j]
			if (subList) {
        /* if (subList.get(subList.size() - 2) === root) {
          root = subList.get(0)
				} */
				for (let k = 0; k < subList.size(); k++) {
          if (subList.get(k) === root) {
            root = subList.get(0)
					}	
				}
			}
		}
		//accept('info', `root: ${root}`, { node: protocol })
		if(this._listNodePointerKnowledge.has(root)){
      let tempPointer=this._listNodePointerKnowledge.get(root)!
			for (let i = 0; i < tempPointer.length; i++) {
        let currentList = this._globalKnowledge[tempPointer[i]!]!
      let actualName = alias.concat("[" + i + "]")
			let secondIndex = currentList.add(actualName)
			let currentPrincipalList = this._principalAssociationKnowledge[tempPointer[i]!]!
			currentPrincipalList.push(namesList)
      let firstIndex = tempPointer[i]
      let type = this._globalKnowledgeDescriptorMap.get(currentList.get(currentList.size() - 2))?.getType()
      this._globalKnowledgeDescriptorMap.set(actualName, new KnowledgeNodeDescriptor(firstIndex!, secondIndex, type!))
			}
		}
    }

    public printGlobalKnowledge() {
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

	public printPrincipals() {
		let temp: string[] = new Array<string>


      for(let i = 0; i < this._principalAssociationKnowledge.length; i++) {
        
		let principalList = this._principalAssociationKnowledge[i]

        let temp2: string[] = []
        
		if (principalList !== undefined) {
          for (let j = 0; j < principalList.length; j++) {
			let innerPrincipalList = principalList[j]
			let temp3: string[] = []
			for (let k = 0; k < innerPrincipalList?.size()!; k++) {
				temp3 = [...temp3, innerPrincipalList?.get(k)!]
			}
            temp2 = [...temp2, "[" + temp3.toString() + "]"]
          }
          temp = [...temp, "[" + temp2.toString() + "]"]
        }
      }
      return temp.toString().concat("\n")
	}

  public flushKnowledge() {
    this._globalKnowledge = new Array<List>;
    this._principalAssociationKnowledge = new Array<Array<List>>;
    this._listNodePointerKnowledge = new Map<string, number[]>();
    this._globalKnowledgeDescriptorMap = new Map<string, KnowledgeNodeDescriptor>();
  }

  public flushCardinality(){
    this._functionCardinalityMap = new Map<KnowledgeFromFunction, boolean>();
  }

	/***
	 * @param paramName: first (and only) param of decryption function
	 * @param aliasName: name on the left of the assignment
	 * @param namesList: list of principals that know aliasName
	 */
	public insertAliasDecrypt(paramName: string, aliasName: string, namesList: List) {
		let index = -1
		for (let i = 0; i < this._globalKnowledge.length; i++) {
			let currentList = this._globalKnowledge[i]
			if (currentList) {
				for (let k = 0; k < currentList.size(); k++) {
					if (currentList.get(k) === paramName) {
						index = i
					}
				}
			} 
		}
		let firstValue = this._globalKnowledge[index]?.get(0)
		//accept('info', `firstValue: ${firstValue}`, { node: protocol })
		if (firstValue) {
			let currentPointerList = this._listNodePointerKnowledge.get(firstValue)
			//accept('info', `currentPointerList.length: ${currentPointerList?.length}`, { node: protocol })
			if (currentPointerList!.length > 0) {
				for (let j = 0; j < currentPointerList?.length!; j++) {
					let pointer = currentPointerList![j]
					this._globalKnowledge[pointer!]?.add(aliasName.concat("[" + j + "]"))
					this._principalAssociationKnowledge[pointer!]?.push(namesList)
				}
			} 
		}
	}

  /**
   * 
   * @param name: communication payload
   */
  public addPrincipalToKnowledge(name: string, recipients: List) {
    let found = false;
    for(let i = 0; i < this._globalKnowledge.length && !found; i++) {
      let innerList = this._globalKnowledge[i]
      for (let j = 0; j < innerList?.size()! && !found; j++) {
        if (innerList?.get(j) === name) {
          found = true
          this._principalAssociationKnowledge[i]![j]?.append(recipients)
        }
      } 
    }

  }

  public getFunctionCardinalityMap() {
    return this._functionCardinalityMap
  }

  public setFunctionCardinalityMap(map: Map<KnowledgeFromFunction, boolean>) {
    this._functionCardinalityMap = map;
  }


  public printIndexMap() {
    let tempArray = []
    for (let key of this._globalKnowledgeDescriptorMap.keys()) {
      tempArray.push("[" + key.concat(this._globalKnowledgeDescriptorMap.get(key)?.toString()!) + "]")
    }
    return tempArray
  }
}  