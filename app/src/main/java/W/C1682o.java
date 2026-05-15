package w;

/* JADX INFO: renamed from: w.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1682o extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18721b;

    public C1682o(float f7, float f8) {
        this.f18720a = f7;
        this.f18721b = f8;
    }

    @Override // w.r
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f18720a;
        }
        if (i7 != 1) {
            return 0.0f;
        }
        return this.f18721b;
    }

    @Override // w.r
    public final int b() {
        return 2;
    }

    @Override // w.r
    public final r c() {
        return new C1682o(0.0f, 0.0f);
    }

    @Override // w.r
    public final void d() {
        this.f18720a = 0.0f;
        this.f18721b = 0.0f;
    }

    @Override // w.r
    public final void e(int i7, float f7) {
        if (i7 == 0) {
            this.f18720a = f7;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f18721b = f7;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1682o)) {
            return false;
        }
        C1682o c1682o = (C1682o) obj;
        return c1682o.f18720a == this.f18720a && c1682o.f18721b == this.f18721b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18721b) + (Float.floatToIntBits(this.f18720a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f18720a + ", v2 = " + this.f18721b;
    }
}
