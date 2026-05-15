package M4;

import A2.C0001b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class q extends t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f4822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f4823c;

    public q(int i7, Method method) {
        this.f4822b = method;
        this.f4823c = i7;
    }

    @Override // M4.t
    public final Object a(Class cls) {
        String strE = C0001b.e(cls);
        if (strE == null) {
            return this.f4822b.invoke(null, cls, Integer.valueOf(this.f4823c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strE));
    }
}
