
def myName = 'John'
        
def sayHello() {
    //println "Hello from method, $myName!" // CANNOT use external variables
}

def myClosure = {-> println "Hello from closure, $myName!"} // CAN use external variables

sayHello() // prints nothing
myClosure() // prints "Hello from closure, John!"
