const { Map } = require('immutable');
const map1 = Map({ a: 1, b: 2, c: 3 });
const map2 = map1.set('b', 50);
console.log(map1.get('b') + " vs. " + map2.get('b')); // 2 vs. 50

const { MapTwo } = require('immutable');
const map1Two = Map({ a: 1, b: 2, c: 3 });
const map2Two = Map({ a: 1, b: 2, c: 3 });
console.log(map1Two.equals(map2Two)); // true
console.log(map1Two === map2Two); // false