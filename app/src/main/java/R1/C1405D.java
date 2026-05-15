package r1;

/* JADX INFO: renamed from: r1.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1405D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15660e;

    public C1405D(int i7) {
        this((i7 & 1) == 0, EnumC1406E.f15661o, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405D)) {
            return false;
        }
        C1405D c1405d = (C1405D) obj;
        return this.f15656a == c1405d.f15656a && this.f15657b == c1405d.f15657b && this.f15658c == c1405d.f15658c && this.f15659d == c1405d.f15659d && this.f15660e == c1405d.f15660e;
    }

    public final int hashCode() {
        return (((((((((this.f15656a * 31) + (this.f15657b ? 1231 : 1237)) * 31) + (this.f15658c ? 1231 : 1237)) * 31) + (this.f15659d ? 1231 : 1237)) * 31) + (this.f15660e ? 1231 : 1237)) * 31) + 1237;
    }

    public C1405D(boolean z6, EnumC1406E enumC1406E, boolean z7) {
        f0.D d4 = n.f15708a;
        int i7 = !z6 ? 262152 : 262144;
        i7 = enumC1406E == EnumC1406E.f15662p ? i7 | 8192 : i7;
        i7 = z7 ? i7 : i7 | 512;
        boolean z8 = enumC1406E == EnumC1406E.f15661o;
        this.f15656a = i7;
        this.f15657b = z8;
        this.f15658c = true;
        this.f15659d = true;
        this.f15660e = true;
    }
}
