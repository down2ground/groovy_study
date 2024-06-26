import java.time.LocalDate

def participant = [
        "name": "Bob",
        "sections": ["front-end", "back-end"],
        "registration date": LocalDate.of(2024, 06, 10)]

println participant.name // Bob
println participant["sections"] // front-end
println participant["sections"][0] // front-end
println participant["age"] // null
println participant.get("registration date")   // 2024-06-10
println participant.getAt("registration date") // 2024-06-10 // [1]

def someMap = [:]
println someMap.anyKey // null

println someMap.getClass()     // class java.util.LinkedHashMap
println participant.getClass() // class java.util.LinkedHashMap

someMap.put(1, "one")
someMap.put(2, "two")
someMap.put(3, "three")
someMap.put(4, "four")

// `LinkedHashMap` preserves iteration order
someMap.each {key, value -> print value + " "}
println() // one two three four

someMap.eachWithIndex {key, value, i -> println "$i | $key: $value"}
// 0 | 1: one
// 1 | 2: two
// 2 | 3: three
// 3 | 4: four

