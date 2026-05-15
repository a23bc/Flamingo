package u2;

import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17222g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f17223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f17224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17225k;
    public short[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f17227n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17233t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17234u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17235v;

    public f(float f7, float f8, int i7, int i8, int i9) {
        this.f17216a = i7;
        this.f17217b = i8;
        this.f17218c = f7;
        this.f17219d = f8;
        this.f17220e = i7 / i9;
        this.f17221f = i7 / 400;
        int i10 = i7 / 65;
        this.f17222g = i10;
        int i11 = i10 * 2;
        this.h = i11;
        this.f17223i = new short[i11];
        this.f17224j = new short[i11 * i8];
        this.l = new short[i11 * i8];
        this.f17227n = new short[i11 * i8];
    }

    public static void e(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i9 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i10 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i13] = (short) (((sArr3[i14] * i16) + ((i7 - i16) * sArr2[i15])) / i7);
                i13 += i8;
                i15 += i8;
                i14 += i8;
            }
        }
    }

    public final void a(short[] sArr, int i7, int i8) {
        short[] sArrC = c(this.l, this.f17226m, i8);
        this.l = sArrC;
        int i9 = this.f17217b;
        System.arraycopy(sArr, i7 * i9, sArrC, this.f17226m * i9, i9 * i8);
        this.f17226m += i8;
    }

    public final void b(short[] sArr, int i7, int i8) {
        int i9 = this.h / i8;
        int i10 = this.f17217b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f17223i[i13] = (short) (i14 / i11);
        }
    }

    public final short[] c(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f17217b;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    public final int d(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f17217b;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int iAbs = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                iAbs += Math.abs(sArr[i10 + i15] - sArr[(i10 + i8) + i15]);
            }
            if (iAbs * i13 < i12 * i8) {
                i13 = i8;
                i12 = iAbs;
            }
            if (iAbs * i11 > i14 * i8) {
                i11 = i8;
                i14 = iAbs;
            }
            i8++;
        }
        this.f17234u = i12 / i13;
        this.f17235v = i14 / i11;
        return i13;
    }

    public final void f() {
        float f7;
        float f8;
        float f9;
        double d4;
        int iD;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f17226m;
        float f10 = this.f17218c;
        float f11 = this.f17219d;
        float f12 = f10 / f11;
        float f13 = this.f17220e * f11;
        double d7 = f12;
        int i15 = this.f17216a;
        int i16 = this.f17217b;
        int i17 = 1;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            int i18 = this.f17225k;
            int i19 = this.h;
            if (i18 >= i19) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f17231r;
                    if (i21 > 0) {
                        int iMin = Math.min(i19, i21);
                        a(this.f17224j, i20, iMin);
                        this.f17231r -= iMin;
                        i20 += iMin;
                        f8 = f12;
                        f9 = f13;
                        d4 = d7;
                        f7 = 1.0f;
                    } else {
                        short[] sArr = this.f17224j;
                        int i22 = i15 > 4000 ? i15 / 4000 : i17;
                        f7 = 1.0f;
                        int i23 = this.f17222g;
                        int i24 = this.f17221f;
                        if (i16 == i17 && i22 == i17) {
                            iD = d(sArr, i20, i24, i23);
                            f8 = f12;
                            f9 = f13;
                            d4 = d7;
                        } else {
                            b(sArr, i20, i22);
                            f8 = f12;
                            f9 = f13;
                            short[] sArr2 = this.f17223i;
                            d4 = d7;
                            int iD2 = d(sArr2, 0, i24 / i22, i23 / i22);
                            if (i22 != 1) {
                                int i25 = iD2 * i22;
                                int i26 = i22 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                if (i27 >= i24) {
                                    i24 = i27;
                                }
                                if (i28 <= i23) {
                                    i23 = i28;
                                }
                                if (i16 == 1) {
                                    iD = d(sArr, i20, i24, i23);
                                } else {
                                    b(sArr, i20, 1);
                                    iD = d(sArr2, 0, i24, i23);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i29 = this.f17234u;
                        int i30 = this.f17235v;
                        if (i29 == 0 || (i7 = this.f17232s) == 0 || i30 > i29 * 3 || i29 * 2 <= this.f17233t * 3) {
                            i7 = iD;
                        }
                        this.f17233t = i29;
                        this.f17232s = iD;
                        if (d4 > 1.0d) {
                            short[] sArr3 = this.f17224j;
                            if (f8 >= 2.0f) {
                                i9 = (int) (i7 / (f8 - 1.0f));
                            } else {
                                this.f17231r = (int) (((2.0f - f8) * i7) / (f8 - 1.0f));
                                i9 = i7;
                            }
                            short[] sArrC = c(this.l, this.f17226m, i9);
                            this.l = sArrC;
                            int i31 = i20 + i7;
                            int i32 = i20;
                            int i33 = i9;
                            e(i33, this.f17217b, sArrC, this.f17226m, sArr3, i32, sArr3, i31);
                            this.f17226m += i33;
                            i20 = i7 + i33 + i32;
                        } else {
                            int i34 = i20;
                            short[] sArr4 = this.f17224j;
                            if (f8 < 0.5f) {
                                i8 = (int) ((i7 * f8) / (1.0f - f8));
                            } else {
                                this.f17231r = (int) ((((2.0f * f8) - 1.0f) * i7) / (1.0f - f8));
                                i8 = i7;
                            }
                            int i35 = i7 + i8;
                            short[] sArrC2 = c(this.l, this.f17226m, i35);
                            this.l = sArrC2;
                            System.arraycopy(sArr4, i34 * i16, sArrC2, this.f17226m * i16, i7 * i16);
                            e(i8, this.f17217b, this.l, this.f17226m + i7, sArr4, i34 + i7, sArr4, i34);
                            this.f17226m += i35;
                            i20 = i34 + i8;
                        }
                    }
                    if (i20 + i19 > i18) {
                        break;
                    }
                    i17 = 1;
                    f12 = f8;
                    f13 = f9;
                    d7 = d4;
                }
                int i36 = this.f17225k - i20;
                short[] sArr5 = this.f17224j;
                System.arraycopy(sArr5, i20 * i16, sArr5, 0, i36 * i16);
                this.f17225k = i36;
            }
            if (f9 != f7 || this.f17226m == i14) {
            }
            int i37 = (int) (i15 / f9);
            while (true) {
                if (i37 <= 16384 && i15 <= 16384) {
                    break;
                }
                i37 /= 2;
                i15 /= 2;
            }
            int i38 = this.f17226m - i14;
            short[] sArrC3 = c(this.f17227n, this.f17228o, i38);
            this.f17227n = sArrC3;
            System.arraycopy(this.l, i14 * i16, sArrC3, this.f17228o * i16, i38 * i16);
            this.f17226m = i14;
            this.f17228o += i38;
            int i39 = 0;
            while (true) {
                i10 = this.f17228o;
                i11 = i10 - 1;
                if (i39 >= i11) {
                    break;
                }
                while (true) {
                    i12 = this.f17229p + 1;
                    int i40 = i12 * i37;
                    i13 = this.f17230q;
                    if (i40 <= i13 * i15) {
                        break;
                    }
                    this.l = c(this.l, this.f17226m, 1);
                    for (int i41 = 0; i41 < i16; i41++) {
                        short[] sArr6 = this.l;
                        int i42 = (this.f17226m * i16) + i41;
                        short[] sArr7 = this.f17227n;
                        int i43 = (i39 * i16) + i41;
                        short s7 = sArr7[i43];
                        short s8 = sArr7[i43 + i16];
                        int i44 = this.f17230q * i15;
                        int i45 = this.f17229p;
                        int i46 = i45 * i37;
                        int i47 = (i45 + 1) * i37;
                        int i48 = i47 - i44;
                        int i49 = i47 - i46;
                        sArr6[i42] = (short) ((((i49 - i48) * s8) + (s7 * i48)) / i49);
                    }
                    this.f17230q++;
                    this.f17226m++;
                }
                this.f17229p = i12;
                if (i12 == i15) {
                    this.f17229p = 0;
                    AbstractC1697a.i(i13 == i37);
                    this.f17230q = 0;
                }
                i39++;
            }
            if (i11 == 0) {
                return;
            }
            short[] sArr8 = this.f17227n;
            System.arraycopy(sArr8, i11 * i16, sArr8, 0, (i10 - i11) * i16);
            this.f17228o -= i11;
            return;
        }
        a(this.f17224j, 0, this.f17225k);
        this.f17225k = 0;
        f9 = f13;
        f7 = 1.0f;
        if (f9 != f7) {
        }
    }
}
