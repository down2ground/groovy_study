package groovyconsole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private State state;

    @PostMapping("/console")
    public Result console(@RequestBody String script) {
        state.incrementConsoleRequestCount();
        return script == null || script.isBlank() ?
                Result.builder().error("The script is empty!").build() :
                Result.builder()
                        .result("The script is: " + script)
                        .output("Fake output")
                        .build();
    }

    @GetMapping("/state")
    public State state() {
        return state;
    }
}
