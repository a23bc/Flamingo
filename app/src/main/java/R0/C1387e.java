package r0;

/* JADX INFO: renamed from: r0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1387e implements InterfaceC1386d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15624a;

    public C1387e(float f7) {
        this.f15624a = f7;
    }

    @Override // r0.InterfaceC1386d
    public final long a(long j3, long j7, n1.n nVar) {
        long j8 = (((long) (((int) (j7 >> 32)) - ((int) (j3 >> 32)))) << 32) | (((long) (((int) (j7 & 4294967295L)) - ((int) (j3 & 4294967295L)))) & 4294967295L);
        float f7 = 1;
        float f8 = (this.f15624a + f7) * (((int) (j8 >> 32)) / 2.0f);
        return (((long) Math.round((f7 - 1.0f) * (((int) (j8 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f8)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1387e) {
            return Float.compare(this.f15624a, ((C1387e) obj).f15624a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.f15624a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f15624a + ", verticalBias=-1.0)";
    }
}
