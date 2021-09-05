const Greeting = {};

function specializedGreeting(name) {
    console.log("Hello " + name + "!");
}

function generalGreeting() {
    console.log("Hello Everyone!");
}

Greeting.specializedGreeting = specializedGreeting;
Greeting.generalGreeting = generalGreeting;

module.exports = Greeting;