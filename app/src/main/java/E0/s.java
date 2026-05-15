package E0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1795g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1796i;

    public s(float f7, float f8, float f9, boolean z6, boolean z7, float f10, float f11) {
        super(3);
        this.f1791c = f7;
        this.f1792d = f8;
        this.f1793e = f9;
        this.f1794f = z6;
        this.f1795g = z7;
        this.h = f10;
        this.f1796i = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f1791c, sVar.f1791c) == 0 && Float.compare(this.f1792d, sVar.f1792d) == 0 && Float.compare(this.f1793e, sVar.f1793e) == 0 && this.f1794f == sVar.f1794f && this.f1795g == sVar.f1795g && Float.compare(this.h, sVar.h) == 0 && Float.compare(this.f1796i, sVar.f1796i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1796i) + n1.c.n(this.h, (((n1.c.n(this.f1793e, n1.c.n(this.f1792d, Float.floatToIntBits(this.f1791c) * 31, 31), 31) + (this.f1794f ? 1231 : 1237)) * 31) + (this.f1795g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f1791c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f1792d);
        sb.append(", theta=");
        sb.append(this.f1793e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f1794f);
        sb.append(", isPositiveArc=");
        sb.append(this.f1795g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return n1.c.u(sb, this.f1796i, ')');
    }
}
