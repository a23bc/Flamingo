package L5;

import A0.e;
import S5.C0427g;
import java.io.IOException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4325r;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4317p) {
            return;
        }
        if (!this.f4325r) {
            b();
        }
        this.f4317p = true;
    }

    @Override // L5.a, S5.E
    public final long k(long j3, C0427g c0427g) throws IOException {
        AbstractC1209k.f(c0427g, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(e.D("byteCount < 0: ", j3).toString());
        }
        if (this.f4317p) {
            throw new IllegalStateException("closed");
        }
        if (this.f4325r) {
            return -1L;
        }
        long jK = super.k(j3, c0427g);
        if (jK != -1) {
            return jK;
        }
        this.f4325r = true;
        b();
        return -1L;
    }
}
