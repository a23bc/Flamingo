package b3;

import E4.F;
import E4.I;
import E4.b0;
import N2.J;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import t2.L;
import t2.M;
import w2.t;

/* JADX INFO: renamed from: b3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0692h extends N5.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B2.g f10383b = new B2.g(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B2.g f10384a;

    public C0692h(B2.g gVar) {
        this.f10384a = gVar;
    }

    public static C0685a a0(w2.m mVar, int i7, int i8) {
        int iS0;
        String strConcat;
        int iU = mVar.u();
        Charset charsetP0 = p0(iU);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        mVar.e(bArr, 0, i9);
        if (i8 == 2) {
            strConcat = "image/" + I0.c.V(new String(bArr, 0, 3, D4.d.f1568b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iS0 = 2;
        } else {
            iS0 = s0(0, bArr);
            String strV = I0.c.V(new String(bArr, 0, iS0, D4.d.f1568b));
            strConcat = strV.indexOf(47) == -1 ? "image/".concat(strV) : strV;
        }
        int i10 = bArr[iS0 + 1] & 255;
        int i11 = iS0 + 2;
        int iR0 = r0(bArr, i11, iU);
        String str = new String(bArr, i11, iR0 - i11, charsetP0);
        int iO0 = o0(iU) + iR0;
        return new C0685a(strConcat, str, i10, i9 <= iO0 ? t.f18886f : Arrays.copyOfRange(bArr, iO0, i9));
    }

    public static C0687c b0(w2.m mVar, int i7, int i8, boolean z6, int i9, B2.g gVar) throws Throwable {
        int i10 = mVar.f18868b;
        int iS0 = s0(i10, mVar.f18867a);
        String str = new String(mVar.f18867a, i10, iS0 - i10, D4.d.f1568b);
        mVar.G(iS0 + 1);
        int iG = mVar.g();
        int iG2 = mVar.g();
        long jW = mVar.w();
        if (jW == 4294967295L) {
            jW = -1;
        }
        long jW2 = mVar.w();
        long j3 = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i11 = i10 + i7;
        while (mVar.f18868b < i11) {
            AbstractC0693i abstractC0693iE0 = e0(i8, mVar, z6, i9, gVar);
            if (abstractC0693iE0 != null) {
                arrayList.add(abstractC0693iE0);
            }
        }
        return new C0687c(str, iG, iG2, jW, j3, (AbstractC0693i[]) arrayList.toArray(new AbstractC0693i[0]));
    }

    public static C0688d c0(w2.m mVar, int i7, int i8, boolean z6, int i9, B2.g gVar) throws Throwable {
        int i10 = mVar.f18868b;
        int iS0 = s0(i10, mVar.f18867a);
        String str = new String(mVar.f18867a, i10, iS0 - i10, D4.d.f1568b);
        mVar.G(iS0 + 1);
        int iU = mVar.u();
        boolean z7 = (iU & 2) != 0;
        boolean z8 = (iU & 1) != 0;
        int iU2 = mVar.u();
        String[] strArr = new String[iU2];
        for (int i11 = 0; i11 < iU2; i11++) {
            int i12 = mVar.f18868b;
            int iS02 = s0(i12, mVar.f18867a);
            strArr[i11] = new String(mVar.f18867a, i12, iS02 - i12, D4.d.f1568b);
            mVar.G(iS02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i10 + i7;
        while (mVar.f18868b < i13) {
            AbstractC0693i abstractC0693iE0 = e0(i8, mVar, z6, i9, gVar);
            if (abstractC0693iE0 != null) {
                arrayList.add(abstractC0693iE0);
            }
        }
        return new C0688d(str, z7, z8, strArr, (AbstractC0693i[]) arrayList.toArray(new AbstractC0693i[0]));
    }

    public static C0689e d0(int i7, w2.m mVar) {
        if (i7 < 4) {
            return null;
        }
        int iU = mVar.u();
        Charset charsetP0 = p0(iU);
        byte[] bArr = new byte[3];
        mVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        mVar.e(bArr2, 0, i8);
        int iR0 = r0(bArr2, 0, iU);
        String str2 = new String(bArr2, 0, iR0, charsetP0);
        int iO0 = o0(iU) + iR0;
        return new C0689e(str, str2, i0(bArr2, iO0, r0(bArr2, iO0, iU), charsetP0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0208 A[Catch: all -> 0x012c, Exception -> 0x012f, OutOfMemoryError -> 0x0132, TRY_LEAVE, TryCatch #3 {Exception -> 0x012f, OutOfMemoryError -> 0x0132, all -> 0x012c, blocks: (B:107:0x0126, B:115:0x0137, B:122:0x014d, B:124:0x0155, B:132:0x016f, B:141:0x0187, B:152:0x01a2, B:159:0x01b4, B:181:0x01f0, B:188:0x0203, B:189:0x0208), top: B:203:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x022a  */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b3.AbstractC0693i e0(int r19, w2.m r20, boolean r21, int r22, B2.g r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0692h.e0(int, w2.m, boolean, int, B2.g):b3.i");
    }

    public static C0690f f0(int i7, w2.m mVar) {
        int iU = mVar.u();
        Charset charsetP0 = p0(iU);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        mVar.e(bArr, 0, i8);
        int iS0 = s0(0, bArr);
        String strJ = M.j(new String(bArr, 0, iS0, D4.d.f1568b));
        int i9 = iS0 + 1;
        int iR0 = r0(bArr, i9, iU);
        String strI0 = i0(bArr, i9, iR0, charsetP0);
        int iO0 = o0(iU) + iR0;
        int iR02 = r0(bArr, iO0, iU);
        String strI02 = i0(bArr, iO0, iR02, charsetP0);
        int iO02 = o0(iU) + iR02;
        return new C0690f(i8 <= iO02 ? t.f18886f : Arrays.copyOfRange(bArr, iO02, i8), strJ, strI0, strI02);
    }

    public static C0696l g0(int i7, w2.m mVar) {
        int iA = mVar.A();
        int iX = mVar.x();
        int iX2 = mVar.x();
        int iU = mVar.u();
        int iU2 = mVar.u();
        J j3 = new J();
        j3.p(mVar);
        int i8 = ((i7 - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = j3.i(iU);
            int i11 = j3.i(iU2);
            iArr[i9] = i10;
            iArr2[i9] = i11;
        }
        return new C0696l(iA, iX, iX2, iArr, iArr2);
    }

    public static C0697m h0(int i7, w2.m mVar) {
        byte[] bArr = new byte[i7];
        mVar.e(bArr, 0, i7);
        int iS0 = s0(0, bArr);
        String str = new String(bArr, 0, iS0, D4.d.f1568b);
        int i8 = iS0 + 1;
        return new C0697m(str, i7 <= i8 ? t.f18886f : Arrays.copyOfRange(bArr, i8, i7));
    }

    public static String i0(byte[] bArr, int i7, int i8, Charset charset) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, charset);
    }

    public static C0698n j0(int i7, String str, w2.m mVar) {
        if (i7 < 1) {
            return null;
        }
        int iU = mVar.u();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        mVar.e(bArr, 0, i8);
        return new C0698n(str, null, k0(bArr, iU, 0));
    }

    public static b0 k0(byte[] bArr, int i7, int i8) {
        if (i8 >= bArr.length) {
            return I.t("");
        }
        F fO = I.o();
        int iR0 = r0(bArr, i8, i7);
        while (i8 < iR0) {
            fO.a(new String(bArr, i8, iR0 - i8, p0(i7)));
            i8 = o0(i7) + iR0;
            iR0 = r0(bArr, i8, i7);
        }
        b0 b0VarF = fO.f();
        return b0VarF.isEmpty() ? I.t("") : b0VarF;
    }

    public static C0698n l0(int i7, w2.m mVar) {
        if (i7 < 1) {
            return null;
        }
        int iU = mVar.u();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        mVar.e(bArr, 0, i8);
        int iR0 = r0(bArr, 0, iU);
        return new C0698n("TXXX", new String(bArr, 0, iR0, p0(iU)), k0(bArr, iU, o0(iU) + iR0));
    }

    public static C0699o m0(int i7, String str, w2.m mVar) {
        byte[] bArr = new byte[i7];
        mVar.e(bArr, 0, i7);
        return new C0699o(str, null, new String(bArr, 0, s0(0, bArr), D4.d.f1568b));
    }

    public static C0699o n0(int i7, w2.m mVar) {
        if (i7 < 1) {
            return null;
        }
        int iU = mVar.u();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        mVar.e(bArr, 0, i8);
        int iR0 = r0(bArr, 0, iU);
        String str = new String(bArr, 0, iR0, p0(iU));
        int iO0 = o0(iU) + iR0;
        return new C0699o("WXXX", str, i0(bArr, iO0, s0(iO0, bArr), D4.d.f1568b));
    }

    public static int o0(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    public static Charset p0(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? D4.d.f1568b : D4.d.f1569c : D4.d.f1570d : D4.d.f1572f;
    }

    public static String q0(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int r0(byte[] bArr, int i7, int i8) {
        int iS0 = s0(i7, bArr);
        if (i8 == 0 || i8 == 3) {
            return iS0;
        }
        while (iS0 < bArr.length - 1) {
            if ((iS0 - i7) % 2 == 0 && bArr[iS0 + 1] == 0) {
                return iS0;
            }
            iS0 = s0(iS0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int s0(int i7, byte[] bArr) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    public static int t0(int i7, w2.m mVar) {
        byte[] bArr = mVar.f18867a;
        int i8 = mVar.f18868b;
        int i9 = i8;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= i8 + i7) {
                return i7;
            }
            if ((bArr[i9] & 255) == 255 && bArr[i10] == 0) {
                System.arraycopy(bArr, i9 + 2, bArr, i10, (i7 - (i9 - i8)) - 2);
                i7--;
            }
            i9 = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean u0(w2.m r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f18868b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.G(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.G(r2)
            return r4
        Lb0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0692h.u0(w2.m, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t2.L Z(int r12, byte[] r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0692h.Z(int, byte[]):t2.L");
    }

    @Override // N5.d
    public final L z(W2.a aVar, ByteBuffer byteBuffer) {
        return Z(byteBuffer.limit(), byteBuffer.array());
    }
}
