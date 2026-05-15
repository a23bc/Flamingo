package x0;

import j5.AbstractC1109c;

/* JADX INFO: renamed from: x0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1893c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1893c f19868e = new C1893c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19872d;

    public C1893c(float f7, float f8, float f9, float f10) {
        this.f19869a = f7;
        this.f19870b = f8;
        this.f19871c = f9;
        this.f19872d = f10;
    }

    public static C1893c a(C1893c c1893c, float f7, float f8, float f9, int i7) {
        if ((i7 & 1) != 0) {
            f7 = c1893c.f19869a;
        }
        if ((i7 & 4) != 0) {
            f8 = c1893c.f19871c;
        }
        if ((i7 & 8) != 0) {
            f9 = c1893c.f19872d;
        }
        return new C1893c(f7, c1893c.f19870b, f8, f9);
    }

    public final long b() {
        float f7 = this.f19871c;
        float f8 = this.f19869a;
        float f9 = ((f7 - f8) / 2.0f) + f8;
        float f10 = this.f19872d;
        float f11 = this.f19870b;
        return (((long) Float.floatToRawIntBits(((f10 - f11) / 2.0f) + f11)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    public final long c() {
        float f7 = this.f19871c - this.f19869a;
        return (((long) Float.floatToRawIntBits(this.f19872d - this.f19870b)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.f19869a)) << 32) | (((long) Float.floatToRawIntBits(this.f19870b)) & 4294967295L);
    }

    public final C1893c e(C1893c c1893c) {
        return new C1893c(Math.max(this.f19869a, c1893c.f19869a), Math.max(this.f19870b, c1893c.f19870b), Math.min(this.f19871c, c1893c.f19871c), Math.min(this.f19872d, c1893c.f19872d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1893c)) {
            return false;
        }
        C1893c c1893c = (C1893c) obj;
        return Float.compare(this.f19869a, c1893c.f19869a) == 0 && Float.compare(this.f19870b, c1893c.f19870b) == 0 && Float.compare(this.f19871c, c1893c.f19871c) == 0 && Float.compare(this.f19872d, c1893c.f19872d) == 0;
    }

    public final boolean f() {
        return (this.f19869a >= this.f19871c) | (this.f19870b >= this.f19872d);
    }

    public final boolean g(C1893c c1893c) {
        return (this.f19869a < c1893c.f19871c) & (c1893c.f19869a < this.f19871c) & (this.f19870b < c1893c.f19872d) & (c1893c.f19870b < this.f19872d);
    }

    public final C1893c h(float f7, float f8) {
        return new C1893c(this.f19869a + f7, this.f19870b + f8, this.f19871c + f7, this.f19872d + f8);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19872d) + n1.c.n(this.f19871c, n1.c.n(this.f19870b, Float.floatToIntBits(this.f19869a) * 31, 31), 31);
    }

    public final C1893c i(long j3) {
        int i7 = (int) (j3 >> 32);
        int i8 = (int) (j3 & 4294967295L);
        return new C1893c(Float.intBitsToFloat(i7) + this.f19869a, Float.intBitsToFloat(i8) + this.f19870b, Float.intBitsToFloat(i7) + this.f19871c, Float.intBitsToFloat(i8) + this.f19872d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC1109c.B(this.f19869a) + ", " + AbstractC1109c.B(this.f19870b) + ", " + AbstractC1109c.B(this.f19871c) + ", " + AbstractC1109c.B(this.f19872d) + ')';
    }
}
