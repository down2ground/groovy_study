/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  groovy.lang.Binding
 *  groovy.lang.Closure
 *  groovy.lang.MetaClass
 *  groovy.lang.Reference
 *  groovy.lang.Script
 *  groovy.transform.Generated
 *  org.codehaus.groovy.reflection.ClassInfo
 *  org.codehaus.groovy.runtime.GStringImpl
 *  org.codehaus.groovy.runtime.GeneratedClosure
 *  org.codehaus.groovy.runtime.InvokerHelper
 *  org.codehaus.groovy.runtime.ScriptBytecodeAdapter
 *  org.codehaus.groovy.vmplugin.v8.IndyInterface
 */
import groovy.lang.Binding;
import groovy.lang.Closure;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.lang.Script;
import groovy.transform.Generated;
import java.lang.invoke.MethodHandles;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.InvokerHelper;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.vmplugin.v8.IndyInterface;

public class closures_scopes
extends Script {
    private static /* synthetic */ ClassInfo $staticClassInfo;
    public static transient /* synthetic */ boolean __$stMC;

    public closures_scopes() {
    }

    public closures_scopes(Binding context) {
        super(context);
    }

    public static void main(String ... args) {
        IndyInterface.bootstrap("invoke", "runScript", 0, InvokerHelper.class, closures_scopes.class, args);
    }

    public Object run() {
        Reference myName = new Reference((Object)"John");
        public final class _run_closure1
        extends Closure
        implements GeneratedClosure {
            private /* synthetic */ Reference myName;
            private static /* synthetic */ ClassInfo $staticClassInfo;
            public static transient /* synthetic */ boolean __$stMC;

            public _run_closure1(Object _outerInstance, Object _thisObject, Reference myName) {
                super(_outerInstance, _thisObject);
                Reference reference;
                this.myName = reference = myName;
            }

            public Object doCall() {
                return IndyInterface.bootstrap("invoke", "println", 2, this, new GStringImpl(new Object[]{this.myName.get()}, new String[]{"Hello from closure, ", "!"}));
            }

            @Generated
            public Object getMyName() {
                return this.myName.get();
            }

            protected /* synthetic */ MetaClass $getStaticMetaClass() {
                if (((Object)((Object)this)).getClass() != _run_closure1.class) {
                    return ScriptBytecodeAdapter.initMetaClass((Object)((Object)this));
                }
                ClassInfo classInfo = $staticClassInfo;
                if (classInfo == null) {
                    $staticClassInfo = classInfo = ClassInfo.getClassInfo(((Object)((Object)this)).getClass());
                }
                return classInfo.getMetaClass();
            }

            public /* synthetic */ MethodHandles.Lookup $getLookup() {
                return MethodHandles.lookup();
            }
        }
        _run_closure1 myClosure = new _run_closure1((Object)this, (Object)this, myName);
        IndyInterface.bootstrap("invoke", "sayHello", 2, this);
        return IndyInterface.bootstrap("invoke", "call", 0, myClosure);
    }

    public Object sayHello() {
        return null;
    }

    protected /* synthetic */ MetaClass $getStaticMetaClass() {
        if (((Object)((Object)this)).getClass() != closures_scopes.class) {
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
