package N2;

import L2.C0247a;
import android.util.Base64;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import e3.C0851a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t2.L;
import t2.N;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: N2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0285b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4995a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4996b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f4997c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4998d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f4999e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f5000f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f5001g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f5002i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f5003j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5004k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f5005m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5006n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f5007o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f5008p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f5009q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f5010r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f5011s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f5012t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f5013u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f5014v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f5015w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f5016x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f5017y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        long j3 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j3).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean b(w2.m mVar, s sVar, int i7, q qVar) {
        int i8 = mVar.f18868b;
        long jW = mVar.w();
        long j3 = jW >>> 16;
        if (j3 != i7) {
            return false;
        }
        boolean z6 = (j3 & 1) == 1;
        int i9 = (int) ((jW >> 12) & 15);
        int i10 = (int) ((jW >> 8) & 15);
        int i11 = (int) ((jW >> 4) & 15);
        int i12 = (int) ((jW >> 1) & 7);
        boolean z7 = (jW & 1) == 1;
        if (i11 <= 7) {
            if (i11 != sVar.f5077g - 1) {
                return false;
            }
        } else if (i11 > 10 || sVar.f5077g != 2) {
            return false;
        }
        if (!(i12 == 0 || i12 == sVar.f5078i) || z7) {
            return false;
        }
        try {
            long jB = mVar.B();
            if (!z6) {
                jB *= (long) sVar.f5072b;
            }
            qVar.f5067a = jB;
            int iQ = q(i9, mVar);
            if (iQ == -1 || iQ > sVar.f5072b) {
                return false;
            }
            if (i10 != 0) {
                if (i10 > 11) {
                    int i13 = sVar.f5075e;
                    if (i10 != 12) {
                        if (i10 > 14) {
                            return false;
                        }
                        int iA = mVar.A();
                        if (i10 == 14) {
                            iA *= 10;
                        }
                        if (iA != i13) {
                            return false;
                        }
                    } else if (mVar.u() * 1000 != i13) {
                        return false;
                    }
                } else if (i10 != sVar.f5076f) {
                    return false;
                }
            }
            int iU = mVar.u();
            int i14 = mVar.f18868b;
            byte[] bArr = mVar.f18867a;
            int i15 = i14 - 1;
            int i16 = w2.t.f18881a;
            int i17 = 0;
            for (int i18 = i8; i18 < i15; i18++) {
                i17 = w2.t.f18892n[i17 ^ (bArr[i18] & 255)];
            }
            return iU == i17;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void c(String str, boolean z6) throws N {
        if (!z6) {
            throw N.a(null, str);
        }
    }

    public static void d(long j3, w2.m mVar, H[] hArr) {
        int i7;
        while (true) {
            if (mVar.a() <= 1) {
                return;
            }
            int i8 = 0;
            while (true) {
                if (mVar.a() == 0) {
                    i7 = -1;
                    break;
                }
                int iU = mVar.u();
                i8 += iU;
                if (iU != 255) {
                    i7 = i8;
                    break;
                }
            }
            int i9 = 0;
            while (true) {
                if (mVar.a() == 0) {
                    i9 = -1;
                    break;
                }
                int iU2 = mVar.u();
                i9 += iU2;
                if (iU2 != 255) {
                    break;
                }
            }
            int i10 = mVar.f18868b + i9;
            if (i9 == -1 || i9 > mVar.a()) {
                AbstractC1697a.w("Skipping remainder of malformed SEI NAL unit.");
                i10 = mVar.f18869c;
            } else if (i7 == 4 && i9 >= 8) {
                int iU3 = mVar.u();
                int iA = mVar.A();
                int iG = iA == 49 ? mVar.g() : 0;
                int iU4 = mVar.u();
                if (iA == 47) {
                    mVar.H(1);
                }
                boolean z6 = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z6 &= iG == 1195456820;
                }
                if (z6) {
                    e(j3, mVar, hArr);
                }
            }
            mVar.G(i10);
        }
    }

    public static void e(long j3, w2.m mVar, H[] hArr) {
        int iU = mVar.u();
        if ((iU & 64) != 0) {
            mVar.H(1);
            int i7 = (iU & 31) * 3;
            int i8 = mVar.f18868b;
            for (H h7 : hArr) {
                mVar.G(i8);
                h7.c(i7, mVar);
                AbstractC1697a.i(j3 != -9223372036854775807L);
                h7.f(j3, 1, i7, 0, null);
            }
        }
    }

    public static int f(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 < 0 || i7 >= 3 || i8 < 0 || i9 >= 19) {
            return -1;
        }
        int i10 = f4998d[i7];
        if (i10 == 44100) {
            return ((i8 % 2) + h[i9]) * 2;
        }
        int i11 = f5001g[i9];
        return i10 == 32000 ? i11 * 6 : i11 * 4;
    }

    public static void g(int i7, w2.m mVar) {
        mVar.D(7);
        byte[] bArr = mVar.f18867a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i7 >> 16) & 255);
        bArr[5] = (byte) ((i7 >> 8) & 255);
        bArr[6] = (byte) (i7 & 255);
    }

    public static int h(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!((i7 & (-2097152)) == -2097152) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = f5012t[i11];
        if (i8 == 2) {
            i12 /= 2;
        } else if (i8 == 0) {
            i12 /= 4;
        }
        int i13 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? f5013u[i10 - 1] : f5014v[i10 - 1]) * 12) / i12) + i13) * 4;
        }
        int i14 = i8 == 3 ? i9 == 2 ? f5015w[i10 - 1] : f5016x[i10 - 1] : f5017y[i10 - 1];
        if (i8 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i9 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    public static J i(byte[] bArr) {
        byte b7 = bArr[0];
        if (b7 == 127 || b7 == 100 || b7 == 64 || b7 == 113) {
            return new J(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b8 = bArrCopyOf[0];
        if (b8 == -2 || b8 == -1 || b8 == 37 || b8 == -14 || b8 == -24) {
            for (int i7 = 0; i7 < bArrCopyOf.length - 1; i7 += 2) {
                byte b9 = bArrCopyOf[i7];
                int i8 = i7 + 1;
                bArrCopyOf[i7] = bArrCopyOf[i8];
                bArrCopyOf[i8] = b9;
            }
        }
        J j3 = new J(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            J j7 = new J(bArrCopyOf.length, bArrCopyOf);
            while (j7.b() >= 16) {
                j7.t(2);
                int i9 = j7.i(14) & 16383;
                int iMin = Math.min(8 - j3.f4988c, 14);
                int i10 = j3.f4988c;
                int i11 = (8 - i10) - iMin;
                byte[] bArr2 = j3.f4989d;
                int i12 = j3.f4987b;
                byte b10 = (byte) (((65280 >> i10) | ((1 << i11) - 1)) & bArr2[i12]);
                bArr2[i12] = b10;
                int i13 = 14 - iMin;
                bArr2[i12] = (byte) (b10 | ((i9 >>> i13) << i11));
                int i14 = i12 + 1;
                while (i13 > 8) {
                    j3.f4989d[i14] = (byte) (i9 >>> (i13 - 8));
                    i13 -= 8;
                    i14++;
                }
                int i15 = 8 - i13;
                byte[] bArr3 = j3.f4989d;
                byte b11 = (byte) (bArr3[i14] & ((1 << i15) - 1));
                bArr3[i14] = b11;
                bArr3[i14] = (byte) (((i9 & ((1 << i13) - 1)) << i15) | b11);
                j3.t(14);
                j3.a();
            }
        }
        j3.o(bArrCopyOf.length, bArrCopyOf);
        return j3;
    }

    public static long j(byte b7, byte b8) {
        int i7;
        int i8 = b7 & 255;
        int i9 = b7 & 3;
        if (i9 != 0) {
            i7 = 2;
            if (i9 != 1 && i9 != 2) {
                i7 = b8 & 63;
            }
        } else {
            i7 = 1;
        }
        int i10 = i8 >> 3;
        int i11 = i10 & 3;
        return ((long) i7) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i10 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    public static int k(J j3) throws N {
        int i7 = j3.i(4);
        if (i7 == 15) {
            if (j3.b() >= 24) {
                return j3.i(24);
            }
            throw N.a(null, "AAC header insufficient data");
        }
        if (i7 < 13) {
            return f4995a[i7];
        }
        throw N.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int l(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static L2.k m(N2.J r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = N2.AbstractC0285b.f5002i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            L2.k r1 = new L2.k
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.AbstractC0285b.m(N2.J):L2.k");
    }

    public static C0284a n(J j3, boolean z6) throws N {
        int i7 = j3.i(5);
        if (i7 == 31) {
            i7 = j3.i(6) + 32;
        }
        int iK = k(j3);
        int i8 = j3.i(4);
        String strS = n1.c.s(i7, "mp4a.40.");
        if (i7 == 5 || i7 == 29) {
            iK = k(j3);
            int i9 = j3.i(5);
            if (i9 == 31) {
                i9 = j3.i(6) + 32;
            }
            i7 = i9;
            if (i7 == 22) {
                i8 = j3.i(4);
            }
        }
        if (z6) {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 17) {
                switch (i7) {
                    case 19:
                    case BuildConfig.API_VERSION /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw N.b("Unsupported audio object type: " + i7);
                }
            }
            if (j3.h()) {
                AbstractC1697a.w("Unexpected frameLengthFlag = 1");
            }
            if (j3.h()) {
                j3.t(14);
            }
            boolean zH = j3.h();
            if (i8 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i7 == 6 || i7 == 20) {
                j3.t(3);
            }
            if (zH) {
                if (i7 == 22) {
                    j3.t(16);
                }
                if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                    j3.t(3);
                }
                j3.t(1);
            }
            switch (i7) {
                case 17:
                case 19:
                case BuildConfig.API_VERSION /* 20 */:
                case 21:
                case 22:
                case 23:
                    int i10 = j3.i(2);
                    if (i10 == 2 || i10 == 3) {
                        throw N.b("Unsupported epConfig: " + i10);
                    }
                    break;
            }
        }
        int i11 = f4996b[i8];
        if (i11 != -1) {
            return new C0284a(strS, iK, i11);
        }
        throw N.a(null, null);
    }

    public static int o(J j3, int[] iArr) {
        int i7 = 0;
        for (int i8 = 0; i8 < 3 && j3.h(); i8++) {
            i7++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 += 1 << iArr[i10];
        }
        return j3.i(iArr[i7]) + i9;
    }

    public static L p(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i8 = w2.t.f18881a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC1697a.w("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(Z2.a.a(new w2.m(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e7) {
                    AbstractC1697a.x("Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new C0851a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new L(arrayList);
    }

    public static int q(int i7, w2.m mVar) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return mVar.u() + 1;
            case 7:
                return mVar.A() + 1;
            case 8:
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    public static V.o r(w2.m mVar) {
        mVar.H(1);
        int iX = mVar.x();
        long j3 = ((long) mVar.f18868b) + ((long) iX);
        int i7 = iX / 18;
        long[] jArrCopyOf = new long[i7];
        long[] jArrCopyOf2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long jO = mVar.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i8);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i8);
                break;
            }
            jArrCopyOf[i8] = jO;
            jArrCopyOf2[i8] = mVar.o();
            mVar.H(2);
            i8++;
        }
        mVar.H((int) (j3 - ((long) mVar.f18868b)));
        return new V.o(jArrCopyOf, 22, jArrCopyOf2);
    }

    public static C0247a s(w2.m mVar, boolean z6, boolean z7) throws N {
        if (z6) {
            t(3, mVar, false);
        }
        mVar.s((int) mVar.l(), D4.d.f1569c);
        long jL = mVar.l();
        String[] strArr = new String[(int) jL];
        for (int i7 = 0; i7 < jL; i7++) {
            strArr[i7] = mVar.s((int) mVar.l(), D4.d.f1569c);
        }
        if (z7 && (mVar.u() & 1) == 0) {
            throw N.a(null, "framing bit expected to be set");
        }
        return new C0247a(5, strArr);
    }

    public static boolean t(int i7, w2.m mVar, boolean z6) throws N {
        if (mVar.a() < 7) {
            if (z6) {
                return false;
            }
            throw N.a(null, "too short header: " + mVar.a());
        }
        if (mVar.u() != i7) {
            if (z6) {
                return false;
            }
            throw N.a(null, "expected header type " + Integer.toHexString(i7));
        }
        if (mVar.u() == 118 && mVar.u() == 111 && mVar.u() == 114 && mVar.u() == 98 && mVar.u() == 105 && mVar.u() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw N.a(null, "expected characters 'vorbis'");
    }
}
