package S5;

import java.io.EOFException;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: S5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0426f implements C {
    @Override // S5.C
    public final G a() {
        return G.f6762d;
    }

    @Override // S5.C
    public final void e(long j3, C0427g c0427g) throws EOFException {
        AbstractC1209k.f(c0427g, "source");
        c0427g.w(j3);
    }

    @Override // S5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // S5.C, java.io.Flushable
    public final void flush() {
    }
}
