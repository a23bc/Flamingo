package m1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f14351c = new p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14353b;

    public p(float f7, float f8) {
        this.f14352a = f7;
        this.f14353b = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f14352a == pVar.f14352a && this.f14353b == pVar.f14353b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14353b) + (Float.floatToIntBits(this.f14352a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f14352a);
        sb.append(", skewX=");
        return n1.c.u(sb, this.f14353b, ')');
    }
}
