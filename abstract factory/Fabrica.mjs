import LexusFabrica from "./LexusFabrica.mjs";
import NissanFabrica from "./NissanFabrica.mjs"

class Fabrica {
    constructor(fabrica) {
        if(fabrica == "lexus") {
            this._fabrica = new LexusFabrica();
        }
        else if(fabrica == "nissan") {
            this._fabrica = new NissanFabrica();
        }
    }

    fabricarCoche() {
        this._fabrica.fabricar();
    }
}

export default Fabrica;
