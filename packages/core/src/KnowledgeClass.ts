

export class List {
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

  append(list: List) {
	for (let i = 0; i < list.size(); i++) {
		this.items.push(list.get(i))
	}
  }
  /* public includes(name: T): boolean {
    return this.items.includes(name)
  } */
}

export class KnowledgeClass {
    public _globalKnowledge: Array<List>;
    private _principalAssociationKnowledge: Array<Array<List>>;
    private _listNodePointerKnowledge: Map<string, number[]>;
    public printList: Array<List>;
    constructor() {
      this._globalKnowledge = new Array<List>;
      this.printList = new Array<List>;
      this._principalAssociationKnowledge = new Array<Array<List>>;
      this._listNodePointerKnowledge = new Map<string, number[]>();
    }
  
    // Getter and setter for globalKnowledge
    public getGlobalKnowledge() {
      return this._globalKnowledge;
    }
  
    public addNewGlobalKnowledge(name: string, namesList: List) {
      let newList = new List()
      newList.add(name)
      this._globalKnowledge.push(newList)
	  let tempArr = [namesList]
	  this._principalAssociationKnowledge.push(tempArr)
      this._listNodePointerKnowledge.set(name,[])
    }

    public addAliasGlobalKnowledge(alias: string, root: string, namesList: List) {
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
              currentList.add(alias)
			  //currentPrincipalList![k]!.append(namesList)
			  currentPrincipalList!.push(namesList)
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
			currentList.add(alias.concat("[" + i + "]"))
			let currentPrincipalList = this._principalAssociationKnowledge[tempPointer[i]!]!
			currentPrincipalList.push(namesList)
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

    public emptyAll() {
      this._globalKnowledge = new Array<List>;
      this._principalAssociationKnowledge = new Array<Array<List>>;
      this._listNodePointerKnowledge = new Map<string, number[]>();
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
}  