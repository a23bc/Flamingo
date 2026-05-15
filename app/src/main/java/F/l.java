package F;

import H.E;
import H.K;
import f0.C0912t;
import f0.C0915u0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class l implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f2083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0130c f2085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D4.i f2086d;

    public l(A a4, i iVar, C0130c c0130c, D4.i iVar2) {
        this.f2083a = a4;
        this.f2084b = iVar;
        this.f2085c = c0130c;
        this.f2086d = iVar2;
    }

    @Override // H.K
    public final int a() {
        return this.f2084b.m().f1582p;
    }

    @Override // H.K
    public final Object b(int i7) {
        Object objN = this.f2086d.n(i7);
        return objN == null ? this.f2084b.n(i7) : objN;
    }

    @Override // H.K
    public final Object c(int i7) {
        return this.f2084b.l(i7);
    }

    @Override // H.K
    public final int d(Object obj) {
        return this.f2086d.l(obj);
    }

    @Override // H.K
    public final void e(int i7, Object obj, C0912t c0912t, int i8) {
        c0912t.Z(-462424778);
        int i9 = (c0912t.d(i7) ? 4 : 2) | i8 | (c0912t.h(obj) ? 32 : 16) | (c0912t.f(this) ? 256 : 128);
        if (c0912t.N(i9 & 1, (i9 & 147) != 146)) {
            E.d(obj, i7, this.f2083a.f2039r, n0.e.e(-824725566, new k(this, i7, 0), c0912t), c0912t, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new j(this, i7, obj, i8, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return AbstractC1209k.a(this.f2084b, ((l) obj).f2084b);
    }

    public final int hashCode() {
        return this.f2084b.hashCode();
    }
}
