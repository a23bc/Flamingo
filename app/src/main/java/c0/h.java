package c0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10561d;

    public h(float f7, float f8, float f9, float f10) {
        this.f10558a = f7;
        this.f10559b = f8;
        this.f10560c = f9;
        this.f10561d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f10558a == hVar.f10558a && this.f10559b == hVar.f10559b && this.f10560c == hVar.f10560c && this.f10561d == hVar.f10561d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10561d) + n1.c.n(this.f10560c, n1.c.n(this.f10559b, Float.floatToIntBits(this.f10558a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f10558a);
        sb.append(", focusedAlpha=");
        sb.append(this.f10559b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f10560c);
        sb.append(", pressedAlpha=");
        return n1.c.u(sb, this.f10561d, ')');
    }
}
