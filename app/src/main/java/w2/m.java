package w2;

import E4.M;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d */
    public static final char[] f18864d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f18865e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final M f18866f = M.o(5, D4.d.f1567a, D4.d.f1569c, D4.d.f1572f, D4.d.f1570d, D4.d.f1571e);

    /* JADX INFO: renamed from: a */
    public byte[] f18867a;

    /* JADX INFO: renamed from: b */
    public int f18868b;

    /* JADX INFO: renamed from: c */
    public int f18869c;

    public m() {
        this.f18867a = t.f18886f;
    }

    public final int A() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f18868b = i7 + 2;
        return (bArr[i8] & 255) | i9;
    }

    public final long B() {
        int i7;
        int i8;
        long j3 = this.f18867a[this.f18868b];
        int i9 = 7;
        while (true) {
            if (i9 < 0) {
                break;
            }
            int i10 = 1 << i9;
            if ((((long) i10) & j3) != 0) {
                i9--;
            } else if (i9 < 6) {
                j3 &= (long) (i10 - 1);
                i8 = 7 - i9;
            } else if (i9 == 7) {
                i8 = 1;
            }
        }
        i8 = 0;
        if (i8 == 0) {
            throw new NumberFormatException(A0.e.D("Invalid UTF-8 sequence first byte: ", j3));
        }
        for (i7 = 1; i7 < i8; i7++) {
            byte b7 = this.f18867a[this.f18868b + i7];
            if ((b7 & 192) != 128) {
                throw new NumberFormatException(A0.e.D("Invalid UTF-8 sequence continuation byte: ", j3));
            }
            j3 = (j3 << 6) | ((long) (b7 & 63));
        }
        this.f18868b += i8;
        return j3;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f18867a;
            int i7 = this.f18868b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f18868b = i7 + 3;
                return D4.d.f1569c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f18867a;
        int i8 = this.f18868b;
        byte b7 = bArr2[i8];
        if (b7 == -2 && bArr2[i8 + 1] == -1) {
            this.f18868b = i8 + 2;
            return D4.d.f1570d;
        }
        if (b7 != -1 || bArr2[i8 + 1] != -2) {
            return null;
        }
        this.f18868b = i8 + 2;
        return D4.d.f1571e;
    }

    public final void D(int i7) {
        byte[] bArr = this.f18867a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        E(i7, bArr);
    }

    public final void E(int i7, byte[] bArr) {
        this.f18867a = bArr;
        this.f18869c = i7;
        this.f18868b = 0;
    }

    public final void F(int i7) {
        AbstractC1697a.d(i7 >= 0 && i7 <= this.f18867a.length);
        this.f18869c = i7;
    }

    public final void G(int i7) {
        AbstractC1697a.d(i7 >= 0 && i7 <= this.f18869c);
        this.f18868b = i7;
    }

    public final void H(int i7) {
        G(this.f18868b + i7);
    }

    public final int a() {
        return this.f18869c - this.f18868b;
    }

    public final void b(int i7) {
        byte[] bArr = this.f18867a;
        if (i7 > bArr.length) {
            this.f18867a = Arrays.copyOf(bArr, i7);
        }
    }

    public final char c(Charset charset) {
        AbstractC1697a.c("Unsupported charset: " + charset, f18866f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b7;
        int i7;
        byte b8;
        byte b9;
        if ((charset.equals(D4.d.f1569c) || charset.equals(D4.d.f1567a)) && a() >= 1) {
            long j3 = this.f18867a[this.f18868b] & 255;
            char c7 = (char) j3;
            N5.d.o(j3, "Out of range: %s", ((long) c7) == j3);
            b7 = (byte) c7;
            i7 = 1;
        } else {
            i7 = 2;
            if ((charset.equals(D4.d.f1572f) || charset.equals(D4.d.f1570d)) && a() >= 2) {
                byte[] bArr = this.f18867a;
                int i8 = this.f18868b;
                b8 = bArr[i8];
                b9 = bArr[i8 + 1];
            } else {
                if (!charset.equals(D4.d.f1571e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f18867a;
                int i9 = this.f18868b;
                b8 = bArr2[i9 + 1];
                b9 = bArr2[i9];
            }
            b7 = (byte) ((char) ((b9 & 255) | (b8 << 8)));
        }
        long j7 = b7;
        char c8 = (char) j7;
        N5.d.o(j7, "Out of range: %s", ((long) c8) == j7);
        return (c8 << 16) + i7;
    }

    public final void e(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f18867a, this.f18868b, bArr, i7, i8);
        this.f18868b += i8;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c7 = (char) (iD >> 16);
            for (char c8 : cArr) {
                if (c8 == c7) {
                    this.f18868b += iD & 65535;
                    return c7;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        int i9 = (bArr[i7] & 255) << 24;
        int i10 = i7 + 2;
        this.f18868b = i10;
        int i11 = ((bArr[i8] & 255) << 16) | i9;
        int i12 = i7 + 3;
        this.f18868b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.f18868b = i7 + 4;
        return (bArr[i12] & 255) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(java.nio.charset.Charset r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.m.h(java.nio.charset.Charset):java.lang.String");
    }

    public final int i() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.f18868b = i10;
        int i11 = ((bArr[i8] & 255) << 8) | i9;
        int i12 = i7 + 3;
        this.f18868b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f18868b = i7 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public final long j() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        long j3 = ((long) bArr[i7]) & 255;
        int i9 = i7 + 2;
        this.f18868b = i9;
        long j7 = j3 | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i7 + 3;
        this.f18868b = i10;
        long j8 = j7 | ((((long) bArr[i9]) & 255) << 16);
        int i11 = i7 + 4;
        this.f18868b = i11;
        long j9 = j8 | ((((long) bArr[i10]) & 255) << 24);
        int i12 = i7 + 5;
        this.f18868b = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 32);
        int i13 = i7 + 6;
        this.f18868b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i7 + 7;
        this.f18868b = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 48);
        this.f18868b = i7 + 8;
        return ((((long) bArr[i14]) & 255) << 56) | j12;
    }

    public final short k() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        int i9 = bArr[i7] & 255;
        this.f18868b = i7 + 2;
        return (short) (((bArr[i8] & 255) << 8) | i9);
    }

    public final long l() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        long j3 = ((long) bArr[i7]) & 255;
        int i9 = i7 + 2;
        this.f18868b = i9;
        long j7 = j3 | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i7 + 3;
        this.f18868b = i10;
        long j8 = j7 | ((((long) bArr[i9]) & 255) << 16);
        this.f18868b = i7 + 4;
        return ((((long) bArr[i10]) & 255) << 24) | j8;
    }

    public final int m() {
        int i7 = i();
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalStateException(n1.c.s(i7, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        int i9 = bArr[i7] & 255;
        this.f18868b = i7 + 2;
        return ((bArr[i8] & 255) << 8) | i9;
    }

    public final long o() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        long j3 = (((long) bArr[i7]) & 255) << 56;
        int i9 = i7 + 2;
        this.f18868b = i9;
        long j7 = j3 | ((((long) bArr[i8]) & 255) << 48);
        int i10 = i7 + 3;
        this.f18868b = i10;
        long j8 = j7 | ((((long) bArr[i9]) & 255) << 40);
        int i11 = i7 + 4;
        this.f18868b = i11;
        long j9 = j8 | ((((long) bArr[i10]) & 255) << 32);
        int i12 = i7 + 5;
        this.f18868b = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 24);
        int i13 = i7 + 6;
        this.f18868b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i7 + 7;
        this.f18868b = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 8);
        this.f18868b = i7 + 8;
        return (((long) bArr[i14]) & 255) | j12;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f18868b;
        while (i7 < this.f18869c && this.f18867a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.f18867a;
        int i8 = this.f18868b;
        int i9 = t.f18881a;
        String str = new String(bArr, i8, i7 - i8, D4.d.f1569c);
        this.f18868b = i7;
        if (i7 < this.f18869c) {
            this.f18868b = i7 + 1;
        }
        return str;
    }

    public final String q(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i8 = this.f18868b;
        int i9 = (i8 + i7) - 1;
        int i10 = (i9 >= this.f18869c || this.f18867a[i9] != 0) ? i7 : i7 - 1;
        byte[] bArr = this.f18867a;
        int i11 = t.f18881a;
        String str = new String(bArr, i8, i10, D4.d.f1569c);
        this.f18868b += i7;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f18868b = i7 + 2;
        return (short) ((bArr[i8] & 255) | i9);
    }

    public final String s(int i7, Charset charset) {
        String str = new String(this.f18867a, this.f18868b, i7, charset);
        this.f18868b += i7;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        this.f18868b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final int v() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f18868b = i7 + 2;
        int i10 = (bArr[i8] & 255) | i9;
        this.f18868b = i7 + 4;
        return i10;
    }

    public final long w() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        long j3 = (((long) bArr[i7]) & 255) << 24;
        int i9 = i7 + 2;
        this.f18868b = i9;
        long j7 = j3 | ((((long) bArr[i8]) & 255) << 16);
        int i10 = i7 + 3;
        this.f18868b = i10;
        long j8 = j7 | ((((long) bArr[i9]) & 255) << 8);
        this.f18868b = i7 + 4;
        return (((long) bArr[i10]) & 255) | j8;
    }

    public final int x() {
        byte[] bArr = this.f18867a;
        int i7 = this.f18868b;
        int i8 = i7 + 1;
        this.f18868b = i8;
        int i9 = (bArr[i7] & 255) << 16;
        int i10 = i7 + 2;
        this.f18868b = i10;
        int i11 = ((bArr[i8] & 255) << 8) | i9;
        this.f18868b = i7 + 3;
        return (bArr[i10] & 255) | i11;
    }

    public final int y() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(n1.c.s(iG, "Top bit not zero: "));
    }

    public final long z() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(A0.e.D("Top bit not zero: ", jO));
    }

    public m(int i7) {
        this.f18867a = new byte[i7];
        this.f18869c = i7;
    }

    public m(byte[] bArr) {
        this.f18867a = bArr;
        this.f18869c = bArr.length;
    }

    public m(int i7, byte[] bArr) {
        this.f18867a = bArr;
        this.f18869c = i7;
    }
}
