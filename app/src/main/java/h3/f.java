package h3;

import H2.S;
import N2.AbstractC0285b;
import android.util.Pair;
import t2.M;
import t2.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f12575a;

    static {
        int i7 = w2.t.f18881a;
        f12575a = "OpusHead".getBytes(D4.d.f1569c);
    }

    public static S a(int i7, w2.m mVar) {
        mVar.G(i7 + 12);
        mVar.H(1);
        b(mVar);
        mVar.H(2);
        int iU = mVar.u();
        if ((iU & 128) != 0) {
            mVar.H(2);
        }
        if ((iU & 64) != 0) {
            mVar.H(mVar.u());
        }
        if ((iU & 32) != 0) {
            mVar.H(2);
        }
        mVar.H(1);
        b(mVar);
        String strB = M.b(mVar.u());
        if ("audio/mpeg".equals(strB) || "audio/vnd.dts".equals(strB) || "audio/vnd.dts.hd".equals(strB)) {
            return new S(strB, null, -1L, -1L);
        }
        mVar.H(4);
        long jW = mVar.w();
        long jW2 = mVar.w();
        mVar.H(1);
        int iB = b(mVar);
        long j3 = jW2;
        byte[] bArr = new byte[iB];
        mVar.e(bArr, 0, iB);
        if (j3 <= 0) {
            j3 = -1;
        }
        return new S(strB, bArr, j3, jW > 0 ? jW : -1L);
    }

    public static int b(w2.m mVar) {
        int iU = mVar.u();
        int i7 = iU & 127;
        while ((iU & 128) == 128) {
            iU = mVar.u();
            i7 = (i7 << 7) | (iU & 127);
        }
        return i7;
    }

    public static x2.c c(w2.m mVar) {
        long jO;
        long jO2;
        mVar.G(8);
        if (AbstractC1001c.e(mVar.g()) == 0) {
            jO = mVar.w();
            jO2 = mVar.w();
        } else {
            jO = mVar.o();
            jO2 = mVar.o();
        }
        return new x2.c(jO, jO2, mVar.w());
    }

    public static Pair d(w2.m mVar, int i7, int i8) throws N {
        Integer num;
        r rVar;
        Pair pairCreate;
        int i9;
        int i10;
        Integer num2;
        boolean z6;
        int i11 = mVar.f18868b;
        while (i11 - i7 < i8) {
            mVar.G(i11);
            int iG = mVar.g();
            AbstractC0285b.c("childAtomSize must be positive", iG > 0);
            if (mVar.g() == 1936289382) {
                int i12 = i11 + 8;
                int i13 = 0;
                int i14 = -1;
                Integer numValueOf = null;
                String strS = null;
                while (i12 - i11 < iG) {
                    mVar.G(i12);
                    int iG2 = mVar.g();
                    int iG3 = mVar.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(mVar.g());
                    } else if (iG3 == 1935894637) {
                        mVar.H(4);
                        strS = mVar.s(4, D4.d.f1569c);
                    } else if (iG3 == 1935894633) {
                        i14 = i12;
                        i13 = iG2;
                    }
                    i12 += iG2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    AbstractC0285b.c("frma atom is mandatory", numValueOf != null);
                    AbstractC0285b.c("schi atom is mandatory", i14 != -1);
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 >= i13) {
                            num = numValueOf;
                            rVar = null;
                            break;
                        }
                        mVar.G(i15);
                        int iG4 = mVar.g();
                        if (mVar.g() == 1952804451) {
                            int iE = AbstractC1001c.e(mVar.g());
                            mVar.H(1);
                            if (iE == 0) {
                                mVar.H(1);
                                i10 = 0;
                                i9 = 0;
                            } else {
                                int iU = mVar.u();
                                i9 = iU & 15;
                                i10 = (iU & 240) >> 4;
                            }
                            if (mVar.u() == 1) {
                                num2 = numValueOf;
                                z6 = true;
                            } else {
                                num2 = numValueOf;
                                z6 = false;
                            }
                            int iU2 = mVar.u();
                            byte[] bArr2 = new byte[16];
                            mVar.e(bArr2, 0, 16);
                            if (z6 && iU2 == 0) {
                                int iU3 = mVar.u();
                                byte[] bArr3 = new byte[iU3];
                                mVar.e(bArr3, 0, iU3);
                                bArr = bArr3;
                            }
                            num = num2;
                            rVar = new r(z6, strS, iU2, bArr2, i10, i9, bArr);
                        } else {
                            i15 += iG4;
                        }
                    }
                    AbstractC0285b.c("tenc atom is mandatory", rVar != null);
                    int i16 = w2.t.f18881a;
                    pairCreate = Pair.create(num, rVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i11 += iG;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0bc7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d1.e e(w2.m r63, int r64, int r65, java.lang.String r66, t2.C1484m r67, boolean r68) throws t2.N {
        /*
            Method dump skipped, instruction units count: 4106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.f.e(w2.m, int, int, java.lang.String, t2.m, boolean):d1.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        r15 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x056d A[ADDED_TO_REGION, LOOP:13: B:220:0x056d->B:224:0x0579, LOOP_START, PHI: r16
  0x056d: PHI (r16v6 int) = (r16v5 int), (r16v7 int) binds: [B:219:0x056b, B:224:0x0579] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06fc A[PHI: r9
  0x06fc: PHI (r9v33 int) = (r9v32 int), (r9v48 int) binds: [B:271:0x06b9, B:280:0x06fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x086b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x055b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(h3.C0999a r51, N2.u r52, long r53, t2.C1484m r55, boolean r56, boolean r57, D4.e r58) {
        /*
            Method dump skipped, instruction units count: 2165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.f.f(h3.a, N2.u, long, t2.m, boolean, boolean, D4.e):java.util.ArrayList");
    }
}
