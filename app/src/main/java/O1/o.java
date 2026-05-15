package O1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o extends OutputStream {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final FileOutputStream f5541o;

    public o(FileOutputStream fileOutputStream) {
        this.f5541o = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f5541o.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        this.f5541o.write(i7);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        AbstractC1209k.f(bArr, "b");
        this.f5541o.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) throws IOException {
        AbstractC1209k.f(bArr, "bytes");
        this.f5541o.write(bArr, i7, i8);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
