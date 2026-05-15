package r0;

/* JADX INFO: renamed from: r0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1388f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15625a;

    public C1388f(float f7) {
        this.f15625a = f7;
    }

    public final int a(int i7, int i8, n1.n nVar) {
        float f7 = (i8 - i7) / 2.0f;
        n1.n nVar2 = n1.n.f14521o;
        float f8 = this.f15625a;
        if (nVar != nVar2) {
            f8 *= -1;
        }
        return Math.round((1 + f8) * f7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1388f) && Float.compare(this.f15625a, ((C1388f) obj).f15625a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15625a);
    }

    public final String toString() {
        return n1.c.u(new StringBuilder("Horizontal(bias="), this.f15625a, ')');
    }
}
