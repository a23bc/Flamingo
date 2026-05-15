package Q0;

/* JADX INFO: renamed from: Q0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0359o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6060d;

    public C0359o(float f7, float f8, float f9, float f10) {
        this.f6057a = f7;
        this.f6058b = f8;
        this.f6059c = f9;
        this.f6060d = f10;
        if (f7 < 0.0f) {
            N0.a.a("Left must be non-negative");
        }
        if (f8 < 0.0f) {
            N0.a.a("Top must be non-negative");
        }
        if (f9 < 0.0f) {
            N0.a.a("Right must be non-negative");
        }
        if (f10 >= 0.0f) {
            return;
        }
        N0.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0359o)) {
            return false;
        }
        C0359o c0359o = (C0359o) obj;
        return n1.g.a(this.f6057a, c0359o.f6057a) && n1.g.a(this.f6058b, c0359o.f6058b) && n1.g.a(this.f6059c, c0359o.f6059c) && n1.g.a(this.f6060d, c0359o.f6060d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f6060d) + n1.c.n(this.f6059c, n1.c.n(this.f6058b, Float.floatToIntBits(this.f6057a) * 31, 31), 31)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) n1.g.b(this.f6057a)) + ", top=" + ((Object) n1.g.b(this.f6058b)) + ", end=" + ((Object) n1.g.b(this.f6059c)) + ", bottom=" + ((Object) n1.g.b(this.f6060d)) + ", isLayoutDirectionAware=true)";
    }
}
