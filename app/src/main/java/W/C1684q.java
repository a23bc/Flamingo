package w;

/* JADX INFO: renamed from: w.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1684q extends r {

    /* JADX INFO: renamed from: a */
    public float f18735a;

    /* JADX INFO: renamed from: b */
    public float f18736b;

    /* JADX INFO: renamed from: c */
    public float f18737c;

    /* JADX INFO: renamed from: d */
    public float f18738d;

    public C1684q(float f7, float f8, float f9, float f10) {
        this.f18735a = f7;
        this.f18736b = f8;
        this.f18737c = f9;
        this.f18738d = f10;
    }

    @Override // w.r
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f18735a;
        }
        if (i7 == 1) {
            return this.f18736b;
        }
        if (i7 == 2) {
            return this.f18737c;
        }
        if (i7 != 3) {
            return 0.0f;
        }
        return this.f18738d;
    }

    @Override // w.r
    public final int b() {
        return 4;
    }

    @Override // w.r
    public final r c() {
        return new C1684q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // w.r
    public final void d() {
        this.f18735a = 0.0f;
        this.f18736b = 0.0f;
        this.f18737c = 0.0f;
        this.f18738d = 0.0f;
    }

    @Override // w.r
    public final void e(int i7, float f7) {
        if (i7 == 0) {
            this.f18735a = f7;
            return;
        }
        if (i7 == 1) {
            this.f18736b = f7;
        } else if (i7 == 2) {
            this.f18737c = f7;
        } else {
            if (i7 != 3) {
                return;
            }
            this.f18738d = f7;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1684q)) {
            return false;
        }
        C1684q c1684q = (C1684q) obj;
        return c1684q.f18735a == this.f18735a && c1684q.f18736b == this.f18736b && c1684q.f18737c == this.f18737c && c1684q.f18738d == this.f18738d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18738d) + n1.c.n(this.f18737c, n1.c.n(this.f18736b, Float.floatToIntBits(this.f18735a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f18735a + ", v2 = " + this.f18736b + ", v3 = " + this.f18737c + ", v4 = " + this.f18738d;
    }
}
