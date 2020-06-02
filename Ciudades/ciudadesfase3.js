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
modifiedCities.forEach(city => {
    console.log(city)
});
