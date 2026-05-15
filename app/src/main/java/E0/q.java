package E0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1788f;

    public q(float f7, float f8, float f9, float f10) {
        super(2);
        this.f1785c = f7;
        this.f1786d = f8;
        this.f1787e = f9;
        this.f1788f = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f1785c, qVar.f1785c) == 0 && Float.compare(this.f1786d, qVar.f1786d) == 0 && Float.compare(this.f1787e, qVar.f1787e) == 0 && Float.compare(this.f1788f, qVar.f1788f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1788f) + n1.c.n(this.f1787e, n1.c.n(this.f1786d, Float.floatToIntBits(this.f1785c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f1785c);
        sb.append(", y1=");
        sb.append(this.f1786d);
        sb.append(", x2=");
        sb.append(this.f1787e);
        sb.append(", y2=");
        return n1.c.u(sb, this.f1788f, ')');
    }
}
