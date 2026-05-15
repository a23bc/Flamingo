package n1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(int i7, int i8, int i9, int i10) {
        if (!((i9 >= 0) & (i8 >= i7) & (i10 >= i9) & (i7 >= 0))) {
            j.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i7, i8, i9, i10);
    }

    public static /* synthetic */ long b(int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i9 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return a(0, i7, 0, i8);
    }

    public static final int c(int i7) {
        if (i7 < 8191) {
            return 13;
        }
        if (i7 < 32767) {
            return 15;
        }
        if (i7 < 65535) {
            return 16;
        }
        return i7 < 262143 ? 18 : 255;
    }

    public static final long d(long j3, long j7) {
        int i7 = (int) (j7 >> 32);
        int iJ = a.j(j3);
        int iH = a.h(j3);
        if (i7 < iJ) {
            i7 = iJ;
        }
        if (i7 <= iH) {
            iH = i7;
        }
        int i8 = (int) (j7 & 4294967295L);
        int i9 = a.i(j3);
        int iG = a.g(j3);
        if (i8 < i9) {
            i8 = i9;
        }
        if (i8 <= iG) {
            iG = i8;
        }
        return (((long) iH) << 32) | (4294967295L & ((long) iG));
    }

    public static final long e(long j3, long j7) {
        int iJ = a.j(j3);
        int iH = a.h(j3);
        int i7 = a.i(j3);
        int iG = a.g(j3);
        int iJ2 = a.j(j7);
        if (iJ2 < iJ) {
            iJ2 = iJ;
        }
        if (iJ2 > iH) {
            iJ2 = iH;
        }
        int iH2 = a.h(j7);
        if (iH2 >= iJ) {
            iJ = iH2;
        }
        if (iJ <= iH) {
            iH = iJ;
        }
        int i8 = a.i(j7);
        if (i8 < i7) {
            i8 = i7;
        }
        if (i8 > iG) {
            i8 = iG;
        }
        int iG2 = a.g(j7);
        if (iG2 >= i7) {
            i7 = iG2;
        }
        if (i7 <= iG) {
            iG = i7;
        }
        return a(iJ2, iH, i8, iG);
    }

    public static final int f(long j3, int i7) {
        int i8 = a.i(j3);
        int iG = a.g(j3);
        if (i7 < i8) {
            i7 = i8;
        }
        return i7 > iG ? iG : i7;
    }

    public static final int g(long j3, int i7) {
        int iJ = a.j(j3);
        int iH = a.h(j3);
        if (i7 < iJ) {
            i7 = iJ;
        }
        return i7 > iH ? iH : i7;
    }

    public static final long h(int i7, int i8, int i9, int i10) {
        int i11 = i10 == Integer.MAX_VALUE ? i9 : i10;
        int iC = c(i11);
        int i12 = i8 == Integer.MAX_VALUE ? i7 : i8;
        int iC2 = c(i12);
        if (iC + iC2 > 31) {
            j(i12, i11);
        }
        int i13 = i8 + 1;
        int i14 = i10 + 1;
        int i15 = iC2 - 13;
        return (((long) (i13 & (~(i13 >> 31)))) << 33) | ((long) ((i15 >> 1) + (i15 & 1))) | (((long) i7) << 2) | (((long) i9) << (iC2 + 2)) | (((long) (i14 & (~(i14 >> 31)))) << (iC2 + 33));
    }

    public static final long i(int i7, int i8, long j3) {
        int iJ = a.j(j3) + i7;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = a.h(j3);
        if (iH != Integer.MAX_VALUE && (iH = iH + i7) < 0) {
            iH = 0;
        }
        int i9 = a.i(j3) + i8;
        if (i9 < 0) {
            i9 = 0;
        }
        int iG = a.g(j3);
        return a(iJ, iH, i9, (iG == Integer.MAX_VALUE || (iG = iG + i8) >= 0) ? iG : 0);
    }

    public static final void j(int i7, int i8) {
        throw new IllegalArgumentException("Can't represent a width of " + i7 + " and height of " + i8 + " in Constraints");
    }

    public static final Void k(int i7) {
        throw new IllegalArgumentException(Z1.l.o(i7, "Can't represent a size of ", " in Constraints"));
    }
}
