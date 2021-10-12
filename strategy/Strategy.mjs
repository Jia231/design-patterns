import PayPal from "./PayPal.mjs";
import Card from "./Card.mjs";
class Strategy {
    constructor() {
        this._str = null;
    }
    setStrategy(paymentType) {
        if(paymentType=='card') {
            this._str = new Card();
        }
        else if(paymentType=='paypal') {
            this._str = new PayPal();
        }
    }

    payNow() {
        return this._str.pay();
    }
}

export default Strategy;
