def s1 = "a"
println s1.getClass().getName() // java.lang.String

def char c1 = "a" // double quotes may be used for the `char` data type
println c1.getClass().getName() // java.lang.Character

def gs = "value = ${2 + 2}"
println gs.getClass().getName() // org.codehaus.groovy.runtime.GStringImpl
println gs // value = 4

String multiline = """
 1
 2
""" // three single quotes may be also used
println multiline.collect { String.format("0x%02X", (int) it) }
// [0x0A, 0x20, 0x31, 0x0A, 0x20, 0x32, 0x0A]
// 0x0A - newline, 0x20 - space

def numbers = "abcde"
println numbers[2] // c
println numbers[-1] // e
println numbers[1..3] // bcd
println numbers[3..1] // dcb
println numbers[0, 2, 4] // ace
println numbers.substring(3) // de
println numbers.subSequence(1, 3) // bc
println numbers.toList() // [a, b, c, d, e]
println numbers.equalsIgnoreCase("Abcde") // true

def spaced = "May      there are always be sunshine!"
println spaced.split() // [May, there, are, always, be, sunshine!]

println "Groovy " * 3 // Groovy Groovy Groovy

println(/"slashy" string/) // "slashy" string
// println /"slashy" string/ // doesn't work without braces

println(/Slashy strings 
are multiline. \/Slashes\/ must be masked./) 
// Slashy strings
// are multiline. /Slashes/ must be masked.

println($/Dollar slashy string. Dolar ($$) is the escape symbol./$)
// Dollar slashy string. Dolar ($) is the escape symbol.






