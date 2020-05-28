
var name = prompt("what is your name please?");
var sirName1 = prompt("what is your first sirname please?");
var sirName2 = prompt("what is your second sirname please?");

var day = parseInt(prompt("what birth day?"));
var month = parseInt(prompt("what birth month?"));
var year = parseInt(prompt("what birth year?"));

var fullName = name + " " + sirName1 + "-" + sirName2;
var fullBirthday = day + "/" + month + "/" + year;

if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
    console.log(
        "hello " + fullName + " ,your birthday is: \n" + fullBirthday + " and this is a leap year ");
} else {
    console.log(
        "hello " + fullName + " ,your birthday is: \n" + fullBirthday + " and this is not a leap year ");
}
