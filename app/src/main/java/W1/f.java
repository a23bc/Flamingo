package W1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f7733o.mark(Integer.MAX_VALUE);
    }

    public final void c(long j3) throws IOException {
        int i7 = this.f7735q;
        if (i7 > j3) {
            this.f7735q = 0;
            this.f7733o.reset();
        } else {
            j3 -= (long) i7;
        }
        b((int) j3);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f7733o.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
