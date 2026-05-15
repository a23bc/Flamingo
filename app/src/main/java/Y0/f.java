package Y0;

import r5.C1420a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f8441c = new f(0.0f, new C1420a(0.0f, 0.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1420a f8443b;

    public f(float f7, C1420a c1420a) {
        this.f8442a = f7;
        this.f8443b = c1420a;
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final C1420a a() {
        return this.f8443b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f8442a == fVar.f8442a && this.f8443b.equals(fVar.f8443b);
    }

    public final int hashCode() {
        return (this.f8443b.hashCode() + (Float.floatToIntBits(this.f8442a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f8442a + ", range=" + this.f8443b + ", steps=0)";
    }
}
