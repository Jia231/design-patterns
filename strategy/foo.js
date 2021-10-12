import Strategy from "./Strategy.mjs";

const str = new Strategy();

str.setStrategy('paypal');

console.log(str.payNow());
