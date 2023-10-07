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
    /* public includes(name: T): boolean {
      return this.items.includes(name)
    } */
  }