package T4;

import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f6979e = new m(0L, 0L, 0.0f, 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6983d;

    public m(long j3, long j7, float f7, int i7) {
        this((i7 & 1) != 0 ? C1987t.f20262j : j3, (i7 & 2) != 0 ? C1987t.f20262j : j7, (i7 & 4) != 0 ? Float.NaN : f7, -1.0f);
    }

    public static m a(m mVar, long j3, long j7, float f7, int i7) {
        if ((i7 & 1) != 0) {
            j3 = mVar.f6980a;
        }
        long j8 = j3;
        if ((i7 & 2) != 0) {
            j7 = mVar.f6981b;
        }
        return new m(j8, j7, f7, mVar.f6983d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C1987t.c(this.f6980a, mVar.f6980a) && C1987t.c(this.f6981b, mVar.f6981b) && n1.g.a(this.f6982c, mVar.f6982c) && Float.compare(this.f6983d, mVar.f6983d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6983d) + n1.c.n(this.f6982c, n1.c.o(C1987t.i(this.f6980a) * 31, 31, this.f6981b), 31);
    }

    public final String toString() {
        return "HazeStyle(backgroundColor=" + C1987t.j(this.f6980a) + ", tint=" + C1987t.j(this.f6981b) + ", blurRadius=" + n1.g.b(this.f6982c) + ", noiseFactor=" + this.f6983d + ")";
    }

    public m(long j3, long j7, float f7, float f8) {
        this.f6980a = j3;
        this.f6981b = j7;
        this.f6982c = f7;
        this.f6983d = f8;
    }
}
