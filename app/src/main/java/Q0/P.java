package Q0;

import R0.C0415x;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a */
    public final K f5856a;

    /* JADX INFO: renamed from: b */
    public boolean f5857b;

    /* JADX INFO: renamed from: c */
    public boolean f5858c;

    /* JADX INFO: renamed from: e */
    public boolean f5860e;

    /* JADX INFO: renamed from: f */
    public boolean f5861f;

    /* JADX INFO: renamed from: g */
    public boolean f5862g;
    public int h;

    /* JADX INFO: renamed from: i */
    public int f5863i;

    /* JADX INFO: renamed from: j */
    public boolean f5864j;

    /* JADX INFO: renamed from: k */
    public boolean f5865k;
    public int l;

    /* JADX INFO: renamed from: m */
    public boolean f5866m;

    /* JADX INFO: renamed from: n */
    public boolean f5867n;

    /* JADX INFO: renamed from: o */
    public int f5868o;

    /* JADX INFO: renamed from: q */
    public Y f5870q;

    /* JADX INFO: renamed from: d */
    public G f5859d = G.f5791s;

    /* JADX INFO: renamed from: p */
    public final C0342c0 f5869p = new C0342c0(this);

    public P(K k7) {
        this.f5856a = k7;
    }

    public final j0 a() {
        return this.f5856a.f5821T.f6003d;
    }

    public final void b() {
        G g6 = this.f5856a.f5822U.f5859d;
        if (g6 == G.f5789q || g6 == G.f5790r) {
            if (this.f5869p.f5954O) {
                g(true);
            } else {
                f(true);
            }
        }
        if (g6 == G.f5790r) {
            Y y6 = this.f5870q;
            if (y6 == null || !y6.f5911I) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j3) {
        Y y6 = this.f5870q;
        if (y6 != null) {
            G g6 = G.f5788p;
            P p7 = y6.f5915t;
            p7.f5859d = g6;
            p7.f5860e = false;
            K k7 = p7.f5856a;
            u0 snapshotObserver = ((C0415x) O.a(k7)).getSnapshotObserver();
            W w7 = new W(y6, j3);
            snapshotObserver.getClass();
            if (k7.f5837v != null) {
                snapshotObserver.a(k7, snapshotObserver.f6076b, w7);
            } else {
                snapshotObserver.a(k7, snapshotObserver.f6077c, w7);
            }
            p7.f5861f = true;
            p7.f5862g = true;
            boolean zS = AbstractC0347f.s(k7);
            C0342c0 c0342c0 = p7.f5869p;
            if (zS) {
                c0342c0.f5949J = true;
                c0342c0.f5950K = true;
            } else {
                c0342c0.f5948I = true;
            }
            p7.f5859d = G.f5791s;
        }
    }

    public final void d(int i7) {
        int i8 = this.l;
        this.l = i7;
        if ((i8 == 0) != (i7 == 0)) {
            K kV = this.f5856a.v();
            P p7 = kV != null ? kV.f5822U : null;
            if (p7 != null) {
                if (i7 == 0) {
                    p7.d(p7.l - 1);
                } else {
                    p7.d(p7.l + 1);
                }
            }
        }
    }

    public final void e(int i7) {
        int i8 = this.f5868o;
        this.f5868o = i7;
        if ((i8 == 0) != (i7 == 0)) {
            K kV = this.f5856a.v();
            P p7 = kV != null ? kV.f5822U : null;
            if (p7 != null) {
                if (i7 == 0) {
                    p7.e(p7.f5868o - 1);
                } else {
                    p7.e(p7.f5868o + 1);
                }
            }
        }
    }

    public final void f(boolean z6) {
        if (this.f5865k != z6) {
            this.f5865k = z6;
            if (z6 && !this.f5864j) {
                d(this.l + 1);
            } else {
                if (z6 || this.f5864j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z6) {
        if (this.f5864j != z6) {
            this.f5864j = z6;
            if (z6 && !this.f5865k) {
                d(this.l + 1);
            } else {
                if (z6 || this.f5865k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z6) {
        if (this.f5867n != z6) {
            this.f5867n = z6;
            if (z6 && !this.f5866m) {
                e(this.f5868o + 1);
            } else {
                if (z6 || this.f5866m) {
                    return;
                }
                e(this.f5868o - 1);
            }
        }
    }

    public final void i(boolean z6) {
        if (this.f5866m != z6) {
            this.f5866m = z6;
            if (z6 && !this.f5867n) {
                e(this.f5868o + 1);
            } else {
                if (z6 || this.f5867n) {
                    return;
                }
                e(this.f5868o - 1);
            }
        }
    }

    public final void j() {
        C0342c0 c0342c0 = this.f5869p;
        Object obj = c0342c0.f5945F;
        K k7 = this.f5856a;
        P p7 = c0342c0.f5965t;
        if ((obj != null || p7.a().i() != null) && c0342c0.f5944E) {
            c0342c0.f5944E = false;
            c0342c0.f5945F = p7.a().i();
            K kV = k7.v();
            if (kV != null) {
                K.V(kV, false, 7);
            }
        }
        Y y6 = this.f5870q;
        if (y6 != null) {
            Object obj2 = y6.f5913K;
            P p8 = y6.f5915t;
            if (obj2 == null) {
                U uH0 = p8.a().H0();
                AbstractC1209k.c(uH0);
                if (uH0.f5888C.i() == null) {
                    return;
                }
            }
            if (y6.f5912J) {
                y6.f5912J = false;
                U uH02 = p8.a().H0();
                AbstractC1209k.c(uH02);
                y6.f5913K = uH02.f5888C.i();
                if (AbstractC0347f.s(k7)) {
                    K kV2 = k7.v();
                    if (kV2 != null) {
                        K.V(kV2, false, 7);
                        return;
                    }
                    return;
                }
                K kV3 = k7.v();
                if (kV3 != null) {
                    K.T(kV3, false, 7);
                }
            }
        }
    }
}
