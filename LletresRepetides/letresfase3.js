// Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
var nameChars = ['k', 'e', 'v', 'v', 'i', 'n', 'n'];
var nameCharsMap = new Map();
for (i = 0; i < nameChars.length; i++) {
    if (!nameCharsMap.has(nameChars[i])) {
        var letterCount = 1;
        nameCharsMap.set(nameChars[i], letterCount);
        console.log(nameCharsMap);
    } else {
        letterCount = nameCharsMap.get(nameChars[i], letterCount)
        nameCharsMap.set(nameChars[i], letterCount + 1);
    }
}

for ([key, value] of nameCharsMap.entries()) {
    console.log(`${key}: ${value}`);
}

