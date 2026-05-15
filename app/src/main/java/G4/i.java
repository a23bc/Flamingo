package g4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class i extends InputStream {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InputStream f12518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12519p = 1073741824;

    public i(InputStream inputStream) {
        this.f12518o = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f12519p;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12518o.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i7 = this.f12518o.read();
        if (i7 == -1) {
            this.f12519p = 0;
        }
        return i7;
    }

    @Override // java.io.InputStream
    public final long skip(long j3) {
        return this.f12518o.skip(j3);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i7 = this.f12518o.read(bArr);
        if (i7 == -1) {
            this.f12519p = 0;
        }
        return i7;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.f12518o.read(bArr, i7, i8);
        if (i9 == -1) {
            this.f12519p = 0;
        }
        return i9;
    }
}
