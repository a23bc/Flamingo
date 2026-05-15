package z0;

import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(long j3, String str, int i7, int i8) {
        super(j3, str, i7);
        this.f21069d = i8;
    }

    @Override // z0.c
    public final float a(int i7) {
        switch (this.f21069d) {
            case 0:
                return i7 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // z0.c
    public final float b(int i7) {
        switch (this.f21069d) {
            case 0:
                return i7 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // z0.c
    public final long d(float f7, float f8, float f9) {
        switch (this.f21069d) {
            case 0:
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                if (f7 > 100.0f) {
                    f7 = 100.0f;
                }
                if (f8 < -128.0f) {
                    f8 = -128.0f;
                }
                if (f8 > 128.0f) {
                    f8 = 128.0f;
                }
                float f10 = (f7 + 16.0f) / 116.0f;
                float f11 = (f8 * 0.002f) + f10;
                float f12 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
                float f13 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
                float[] fArr = j.f21068e;
                return (((long) Float.floatToRawIntBits(f13 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f12 * fArr[0])) << 32);
            default:
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f8 <= 2.0f ? f8 : 2.0f)) & 4294967295L);
        }
    }

    @Override // z0.c
    public final float e(float f7, float f8, float f9) {
        switch (this.f21069d) {
            case 0:
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                if (f7 > 100.0f) {
                    f7 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                float f10 = ((f7 + 16.0f) / 116.0f) - (f9 * 0.005f);
                return (f10 > 0.20689656f ? f10 * f10 * f10 : 0.12841855f * (f10 - 0.13793103f)) * j.f21068e[2];
            default:
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                if (f9 > 2.0f) {
                    return 2.0f;
                }
                return f9;
        }
    }

    @Override // z0.c
    public final long f(float f7, float f8, float f9, float f10, c cVar) {
        switch (this.f21069d) {
            case 0:
                float[] fArr = j.f21068e;
                float f11 = f7 / fArr[0];
                float f12 = f8 / fArr[1];
                float f13 = f9 / fArr[2];
                float fCbrt = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f;
                float f14 = (116.0f * fCbrt2) - 16.0f;
                float f15 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                if (f14 > 100.0f) {
                    f14 = 100.0f;
                }
                if (f15 < -128.0f) {
                    f15 = -128.0f;
                }
                if (f15 > 128.0f) {
                    f15 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return AbstractC1959I.b(f14, f15, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f10, cVar);
            default:
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                if (f8 > 2.0f) {
                    f8 = 2.0f;
                }
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                return AbstractC1959I.b(f7, f8, f9 <= 2.0f ? f9 : 2.0f, f10, cVar);
        }
    }
}
