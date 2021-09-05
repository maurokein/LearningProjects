const math = require('./math.js');
const greeting = require('./greeting.js');

console.log(math);

console.log(math.divide(1,0));
console.log(math.multiply(2,3));
console.log(math.substract(4,8));

console.log(greeting.specializedGreeting("Mauro"));
console.log(greeting.generalGreeting());