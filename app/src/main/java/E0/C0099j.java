package E0;

/* JADX INFO: renamed from: E0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0099j extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1768g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1769i;

    public C0099j(float f7, float f8, float f9, boolean z6, boolean z7, float f10, float f11) {
        super(3);
        this.f1764c = f7;
        this.f1765d = f8;
        this.f1766e = f9;
        this.f1767f = z6;
        this.f1768g = z7;
        this.h = f10;
        this.f1769i = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0099j)) {
            return false;
        }
        C0099j c0099j = (C0099j) obj;
        return Float.compare(this.f1764c, c0099j.f1764c) == 0 && Float.compare(this.f1765d, c0099j.f1765d) == 0 && Float.compare(this.f1766e, c0099j.f1766e) == 0 && this.f1767f == c0099j.f1767f && this.f1768g == c0099j.f1768g && Float.compare(this.h, c0099j.h) == 0 && Float.compare(this.f1769i, c0099j.f1769i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1769i) + n1.c.n(this.h, (((n1.c.n(this.f1766e, n1.c.n(this.f1765d, Float.floatToIntBits(this.f1764c) * 31, 31), 31) + (this.f1767f ? 1231 : 1237)) * 31) + (this.f1768g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f1764c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f1765d);
        sb.append(", theta=");
        sb.append(this.f1766e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f1767f);
        sb.append(", isPositiveArc=");
        sb.append(this.f1768g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return n1.c.u(sb, this.f1769i, ')');
    }
}
