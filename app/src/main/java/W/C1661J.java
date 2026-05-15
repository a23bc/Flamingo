package w;

import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;

/* JADX INFO: renamed from: w.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1661J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.e f18530a = new h0.e(new C1658G[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0894j0 f18531b = C0879c.t(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18532c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0894j0 f18533d = C0879c.t(Boolean.TRUE);

    public final void a(int i7, C0912t c0912t) {
        c0912t.Z(-318043801);
        if ((((c0912t.h(this) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.t(null);
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            if (((Boolean) this.f18533d.getValue()).booleanValue() || ((Boolean) this.f18531b.getValue()).booleanValue()) {
                c0912t.X(1719915818);
                boolean zH = c0912t.h(this);
                Object objK2 = c0912t.K();
                if (zH || objK2 == w7) {
                    objK2 = new C1660I(interfaceC0878b0, this, null);
                    c0912t.i0(objK2);
                }
                C0879c.e(c0912t, this, (l5.e) objK2);
                c0912t.p(false);
            } else {
                c0912t.X(1721436120);
                c0912t.p(false);
            }
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new A5.y(i7, 9, this);
        }
    }
}
