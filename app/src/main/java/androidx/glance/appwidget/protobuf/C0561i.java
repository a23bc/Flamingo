package androidx.glance.appwidget.protobuf;

import D2.C0088d;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0561i extends I0.c {
    public static final Logger h = Logger.getLogger(C0561i.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f9636i = Z.f9606e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B f9637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O1.o f9641g;

    public C0561i(O1.o oVar, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i7, 20);
        this.f9638d = new byte[iMax];
        this.f9639e = iMax;
        this.f9641g = oVar;
    }

    public static int g0(int i7, C0558f c0558f) {
        int iI0 = i0(i7);
        int size = c0558f.size();
        return j0(size) + size + iI0;
    }

    public static int h0(String str) {
        int length;
        try {
            length = c0.a(str);
        } catch (b0 unused) {
            length = str.getBytes(AbstractC0572u.f9656a).length;
        }
        return j0(length) + length;
    }

    public static int i0(int i7) {
        return j0(i7 << 3);
    }

    public static int j0(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int k0(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public final void A0(int i7) throws IOException {
        m0(5);
        e0(i7);
    }

    public final void B0(long j3, int i7) throws IOException {
        m0(20);
        d0(i7, 0);
        f0(j3);
    }

    public final void C0(long j3) throws IOException {
        m0(10);
        f0(j3);
    }

    @Override // I0.c
    public final void a0(byte[] bArr, int i7, int i8) throws IOException {
        n0(bArr, i7, i8);
    }

    public final void b0(int i7) {
        int i8 = this.f9640f;
        int i9 = i8 + 1;
        this.f9640f = i9;
        byte[] bArr = this.f9638d;
        bArr[i8] = (byte) (i7 & 255);
        int i10 = i8 + 2;
        this.f9640f = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        int i11 = i8 + 3;
        this.f9640f = i11;
        bArr[i10] = (byte) ((i7 >> 16) & 255);
        this.f9640f = i8 + 4;
        bArr[i11] = (byte) ((i7 >> 24) & 255);
    }

    public final void c0(long j3) {
        int i7 = this.f9640f;
        int i8 = i7 + 1;
        this.f9640f = i8;
        byte[] bArr = this.f9638d;
        bArr[i7] = (byte) (j3 & 255);
        int i9 = i7 + 2;
        this.f9640f = i9;
        bArr[i8] = (byte) ((j3 >> 8) & 255);
        int i10 = i7 + 3;
        this.f9640f = i10;
        bArr[i9] = (byte) ((j3 >> 16) & 255);
        int i11 = i7 + 4;
        this.f9640f = i11;
        bArr[i10] = (byte) (255 & (j3 >> 24));
        int i12 = i7 + 5;
        this.f9640f = i12;
        bArr[i11] = (byte) (((int) (j3 >> 32)) & 255);
        int i13 = i7 + 6;
        this.f9640f = i13;
        bArr[i12] = (byte) (((int) (j3 >> 40)) & 255);
        int i14 = i7 + 7;
        this.f9640f = i14;
        bArr[i13] = (byte) (((int) (j3 >> 48)) & 255);
        this.f9640f = i7 + 8;
        bArr[i14] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void d0(int i7, int i8) {
        e0((i7 << 3) | i8);
    }

    public final void e0(int i7) {
        boolean z6 = f9636i;
        byte[] bArr = this.f9638d;
        if (z6) {
            while ((i7 & (-128)) != 0) {
                int i8 = this.f9640f;
                this.f9640f = i8 + 1;
                Z.j(bArr, i8, (byte) ((i7 | 128) & 255));
                i7 >>>= 7;
            }
            int i9 = this.f9640f;
            this.f9640f = i9 + 1;
            Z.j(bArr, i9, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i10 = this.f9640f;
            this.f9640f = i10 + 1;
            bArr[i10] = (byte) ((i7 | 128) & 255);
            i7 >>>= 7;
        }
        int i11 = this.f9640f;
        this.f9640f = i11 + 1;
        bArr[i11] = (byte) i7;
    }

    public final void f0(long j3) {
        boolean z6 = f9636i;
        byte[] bArr = this.f9638d;
        if (z6) {
            while ((j3 & (-128)) != 0) {
                int i7 = this.f9640f;
                this.f9640f = i7 + 1;
                Z.j(bArr, i7, (byte) ((((int) j3) | 128) & 255));
                j3 >>>= 7;
            }
            int i8 = this.f9640f;
            this.f9640f = i8 + 1;
            Z.j(bArr, i8, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i9 = this.f9640f;
            this.f9640f = i9 + 1;
            bArr[i9] = (byte) ((((int) j3) | 128) & 255);
            j3 >>>= 7;
        }
        int i10 = this.f9640f;
        this.f9640f = i10 + 1;
        bArr[i10] = (byte) j3;
    }

    public final void l0() throws IOException {
        this.f9641g.write(this.f9638d, 0, this.f9640f);
        this.f9640f = 0;
    }

    public final void m0(int i7) throws IOException {
        if (this.f9639e - this.f9640f < i7) {
            l0();
        }
    }

    public final void n0(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.f9640f;
        int i10 = this.f9639e;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f9638d;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f9640f += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i11);
        int i12 = i7 + i11;
        int i13 = i8 - i11;
        this.f9640f = i10;
        l0();
        if (i13 > i10) {
            this.f9641g.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f9640f = i13;
        }
    }

    public final void o0(int i7, boolean z6) throws IOException {
        m0(11);
        d0(i7, 0);
        byte b7 = z6 ? (byte) 1 : (byte) 0;
        int i8 = this.f9640f;
        this.f9640f = i8 + 1;
        this.f9638d[i8] = b7;
    }

    public final void p0(int i7, C0558f c0558f) throws IOException {
        y0(i7, 2);
        A0(c0558f.size());
        a0(c0558f.f9620p, c0558f.e(), c0558f.size());
    }

    public final void q0(int i7, int i8) throws IOException {
        m0(14);
        d0(i7, 5);
        b0(i8);
    }

    public final void r0(int i7) throws IOException {
        m0(4);
        b0(i7);
    }

    public final void s0(long j3, int i7) throws IOException {
        m0(18);
        d0(i7, 1);
        c0(j3);
    }

    public final void t0(long j3) throws IOException {
        m0(8);
        c0(j3);
    }

    public final void u0(int i7, int i8) throws IOException {
        m0(20);
        d0(i7, 0);
        if (i8 >= 0) {
            e0(i8);
        } else {
            f0(i8);
        }
    }

    public final void v0(int i7) throws IOException {
        if (i7 >= 0) {
            A0(i7);
        } else {
            C0(i7);
        }
    }

    public final void w0(int i7, AbstractC0553a abstractC0553a, P p7) throws IOException {
        y0(i7, 2);
        A0(abstractC0553a.a(p7));
        p7.g(abstractC0553a, this.f9637c);
    }

    public final void x0(int i7, String str) throws IOException {
        y0(i7, 2);
        try {
            int length = str.length() * 3;
            int iJ0 = j0(length);
            int i8 = iJ0 + length;
            int i9 = this.f9639e;
            if (i8 > i9) {
                byte[] bArr = new byte[length];
                int iW = c0.f9613a.w(str, bArr, 0, length);
                A0(iW);
                n0(bArr, 0, iW);
                return;
            }
            if (i8 > i9 - this.f9640f) {
                l0();
            }
            int iJ02 = j0(str.length());
            int i10 = this.f9640f;
            byte[] bArr2 = this.f9638d;
            try {
                if (iJ02 != iJ0) {
                    int iA = c0.a(str);
                    e0(iA);
                    this.f9640f = c0.f9613a.w(str, bArr2, this.f9640f, iA);
                    return;
                }
                int i11 = i10 + iJ02;
                this.f9640f = i11;
                int iW2 = c0.f9613a.w(str, bArr2, i11, i9 - i11);
                this.f9640f = i10;
                e0((iW2 - i10) - iJ02);
                this.f9640f = iW2;
            } catch (b0 e7) {
                this.f9640f = i10;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new C0088d(e8);
            }
        } catch (b0 e9) {
            h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e9);
            byte[] bytes = str.getBytes(AbstractC0572u.f9656a);
            try {
                A0(bytes.length);
                a0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e10) {
                throw new C0088d(e10);
            }
        }
    }

    public final void y0(int i7, int i8) {
        A0((i7 << 3) | i8);
    }

    public final void z0(int i7, int i8) throws IOException {
        m0(20);
        d0(i7, 0);
        e0(i8);
    }
}
