package groovyconsole;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {
    private String error;
    private String result;
    private String output;
}
