var city01 = prompt("Insert city1")
var city02 = prompt("Insert city2")
var city03 = prompt("Insert city3")
var city04 = prompt("Insert city4")
var city05 = prompt("Insert city5")
var city06 = prompt("Insert city6")

var cities = [city01, city02, city03, city04, city05, city06]
cities.sort();

var modifiedCities = []
for (i = 0; i < cities.length; i++) {
    cities[i] = cities[i].replace(/a/g, "4");
    modifiedCities[i] = cities[i]
}
modifiedCities.sort()

barcelona = []
madrid = []
valencia = []
malaga = []
cadiz = []
santander = []

for (i = 0; i < city01.length; i++) {
    barcelona[i] = city01[i];
}
console.log("Barcelona:")
for (i = barelona.length - 1; i >= 0; i--) {
    console.log(barcelona[i])
}


for (i = 0; i < city02.length; i++) {
    madrid[i] = city02[i];
}
console.log("Madrid:")
for (i = madrid.length - 1; i >= 0; i--) {
    console.log(madrid[i])
}


for (i = 0; i < city03.length; i++) {
    valencia[i] = city03[i];
}
console.log("Valencia:")
for (i = valencia.length - 1; i >= 0; i--) {
    console.log(valencia[i])
}


for (i = 0; i < city04.length; i++) {
    malaga[i] = city04[i];
}
console.log("Malaga:")
for (i = malaga.length - 1; i >= 0; i--) {
    console.log(malaga[i])
}


for (i = 0; i < city05.length; i++) {
    cadiz[i] = city05[i];
}
console.log("Cadiz:")
for (i = cadiz.length - 1; i >= 0; i--) {
    console.log(cadiz[i])
}


for (i = 0; i < city06.length; i++) {
    santander[i] = city06[i];
}
console.log("Santander:")
for (i = santander.length - 1; i >= 0; i--) {
    console.log(santander[i])
}