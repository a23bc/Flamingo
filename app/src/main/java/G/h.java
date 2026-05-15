package G;

import H.E;
import H.K;
import f0.C0912t;
import f0.C0915u0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class h implements K {

    /* JADX INFO: renamed from: a */
    public final x f2509a;

    /* JADX INFO: renamed from: b */
    public final g f2510b;

    /* JADX INFO: renamed from: c */
    public final D4.i f2511c;

    public h(x xVar, g gVar, D4.i iVar) {
        this.f2509a = xVar;
        this.f2510b = gVar;
        this.f2511c = iVar;
    }

    @Override // H.K
    public final int a() {
        return this.f2510b.m().f1582p;
    }

    @Override // H.K
    public final Object b(int i7) {
        Object objN = this.f2511c.n(i7);
        return objN == null ? this.f2510b.n(i7) : objN;
    }

    @Override // H.K
    public final Object c(int i7) {
        return this.f2510b.l(i7);
    }

    @Override // H.K
    public final int d(Object obj) {
        return this.f2511c.l(obj);
    }

    @Override // H.K
    public final void e(int i7, Object obj, C0912t c0912t, int i8) {
        c0912t.Z(1493551140);
        int i9 = (c0912t.d(i7) ? 4 : 2) | i8 | (c0912t.h(obj) ? 32 : 16) | (c0912t.f(this) ? 256 : 128);
        if (c0912t.N(i9 & 1, (i9 & 147) != 146)) {
            E.d(obj, i7, this.f2509a.f2625q, n0.e.e(726189336, new F.k(this, i7, 1), c0912t), c0912t, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new F.j(this, i7, obj, i8, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return AbstractC1209k.a(this.f2510b, ((h) obj).f2510b);
    }

    public final int hashCode() {
        return this.f2510b.hashCode();
    }
}
