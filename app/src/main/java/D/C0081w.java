package D;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: D.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0081w implements InterfaceC0077s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0.B0 f1408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1409b;

    public C0081w(O0.B0 b0, long j3) {
        this.f1408a = b0;
        this.f1409b = j3;
    }

    public final float a() {
        long j3 = this.f1409b;
        if (!n1.a.d(j3)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f1408a.i0(n1.a.h(j3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0081w)) {
            return false;
        }
        C0081w c0081w = (C0081w) obj;
        return AbstractC1209k.a(this.f1408a, c0081w.f1408a) && n1.a.b(this.f1409b, c0081w.f1409b);
    }

    public final int hashCode() {
        int iHashCode = this.f1408a.hashCode() * 31;
        long j3 = this.f1409b;
        return ((int) (j3 ^ (j3 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f1408a + ", constraints=" + ((Object) n1.a.k(this.f1409b)) + ')';
    }
}
