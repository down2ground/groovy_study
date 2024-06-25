
def myList = [1, 23.7, "apple", ["guitar", -1, false], true]

println myList[1] // 23.7
println myList[1..2] // [23.7, apple]
println myList[3][0] // guitar
println myList.get(3).get(0) // guitar

println myList[3].contains(-1) // true
println myList[3].size() // 3

myList[3].add(10)
myList[3] << 20 // the same as `add`
println myList[3] // [guitar, -1, false, 10, 20]

myList[3].remove(1)
println myList[3] // [guitar, false, 10, 20]

def newList = myList[3] + [30, 40]
println newList // [guitar, false, 10, 20, 30, 40]
newList = newList.plus([40])
println newList // [guitar, false, 10, 20, 30, 40, 40]

newList = newList - [40]
println newList // [guitar, false, 10, 20, 30]
newList = newList.minus([20, 30])
println newList // [guitar, false, 10]

println newList.pop() // guitar
println newList // [false, 10]

println newList.removeLast() // 10
println newList // [false]

println([1, 2, 3].intersect([2, 3, 4])) // [2, 3]

def anotherList = [1, 2, 3]
println anotherList.reverse() // [3, 2, 1]
println anotherList           // [1, 2, 3] // `reverse()` returned a copy

println([5, "abc", 10.0].sort()) // [5, 10.0, abc] // It can sort values of different types!

// Oops!
// println "a".compareTo(5)
// java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

println anotherList.isEmpty() // false



