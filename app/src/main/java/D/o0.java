package D;

import f0.C0903o;
import f0.C0912t;
import m5.AbstractC1209k;
import r0.C1385c;
import r0.C1389g;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a */
    public static final q0 f1362a = new q0(AbstractC0068i.f1327a, C1385c.f15621x);

    public static final q0 a(InterfaceC0064f interfaceC0064f, C1389g c1389g, C0912t c0912t, int i7) {
        if (AbstractC1209k.a(interfaceC0064f, AbstractC0068i.f1327a) && AbstractC1209k.a(c1389g, C1385c.f15621x)) {
            c0912t.X(-1073795767);
            c0912t.p(false);
            return f1362a;
        }
        c0912t.X(-1073744896);
        boolean z6 = true;
        boolean z7 = (((i7 & 14) ^ 6) > 4 && c0912t.f(interfaceC0064f)) || (i7 & 6) == 4;
        if ((((i7 & 112) ^ 48) <= 32 || !c0912t.f(c1389g)) && (i7 & 48) != 32) {
            z6 = false;
        }
        boolean z8 = z7 | z6;
        Object objK = c0912t.K();
        if (z8 || objK == C0903o.f11850a) {
            objK = new q0(interfaceC0064f, c1389g);
            c0912t.i0(objK);
        }
        q0 q0Var = (q0) objK;
        c0912t.p(false);
        return q0Var;
    }
}
