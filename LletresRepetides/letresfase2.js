var nameChars = ['k', 'e', 'v', 'i', 'n', 3];
for (i = 0; i < nameChars.length; i++) {
    if ((i == 'e') | (nameChars[i] == 'i') | (nameChars[i] == 'u') | (nameChars[i] == 'o') | (nameChars[i] == 'a')) {
        console.log(nameChars[i] + " is a vowel");
    }
    else if (nameChars[i] == ' ') {
        console.log("here is a space");
    } else {
        console.log(nameChars[i] + " is a consonant");
    }
}
for (i = 0; i < nameChars.length; i++) {

    if (typeof (nameChars[i]) === 'number') {
        console.log("Your name contains a number")
    }
}

