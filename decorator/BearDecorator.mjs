class BearDecorator {
    constructor(zoo) {
        this._zoo = zoo;
    }

    addAnimal() {
        this._zoo.addAnimals('bear');
    }
}

export default BearDecorator;
