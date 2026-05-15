package S5;

import java.io.IOException;
import java.io.InputStream;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: S5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0424d implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6775o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f6776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f6777q;

    public C0424d(InputStream inputStream, G g6) {
        AbstractC1209k.f(inputStream, "input");
        this.f6776p = inputStream;
        this.f6777q = g6;
    }

    @Override // S5.E
    public final G a() {
        switch (this.f6775o) {
            case 0:
                return (D) this.f6776p;
            default:
                return (G) this.f6777q;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f6775o) {
            case 0:
                C0424d c0424d = (C0424d) this.f6777q;
                D d4 = (D) this.f6776p;
                d4.h();
                try {
                    c0424d.close();
                    if (d4.i()) {
                        throw d4.k(null);
                    }
                    return;
                } catch (IOException e7) {
                    if (!d4.i()) {
                        throw e7;
                    }
                    throw d4.k(e7);
                } finally {
                    d4.i();
                }
            default:
                ((InputStream) this.f6776p).close();
                return;
        }
    }

    @Override // S5.E
    public final long k(long j3, C0427g c0427g) throws IOException {
        switch (this.f6775o) {
            case 0:
                AbstractC1209k.f(c0427g, "sink");
                C0424d c0424d = (C0424d) this.f6777q;
                D d4 = (D) this.f6776p;
                d4.h();
                try {
                    long jK = c0424d.k(j3, c0427g);
                    if (d4.i()) {
                        throw d4.k(null);
                    }
                    return jK;
                } catch (IOException e7) {
                    if (d4.i()) {
                        throw d4.k(e7);
                    }
                    throw e7;
                } finally {
                    d4.i();
                }
            default:
                AbstractC1209k.f(c0427g, "sink");
                if (j3 == 0) {
                    return 0L;
                }
                if (j3 < 0) {
                    throw new IllegalArgumentException(A0.e.D("byteCount < 0: ", j3).toString());
                }
                try {
                    ((G) this.f6777q).f();
                    z zVarZ = c0427g.z(1);
                    int i7 = ((InputStream) this.f6776p).read(zVarZ.f6825a, zVarZ.f6827c, (int) Math.min(j3, 8192 - zVarZ.f6827c));
                    if (i7 == -1) {
                        if (zVarZ.f6826b == zVarZ.f6827c) {
                            c0427g.f6784o = zVarZ.a();
                            A.a(zVarZ);
                        }
                        return -1L;
                    }
                    zVarZ.f6827c += i7;
                    long j7 = i7;
                    c0427g.f6785p += j7;
                    return j7;
                } catch (AssertionError e8) {
                    if (M3.a.W(e8)) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
        }
    }

    public final String toString() {
        switch (this.f6775o) {
            case 0:
                return "AsyncTimeout.source(" + ((C0424d) this.f6777q) + ')';
            default:
                return "source(" + ((InputStream) this.f6776p) + ')';
        }
    }

    public C0424d(D d4, C0424d c0424d) {
        this.f6776p = d4;
        this.f6777q = c0424d;
    }
}
