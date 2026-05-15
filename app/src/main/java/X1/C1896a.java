package x1;

import android.graphics.Color;

/* JADX INFO: renamed from: x1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1896a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f19886f;

    public C1896a(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f19881a = f7;
        this.f19882b = f8;
        this.f19883c = f9;
        this.f19884d = f10;
        this.f19885e = f11;
        this.f19886f = f12;
    }

    public static C1896a a(int i7) {
        l lVar = l.f19915k;
        float f7 = b.f(Color.red(i7));
        float f8 = b.f(Color.green(i7));
        float f9 = b.f(Color.blue(i7));
        float[][] fArr = b.f19890d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * f9) + (fArr2[1] * f8) + (fArr2[0] * f7);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * f9) + (fArr3[1] * f8) + (fArr3[0] * f7);
        float[] fArr4 = fArr[2];
        float f12 = (f9 * fArr4[2]) + (f8 * fArr4[1]) + (f7 * fArr4[0]);
        float[][] fArr5 = b.f19887a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = lVar.f19922g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float fAbs = Math.abs(f16);
        float f19 = lVar.h;
        float fPow = (float) Math.pow(((double) (fAbs * f19)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f17) * f19)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f18) * f19)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d4 = fSignum3;
        float f20 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d4)) / 11.0f;
        float f21 = ((float) (((double) (fSignum + fSignum2)) - (d4 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f22)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = fAtan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * lVar.f19917b;
        float f28 = lVar.f19916a;
        float f29 = lVar.f19919d;
        float fPow4 = ((float) Math.pow(f27 / f28, lVar.f19924j * f29)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f30 = f28 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f19921f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f25) < 20.14d ? f25 + 360.0f : f25)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f19920e) * lVar.f19918c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f31 = lVar.f19923i * fPow5;
        Math.sqrt((r3 * f29) / f30);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f26;
        return new C1896a(f25, fPow5, fPow4, f32, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static C1896a b(float f7, float f8, float f9) {
        l lVar = l.f19915k;
        float f10 = lVar.f19919d;
        Math.sqrt(((double) f7) / 100.0d);
        float f11 = lVar.f19916a + 4.0f;
        float f12 = lVar.f19923i * f8;
        Math.sqrt(((f8 / ((float) Math.sqrt(r1))) * lVar.f19919d) / f11);
        float f13 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float fLog = ((float) Math.log((((double) f12) * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f9) / 180.0f;
        return new C1896a(f9, f8, f7, f13, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(x1.l r21) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C1896a.c(x1.l):int");
    }
}
