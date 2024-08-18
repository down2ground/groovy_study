package groovyconsole;

import groovy.lang.Binding;
import org.springframework.context.ApplicationContext;

public class SpringBinding extends Binding {

    private static final String APPLICATION_CONTEXT_NAME = "_ctx";

    private final ApplicationContext ctx;

    public SpringBinding(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public Object getVariable(String name) {
        if (getVariables().containsKey(name)) {
            return getVariables().get(name);
        }
        if (ctx.containsBean(name)) {
            Object variable = ctx.getBean(name);
            setVariable(name, variable);
            return variable;
        }
        if (APPLICATION_CONTEXT_NAME.equals(name)) {
            setVariable(name, ctx.getBean(name));
            return ctx;
        }
        return null;
    }
}
