package E0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1814f;

    public y(float f7, float f8, float f9, float f10) {
        super(2);
        this.f1811c = f7;
        this.f1812d = f8;
        this.f1813e = f9;
        this.f1814f = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f1811c, yVar.f1811c) == 0 && Float.compare(this.f1812d, yVar.f1812d) == 0 && Float.compare(this.f1813e, yVar.f1813e) == 0 && Float.compare(this.f1814f, yVar.f1814f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1814f) + n1.c.n(this.f1813e, n1.c.n(this.f1812d, Float.floatToIntBits(this.f1811c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f1811c);
        sb.append(", dy1=");
        sb.append(this.f1812d);
        sb.append(", dx2=");
        sb.append(this.f1813e);
        sb.append(", dy2=");
        return n1.c.u(sb, this.f1814f, ')');
    }
}
