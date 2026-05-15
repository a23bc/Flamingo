package Y1;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class w extends Writer {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringBuilder f8683o = new StringBuilder(128);

    public final void b() {
        StringBuilder sb = this.f8683o;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                b();
            } else {
                this.f8683o.append(c7);
            }
        }
    }
}
