package x1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f19915k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f19921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f19922g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f19924j;

    static {
        float[] fArr = b.f19889c;
        float fL = (float) ((((double) b.l()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f19887a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr3[0] * f7;
        float f9 = fArr[1];
        float f10 = (fArr3[1] * f9) + f8;
        float f11 = fArr[2];
        float f12 = (fArr3[2] * f11) + f10;
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[2] * f11) + (fArr4[1] * f9) + (fArr4[0] * f7);
        float[] fArr5 = fArr2[2];
        float f14 = (f11 * fArr5[2]) + (f9 * fArr5[1]) + (f7 * fArr5[0]);
        float f15 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fL) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = fExp;
        if (d4 > 1.0d) {
            fExp = 1.0f;
        } else if (d4 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f12) * fExp) + 1.0f) - fExp, (((100.0f / f13) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp};
        float f16 = 1.0f / ((5.0f * fL) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float fCbrt = (0.1f * f18 * f18 * ((float) Math.cbrt(((double) fL) * 5.0d))) + (f17 * fL);
        float fL2 = b.l() / fArr[1];
        double d7 = fL2;
        float fSqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f13)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f14)) / 100.0d, 0.42d)};
        float f19 = fArr7[0];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr7[1];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[2];
        float[] fArr8 = {f20, f22, (400.0f * f23) / (f23 + 27.13f)};
        f19915k = new l(fL2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f15, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public l(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f19921f = f7;
        this.f19916a = f8;
        this.f19917b = f9;
        this.f19918c = f10;
        this.f19919d = f11;
        this.f19920e = f12;
        this.f19922g = fArr;
        this.h = f13;
        this.f19923i = f14;
        this.f19924j = f15;
    }
}
