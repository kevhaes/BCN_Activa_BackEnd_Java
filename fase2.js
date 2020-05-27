var refYear = 1948
var leapYear = []
var myBirthday = parseInt(prompt("your birth year?"))

for (i = refYear + 1; i <= myBirthday; i++)
    if ((i - refYear) % 4 == 0) {
        leapYear.push(i)
    }
alert("there are " + leapYear.length + " between " + refYear + " and now: \n" + leapYear)



