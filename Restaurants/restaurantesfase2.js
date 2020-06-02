var banknote5 = 5;
var banknote10 = 10;
var banknote20 = 20;
var banknote50 = 50;
var banknote100 = 100;
var banknote200 = 200;
var banknote500 = 500;
var totalMeal;

meals = [];
mealPrices = []
orders = []

for (i = 0; i < 5; i++) {
    meals[i] = prompt("Insert a meal please");
}
for (i = 0; i < meals.length; i++) {
    mealPrices[i] = prompt("Insert a price meal " + (i + 1) + " please.")
}
console.log("This is the menu of the day:");
for (i = 0; i < meals.length; i++) {
    console.log((meals[i] + " €" + mealPrices[i]))
}


orderCounter = 0;
answer = 1;

while (answer == 1) {
    orders.push(prompt("What do you want to eat?"));
    answer = parseInt(prompt("Do you want to continue? for YES type: 1 /for NO type: 0"))
    orderCounter++
}
console.log("You ordred " + orderCounter + " plates:")
orders.forEach(order => {
    console.log(order)
});
