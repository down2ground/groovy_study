
def myRange = 1..4

println myRange instanceof java.util.List // true

println myRange             // 1..4
println myRange.size()      // 4
println myRange.getFrom()   // 1
println myRange.getTo()     // 4
println myRange.from        // 1
println myRange.to          // 4
println myRange.isReverse() // false

println myRange.get(2)          // 3
println myRange[2]              // 3
println myRange.contains(2)     // true
println myRange.contains(2.5)   // false

def mySubRange = myRange.subList(1, 4) // zero-based, 1 inclusive, 4 exclusive
println mySubRange // 2..4

mySubRange.each {print "$it "}
println() // 2 3 4

(5..2).each {print "$it "} // reverse
println() // 5 4 3 2

(5<..<2).each {print "$it "} // exclusive
println() // 4 3

