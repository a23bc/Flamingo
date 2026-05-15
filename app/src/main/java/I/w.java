package I;

import f0.C0912t;
import f0.C0915u0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class w implements H.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0211c f3394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f3395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4.i f3396c;

    public w(C0211c c0211c, v vVar, D4.i iVar) {
        this.f3394a = c0211c;
        this.f3395b = vVar;
        this.f3396c = iVar;
    }

    @Override // H.K
    public final int a() {
        return this.f3395b.m().f1582p;
    }

    @Override // H.K
    public final Object b(int i7) {
        Object objN = this.f3396c.n(i7);
        return objN == null ? this.f3395b.n(i7) : objN;
    }

    @Override // H.K
    public final /* synthetic */ Object c(int i7) {
        return null;
    }

    @Override // H.K
    public final int d(Object obj) {
        return this.f3396c.l(obj);
    }

    @Override // H.K
    public final void e(int i7, Object obj, C0912t c0912t, int i8) {
        c0912t.Z(-1201380429);
        int i9 = (c0912t.d(i7) ? 4 : 2) | i8 | (c0912t.h(obj) ? 32 : 16) | (c0912t.f(this) ? 256 : 128);
        if (c0912t.N(i9 & 1, (i9 & 147) != 146)) {
            H.E.d(obj, i7, this.f3394a.f3284A, n0.e.e(1142237095, new F.k(this, i7, 2), c0912t), c0912t, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new F.j(this, i7, obj, i8, 2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return AbstractC1209k.a(this.f3395b, ((w) obj).f3395b);
    }

    public final int hashCode() {
        return this.f3395b.hashCode();
    }
}
