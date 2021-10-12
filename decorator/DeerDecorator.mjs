class DeerDecorator {
    constructor(zoo) {
        this._zoo = zoo;
    }

    addAnimal() {
        this._zoo.addAnimals('deer');
    }
}

export default DeerDecorator;
