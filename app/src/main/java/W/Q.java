package w;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f18549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f18551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f18552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f18553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18554g;

    public final long a(float f7, float f8, long j3) {
        double dCos;
        double dExp;
        if (!this.f18550c) {
            if (this.f18548a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f9 = this.f18554g;
            double d4 = f9;
            double d7 = d4 * d4;
            if (f9 > 1.0f) {
                double d8 = this.f18549b;
                double d9 = d7 - ((double) 1);
                this.f18551d = (Math.sqrt(d9) * d8) + (((double) (-f9)) * d8);
                double d10 = -this.f18554g;
                double d11 = this.f18549b;
                this.f18552e = (d10 * d11) - (Math.sqrt(d9) * d11);
            } else if (f9 >= 0.0f && f9 < 1.0f) {
                this.f18553f = Math.sqrt(((double) 1) - d7) * this.f18549b;
            }
            this.f18550c = true;
        }
        float f10 = f7 - this.f18548a;
        double d12 = j3 / 1000.0d;
        float f11 = this.f18554g;
        if (f11 > 1.0f) {
            double d13 = f10;
            double d14 = this.f18552e;
            double d15 = ((d14 * d13) - ((double) f8)) / (d14 - this.f18551d);
            double d16 = d13 - d15;
            dExp = (Math.exp(this.f18551d * d12) * d15) + (Math.exp(d14 * d12) * d16);
            double d17 = this.f18552e;
            double dExp2 = Math.exp(d17 * d12) * d16 * d17;
            double d18 = this.f18551d;
            dCos = (Math.exp(d18 * d12) * d15 * d18) + dExp2;
        } else if (f11 == 1.0f) {
            double d19 = this.f18549b;
            double d20 = f10;
            double d21 = (d19 * d20) + ((double) f8);
            double d22 = (d21 * d12) + d20;
            dExp = Math.exp((-d19) * d12) * d22;
            double dExp3 = Math.exp((-this.f18549b) * d12) * d22;
            double d23 = -this.f18549b;
            dCos = (dExp3 * d23) + (Math.exp(d23 * d12) * d21);
        } else {
            double d24 = ((double) 1) / this.f18553f;
            double d25 = this.f18549b;
            double d26 = f10;
            double d27 = ((((double) f11) * d25 * d26) + ((double) f8)) * d24;
            double dExp4 = Math.exp(((double) (-f11)) * d25 * d12) * ((Math.sin(this.f18553f * d12) * d27) + (Math.cos(this.f18553f * d12) * d26));
            double d28 = this.f18549b;
            float f12 = this.f18554g;
            double d29 = (-d28) * dExp4 * ((double) f12);
            double dExp5 = Math.exp(((double) (-f12)) * d28 * d12);
            double d30 = this.f18553f;
            double dSin = Math.sin(d30 * d12) * (-d30) * d26;
            double d31 = this.f18553f;
            dCos = (((Math.cos(d31 * d12) * d27 * d31) + dSin) * dExp5) + d29;
            dExp = dExp4;
        }
        return (((long) Float.floatToRawIntBits((float) (dExp + ((double) this.f18548a)))) << 32) | (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L);
    }
}
