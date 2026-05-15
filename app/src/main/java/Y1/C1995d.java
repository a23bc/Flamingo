package y1;

import android.graphics.Path;
import j5.AbstractC1110d;

/* JADX INFO: renamed from: y1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1995d {

    /* JADX INFO: renamed from: a */
    public char f20276a;

    /* JADX INFO: renamed from: b */
    public final float[] f20277b;

    public C1995d(char c7, float[] fArr) {
        this.f20276a = c7;
        this.f20277b = fArr;
    }

    public static void a(Path path, float f7, float f8, float f9, float f10, float f11, float f12, float f13, boolean z6, boolean z7) {
        double d4;
        double d7;
        double radians = Math.toRadians(f13);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d8 = f7;
        double d9 = f8;
        double d10 = f11;
        double d11 = ((d9 * dSin) + (d8 * dCos)) / d10;
        double d12 = f12;
        double d13 = ((d9 * dCos) + (((double) (-f7)) * dSin)) / d12;
        double d14 = f10;
        double d15 = ((d14 * dSin) + (((double) f9) * dCos)) / d10;
        double d16 = ((d14 * dCos) + (((double) (-f9)) * dSin)) / d12;
        double d17 = d11 - d15;
        double d18 = d13 - d16;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d13 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f7, f8, f9, f10, f11 * fSqrt, fSqrt * f12, f13, z6, z7);
            return;
        }
        double dSqrt = Math.sqrt(d22);
        double d23 = d17 * dSqrt;
        double d24 = dSqrt * d18;
        if (z6 == z7) {
            d4 = d19 - d24;
            d7 = d20 + d23;
        } else {
            d4 = d19 + d24;
            d7 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d7, d11 - d4);
        double dAtan22 = Math.atan2(d16 - d7, d15 - d4) - dAtan2;
        if (z7 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d4 * d10;
        double d26 = d7 * d12;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d10;
        double d30 = d29 * dCos2;
        double d31 = d12 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d12 * dCos2;
        double d35 = dAtan22 / ((double) iCeil);
        double d36 = (dCos3 * d34) + (dSin3 * d33);
        int i7 = 0;
        double d37 = d8;
        double d38 = d9;
        double d39 = dAtan2;
        while (i7 < iCeil) {
            double d40 = d39 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            double d41 = d35;
            double d42 = (((d10 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = d27;
            double d44 = (d34 * dSin4) + (d10 * dSin2 * dCos4) + d28;
            double d45 = (d30 * dSin4) - (d31 * dCos4);
            double d46 = (dCos4 * d34) + (dSin4 * d33);
            double d47 = d40 - d39;
            double dTan = Math.tan(d47 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d32 * dSqrt2) + d37), (float) ((d36 * dSqrt2) + d38), (float) (d42 - (dSqrt2 * d45)), (float) (d44 - (dSqrt2 * d46)), (float) d42, (float) d44);
            i7++;
            d38 = d44;
            iCeil = iCeil;
            d33 = d33;
            dCos2 = dCos2;
            d39 = d40;
            d36 = d46;
            d32 = d45;
            d27 = d43;
            d37 = d42;
            d35 = d41;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(C1995d[] c1995dArr, Path path) {
        int i7;
        int i8;
        C1995d c1995d;
        int i9;
        char c7;
        float f7;
        float f8;
        float f9;
        float f10;
        C1995d c1995d2;
        boolean z6;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = c1995dArr.length;
        char c8 = 'm';
        int i10 = 0;
        char c9 = 'm';
        int i11 = 0;
        while (i11 < length) {
            C1995d c1995d3 = c1995dArr[i11];
            char c10 = c1995d3.f20276a;
            float f19 = fArr[i10];
            float f20 = fArr[1];
            float f21 = fArr[2];
            float f22 = fArr[3];
            float f23 = fArr[4];
            float f24 = fArr[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i7 = 7;
                    break;
                case 'C':
                case 'c':
                    i7 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i7 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i7 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i7 = 2;
                    break;
            }
            float f25 = f20;
            float f26 = f23;
            float f27 = f24;
            float f28 = f19;
            int i12 = i10;
            while (true) {
                float[] fArr2 = c1995d3.f20277b;
                if (i12 < fArr2.length) {
                    int i13 = i10;
                    if (c10 == 'A') {
                        i8 = i12;
                        c1995d = c1995d3;
                        float f29 = f28;
                        float f30 = f25;
                        i9 = i11;
                        c7 = c10;
                        int i14 = i8 + 5;
                        int i15 = i8 + 6;
                        a(path, f29, f30, fArr2[i14], fArr2[i15], fArr2[i8], fArr2[i8 + 1], fArr2[i8 + 2], fArr2[i8 + 3] != 0.0f ? 1 : i13, fArr2[i8 + 4] != 0.0f ? 1 : i13);
                        f21 = fArr2[i14];
                        f7 = fArr2[i15];
                        f22 = f7;
                        f8 = f21;
                    } else if (c10 == 'C') {
                        i8 = i12;
                        i9 = i11;
                        c1995d = c1995d3;
                        c7 = c10;
                        int i16 = i8 + 2;
                        int i17 = i8 + 3;
                        int i18 = i8 + 4;
                        int i19 = i8 + 5;
                        path2.cubicTo(fArr2[i8], fArr2[i8 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                        float f31 = fArr2[i18];
                        float f32 = fArr2[i19];
                        f21 = fArr2[i16];
                        f22 = fArr2[i17];
                        f7 = f32;
                        f8 = f31;
                    } else if (c10 != 'H') {
                        if (c10 == 'Q') {
                            i8 = i12;
                            i9 = i11;
                            c1995d = c1995d3;
                            c7 = c10;
                            int i20 = i8 + 1;
                            int i21 = i8 + 2;
                            int i22 = i8 + 3;
                            path2.quadTo(fArr2[i8], fArr2[i20], fArr2[i21], fArr2[i22]);
                            f9 = fArr2[i8];
                            float f33 = fArr2[i20];
                            f10 = fArr2[i21];
                            f22 = f33;
                            f7 = fArr2[i22];
                        } else if (c10 == 'V') {
                            i8 = i12;
                            i9 = i11;
                            c1995d = c1995d3;
                            f8 = f28;
                            c7 = c10;
                            path2.lineTo(f8, fArr2[i8]);
                            f7 = fArr2[i8];
                        } else if (c10 != 'a') {
                            if (c10 == 'c') {
                                i8 = i12;
                                int i23 = i8 + 2;
                                int i24 = i8 + 3;
                                int i25 = i8 + 4;
                                int i26 = i8 + 5;
                                path2.rCubicTo(fArr2[i8], fArr2[i8 + 1], fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                float f34 = fArr2[i23] + f28;
                                float f35 = f25 + fArr2[i24];
                                f28 += fArr2[i25];
                                f25 += fArr2[i26];
                                f21 = f34;
                                f22 = f35;
                            } else if (c10 != 'h') {
                                if (c10 != 'q') {
                                    if (c10 != 'v') {
                                        if (c10 == 'L') {
                                            i8 = i12;
                                            int i27 = i8 + 1;
                                            path2.lineTo(fArr2[i8], fArr2[i27]);
                                            f8 = fArr2[i8];
                                            f7 = fArr2[i27];
                                        } else if (c10 == 'M') {
                                            i8 = i12;
                                            f8 = fArr2[i8];
                                            f7 = fArr2[i8 + 1];
                                            if (i8 > 0) {
                                                path2.lineTo(f8, f7);
                                            } else {
                                                path2.moveTo(f8, f7);
                                                f26 = f8;
                                                f27 = f7;
                                            }
                                        } else if (c10 == 'S') {
                                            i8 = i12;
                                            if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                f28 = (f28 * 2.0f) - f21;
                                                f25 = (f25 * 2.0f) - f22;
                                            }
                                            float f36 = f28;
                                            float f37 = f25;
                                            int i28 = i8 + 1;
                                            int i29 = i8 + 2;
                                            int i30 = i8 + 3;
                                            path2.cubicTo(f36, f37, fArr2[i8], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            f9 = fArr2[i8];
                                            float f38 = fArr2[i28];
                                            f10 = fArr2[i29];
                                            f22 = f38;
                                            f7 = fArr2[i30];
                                            i9 = i11;
                                            c1995d = c1995d3;
                                            c7 = c10;
                                        } else if (c10 == 'T') {
                                            i8 = i12;
                                            if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                f28 = (f28 * 2.0f) - f21;
                                                f25 = (f25 * 2.0f) - f22;
                                            }
                                            float f39 = f25;
                                            float f40 = fArr2[i8];
                                            int i31 = i8 + 1;
                                            path2.quadTo(f28, f39, f40, fArr2[i31]);
                                            f22 = f39;
                                            f8 = fArr2[i8];
                                            f7 = fArr2[i31];
                                            i9 = i11;
                                            c1995d = c1995d3;
                                            f21 = f28;
                                            c7 = c10;
                                        } else if (c10 == 'l') {
                                            i8 = i12;
                                            int i32 = i8 + 1;
                                            path2.rLineTo(fArr2[i8], fArr2[i32]);
                                            f28 += fArr2[i8];
                                            f14 = fArr2[i32];
                                        } else if (c10 == c8) {
                                            i8 = i12;
                                            float f41 = fArr2[i8];
                                            f28 += f41;
                                            float f42 = fArr2[i8 + 1];
                                            f25 += f42;
                                            if (i8 > 0) {
                                                path2.rLineTo(f41, f42);
                                            } else {
                                                path2.rMoveTo(f41, f42);
                                                c1995d = c1995d3;
                                                f8 = f28;
                                                f26 = f8;
                                                f7 = f25;
                                                f27 = f7;
                                                i9 = i11;
                                                c7 = c10;
                                            }
                                        } else if (c10 == 's') {
                                            if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                f15 = f25 - f22;
                                                f16 = f28 - f21;
                                            } else {
                                                f16 = 0.0f;
                                                f15 = 0.0f;
                                            }
                                            int i33 = i12 + 1;
                                            int i34 = i12 + 2;
                                            int i35 = i12 + 3;
                                            i8 = i12;
                                            path2.rCubicTo(f16, f15, fArr2[i12], fArr2[i33], fArr2[i34], fArr2[i35]);
                                            f11 = fArr2[i8] + f28;
                                            f12 = f25 + fArr2[i33];
                                            f28 += fArr2[i34];
                                            f13 = fArr2[i35];
                                        } else if (c10 != 't') {
                                            i8 = i12;
                                        } else {
                                            if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                f17 = f28 - f21;
                                                f18 = f25 - f22;
                                            } else {
                                                f18 = 0.0f;
                                                f17 = 0.0f;
                                            }
                                            int i36 = i12 + 1;
                                            path2.rQuadTo(f17, f18, fArr2[i12], fArr2[i36]);
                                            float f43 = f17 + f28;
                                            float f44 = f25 + f18;
                                            float f45 = f28 + fArr2[i12];
                                            f25 += fArr2[i36];
                                            f22 = f44;
                                            i8 = i12;
                                            c1995d = c1995d3;
                                            f8 = f45;
                                            f21 = f43;
                                            f7 = f25;
                                            i9 = i11;
                                            c7 = c10;
                                        }
                                        i9 = i11;
                                        c1995d = c1995d3;
                                        c7 = c10;
                                    } else {
                                        i8 = i12;
                                        path2.rLineTo(0.0f, fArr2[i8]);
                                        f14 = fArr2[i8];
                                    }
                                    f25 += f14;
                                } else {
                                    i8 = i12;
                                    int i37 = i8 + 1;
                                    int i38 = i8 + 2;
                                    int i39 = i8 + 3;
                                    path2.rQuadTo(fArr2[i8], fArr2[i37], fArr2[i38], fArr2[i39]);
                                    f11 = fArr2[i8] + f28;
                                    f12 = f25 + fArr2[i37];
                                    f28 += fArr2[i38];
                                    f13 = fArr2[i39];
                                }
                                f25 += f13;
                                f21 = f11;
                                f22 = f12;
                            } else {
                                i8 = i12;
                                path2.rLineTo(fArr2[i8], 0.0f);
                                f28 += fArr2[i8];
                            }
                            c1995d = c1995d3;
                            f8 = f28;
                            f7 = f25;
                            i9 = i11;
                            c7 = c10;
                        } else {
                            i8 = i12;
                            int i40 = i8 + 5;
                            float f46 = fArr2[i40] + f28;
                            int i41 = i8 + 6;
                            float f47 = fArr2[i41] + f25;
                            float f48 = fArr2[i8];
                            float f49 = fArr2[i8 + 1];
                            float f50 = fArr2[i8 + 2];
                            if (fArr2[i8 + 3] != 0.0f) {
                                c1995d2 = c1995d3;
                                z6 = 1;
                            } else {
                                c1995d2 = c1995d3;
                                z6 = i13;
                            }
                            c1995d = c1995d2;
                            float f51 = f28;
                            c7 = c10;
                            float f52 = f25;
                            i9 = i11;
                            a(path, f51, f52, f46, f47, f48, f49, f50, z6, fArr2[i8 + 4] != 0.0f ? 1 : i13);
                            f8 = f51 + fArr2[i40];
                            f7 = f52 + fArr2[i41];
                            f21 = f8;
                            f22 = f7;
                        }
                        f21 = f9;
                        f8 = f10;
                    } else {
                        i8 = i12;
                        c1995d = c1995d3;
                        c7 = c10;
                        f7 = f25;
                        i9 = i11;
                        path2.lineTo(fArr2[i8], f7);
                        f8 = fArr2[i8];
                    }
                    c10 = c7;
                    c1995d3 = c1995d;
                    i11 = i9;
                    i10 = i13;
                    c8 = 'm';
                    f28 = f8;
                    f25 = f7;
                    c9 = c10;
                    i12 = i8 + i7;
                    path2 = path;
                }
            }
            int i42 = i10;
            fArr[i42] = f28;
            fArr[1] = f25;
            fArr[2] = f21;
            fArr[3] = f22;
            fArr[4] = f26;
            fArr[5] = f27;
            c9 = c1995d3.f20276a;
            i11++;
            path2 = path;
            i10 = i42;
            c8 = 'm';
        }
    }

    public C1995d(C1995d c1995d) {
        this.f20276a = c1995d.f20276a;
        float[] fArr = c1995d.f20277b;
        this.f20277b = AbstractC1110d.t(fArr, fArr.length);
    }
}
