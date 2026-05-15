package F4;

import N5.d;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        bArr.getClass();
        d.t(i7, i8 + i7, bArr.length);
    }
}
