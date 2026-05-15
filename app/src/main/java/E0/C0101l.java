package E0;

/* JADX INFO: renamed from: E0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0101l extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1775g;
    public final float h;

    public C0101l(float f7, float f8, float f9, float f10, float f11, float f12) {
        super(2);
        this.f1771c = f7;
        this.f1772d = f8;
        this.f1773e = f9;
        this.f1774f = f10;
        this.f1775g = f11;
        this.h = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0101l)) {
            return false;
        }
        C0101l c0101l = (C0101l) obj;
        return Float.compare(this.f1771c, c0101l.f1771c) == 0 && Float.compare(this.f1772d, c0101l.f1772d) == 0 && Float.compare(this.f1773e, c0101l.f1773e) == 0 && Float.compare(this.f1774f, c0101l.f1774f) == 0 && Float.compare(this.f1775g, c0101l.f1775g) == 0 && Float.compare(this.h, c0101l.h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.h) + n1.c.n(this.f1775g, n1.c.n(this.f1774f, n1.c.n(this.f1773e, n1.c.n(this.f1772d, Float.floatToIntBits(this.f1771c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f1771c);
        sb.append(", y1=");
        sb.append(this.f1772d);
        sb.append(", x2=");
        sb.append(this.f1773e);
        sb.append(", y2=");
        sb.append(this.f1774f);
        sb.append(", x3=");
        sb.append(this.f1775g);
        sb.append(", y3=");
        return n1.c.u(sb, this.h, ')');
    }
}
