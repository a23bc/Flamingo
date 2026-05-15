package y2;

import java.io.InputStream;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class l extends InputStream {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B f20339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f20340p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20342r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20343s = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f20341q = new byte[1];

    public l(B b7, m mVar) {
        this.f20339o = b7;
        this.f20340p = mVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f20343s) {
            return;
        }
        this.f20339o.close();
        this.f20343s = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f20341q;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC1697a.i(!this.f20343s);
        boolean z6 = this.f20342r;
        B b7 = this.f20339o;
        if (!z6) {
            b7.e(this.f20340p);
            this.f20342r = true;
        }
        int iN = b7.n(bArr, i7, i8);
        if (iN == -1) {
            return -1;
        }
        return iN;
    }
}
