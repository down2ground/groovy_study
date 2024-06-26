
for (def i = 0; i < 5; ++i) 
    print i + " "
println() // 0 1 2 3 4

for (def i in 1..5) 
    print i + " "
println() // 1 2 3 4 5

for (int fib in [1, 1, 2, 3, 5, 8, 13]) 
    print fib + " "
println() // 1 1 2 3 5 8 13

["a", "b", "c", "d", "e"].each {print it}
println() // abcde

2.upto(5) {print it} // `it` is an explicit loop variable
println() // 2345

4.times {print it}
println() // 0123

3.step(10, 2) {print it}
println() // 3579

String result = ""
Random random = new Random()
while (result.length() < 20)
    result += random.nextInt(9) + " "
println result // 5 7 1 7 8 4 3 1 4 1

do {
    println "This will be printed at least one time"
} while (false)







