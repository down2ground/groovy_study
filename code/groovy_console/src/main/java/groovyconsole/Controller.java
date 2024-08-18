package groovyconsole;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;

@RestController
public class Controller {

    @Autowired
    private State state;

    @Autowired
    ApplicationContext ctx;

    @PostMapping("/console")
    public Result console(@RequestBody String script) {
        state.incrementConsoleRequestCount();
        Result.ResultBuilder resultBuilder = Result.builder();
        StringWriter stringWriter = new StringWriter();
        Binding binding = new SpringBinding(ctx);
        binding.setVariable("out", new PrintWriter(stringWriter));
        GroovyShell groovyShell = new GroovyShell(this.getClass().getClassLoader(), binding);
        try {
            Object result = groovyShell.evaluate(script);
            resultBuilder.result(Objects.toString(result));
        } catch (Throwable t) {
            resultBuilder.error(t.getMessage());
        }
        String output = stringWriter.toString();
        if (output != null && !output.isEmpty()) {
            resultBuilder.output(output);
        }
        return resultBuilder.build();
    }

    @GetMapping("/state")
    public State state() {
        return state;
    }
}
