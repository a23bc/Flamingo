package z0;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21032c;

    public c(long j3, String str, int i7) {
        this.f21030a = str;
        this.f21031b = j3;
        this.f21032c = i7;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i7 < -1 || i7 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i7);

    public abstract float b(int i7);

    public boolean c() {
        return false;
    }

    public abstract long d(float f7, float f8, float f9);

    public abstract float e(float f7, float f8, float f9);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21032c == cVar.f21032c && AbstractC1209k.a(this.f21030a, cVar.f21030a)) {
            return AbstractC2077b.a(this.f21031b, cVar.f21031b);
        }
        return false;
    }

    public abstract long f(float f7, float f8, float f9, float f10, c cVar);

    public int hashCode() {
        int iHashCode = this.f21030a.hashCode() * 31;
        int i7 = AbstractC2077b.f21029e;
        long j3 = this.f21031b;
        return ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f21032c;
    }

    public final String toString() {
        return this.f21030a + " (id=" + this.f21032c + ", model=" + ((Object) AbstractC2077b.b(this.f21031b)) + ')';
    }
}
