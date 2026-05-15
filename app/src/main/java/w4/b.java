package w4;

import a.AbstractC0509a;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    public static final Object f19444a;

    /* JADX INFO: renamed from: b */
    public static final Object f19445b;

    static {
        Y4.f fVar = Y4.f.f8723o;
        f19444a = AbstractC0509a.N(fVar, a.f19439s);
        f19445b = AbstractC0509a.N(fVar, a.f19438r);
        AbstractC0509a.N(fVar, a.f19437q);
    }

    public static String a(List list) {
        AbstractC1209k.f(list, "list");
        StringBuilder sb = new StringBuilder("[");
        for (Object obj : list) {
            if (obj instanceof List) {
                sb.append(a((List) obj));
            } else {
                if (obj == null) {
                    throw new IllegalStateException("unable to save data: some part of list is null! ");
                }
                InterfaceC1182c interfaceC1182cB = b(obj);
                if (interfaceC1182cB == null) {
                    throw new IllegalStateException(("Unable to save data: type of " + obj + " (class: " + obj.getClass() + " is not supported, please call [registerTypeConverters] at first!").toString());
                }
                sb.append(((String) interfaceC1182cB.b(obj)) + "#@#");
            }
        }
        if (sb.length() > 5) {
            sb.delete(sb.length() - 3, sb.length());
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static InterfaceC1182c b(Object obj) {
        Object obj2 = d().get(obj.getClass());
        if (obj2 == null) {
            for (Class cls : d().keySet()) {
                if (cls.isAssignableFrom(obj.getClass())) {
                    return (InterfaceC1182c) d().get(cls);
                }
            }
        }
        return (InterfaceC1182c) obj2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y4.e, java.lang.Object] */
    public static Map c() {
        return (Map) f19445b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y4.e, java.lang.Object] */
    public static Map d() {
        return (Map) f19444a.getValue();
    }
}
