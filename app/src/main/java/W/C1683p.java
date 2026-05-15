package w;

/* JADX INFO: renamed from: w.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1683p extends r {

    /* JADX INFO: renamed from: a */
    public float f18724a;

    /* JADX INFO: renamed from: b */
    public float f18725b;

    /* JADX INFO: renamed from: c */
    public float f18726c;

    public C1683p(float f7, float f8, float f9) {
        this.f18724a = f7;
        this.f18725b = f8;
        this.f18726c = f9;
    }

    @Override // w.r
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f18724a;
        }
        if (i7 == 1) {
            return this.f18725b;
        }
        if (i7 != 2) {
            return 0.0f;
        }
        return this.f18726c;
    }

    @Override // w.r
    public final int b() {
        return 3;
    }

    @Override // w.r
    public final r c() {
        return new C1683p(0.0f, 0.0f, 0.0f);
    }

    @Override // w.r
    public final void d() {
        this.f18724a = 0.0f;
        this.f18725b = 0.0f;
        this.f18726c = 0.0f;
    }

    @Override // w.r
    public final void e(int i7, float f7) {
        if (i7 == 0) {
            this.f18724a = f7;
        } else if (i7 == 1) {
            this.f18725b = f7;
        } else {
            if (i7 != 2) {
                return;
            }
            this.f18726c = f7;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1683p)) {
            return false;
        }
        C1683p c1683p = (C1683p) obj;
        return c1683p.f18724a == this.f18724a && c1683p.f18725b == this.f18725b && c1683p.f18726c == this.f18726c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18726c) + n1.c.n(this.f18725b, Float.floatToIntBits(this.f18724a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f18724a + ", v2 = " + this.f18725b + ", v3 = " + this.f18726c;
    }
}
