package v;

import w.InterfaceC1654C;

/* JADX INFO: renamed from: v.U, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1602U implements InterfaceC1654C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f18012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f18013p;

    public C1602U(float f7, n1.d dVar) {
        this.f18012o = f7;
        float fB = dVar.b();
        float f8 = AbstractC1603V.f18014a;
        this.f18013p = fB * 386.0878f * 160.0f * 0.84f;
    }

    @Override // w.InterfaceC1654C
    public float C(float f7, float f8, long j3) {
        float f9 = this.f18013p;
        return ((f8 / f9) * ((float) Math.exp((f9 * (j3 / 1000000)) / 1000.0f))) + (f7 - (f8 / f9));
    }

    public C1601T a(float f7) {
        double dB = b(f7);
        double d4 = AbstractC1603V.f18014a;
        double d7 = d4 - 1.0d;
        return new C1601T(f7, (float) (Math.exp((d4 / d7) * dB) * ((double) (this.f18012o * this.f18013p))), (long) (Math.exp(dB / d7) * 1000.0d));
    }

    public double b(float f7) {
        float[] fArr = AbstractC1605b.f18033a;
        return Math.log(((double) (Math.abs(f7) * 0.35f)) / ((double) (this.f18012o * this.f18013p)));
    }

    @Override // w.InterfaceC1654C
    public long k(float f7) {
        return ((long) ((((float) Math.log(this.f18012o / Math.abs(f7))) * 1000.0f) / this.f18013p)) * 1000000;
    }

    @Override // w.InterfaceC1654C
    public float l() {
        return this.f18012o;
    }

    @Override // w.InterfaceC1654C
    public float m(float f7, float f8) {
        if (Math.abs(f8) <= this.f18012o) {
            return f7;
        }
        double dLog = Math.log(Math.abs(r1 / f8));
        float f9 = this.f18013p;
        return ((f8 / f9) * ((float) Math.exp((((double) f9) * ((dLog / ((double) f9)) * ((double) 1000))) / ((double) 1000.0f)))) + (f7 - (f8 / f9));
    }

    @Override // w.InterfaceC1654C
    public float t(long j3, float f7) {
        return f7 * ((float) Math.exp(((j3 / 1000000) / 1000.0f) * this.f18013p));
    }

    public C1602U() {
        this.f18012o = Math.max(1.0E-7f, Math.abs(0.1f));
        this.f18013p = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }
}
