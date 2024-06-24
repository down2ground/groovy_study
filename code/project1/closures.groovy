
def name = 'Bob'
        
def sayHello() {
    println "Hello, $name!" // CANNOT use external variables
}
// sayHello() // groovy.lang.MissingPropertyException: No such property: name for class: methods

def myClosure = {-> println "Hello, $name!"} // CAN use external variables
// `->` restricts the closure to be called without arguments (otherwise it will be called with
// the implicit argument `it`)
myClosure.call() // Hello, Bob!
myClosure()      // Hello, Bob!

def myList = [1, 2, 3, 4, 5, 6, 7, 8]

println myList.find {it > 3} // 4 // `it` is the implicit argument 

// Delegation

class Alice {
    public name = "Alice"
}
class Bob {
    public name = "Bob"
}

def closure = {println delegate.name} // by now the `name` variable from the module is assumed

println closure.delegate.class.getName() // closures

closure.delegate = Alice
closure() // Alice
closure.delegate = Bob
closure() // Bob



