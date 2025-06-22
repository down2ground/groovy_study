/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  groovy.lang.Binding
 *  groovy.lang.MetaClass
 *  groovy.lang.Script
 *  groovy.transform.Generated
 *  org.codehaus.groovy.reflection.ClassInfo
 *  org.codehaus.groovy.runtime.InvokerHelper
 *  org.codehaus.groovy.runtime.ScriptBytecodeAdapter
 *  org.codehaus.groovy.vmplugin.v8.IndyInterface
 */
import groovy.lang.Binding;
import groovy.lang.MetaClass;
import groovy.lang.Script;
import groovy.transform.Generated;
import java.lang.invoke.MethodHandles;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.InvokerHelper;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.vmplugin.v8.IndyInterface;

public class methods
extends Script {
    private static /* synthetic */ ClassInfo $staticClassInfo;
    public static transient /* synthetic */ boolean __$stMC;

    public methods() {
    }

    public methods(Binding context) {
        super(context);
    }

    public static void main(String ... args) {
        IndyInterface.bootstrap("invoke", "runScript", 0, InvokerHelper.class, methods.class, args);
    }

    public Object run() {
        IndyInterface.bootstrap("invoke", "println", 2, this, IndyInterface.bootstrap("invoke", "sum", 2, this, 7, 4));
        return IndyInterface.bootstrap("invoke", "println", 2, this, IndyInterface.bootstrap("invoke", "sum", 2, this, 7));
    }

    public Object sum(int a, int b) {
        return IndyInterface.bootstrap("invoke", "plus", 0, a, b);
    }

    @Generated
    public Object sum(int a) {
        return this.sum(a, 0);
    }

    protected /* synthetic */ MetaClass $getStaticMetaClass() {
        if (((Object)((Object)this)).getClass() != methods.class) {
            return ScriptBytecodeAdapter.initMetaClass((Object)((Object)this));
        }
        ClassInfo classInfo = $staticClassInfo;
        if (classInfo == null) {
            $staticClassInfo = classInfo = ClassInfo.getClassInfo(((Object)((Object)this)).getClass());
        }
        return classInfo.getMetaClass();
    }

    public static /* synthetic */ MethodHandles.Lookup $getLookup() {
        return MethodHandles.lookup();
    }
}
