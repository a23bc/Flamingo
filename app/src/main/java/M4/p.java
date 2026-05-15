package M4;

import A2.C0001b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f4820b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4821c;

    public p(Method method, Object obj) {
        this.f4820b = method;
        this.f4821c = obj;
    }

    @Override // M4.t
    public final Object a(Class cls) {
        String strE = C0001b.e(cls);
        if (strE == null) {
            return this.f4820b.invoke(this.f4821c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strE));
    }
}
