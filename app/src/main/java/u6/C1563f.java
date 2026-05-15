package u6;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: u6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1563f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC1561e f17600c;

    public C1563f(EnumC1561e enumC1561e, int i7) {
        float f7 = 0;
        float f8 = -2;
        enumC1561e = (i7 & 4) != 0 ? EnumC1561e.f17586o : enumC1561e;
        AbstractC1209k.f(enumC1561e, "alignment");
        this.f17598a = f7;
        this.f17599b = f8;
        this.f17600c = enumC1561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1563f)) {
            return false;
        }
        C1563f c1563f = (C1563f) obj;
        return n1.g.a(this.f17598a, c1563f.f17598a) && n1.g.a(this.f17599b, c1563f.f17599b) && this.f17600c == c1563f.f17600c;
    }

    public final int hashCode() {
        return this.f17600c.hashCode() + n1.c.n(this.f17599b, Float.floatToIntBits(this.f17598a) * 31, 31);
    }

    public final String toString() {
        return "LyricFlowLayoutConfig(horizontalSpacing=" + ((Object) n1.g.b(this.f17598a)) + ", verticalSpacing=" + ((Object) n1.g.b(this.f17599b)) + ", alignment=" + this.f17600c + ')';
    }
}
