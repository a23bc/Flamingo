package A5;

import d5.EnumC0830a;
import e5.AbstractC0863a;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: renamed from: A5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0027c {

    /* JADX INFO: renamed from: a */
    public static final c5.d[] f537a = new c5.d[0];

    /* JADX INFO: renamed from: b */
    public static final B5.u f538b = new B5.u("NULL", 0);

    public static final Object a(c5.i iVar, Object obj, Object obj2, l5.e eVar, c5.d dVar) {
        Object objInvoke;
        Object objM = B5.a.m(iVar, obj2);
        try {
            A a4 = new A(dVar, iVar);
            if (eVar instanceof AbstractC0863a) {
                AbstractC1223y.c(2, eVar);
                objInvoke = eVar.invoke(obj, a4);
            } else {
                objInvoke = I0.c.Z(eVar, obj, a4);
            }
            B5.a.g(iVar, objM);
            if (objInvoke == EnumC0830a.f11264o) {
                AbstractC1209k.f(dVar, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            B5.a.g(iVar, objM);
            throw th;
        }
    }
}
