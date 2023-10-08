export class List {
    private items: Array<string>;
  
    constructor() {
        this.items = [];
    }
  
    size(): number {
        return this.items.length;
    }
  
    add(value: string): number {
        return this.items.push(value)
    }
  
    get(index: number): string {
        return this.items[index] as string;
    }
  
    append(list: List) {
      for (let i = 0; i < list.size(); i++) {
          this.items.push(list.get(i))
      }
    }

    contains(name: string) {
        let found = false
        for (let i = 0; i < this.size(); i++) {
            if (this.get(i) === name) {
                found = true
            }            
        }
        return found
    }
    
    toString() {
        return this.items.toString()
    }
  }