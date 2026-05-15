package x;

import Q0.AbstractC0347f;
import l5.InterfaceC1180a;
import z.C2026a0;
import z.H0;

/* JADX INFO: renamed from: x.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1808A implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f19598o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f19599p;

    public /* synthetic */ C1808A(int i7, Object obj) {
        this.f19598o = i7;
        this.f19599p = obj;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        C1875s c1875s;
        switch (this.f19598o) {
            case 0:
                InterfaceC1180a interfaceC1180a = ((C1820G) this.f19599p).Z;
                if (interfaceC1180a != null) {
                    interfaceC1180a.a();
                }
                return Boolean.TRUE;
            case 1:
                f0.D d4 = AbstractC1880u0.f19845a;
                C1819F0 c1819f0 = (C1819F0) this.f19599p;
                C1877t c1877t = (C1877t) AbstractC0347f.i(c1819f0, d4);
                c1819f0.f19641O = c1877t;
                if (c1877t != null) {
                    c1875s = new C1875s(c1877t.f19839a, c1877t.f19840b, c1877t.f19841c, c1877t.f19842d);
                } else {
                    c1875s = null;
                }
                c1819f0.f19642P = c1875s;
                return Y4.o.f8736a;
            case 2:
                Object objF = ((y5.c) this.f19599p).f();
                if (objF instanceof y5.i) {
                    objF = null;
                }
                return (C2026a0) objF;
            default:
                return Boolean.valueOf(((H0) this.f19599p).f15636B);
        }
    }
}
