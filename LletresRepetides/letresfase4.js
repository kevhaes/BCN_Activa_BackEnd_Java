
sirname = prompt("please input Sirname");
firstName = prompt("please input First name");
fullname = []
position = 0;

for (i = 0; i < sirname.length; i++) {
    fullname.push(sirname[i])
}
fullname.push(' ')
for (i = 0; i < firstName.length; i++) {
    fullname.push(firstName[i])
}

console.log(fullname)