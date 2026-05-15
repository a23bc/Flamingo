package V4;

import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.W;
import f0.Z0;
import m5.AbstractC1209k;
import w.AbstractC1674g;
import x.InterfaceC1844c0;
import x.InterfaceC1846d0;

/* JADX INFO: renamed from: V4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0455b implements InterfaceC1844c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0457d f7478a;

    public C0455b(C0457d c0457d) {
        this.f7478a = c0457d;
    }

    @Override // x.InterfaceC1844c0
    public final InterfaceC1846d0 a(B.k kVar, C0912t c0912t) {
        AbstractC1209k.f(kVar, "interactionSource");
        c0912t.Y(-2045252560);
        InterfaceC0878b0 interfaceC0878b0P = N5.l.p(kVar, c0912t, 0);
        Object objK = c0912t.K();
        W w7 = C0903o.f11850a;
        if (objK == w7) {
            objK = C0879c.t(Boolean.FALSE);
            c0912t.i0(objK);
        }
        InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
        boolean zF = c0912t.f(kVar);
        Object objK2 = c0912t.K();
        if (zF || objK2 == w7) {
            objK2 = new B.g(kVar, interfaceC0878b0, null);
            c0912t.i0(objK2);
        }
        C0879c.e(c0912t, kVar, (l5.e) objK2);
        Z0 z0B = AbstractC1674g.b(((Boolean) interfaceC0878b0P.getValue()).booleanValue() ? 1.0f : ((Boolean) interfaceC0878b0.getValue()).booleanValue() ? 0.5f : 0.0f, null, 0.0f, null, c0912t, 0, 30);
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(this.f7478a.invoke(c0912t, 0), c0912t);
        c0912t.Y(1709394896);
        Object objK3 = c0912t.K();
        if (objK3 == w7) {
            objK3 = new C0454a(interfaceC0878b0P, interfaceC0878b0X, interfaceC0878b0, z0B);
            c0912t.i0(objK3);
        }
        C0454a c0454a = (C0454a) objK3;
        c0912t.p(false);
        c0912t.p(false);
        return c0454a;
    }
}
