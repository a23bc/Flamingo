package h6;

import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import w5.InterfaceC1765B;
import x.AbstractC1878t0;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F.A f12880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f12882r;

    public /* synthetic */ K0(F.A a4, InterfaceC0878b0 interfaceC0878b0, InterfaceC1765B interfaceC1765B, int i7) {
        this.f12879o = i7;
        this.f12880p = a4;
        this.f12881q = interfaceC0878b0;
        this.f12882r = interfaceC1765B;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12879o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    InterfaceC1398p interfaceC1398pB = androidx.compose.ui.draw.a.b(androidx.compose.ui.graphics.a.a(androidx.compose.foundation.layout.c.f9203c, new b6.k(22)), new b6.k(23));
                    c0912t.X(1777501312);
                    InterfaceC0878b0 interfaceC0878b0 = this.f12881q;
                    boolean zF = c0912t.f(interfaceC0878b0);
                    InterfaceC1765B interfaceC1765B = this.f12882r;
                    boolean zH = zF | c0912t.h(interfaceC1765B);
                    Object objK = c0912t.K();
                    if (zH || objK == C0903o.f11850a) {
                        objK = new D.h0(interfaceC0878b0, 20, interfaceC1765B);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    I0.c.e(0, 508, null, null, this.f12880p, c0912t, (InterfaceC1182c) objK, null, interfaceC1398pB, null, null, false);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C0879c.a(AbstractC1878t0.f19843a.a(null), n0.e.e(-1883262088, new K0(this.f12880p, this.f12881q, this.f12882r, 0), c0912t2), c0912t2, 56);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
