package E0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1790d;

    public r(float f7, float f8) {
        super(1);
        this.f1789c = f7;
        this.f1790d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f1789c, rVar.f1789c) == 0 && Float.compare(this.f1790d, rVar.f1790d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1790d) + (Float.floatToIntBits(this.f1789c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f1789c);
        sb.append(", y=");
        return n1.c.u(sb, this.f1790d, ')');
    }
}
