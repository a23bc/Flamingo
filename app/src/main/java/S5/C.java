package S5;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface C extends Closeable, Flushable {
    G a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(long j3, C0427g c0427g);

    void flush();
}
