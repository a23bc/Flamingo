package E0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1810f;

    public x(float f7, float f8, float f9, float f10) {
        super(1);
        this.f1807c = f7;
        this.f1808d = f8;
        this.f1809e = f9;
        this.f1810f = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f1807c, xVar.f1807c) == 0 && Float.compare(this.f1808d, xVar.f1808d) == 0 && Float.compare(this.f1809e, xVar.f1809e) == 0 && Float.compare(this.f1810f, xVar.f1810f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1810f) + n1.c.n(this.f1809e, n1.c.n(this.f1808d, Float.floatToIntBits(this.f1807c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f1807c);
        sb.append(", dy1=");
        sb.append(this.f1808d);
        sb.append(", dx2=");
        sb.append(this.f1809e);
        sb.append(", dy2=");
        return n1.c.u(sb, this.f1810f, ')');
    }
}
