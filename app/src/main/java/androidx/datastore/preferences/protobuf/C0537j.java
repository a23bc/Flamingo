package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0537j extends M {
    public static final Logger h = Logger.getLogger(C0537j.class.getName());

    /* JADX INFO: renamed from: i */
    public static final boolean f9485i = o0.f9507f;

    /* JADX INFO: renamed from: c */
    public F f9486c;

    /* JADX INFO: renamed from: d */
    public final byte[] f9487d;

    /* JADX INFO: renamed from: e */
    public final int f9488e;

    /* JADX INFO: renamed from: f */
    public int f9489f;

    /* JADX INFO: renamed from: g */
    public final O1.o f9490g;

    public C0537j(O1.o oVar, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i7, 20);
        this.f9487d = new byte[iMax];
        this.f9488e = iMax;
        this.f9490g = oVar;
    }

    public static int A(long j3) {
        int i7;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i7 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static int r(int i7, C0533f c0533f) {
        return s(c0533f) + y(i7);
    }

    public static int s(C0533f c0533f) {
        int size = c0533f.size();
        return z(size) + size;
    }

    public static int t(int i7) {
        return y(i7) + 4;
    }

    public static int u(int i7) {
        return y(i7) + 8;
    }

    public static int v(int i7, AbstractC0528a abstractC0528a, X x6) {
        return abstractC0528a.b(x6) + (y(i7) * 2);
    }

    public static int w(int i7) {
        if (i7 >= 0) {
            return z(i7);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = r0.b(str);
        } catch (q0 unused) {
            length = str.getBytes(AbstractC0548v.f9521a).length;
        }
        return z(length) + length;
    }

    public static int y(int i7) {
        return z(i7 << 3);
    }

    public static int z(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void B() throws IOException {
        this.f9490g.write(this.f9487d, 0, this.f9489f);
        this.f9489f = 0;
    }

    public final void C(int i7) throws IOException {
        if (this.f9488e - this.f9489f < i7) {
            B();
        }
    }

    public final void D(byte b7) throws IOException {
        if (this.f9489f == this.f9488e) {
            B();
        }
        int i7 = this.f9489f;
        this.f9489f = i7 + 1;
        this.f9487d[i7] = b7;
    }

    public final void E(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.f9489f;
        int i10 = this.f9488e;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f9487d;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f9489f += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i11);
        int i12 = i7 + i11;
        int i13 = i8 - i11;
        this.f9489f = i10;
        B();
        if (i13 > i10) {
            this.f9490g.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f9489f = i13;
        }
    }

    public final void F(int i7, boolean z6) throws IOException {
        C(11);
        o(i7, 0);
        byte b7 = z6 ? (byte) 1 : (byte) 0;
        int i8 = this.f9489f;
        this.f9489f = i8 + 1;
        this.f9487d[i8] = b7;
    }

    public final void G(int i7, C0533f c0533f) throws IOException {
        R(i7, 2);
        H(c0533f);
    }

    public final void H(C0533f c0533f) throws IOException {
        T(c0533f.size());
        l(c0533f.f9462p, c0533f.b(), c0533f.size());
    }

    public final void I(int i7, int i8) throws IOException {
        C(14);
        o(i7, 5);
        m(i8);
    }

    public final void J(int i7) throws IOException {
        C(4);
        m(i7);
    }

    public final void K(long j3, int i7) throws IOException {
        C(18);
        o(i7, 1);
        n(j3);
    }

    public final void L(long j3) throws IOException {
        C(8);
        n(j3);
    }

    public final void M(int i7, int i8) throws IOException {
        C(20);
        o(i7, 0);
        if (i8 >= 0) {
            p(i8);
        } else {
            q(i8);
        }
    }

    public final void N(int i7) throws IOException {
        if (i7 >= 0) {
            T(i7);
        } else {
            V(i7);
        }
    }

    public final void O(int i7, AbstractC0528a abstractC0528a, X x6) throws IOException {
        R(i7, 2);
        T(abstractC0528a.b(x6));
        x6.d(abstractC0528a, this.f9486c);
    }

    public final void P(int i7, String str) throws IOException {
        R(i7, 2);
        Q(str);
    }

    public final void Q(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iZ = z(length);
            int i7 = iZ + length;
            int i8 = this.f9488e;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int iF = r0.f9520a.f(str, bArr, 0, length);
                T(iF);
                E(bArr, 0, iF);
                return;
            }
            if (i7 > i8 - this.f9489f) {
                B();
            }
            int iZ2 = z(str.length());
            int i9 = this.f9489f;
            byte[] bArr2 = this.f9487d;
            try {
                if (iZ2 == iZ) {
                    int i10 = i9 + iZ2;
                    this.f9489f = i10;
                    int iF2 = r0.f9520a.f(str, bArr2, i10, i8 - i10);
                    this.f9489f = i9;
                    p((iF2 - i9) - iZ2);
                    this.f9489f = iF2;
                } else {
                    int iB = r0.b(str);
                    p(iB);
                    this.f9489f = r0.f9520a.f(str, bArr2, this.f9489f, iB);
                }
            } catch (q0 e7) {
                this.f9489f = i9;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new C0536i(e8);
            }
        } catch (q0 e9) {
            h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e9);
            byte[] bytes = str.getBytes(AbstractC0548v.f9521a);
            try {
                T(bytes.length);
                l(bytes, 0, bytes.length);
            } catch (C0536i e10) {
                throw e10;
            } catch (IndexOutOfBoundsException e11) {
                throw new C0536i(e11);
            }
        }
    }

    public final void R(int i7, int i8) throws IOException {
        T((i7 << 3) | i8);
    }

    public final void S(int i7, int i8) throws IOException {
        C(20);
        o(i7, 0);
        p(i8);
    }

    public final void T(int i7) throws IOException {
        C(5);
        p(i7);
    }

    public final void U(long j3, int i7) throws IOException {
        C(20);
        o(i7, 0);
        q(j3);
    }

    public final void V(long j3) throws IOException {
        C(10);
        q(j3);
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public final void l(byte[] bArr, int i7, int i8) throws IOException {
        E(bArr, i7, i8);
    }

    public final void m(int i7) {
        int i8 = this.f9489f;
        int i9 = i8 + 1;
        this.f9489f = i9;
        byte[] bArr = this.f9487d;
        bArr[i8] = (byte) (i7 & 255);
        int i10 = i8 + 2;
        this.f9489f = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        int i11 = i8 + 3;
        this.f9489f = i11;
        bArr[i10] = (byte) ((i7 >> 16) & 255);
        this.f9489f = i8 + 4;
        bArr[i11] = (byte) ((i7 >> 24) & 255);
    }

    public final void n(long j3) {
        int i7 = this.f9489f;
        int i8 = i7 + 1;
        this.f9489f = i8;
        byte[] bArr = this.f9487d;
        bArr[i7] = (byte) (j3 & 255);
        int i9 = i7 + 2;
        this.f9489f = i9;
        bArr[i8] = (byte) ((j3 >> 8) & 255);
        int i10 = i7 + 3;
        this.f9489f = i10;
        bArr[i9] = (byte) ((j3 >> 16) & 255);
        int i11 = i7 + 4;
        this.f9489f = i11;
        bArr[i10] = (byte) (255 & (j3 >> 24));
        int i12 = i7 + 5;
        this.f9489f = i12;
        bArr[i11] = (byte) (((int) (j3 >> 32)) & 255);
        int i13 = i7 + 6;
        this.f9489f = i13;
        bArr[i12] = (byte) (((int) (j3 >> 40)) & 255);
        int i14 = i7 + 7;
        this.f9489f = i14;
        bArr[i13] = (byte) (((int) (j3 >> 48)) & 255);
        this.f9489f = i7 + 8;
        bArr[i14] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void o(int i7, int i8) {
        p((i7 << 3) | i8);
    }

    public final void p(int i7) {
        boolean z6 = f9485i;
        byte[] bArr = this.f9487d;
        if (z6) {
            while ((i7 & (-128)) != 0) {
                int i8 = this.f9489f;
                this.f9489f = i8 + 1;
                o0.j(bArr, i8, (byte) ((i7 & 127) | 128));
                i7 >>>= 7;
            }
            int i9 = this.f9489f;
            this.f9489f = i9 + 1;
            o0.j(bArr, i9, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i10 = this.f9489f;
            this.f9489f = i10 + 1;
            bArr[i10] = (byte) ((i7 & 127) | 128);
            i7 >>>= 7;
        }
        int i11 = this.f9489f;
        this.f9489f = i11 + 1;
        bArr[i11] = (byte) i7;
    }

    public final void q(long j3) {
        boolean z6 = f9485i;
        byte[] bArr = this.f9487d;
        if (z6) {
            while ((j3 & (-128)) != 0) {
                int i7 = this.f9489f;
                this.f9489f = i7 + 1;
                o0.j(bArr, i7, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            int i8 = this.f9489f;
            this.f9489f = i8 + 1;
            o0.j(bArr, i8, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i9 = this.f9489f;
            this.f9489f = i9 + 1;
            bArr[i9] = (byte) ((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        int i10 = this.f9489f;
        this.f9489f = i10 + 1;
        bArr[i10] = (byte) j3;
    }
}
