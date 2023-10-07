
export class KnowledgeNodeDescriptor {
    private firstIndex: number;
    private secondIndex: number;
    private type: string;
    
    constructor(first: number, second: number, type: string) {
      this.firstIndex = first;
      this.secondIndex = second;
      this.type = type; 
    }

    public getIndexes(): number[] {
        return [this.firstIndex, this.secondIndex]
    }
    public getType() {
        return this.type
    }

    public toString() {
        return `{ firstIndex: ${this.firstIndex}, secondIndex: ${this.secondIndex}, type: ${this.type} }`
    }

    public getFirstIndex() {
        return this.firstIndex
    }
}