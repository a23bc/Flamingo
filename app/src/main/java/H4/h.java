package h4;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1004c f12743o;

    public h(C1004c c1004c) {
        this.f12743o = c1004c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12743o.close();
    }
}
