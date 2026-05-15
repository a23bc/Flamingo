package E0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1784f;

    public p(float f7, float f8, float f9, float f10) {
        super(1);
        this.f1781c = f7;
        this.f1782d = f8;
        this.f1783e = f9;
        this.f1784f = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f1781c, pVar.f1781c) == 0 && Float.compare(this.f1782d, pVar.f1782d) == 0 && Float.compare(this.f1783e, pVar.f1783e) == 0 && Float.compare(this.f1784f, pVar.f1784f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1784f) + n1.c.n(this.f1783e, n1.c.n(this.f1782d, Float.floatToIntBits(this.f1781c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f1781c);
        sb.append(", y1=");
        sb.append(this.f1782d);
        sb.append(", x2=");
        sb.append(this.f1783e);
        sb.append(", y2=");
        return n1.c.u(sb, this.f1784f, ')');
    }
}
