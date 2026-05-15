package x2;

import N2.J;
import java.util.Arrays;
import t2.C1480i;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f19966a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f19967b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f19968c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f19969d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        AbstractC1697a.i(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            a(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            a(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            a(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b7 = bArr[i11];
            if ((b7 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b7 == 1) {
                    a(zArr);
                    return i12;
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    public static d c(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int iG;
        int i13;
        int i14;
        int i15;
        J j3 = new J(bArr, i7 + 2, i8);
        int i16 = 4;
        j3.t(4);
        int i17 = j3.i(3);
        j3.s();
        int i18 = j3.i(2);
        boolean zH = j3.h();
        int i19 = j3.i(5);
        int i20 = 0;
        for (int i21 = 0; i21 < 32; i21++) {
            if (j3.h()) {
                i20 |= 1 << i21;
            }
        }
        int[] iArr = new int[6];
        for (int i22 = 0; i22 < 6; i22++) {
            iArr[i22] = j3.i(8);
        }
        int i23 = j3.i(8);
        int i24 = 0;
        for (int i25 = 0; i25 < i17; i25++) {
            if (j3.h()) {
                i24 += 89;
            }
            if (j3.h()) {
                i24 += 8;
            }
        }
        j3.t(i24);
        if (i17 > 0) {
            j3.t((8 - i17) * 2);
        }
        j3.m();
        int iM = j3.m();
        if (iM == 3) {
            j3.s();
        }
        int iM2 = j3.m();
        int iM3 = j3.m();
        if (j3.h()) {
            int iM4 = j3.m();
            int iM5 = j3.m();
            int iM6 = j3.m();
            int iM7 = j3.m();
            iM2 -= (iM4 + iM5) * ((iM == 1 || iM == 2) ? 2 : 1);
            iM3 -= (iM6 + iM7) * (iM == 1 ? 2 : 1);
        }
        int iM8 = j3.m();
        int i26 = iM2;
        int i27 = i20;
        int iM9 = j3.m();
        int iM10 = j3.m();
        int iF = -1;
        int iMax = -1;
        for (int i28 = j3.h() ? 0 : i17; i28 <= i17; i28++) {
            j3.m();
            iMax = Math.max(j3.m(), iMax);
            j3.m();
        }
        j3.m();
        j3.m();
        j3.m();
        j3.m();
        j3.m();
        j3.m();
        if (j3.h() && j3.h()) {
            int i29 = 0;
            while (i29 < i16) {
                int i30 = 0;
                while (i30 < 6) {
                    if (j3.h()) {
                        int iMin = Math.min(64, 1 << ((i29 << 1) + i16));
                        if (i29 > 1) {
                            j3.n();
                        }
                        for (int i31 = 0; i31 < iMin; i31++) {
                            j3.n();
                        }
                    } else {
                        j3.m();
                    }
                    i30 += i29 == 3 ? 3 : 1;
                    i16 = 4;
                }
                i29++;
                i16 = 4;
            }
        }
        j3.t(2);
        if (j3.h()) {
            j3.t(8);
            j3.m();
            j3.m();
            j3.s();
        }
        int iM11 = j3.m();
        int[] iArrCopyOf = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i32 = 0;
        int i33 = -1;
        int i34 = -1;
        while (i32 < iM11) {
            if (i32 == 0 || !j3.h()) {
                i13 = iMax;
                i14 = iM11;
                i15 = iM8;
                int iM12 = j3.m();
                int iM13 = j3.m();
                int[] iArr2 = new int[iM12];
                int i35 = 0;
                while (i35 < iM12) {
                    iArr2[i35] = (i35 > 0 ? iArr2[i35 - 1] : 0) - (j3.m() + 1);
                    j3.s();
                    i35++;
                }
                int[] iArr3 = new int[iM13];
                int i36 = 0;
                while (i36 < iM13) {
                    iArr3[i36] = j3.m() + 1 + (i36 > 0 ? iArr3[i36 - 1] : 0);
                    j3.s();
                    i36++;
                }
                i34 = iM13;
                iArrCopyOf2 = iArr3;
                iArrCopyOf = iArr2;
                i33 = iM12;
            } else {
                i13 = iMax;
                int i37 = i33 + i34;
                int iM14 = (1 - ((j3.h() ? 1 : 0) * 2)) * (j3.m() + 1);
                i14 = iM11;
                int i38 = i37 + 1;
                int[] iArr4 = iArrCopyOf;
                boolean[] zArr = new boolean[i38];
                for (int i39 = 0; i39 <= i37; i39++) {
                    if (j3.h()) {
                        zArr[i39] = true;
                    } else {
                        zArr[i39] = j3.h();
                    }
                }
                int[] iArr5 = new int[i38];
                int[] iArr6 = new int[i38];
                int i40 = 0;
                for (int i41 = i34 - 1; i41 >= 0; i41--) {
                    int i42 = iArrCopyOf2[i41] + iM14;
                    if (i42 < 0 && zArr[i33 + i41]) {
                        iArr5[i40] = i42;
                        i40++;
                    }
                }
                if (iM14 < 0 && zArr[i37]) {
                    iArr5[i40] = iM14;
                    i40++;
                }
                int i43 = i40;
                i15 = iM8;
                for (int i44 = 0; i44 < i33; i44++) {
                    int i45 = iArr4[i44] + iM14;
                    if (i45 < 0 && zArr[i44]) {
                        iArr5[i43] = i45;
                        i43++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i43);
                int i46 = 0;
                for (int i47 = i33 - 1; i47 >= 0; i47--) {
                    int i48 = iArr4[i47] + iM14;
                    if (i48 > 0 && zArr[i47]) {
                        iArr6[i46] = i48;
                        i46++;
                    }
                }
                if (iM14 > 0 && zArr[i37]) {
                    iArr6[i46] = iM14;
                    i46++;
                }
                int i49 = i43;
                int i50 = i46;
                for (int i51 = 0; i51 < i34; i51++) {
                    int i52 = iArrCopyOf2[i51] + iM14;
                    if (i52 > 0 && zArr[i33 + i51]) {
                        iArr6[i50] = i52;
                        i50++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr6, i50);
                i34 = i50;
                i33 = i49;
            }
            i32++;
            iMax = i13;
            iM11 = i14;
            iM8 = i15;
        }
        int i53 = iMax;
        int i54 = iM8;
        if (j3.h()) {
            int iM15 = j3.m();
            for (int i55 = 0; i55 < iM15; i55++) {
                j3.t(iM10 + 5);
            }
        }
        j3.t(2);
        float f7 = 1.0f;
        if (j3.h()) {
            if (j3.h()) {
                int i56 = j3.i(8);
                if (i56 == 255) {
                    int i57 = j3.i(16);
                    int i58 = j3.i(16);
                    if (i57 != 0 && i58 != 0) {
                        f7 = i57 / i58;
                    }
                } else if (i56 < 17) {
                    f7 = f19967b[i56];
                } else {
                    n1.c.x(i56, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (j3.h()) {
                j3.s();
            }
            if (j3.h()) {
                j3.t(3);
                i12 = j3.h() ? 1 : 2;
                if (j3.h()) {
                    int i59 = j3.i(8);
                    int i60 = j3.i(8);
                    j3.t(8);
                    iF = C1480i.f(i59);
                    iG = C1480i.g(i60);
                } else {
                    iG = -1;
                }
            } else {
                i12 = -1;
                iG = -1;
            }
            if (j3.h()) {
                j3.m();
                j3.m();
            }
            j3.s();
            if (j3.h()) {
                iM3 *= 2;
            }
            i11 = i12;
            i9 = iM3;
            i10 = iF;
            iF = iG;
        } else {
            i9 = iM3;
            i10 = -1;
            i11 = -1;
        }
        return new d(i18, zH, i19, i27, i54, iM9, iArr, i23, i26, i9, f7, i53, i10, i11, iF);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static x2.f d(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.d(byte[], int, int):x2.f");
    }

    public static void e(J j3) {
        int iM = j3.m() + 1;
        j3.t(8);
        for (int i7 = 0; i7 < iM; i7++) {
            j3.m();
            j3.m();
            j3.s();
        }
        j3.t(20);
    }

    public static int f(int i7, byte[] bArr) {
        int i8;
        synchronized (f19968c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    if (i9 >= i7 - 2) {
                        i9 = i7;
                        break;
                    }
                    try {
                        if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = f19969d;
                    if (iArr.length <= i10) {
                        f19969d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f19969d[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f19969d[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }
}
