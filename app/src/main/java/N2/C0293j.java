package N2;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: N2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0293j implements n {

    /* JADX INFO: renamed from: p */
    public final y2.h f5052p;

    /* JADX INFO: renamed from: q */
    public final long f5053q;

    /* JADX INFO: renamed from: r */
    public long f5054r;

    /* JADX INFO: renamed from: t */
    public int f5056t;

    /* JADX INFO: renamed from: u */
    public int f5057u;

    /* JADX INFO: renamed from: s */
    public byte[] f5055s = new byte[65536];

    /* JADX INFO: renamed from: o */
    public final byte[] f5051o = new byte[4096];

    static {
        t2.H.a("media3.extractor");
    }

    public C0293j(y2.h hVar, long j3, long j7) {
        this.f5052p = hVar;
        this.f5054r = j3;
        this.f5053q = j7;
    }

    @Override // N2.n
    public final boolean b(byte[] bArr, int i7, int i8, boolean z6) {
        int iMin;
        int i9 = this.f5057u;
        if (i9 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i9, i8);
            System.arraycopy(this.f5055s, 0, bArr, i7, iMin);
            t(iMin);
        }
        int iR = iMin;
        while (iR < i8 && iR != -1) {
            iR = r(bArr, i7, i8, iR, z6);
        }
        if (iR != -1) {
            this.f5054r += (long) iR;
        }
        return iR != -1;
    }

    @Override // N2.n
    public final long c() {
        return this.f5053q;
    }

    @Override // N2.n
    public final void f() {
        this.f5056t = 0;
    }

    @Override // N2.n
    public final void g(int i7) {
        int iMin = Math.min(this.f5057u, i7);
        t(iMin);
        int iR = iMin;
        while (iR < i7 && iR != -1) {
            byte[] bArr = this.f5051o;
            iR = r(bArr, -iR, Math.min(i7, bArr.length + iR), iR, false);
        }
        if (iR != -1) {
            this.f5054r += (long) iR;
        }
    }

    @Override // N2.n
    public final boolean i(byte[] bArr, int i7, int i8, boolean z6) {
        if (!k(i8, z6)) {
            return false;
        }
        System.arraycopy(this.f5055s, this.f5056t - i8, bArr, i7, i8);
        return true;
    }

    @Override // N2.n
    public final long j() {
        return this.f5054r + ((long) this.f5056t);
    }

    public final boolean k(int i7, boolean z6) throws EOFException, InterruptedIOException {
        p(i7);
        int iR = this.f5057u - this.f5056t;
        while (iR < i7) {
            int i8 = i7;
            boolean z7 = z6;
            iR = r(this.f5055s, this.f5056t, i8, iR, z7);
            if (iR == -1) {
                return false;
            }
            this.f5057u = this.f5056t + iR;
            i7 = i8;
            z6 = z7;
        }
        this.f5056t += i7;
        return true;
    }

    @Override // N2.n
    public final void l(byte[] bArr, int i7, int i8) {
        i(bArr, i7, i8, false);
    }

    @Override // N2.n
    public final void m(int i7) throws EOFException, InterruptedIOException {
        k(i7, false);
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        C0293j c0293j;
        int i9 = this.f5057u;
        int iR = 0;
        if (i9 != 0) {
            int iMin = Math.min(i9, i8);
            System.arraycopy(this.f5055s, 0, bArr, i7, iMin);
            t(iMin);
            iR = iMin;
        }
        if (iR == 0) {
            c0293j = this;
            iR = c0293j.r(bArr, i7, i8, 0, true);
        } else {
            c0293j = this;
        }
        if (iR != -1) {
            c0293j.f5054r += (long) iR;
        }
        return iR;
    }

    @Override // N2.n
    public final long o() {
        return this.f5054r;
    }

    public final void p(int i7) {
        int i8 = this.f5056t + i7;
        byte[] bArr = this.f5055s;
        if (i8 > bArr.length) {
            this.f5055s = Arrays.copyOf(this.f5055s, w2.t.g(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    public final int q(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        C0293j c0293j;
        int iMin;
        p(i8);
        int i9 = this.f5057u;
        int i10 = this.f5056t;
        int i11 = i9 - i10;
        if (i11 == 0) {
            c0293j = this;
            iMin = c0293j.r(this.f5055s, i10, i8, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c0293j.f5057u += iMin;
        } else {
            c0293j = this;
            iMin = Math.min(i8, i11);
        }
        System.arraycopy(c0293j.f5055s, c0293j.f5056t, bArr, i7, iMin);
        c0293j.f5056t += iMin;
        return iMin;
    }

    public final int r(byte[] bArr, int i7, int i8, int i9, boolean z6) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iN = this.f5052p.n(bArr, i7 + i9, i8 - i9);
        if (iN != -1) {
            return i9 + iN;
        }
        if (i9 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // N2.n
    public final void readFully(byte[] bArr, int i7, int i8) {
        b(bArr, i7, i8, false);
    }

    public final int s(int i7) throws EOFException, InterruptedIOException {
        C0293j c0293j;
        int iMin = Math.min(this.f5057u, i7);
        t(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f5051o;
            c0293j = this;
            iMin = c0293j.r(bArr, 0, Math.min(i7, bArr.length), 0, true);
        } else {
            c0293j = this;
        }
        if (iMin != -1) {
            c0293j.f5054r += (long) iMin;
        }
        return iMin;
    }

    public final void t(int i7) {
        int i8 = this.f5057u - i7;
        this.f5057u = i8;
        this.f5056t = 0;
        byte[] bArr = this.f5055s;
        byte[] bArr2 = i8 < bArr.length - 524288 ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f5055s = bArr2;
    }
}
