
trait Flying {
    String fly() { "I believe I can fly!" }
}
class Bird implements Flying {}
def b = new Bird()
println b.fly()

// Duck typing
trait SpeakingDuck {
    String speak() { quack(3) } // method `quack()` is missing
}
class Duck implements SpeakingDuck {
    String methodMissing(String name, args) { // will be called instead of any missing method
        println name                  // quack
        println args                  // [3]
        println args[0].getClass()    // class java.lang.Integer
        return new IntRange(1, args[0] as int).collect {"${name}" }.join(", ")
    }
}
def duck = new Duck()
println duck.speak() // quack, quack, quack


