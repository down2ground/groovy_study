
// def d = 5 / 0
// Caught: java.lang.ArithmeticException: Division by zero
// java.lang.ArithmeticException: Division by zero
//         at exceptions.run(exceptions.groovy:2)

try {
    def d = 5 / 0
} catch (ArithmeticException e) {
    println e.getCause()     // null
    println e.getMessage()   // Division by zero
} finally {
    println "This will be printed anyway." // This will be printed anyway.
}

class CloseMe implements Closeable {

    private String name
    
    public CloseMe(String name) {
        this.name = name
    }

    @Override
    void close() throws IOException {
        println "closed $name"
    }
}

CloseMe closeMe1 = new CloseMe("1")

try (
    closeMe1 // existing resource may be closed as well
    CloseMe closeMe2 = new CloseMe("2")
) {
    // do something
} // here the resource closing is done

// The output is:
// closed 2
// closed 1




