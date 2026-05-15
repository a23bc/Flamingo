package z0;

import k.AbstractC1113a;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f21070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f21071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f21072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f21073g;

    static {
        float[] fArrG = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(C2076a.f21023b.f21024a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f21070d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f21071e = fArr;
        f21072f = j.f(fArrG);
        f21073g = j.f(fArr);
    }

    @Override // z0.c
    public final float a(int i7) {
        return i7 == 0 ? 1.0f : 0.5f;
    }

    @Override // z0.c
    public final float b(int i7) {
        return i7 == 0 ? 0.0f : -0.5f;
    }

    @Override // z0.c
    public final long d(float f7, float f8, float f9) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        if (f8 > 0.5f) {
            f8 = 0.5f;
        }
        if (f9 < -0.5f) {
            f9 = -0.5f;
        }
        float f10 = f9 <= 0.5f ? f9 : 0.5f;
        float[] fArr = f21073g;
        float f11 = (fArr[6] * f10) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f10) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f10) + (fArr[5] * f8) + (fArr[2] * f7);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f21072f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f16) + (fArr2[4] * f15) + (fArr2[1] * f14))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f16) + ((fArr2[3] * f15) + (fArr2[0] * f14)))) << 32);
    }

    @Override // z0.c
    public final float e(float f7, float f8, float f9) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        if (f8 > 0.5f) {
            f8 = 0.5f;
        }
        if (f9 < -0.5f) {
            f9 = -0.5f;
        }
        float f10 = f9 <= 0.5f ? f9 : 0.5f;
        float[] fArr = f21073g;
        float f11 = (fArr[6] * f10) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f10) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f10) + (fArr[5] * f8) + (fArr[2] * f7);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f21072f;
        return (fArr2[8] * f16) + (fArr2[5] * f15) + (fArr2[2] * f14);
    }

    @Override // z0.c
    public final long f(float f7, float f8, float f9, float f10, c cVar) {
        float[] fArr = f21070d;
        float f11 = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f7);
        float fE = AbstractC1113a.E(f11);
        float fE2 = AbstractC1113a.E(f12);
        float fE3 = AbstractC1113a.E(f13);
        float[] fArr2 = f21071e;
        return AbstractC1959I.b((fArr2[6] * fE3) + (fArr2[3] * fE2) + (fArr2[0] * fE), (fArr2[7] * fE3) + (fArr2[4] * fE2) + (fArr2[1] * fE), (fArr2[8] * fE3) + (fArr2[5] * fE2) + (fArr2[2] * fE), f10, cVar);
    }
}
