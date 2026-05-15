package Q1;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0529b;
import androidx.datastore.preferences.protobuf.AbstractC0546t;
import androidx.datastore.preferences.protobuf.AbstractC0548v;
import androidx.datastore.preferences.protobuf.C0533f;
import androidx.datastore.preferences.protobuf.C0545s;
import androidx.datastore.preferences.protobuf.InterfaceC0547u;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.r;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0546t {
    private static final g DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0547u strings_ = V.f9424r;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0546t.h(g.class, gVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void i(g gVar, Iterable iterable) {
        InterfaceC0547u interfaceC0547u = gVar.strings_;
        if (!((AbstractC0529b) interfaceC0547u).f9442o) {
            int size = interfaceC0547u.size();
            gVar.strings_ = interfaceC0547u.f(size == 0 ? 10 : size * 2);
        }
        List list = gVar.strings_;
        Charset charset = AbstractC0548v.f9521a;
        iterable.getClass();
        if (iterable instanceof A) {
            List listM = ((A) iterable).m();
            A a4 = (A) list;
            int size2 = list.size();
            for (Object obj : listM) {
                if (obj == null) {
                    String str = "Element at index " + (a4.size() - size2) + " is null.";
                    for (int size3 = a4.size() - 1; size3 >= size2; size3--) {
                        a4.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C0533f) {
                    a4.h((C0533f) obj);
                } else {
                    a4.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof T) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static g j() {
        return DEFAULT_INSTANCE;
    }

    public static f l() {
        return (f) ((r) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0546t
    public final Object d(int i7) {
        S c0545s;
        switch (AbstractC1676i.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s7 = PARSER;
                if (s7 != null) {
                    return s7;
                }
                synchronized (g.class) {
                    try {
                        c0545s = PARSER;
                        if (c0545s == null) {
                            c0545s = new C0545s();
                            PARSER = c0545s;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0545s;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0547u k() {
        return this.strings_;
    }
}
