package groovyconsole;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class State {
    private int consoleRequestCount = 0;
    private String someProperty;

    public void incrementConsoleRequestCount() {
        ++consoleRequestCount;
    }
}
