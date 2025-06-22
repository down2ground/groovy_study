/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  groovy.lang.Closure
 *  groovy.lang.MetaClass
 *  groovy.lang.Reference
 *  groovy.transform.Generated
 *  org.codehaus.groovy.reflection.ClassInfo
 *  org.codehaus.groovy.runtime.GStringImpl
 *  org.codehaus.groovy.runtime.GeneratedClosure
 *  org.codehaus.groovy.runtime.ScriptBytecodeAdapter
 *  org.codehaus.groovy.vmplugin.v8.IndyInterface
 */
import groovy.lang.Closure;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.lang.invoke.MethodHandles;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.vmplugin.v8.IndyInterface;

public final class closures_scopes._run_closure1
extends Closure
implements GeneratedClosure {
    private /* synthetic */ Reference myName;
    private static /* synthetic */ ClassInfo $staticClassInfo;
    public static transient /* synthetic */ boolean __$stMC;

    public closures_scopes._run_closure1(Object _outerInstance, Object _thisObject, Reference myName) {
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
        if (((Object)((Object)this)).getClass() != closures_scopes._run_closure1.class) {
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
