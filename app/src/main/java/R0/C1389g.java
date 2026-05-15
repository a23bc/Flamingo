package r0;

/* JADX INFO: renamed from: r0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1389g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15626a;

    public C1389g(float f7) {
        this.f15626a = f7;
    }

    public final int a(int i7, int i8) {
        return Math.round((1 + this.f15626a) * ((i8 - i7) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1389g) && Float.compare(this.f15626a, ((C1389g) obj).f15626a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15626a);
    }

    public final String toString() {
        return n1.c.u(new StringBuilder("Vertical(bias="), this.f15626a, ')');
    }
}
