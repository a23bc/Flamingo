package h3;

import E4.I;
import N2.F;
import b3.AbstractC0693i;
import b3.C0689e;
import b3.C0698n;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12666a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i7, boolean z6) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579 && z6) {
            return true;
        }
        int[] iArr = f12666a;
        for (int i8 = 0; i8 < 29; i8++) {
            if (iArr[i8] == i7) {
                return true;
            }
        }
        return false;
    }

    public static C0698n b(int i7, String str, w2.m mVar) {
        int iG = mVar.g();
        if (mVar.g() == 1684108385 && iG >= 22) {
            mVar.H(10);
            int iA = mVar.A();
            if (iA > 0) {
                String strS = n1.c.s(iA, "");
                int iA2 = mVar.A();
                if (iA2 > 0) {
                    strS = strS + "/" + iA2;
                }
                return new C0698n(str, null, I.t(strS));
            }
        }
        AbstractC1697a.w("Failed to parse index/count attribute: " + AbstractC1001c.b(i7));
        return null;
    }

    public static int c(w2.m mVar) {
        int iG = mVar.g();
        if (mVar.g() == 1684108385) {
            mVar.H(8);
            int i7 = iG - 16;
            if (i7 == 1) {
                return mVar.u();
            }
            if (i7 == 2) {
                return mVar.A();
            }
            if (i7 == 3) {
                return mVar.x();
            }
            if (i7 == 4 && (mVar.f18867a[mVar.f18868b] & 128) == 0) {
                return mVar.y();
            }
        }
        AbstractC1697a.w("Failed to parse data atom to int");
        return -1;
    }

    public static AbstractC0693i d(int i7, String str, w2.m mVar, boolean z6, boolean z7) {
        int iC = c(mVar);
        if (z7) {
            iC = Math.min(1, iC);
        }
        if (iC >= 0) {
            return z6 ? new C0698n(str, null, I.t(Integer.toString(iC))) : new C0689e("und", str, Integer.toString(iC));
        }
        AbstractC1697a.w("Failed to parse uint8 attribute: " + AbstractC1001c.b(i7));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static D4.i e(byte[] bArr) {
        w2.m mVar = new w2.m(bArr);
        if (mVar.f18869c < 32) {
            return null;
        }
        mVar.G(0);
        int iA = mVar.a();
        int iG = mVar.g();
        if (iG != iA) {
            AbstractC1697a.w("Advertised atom size (" + iG + ") does not match buffer size: " + iA);
            return null;
        }
        int iG2 = mVar.g();
        if (iG2 != 1886614376) {
            n1.c.x(iG2, "Atom type is not pssh: ");
            return null;
        }
        int iE = AbstractC1001c.e(mVar.g());
        if (iE > 1) {
            n1.c.x(iE, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(mVar.o(), mVar.o());
        if (iE == 1) {
            int iY = mVar.y();
            UUID[] uuidArr = new UUID[iY];
            for (int i7 = 0; i7 < iY; i7++) {
                uuidArr[i7] = new UUID(mVar.o(), mVar.o());
            }
        }
        int iY2 = mVar.y();
        int iA2 = mVar.a();
        if (iY2 == iA2) {
            ?? r22 = new byte[iY2];
            mVar.e(r22, 0, iY2);
            return new D4.i(uuid, iE, (Serializable) r22, 11);
        }
        AbstractC1697a.w("Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] f(UUID uuid, byte[] bArr) {
        D4.i iVarE = e(bArr);
        if (iVarE == null) {
            return null;
        }
        UUID uuid2 = (UUID) iVarE.f1583q;
        if (uuid.equals(uuid2)) {
            return (byte[]) iVarE.f1584r;
        }
        AbstractC1697a.w("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static C0698n g(int i7, String str, w2.m mVar) {
        int iG = mVar.g();
        if (mVar.g() == 1684108385) {
            mVar.H(8);
            return new C0698n(str, null, I.t(mVar.q(iG - 16)));
        }
        AbstractC1697a.w("Failed to parse text attribute: " + AbstractC1001c.b(i7));
        return null;
    }

    public static F h(N2.n nVar, boolean z6, boolean z7) {
        F f7;
        boolean z8;
        int i7;
        long jO;
        int i8;
        int i9;
        int[] iArr;
        boolean z9 = true;
        long jC = nVar.c();
        long j3 = -1;
        long j7 = 4096;
        if (jC != -1 && jC <= 4096) {
            j7 = jC;
        }
        int i10 = (int) j7;
        w2.m mVar = new w2.m(64);
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i12 < i10) {
            mVar.D(8);
            if (!nVar.i(mVar.f18867a, i11, 8, z9)) {
                break;
            }
            long jW = mVar.w();
            boolean z11 = z9;
            int iG = mVar.g();
            if (jW == 1) {
                nVar.l(mVar.f18867a, 8, 8);
                i8 = 16;
                mVar.F(16);
                jO = mVar.o();
                i7 = i12;
            } else {
                if (jW == 0) {
                    long jC2 = nVar.c();
                    if (jC2 != j3) {
                        jW = (jC2 - nVar.j()) + ((long) 8);
                    }
                }
                i7 = i12;
                jO = jW;
                i8 = 8;
            }
            long j8 = i8;
            if (jO < j8) {
                return new k();
            }
            int i13 = i7 + i8;
            f7 = null;
            if (iG == 1836019574) {
                i10 += (int) jO;
                if (jC != -1 && i10 > jC) {
                    i10 = (int) jC;
                }
                i12 = i13;
                z9 = z11;
                j3 = -1;
                i11 = 0;
            } else {
                if (iG == 1836019558 || iG == 1836475768) {
                    z8 = z11;
                    break;
                }
                if (iG == 1835295092) {
                    z10 = z11;
                }
                long j9 = jC;
                if ((((long) i13) + jO) - j8 >= i10) {
                    z8 = false;
                    break;
                }
                int i14 = (int) (jO - j8);
                i12 = i13 + i14;
                if (iG != 1718909296) {
                    i9 = 0;
                    if (i14 != 0) {
                        nVar.m(i14);
                    }
                } else {
                    if (i14 < 8) {
                        return new k();
                    }
                    mVar.D(i14);
                    i9 = 0;
                    nVar.l(mVar.f18867a, 0, i14);
                    if (a(mVar.g(), z7)) {
                        z10 = z11;
                    }
                    mVar.H(4);
                    int iA = mVar.a() / 4;
                    if (!z10 && iA > 0) {
                        iArr = new int[iA];
                        int i15 = 0;
                        while (true) {
                            if (i15 >= iA) {
                                break;
                            }
                            int iG2 = mVar.g();
                            iArr[i15] = iG2;
                            if (a(iG2, z7)) {
                                z10 = z11;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (!z10) {
                        k kVar = new k();
                        if (iArr == null) {
                            int i16 = H4.a.f3248q;
                            return kVar;
                        }
                        int i17 = H4.a.f3248q;
                        if (iArr.length == 0) {
                            return kVar;
                        }
                        new H4.a(Arrays.copyOf(iArr, iArr.length));
                        return kVar;
                    }
                }
                i11 = i9;
                z9 = z11;
                jC = j9;
                j3 = -1;
            }
        }
        f7 = null;
        z8 = i11;
        return !z10 ? k.f12628c : z6 != z8 ? z8 ? k.f12626a : k.f12627b : f7;
    }
}
