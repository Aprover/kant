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
    private _principalKnowledge: Array<List<string>>;
    private _listKnowledge: Map<string, number[]>;
  
    constructor() {
      this._globalKnowledge = new Array<List<string>>;
      this._principalKnowledge = new Array<List<string>>;
      this._listKnowledge = new Map<string, number[]>();
    }
  
    // Getter and setter for globalKnowledge
    public getGlobalKnowledge() {
      return this._globalKnowledge;
    }
  
    public addNewGlobalKnowledge(name: string) {
      let newList = new List<string>()
      newList.add(name)
      this._globalKnowledge.push(newList)
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




  
    // Getter and setter for principalKnowledge
    get principalKnowledge() {
      return this._principalKnowledge;
    }
  
    set principalKnowledge(value: Array<List<string>>) {
      this._principalKnowledge = value;
    }
  
    // Getter and setter for listKnowledge
    get listKnowledge() {
      return this._listKnowledge;
    }
  
    set listKnowledge(value: Map<string, number[]>) {
      this._listKnowledge = value;
    }
  }
  