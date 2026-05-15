package S5;

import java.io.IOException;
import java.io.OutputStream;
import m5.AbstractC1209k;
import o5.AbstractC1267a;

/* JADX INFO: renamed from: S5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0423c implements C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f6773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f6774q;

    public /* synthetic */ C0423c(Object obj, int i7, Object obj2) {
        this.f6772o = i7;
        this.f6773p = obj;
        this.f6774q = obj2;
    }

    @Override // S5.C
    public final G a() {
        switch (this.f6772o) {
            case 0:
                return (D) this.f6773p;
            default:
                return (G) this.f6774q;
        }
    }

    @Override // S5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f6772o) {
            case 0:
                C0423c c0423c = (C0423c) this.f6774q;
                D d4 = (D) this.f6773p;
                d4.h();
                try {
                    c0423c.close();
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
                ((OutputStream) this.f6773p).close();
                return;
        }
    }

    @Override // S5.C
    public final void e(long j3, C0427g c0427g) throws IOException {
        switch (this.f6772o) {
            case 0:
                AbstractC1209k.f(c0427g, "source");
                AbstractC1267a.o(c0427g.f6785p, 0L, j3);
                long j7 = j3;
                while (true) {
                    long j8 = 0;
                    if (j7 <= 0) {
                        return;
                    }
                    z zVar = c0427g.f6784o;
                    AbstractC1209k.c(zVar);
                    while (true) {
                        if (j8 < 65536) {
                            j8 += (long) (zVar.f6827c - zVar.f6826b);
                            if (j8 >= j7) {
                                j8 = j7;
                            } else {
                                zVar = zVar.f6830f;
                                AbstractC1209k.c(zVar);
                            }
                        }
                    }
                    C0423c c0423c = (C0423c) this.f6774q;
                    D d4 = (D) this.f6773p;
                    d4.h();
                    try {
                        try {
                            c0423c.e(j8, c0427g);
                            if (d4.i()) {
                                throw d4.k(null);
                            }
                            j7 -= j8;
                        } catch (IOException e7) {
                            if (!d4.i()) {
                                throw e7;
                            }
                            throw d4.k(e7);
                        }
                    } catch (Throwable th) {
                        d4.i();
                        throw th;
                    }
                }
                break;
            default:
                AbstractC1209k.f(c0427g, "source");
                AbstractC1267a.o(c0427g.f6785p, 0L, j3);
                while (j3 > 0) {
                    ((G) this.f6774q).f();
                    z zVar2 = c0427g.f6784o;
                    AbstractC1209k.c(zVar2);
                    int iMin = (int) Math.min(j3, zVar2.f6827c - zVar2.f6826b);
                    ((OutputStream) this.f6773p).write(zVar2.f6825a, zVar2.f6826b, iMin);
                    int i7 = zVar2.f6826b + iMin;
                    zVar2.f6826b = i7;
                    long j9 = iMin;
                    j3 -= j9;
                    c0427g.f6785p -= j9;
                    if (i7 == zVar2.f6827c) {
                        c0427g.f6784o = zVar2.a();
                        A.a(zVar2);
                    }
                }
                return;
        }
    }

    @Override // S5.C, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f6772o) {
            case 0:
                C0423c c0423c = (C0423c) this.f6774q;
                D d4 = (D) this.f6773p;
                d4.h();
                try {
                    c0423c.flush();
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
                ((OutputStream) this.f6773p).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f6772o) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0423c) this.f6774q) + ')';
            default:
                return "sink(" + ((OutputStream) this.f6773p) + ')';
        }
    }
}
