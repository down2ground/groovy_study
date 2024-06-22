// variable type inference
def _value1 = 52       // underscore may be the first symbol in identifier names
println _value1.class  // class java.lang.Integer

Double doubleValue = 52   // type may also be specified explicitly
println doubleValue       // 52.0

globalName = "Bob" // omitting type makes the variable global

def printName() {
    println globalName
    // println doubleValue // ERROR
    // groovy.lang.MissingPropertyException: No such property: doubleValue for class: variables
}

printName()  // Bob

var interpolatedString = "${globalName}'s age is $doubleValue" // {} may be omitted
// `var` is a synonym for `def`
println interpolatedString  // Bob's age is 52.0

def literalString = '${globalName} is $doubleValue years old'
println literalString // ${globalName} is $doubleValue years old

def (a, b, c) = ["first", 23, true]   // Multiple assignments (destructuring)
print a; print b; print c; println() // first23true

def (a1, b1, c1) = ["first", 23] // not all values provided - variable will get the default value
print a1; print b1; print c1; println() // first23null

def (int a2, int b2) = [100, 200, 300] // types specified, unused values will be ignored
print a2; print b2; println() // 100200




