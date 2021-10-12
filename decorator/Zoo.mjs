class Zoo {
    constructor(name) {
        this._name =  name;
        this._animals =[];
    }

    welcome() {
        return `Welcome to ${this._name}! We got ${this._animals}`
    }

    addAnimals(animal) {
        this._animals.push(animal);
    }
}

export default Zoo;
