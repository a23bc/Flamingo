package F5;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements Closeable {
    public abstract long b();

    public abstract q c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        G5.b.b(g());
    }

    public abstract M3.a d();

    public abstract S5.i g();
}
