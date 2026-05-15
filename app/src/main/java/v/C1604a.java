package v;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1604a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18025b;

    public C1604a(float f7, float f8) {
        this.f18024a = f7;
        this.f18025b = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1604a)) {
            return false;
        }
        C1604a c1604a = (C1604a) obj;
        return Float.compare(this.f18024a, c1604a.f18024a) == 0 && Float.compare(this.f18025b, c1604a.f18025b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18025b) + (Float.floatToIntBits(this.f18024a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f18024a);
        sb.append(", velocityCoefficient=");
        return n1.c.u(sb, this.f18025b, ')');
    }
}
