package D;

import f0.C0903o;
import f0.C0912t;
import m5.AbstractC1209k;
import r0.C1385c;
import r0.C1388f;

/* JADX INFO: renamed from: D.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0082x {

    /* JADX INFO: renamed from: a */
    public static final C0084z f1411a = new C0084z(AbstractC0068i.f1329c, C1385c.f15608A);

    public static final C0084z a(InterfaceC0067h interfaceC0067h, C1388f c1388f, C0912t c0912t, int i7) {
        if (AbstractC1209k.a(interfaceC0067h, AbstractC0068i.f1329c) && AbstractC1209k.a(c1388f, C1385c.f15608A)) {
            c0912t.X(-1446569784);
            c0912t.p(false);
            return f1411a;
        }
        c0912t.X(-1446515937);
        boolean z6 = true;
        boolean z7 = (((i7 & 14) ^ 6) > 4 && c0912t.f(interfaceC0067h)) || (i7 & 6) == 4;
        if ((((i7 & 112) ^ 48) <= 32 || !c0912t.f(c1388f)) && (i7 & 48) != 32) {
            z6 = false;
        }
        boolean z8 = z7 | z6;
        Object objK = c0912t.K();
        if (z8 || objK == C0903o.f11850a) {
            objK = new C0084z(interfaceC0067h, c1388f);
            c0912t.i0(objK);
        }
        C0084z c0084z = (C0084z) objK;
        c0912t.p(false);
        return c0084z;
    }
}
