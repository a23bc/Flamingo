package z0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a */
    public final float f21102a;

    /* JADX INFO: renamed from: b */
    public final float f21103b;

    public s(float f7, float f8) {
        this.f21102a = f7;
        this.f21103b = f8;
    }

    public final float[] a() {
        float f7 = this.f21102a;
        float f8 = this.f21103b;
        return new float[]{f7 / f8, 1.0f, ((1.0f - f7) - f8) / f8};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f21102a, sVar.f21102a) == 0 && Float.compare(this.f21103b, sVar.f21103b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21103b) + (Float.floatToIntBits(this.f21102a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f21102a);
        sb.append(", y=");
        return n1.c.u(sb, this.f21103b, ')');
    }
}
