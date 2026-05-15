package E0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1801g;
    public final float h;

    public t(float f7, float f8, float f9, float f10, float f11, float f12) {
        super(2);
        this.f1797c = f7;
        this.f1798d = f8;
        this.f1799e = f9;
        this.f1800f = f10;
        this.f1801g = f11;
        this.h = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f1797c, tVar.f1797c) == 0 && Float.compare(this.f1798d, tVar.f1798d) == 0 && Float.compare(this.f1799e, tVar.f1799e) == 0 && Float.compare(this.f1800f, tVar.f1800f) == 0 && Float.compare(this.f1801g, tVar.f1801g) == 0 && Float.compare(this.h, tVar.h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.h) + n1.c.n(this.f1801g, n1.c.n(this.f1800f, n1.c.n(this.f1799e, n1.c.n(this.f1798d, Float.floatToIntBits(this.f1797c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f1797c);
        sb.append(", dy1=");
        sb.append(this.f1798d);
        sb.append(", dx2=");
        sb.append(this.f1799e);
        sb.append(", dy2=");
        sb.append(this.f1800f);
        sb.append(", dx3=");
        sb.append(this.f1801g);
        sb.append(", dy3=");
        return n1.c.u(sb, this.h, ')');
    }
}
