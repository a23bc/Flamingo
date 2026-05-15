package M5;

import S5.C0427g;
import S5.E;
import S5.G;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class r implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final S5.y f4910o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4913r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4915t;

    public r(S5.y yVar) {
        AbstractC1209k.f(yVar, "source");
        this.f4910o = yVar;
    }

    @Override // S5.E
    public final G a() {
        return this.f4910o.f6822o.a();
    }

    @Override // S5.E
    public final long k(long j3, C0427g c0427g) throws IOException {
        int i7;
        int i8;
        AbstractC1209k.f(c0427g, "sink");
        do {
            int i9 = this.f4914s;
            S5.y yVar = this.f4910o;
            if (i9 == 0) {
                yVar.u(this.f4915t);
                this.f4915t = 0;
                if ((this.f4912q & 4) == 0) {
                    i7 = this.f4913r;
                    int iQ = G5.b.q(yVar);
                    this.f4914s = iQ;
                    this.f4911p = iQ;
                    int iD = yVar.d() & 255;
                    this.f4912q = yVar.d() & 255;
                    Logger logger = s.f4916r;
                    if (logger.isLoggable(Level.FINE)) {
                        S5.j jVar = f.f4854a;
                        logger.fine(f.a(true, this.f4913r, this.f4911p, iD, this.f4912q));
                    }
                    i8 = yVar.i() & Integer.MAX_VALUE;
                    this.f4913r = i8;
                    if (iD != 9) {
                        throw new IOException(iD + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jK = yVar.k(Math.min(j3, i9), c0427g);
                if (jK != -1) {
                    this.f4914s -= (int) jK;
                    return jK;
                }
            }
            return -1L;
        } while (i8 == i7);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
