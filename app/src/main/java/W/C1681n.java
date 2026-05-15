package w;

/* JADX INFO: renamed from: w.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1681n extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18716a;

    public C1681n(float f7) {
        this.f18716a = f7;
    }

    @Override // w.r
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f18716a;
        }
        return 0.0f;
    }

    @Override // w.r
    public final int b() {
        return 1;
    }

    @Override // w.r
    public final r c() {
        return new C1681n(0.0f);
    }

    @Override // w.r
    public final void d() {
        this.f18716a = 0.0f;
    }

    @Override // w.r
    public final void e(int i7, float f7) {
        if (i7 == 0) {
            this.f18716a = f7;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1681n) && ((C1681n) obj).f18716a == this.f18716a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18716a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f18716a;
    }
}
