package v;

/* JADX INFO: renamed from: v.T, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1601T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18011c;

    public C1601T(float f7, float f8, long j3) {
        this.f18009a = f7;
        this.f18010b = f8;
        this.f18011c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1601T)) {
            return false;
        }
        C1601T c1601t = (C1601T) obj;
        return Float.compare(this.f18009a, c1601t.f18009a) == 0 && Float.compare(this.f18010b, c1601t.f18010b) == 0 && this.f18011c == c1601t.f18011c;
    }

    public final int hashCode() {
        int iN = n1.c.n(this.f18010b, Float.floatToIntBits(this.f18009a) * 31, 31);
        long j3 = this.f18011c;
        return iN + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f18009a + ", distance=" + this.f18010b + ", duration=" + this.f18011c + ')';
    }
}
