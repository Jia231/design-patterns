import Zoo from "./Zoo.mjs";
import BearDecorator from './BearDecorator.mjs';
import DeerDecorator from "./DeerDecorator.mjs";

const sb = new Zoo('Simon Bolivar');
const sbb = new BearDecorator(sb);
sbb.addAnimal();
const sbd = new DeerDecorator(sb);
sbd.addAnimal();

console.log(sb.welcome());



