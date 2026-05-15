package M4;

import A2.C0001b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class r extends t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f4824b;

    public r(Method method) {
        this.f4824b = method;
    }

    @Override // M4.t
    public final Object a(Class cls) {
        String strE = C0001b.e(cls);
        if (strE == null) {
            return this.f4824b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strE));
    }
}
