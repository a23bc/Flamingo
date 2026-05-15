package L;

import x0.C1895e;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4085a;

    public d(float f7) {
        this.f4085a = f7;
        if (f7 < 0.0f || f7 > 100.0f) {
            C.b.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // L.b
    public final float a(long j3, n1.d dVar) {
        return (this.f4085a / 100.0f) * C1895e.c(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f4085a, ((d) obj).f4085a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4085a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4085a + "%)";
    }
}
