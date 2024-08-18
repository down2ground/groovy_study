package groovyconsole;

public class Greeter {

    private String name;

    public Greeter(String name) {
        this.name = name;
    }
    
    public String greet() {
        return "Hello, " + (name == null || name.isBlank() ? "stranger" : name) + "!";
    }
}
