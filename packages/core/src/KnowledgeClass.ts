class List<T> {
  private items: Array<T>;

  constructor() {
      this.items = [];
  }

  size(): number {
      return this.items.length;
  }

  add(value: T): void {
      this.items.push(value);
  }

  get(index: number): T {
      return this.items[index] as T;
  }

  /* public includes(name: T): boolean {
    return this.items.includes(name)
  } */
}

export class KnowledgeClass {
    private _globalKnowledge: Array<List<string>>;
    private _principalAssociationKnowledge: Array<List<string>>;
    private _listNodePointerKnowledge: Map<string, number[]>;
  
    constructor() {
      this._globalKnowledge = new Array<List<string>>;
      this._principalAssociationKnowledge = new Array<List<string>>;
      this._listNodePointerKnowledge = new Map<string, number[]>();
    }
  
    // Getter and setter for globalKnowledge
    public getGlobalKnowledge() {
      return this._globalKnowledge;
    }
  
    public addNewGlobalKnowledge(name: string) {
      let newList = new List<string>()
      newList.add(name)
      this._globalKnowledge.push(newList)
      this._listNodePointerKnowledge.set(name,[])
    }

    public addAliasGlobalKnowledge(alias: string, root: string) {
      // alias e nome parametro
      for (let i = 0; i < this._globalKnowledge.length; i++) {
        let currentList = this._globalKnowledge[i]
        if (currentList) {
          if (currentList.get(currentList.size() - 1) === root) {
            currentList.add(alias)
          }
          return i
        }
      }
    }

    public addNodePointer(name: string, index: number){
      if(this._listNodePointerKnowledge.has(name)){
        let pointerList=new Array<number>
        pointerList=this._listNodePointerKnowledge.get(name)!
        pointerList.push(index)
        this._listNodePointerKnowledge.set(name,pointerList)
      }
      
    }

    public cloneNodePoiter(name: string){
      if(this._listNodePointerKnowledge.has(name)){
        let tempPointer=this._listNodePointerKnowledge.get(name)!
        for (let i = 0; i < tempPointer.length; i++) {
          let currentList = this._globalKnowledge[tempPointer[i]!]!
          currentList.add(name.concat("[" + i + "]"))
        }
      }
    }
    
  }
  