package x;

import f0.C0903o;
import f0.C0912t;
import o0.C1247d;

/* JADX INFO: renamed from: x.u0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1880u0 {

    /* JADX INFO: renamed from: a */
    public static final f0.D f19845a = new f0.D(new C1247d(18));

    public static final C1875s a(C0912t c0912t) {
        c0912t.X(282942128);
        C1877t c1877t = (C1877t) c0912t.j(f19845a);
        if (c1877t == null) {
            c0912t.p(false);
            return null;
        }
        boolean zF = c0912t.f(c1877t);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            Object c1875s = new C1875s(c1877t.f19839a, c1877t.f19840b, c1877t.f19841c, c1877t.f19842d);
            c0912t.i0(c1875s);
            objK = c1875s;
        }
        C1875s c1875s2 = (C1875s) objK;
        c0912t.p(false);
        return c1875s2;
    }
}
