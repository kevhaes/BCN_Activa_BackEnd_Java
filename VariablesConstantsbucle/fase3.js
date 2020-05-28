var refYear = 1948;
var myYear = 1978;
var isLeap = false;

for (i = refYear; i <= myYear; i++) {
    if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))) {
        isLeap = true;
    } else {
        isLeap = false;
    }

    if (isLeap) {
        console.log(i + " is a leap year");
    } else {
        console.log(i + " is a normal year");
    }
}
