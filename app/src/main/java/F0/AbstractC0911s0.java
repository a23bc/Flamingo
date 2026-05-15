package f0;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: f0.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0911s0 {

    /* JADX INFO: renamed from: a */
    public final V f11871a;

    public AbstractC0911s0(InterfaceC1180a interfaceC1180a) {
        this.f11871a = new V(interfaceC1180a);
    }

    public abstract C0913t0 a(Object obj);

    public c1 b() {
        return this.f11871a;
    }

    public final c1 c(C0913t0 c0913t0, c1 c1Var) {
        c1 c1Var2 = null;
        c1Var2 = null;
        c1Var2 = null;
        c1Var2 = null;
        c1Var2 = null;
        c1Var2 = null;
        if (c1Var instanceof K) {
            if (c0913t0.f11918b) {
                K k7 = (K) c1Var;
                k7.f11693a.setValue(c0913t0.c());
                c1Var2 = k7;
            }
        } else if (c1Var instanceof b1) {
            if ((c0913t0.f11917a || c0913t0.f11922f != null) && !c0913t0.f11918b) {
                b1 b1Var = (b1) c1Var;
                if (AbstractC1209k.a(c0913t0.c(), b1Var.f11790a)) {
                    c1Var2 = b1Var;
                }
            }
        } else if (c1Var instanceof E) {
            c0913t0.getClass();
            InterfaceC1182c interfaceC1182c = ((E) c1Var).f11649a;
        }
        if (c1Var2 != null) {
            return c1Var2;
        }
        if (!c0913t0.f11918b) {
            return new b1(c0913t0.c());
        }
        Q0 q02 = (Q0) c0913t0.f11921e;
        if (q02 == null) {
            q02 = W.f11767t;
        }
        return new K(new C0894j0(c0913t0.f11922f, q02));
    }
}
