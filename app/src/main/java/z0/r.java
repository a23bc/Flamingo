package z0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f21095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f21096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f21097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f21098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f21099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f21100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f21101g;

    public /* synthetic */ r(double d4, double d7, double d8, double d9, double d10) {
        this(d4, d7, d8, d9, d10, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f21095a, rVar.f21095a) == 0 && Double.compare(this.f21096b, rVar.f21096b) == 0 && Double.compare(this.f21097c, rVar.f21097c) == 0 && Double.compare(this.f21098d, rVar.f21098d) == 0 && Double.compare(this.f21099e, rVar.f21099e) == 0 && Double.compare(this.f21100f, rVar.f21100f) == 0 && Double.compare(this.f21101g, rVar.f21101g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f21095a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f21096b);
        int i7 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f21097c);
        int i8 = (i7 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f21098d);
        int i9 = (i8 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f21099e);
        int i10 = (i9 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f21100f);
        int i11 = (i10 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f21101g);
        return i11 + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f21095a + ", a=" + this.f21096b + ", b=" + this.f21097c + ", c=" + this.f21098d + ", d=" + this.f21099e + ", e=" + this.f21100f + ", f=" + this.f21101g + ')';
    }

    public r(double d4, double d7, double d8, double d9, double d10, double d11, double d12) {
        this.f21095a = d4;
        this.f21096b = d7;
        this.f21097c = d8;
        this.f21098d = d9;
        this.f21099e = d10;
        this.f21100f = d11;
        this.f21101g = d12;
        if (Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d4)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d4 == -2.0d || d4 == -3.0d) {
            return;
        }
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d10);
        }
        if (d10 == 0.0d && (d7 == 0.0d || d4 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d10 >= 1.0d && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d7 == 0.0d || d4 == 0.0d) && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d9 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d7 < 0.0d || d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
