package w;

/* JADX INFO: renamed from: w.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1686t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f18744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f18745b;

    public C1686t(double d4, double d7) {
        this.f18744a = d4;
        this.f18745b = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1686t)) {
            return false;
        }
        C1686t c1686t = (C1686t) obj;
        return Double.compare(this.f18744a, c1686t.f18744a) == 0 && Double.compare(this.f18745b, c1686t.f18745b) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f18744a);
        int i7 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f18745b);
        return i7 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f18744a + ", _imaginary=" + this.f18745b + ')';
    }
}
