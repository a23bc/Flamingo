package r5;

/* JADX INFO: renamed from: r5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1420a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15780b;

    public C1420a(float f7, float f8) {
        this.f15779a = f7;
        this.f15780b = f8;
    }

    public static boolean a(Float f7, Float f8) {
        return f7.floatValue() <= f8.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1420a)) {
            return false;
        }
        float f7 = this.f15779a;
        float f8 = this.f15780b;
        if (f7 > f8) {
            C1420a c1420a = (C1420a) obj;
            if (c1420a.f15779a > c1420a.f15780b) {
                return true;
            }
        }
        C1420a c1420a2 = (C1420a) obj;
        return f7 == c1420a2.f15779a && f8 == c1420a2.f15780b;
    }

    public final int hashCode() {
        float f7 = this.f15779a;
        float f8 = this.f15780b;
        if (f7 > f8) {
            return -1;
        }
        return Float.floatToIntBits(f8) + (Float.floatToIntBits(f7) * 31);
    }

    public final String toString() {
        return this.f15779a + ".." + this.f15780b;
    }
}
