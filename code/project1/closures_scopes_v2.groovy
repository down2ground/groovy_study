import groovy.transform.Field

@Field
def myName = 'John'

def sayHello() {
    println "Hello from method, $myName!" // now CAN use external variables
}

def myClosure = {-> println "Hello from closure, $myName!"} // still CAN use external variables

sayHello()  // prints "Hello from method, John!"
myClosure() // prints "Hello from closure, John!"
