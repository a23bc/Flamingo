package M5;

import S5.C0427g;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m5.AbstractC1209k;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Logger f4943t = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final S5.w f4944o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0427g f4945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4947r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f4948s;

    public x(S5.w wVar) {
        AbstractC1209k.f(wVar, "sink");
        this.f4944o = wVar;
        C0427g c0427g = new C0427g();
        this.f4945p = c0427g;
        this.f4946q = 16384;
        this.f4948s = new d(c0427g);
    }

    public final synchronized void b(B b7) {
        try {
            AbstractC1209k.f(b7, "peerSettings");
            if (this.f4947r) {
                throw new IOException("closed");
            }
            int i7 = this.f4946q;
            int i8 = b7.f4827a;
            if ((i8 & 32) != 0) {
                i7 = b7.f4828b[5];
            }
            this.f4946q = i7;
            if (((i8 & 2) != 0 ? b7.f4828b[1] : -1) != -1) {
                d dVar = this.f4948s;
                int i9 = (i8 & 2) != 0 ? b7.f4828b[1] : -1;
                dVar.getClass();
                int iMin = Math.min(i9, 16384);
                int i10 = dVar.f4848d;
                if (i10 != iMin) {
                    if (iMin < i10) {
                        dVar.f4846b = Math.min(dVar.f4846b, iMin);
                    }
                    dVar.f4847c = true;
                    dVar.f4848d = iMin;
                    int i11 = dVar.h;
                    if (iMin < i11) {
                        if (iMin == 0) {
                            C0282b[] c0282bArr = dVar.f4849e;
                            Z4.l.d0(c0282bArr, 0, c0282bArr.length);
                            dVar.f4850f = dVar.f4849e.length - 1;
                            dVar.f4851g = 0;
                            dVar.h = 0;
                        } else {
                            dVar.a(i11 - iMin);
                        }
                    }
                }
            }
            d(0, 0, 4, 1);
            this.f4944o.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z6, int i7, C0427g c0427g, int i8) {
        if (this.f4947r) {
            throw new IOException("closed");
        }
        d(i7, i8, 0, z6 ? 1 : 0);
        if (i8 > 0) {
            AbstractC1209k.c(c0427g);
            this.f4944o.e(i8, c0427g);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f4947r = true;
        this.f4944o.close();
    }

    public final void d(int i7, int i8, int i9, int i10) {
        Level level = Level.FINE;
        Logger logger = f4943t;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i7, i8, i9, i10));
        }
        if (i8 > this.f4946q) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4946q + ": " + i8).toString());
        }
        if ((Integer.MIN_VALUE & i7) != 0) {
            throw new IllegalArgumentException(n1.c.s(i7, "reserved bit set: ").toString());
        }
        byte[] bArr = G5.b.f2765a;
        S5.w wVar = this.f4944o;
        AbstractC1209k.f(wVar, "<this>");
        wVar.m((i8 >>> 16) & 255);
        wVar.m((i8 >>> 8) & 255);
        wVar.m(i8 & 255);
        wVar.m(i9 & 255);
        wVar.m(i10 & 255);
        wVar.d(i7 & Integer.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.f4947r) {
            throw new IOException("closed");
        }
        this.f4944o.flush();
    }

    public final synchronized void g(byte[] bArr, int i7, int i8) {
        Z1.l.w(i8, "errorCode");
        if (this.f4947r) {
            throw new IOException("closed");
        }
        if (AbstractC1676i.b(i8) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        d(0, bArr.length + 8, 7, 0);
        this.f4944o.d(i7);
        this.f4944o.d(AbstractC1676i.b(i8));
        if (bArr.length != 0) {
            S5.w wVar = this.f4944o;
            if (wVar.f6820q) {
                throw new IllegalStateException("closed");
            }
            wVar.f6819p.A(bArr.length, bArr);
            wVar.b();
        }
        this.f4944o.flush();
    }

    public final synchronized void h(boolean z6, int i7, ArrayList arrayList) {
        if (this.f4947r) {
            throw new IOException("closed");
        }
        this.f4948s.d(arrayList);
        long j3 = this.f4945p.f6785p;
        long jMin = Math.min(this.f4946q, j3);
        int i8 = j3 == jMin ? 4 : 0;
        if (z6) {
            i8 |= 1;
        }
        d(i7, (int) jMin, 1, i8);
        this.f4944o.e(jMin, this.f4945p);
        if (j3 > jMin) {
            long j7 = j3 - jMin;
            while (j7 > 0) {
                long jMin2 = Math.min(this.f4946q, j7);
                j7 -= jMin2;
                d(i7, (int) jMin2, 9, j7 == 0 ? 4 : 0);
                this.f4944o.e(jMin2, this.f4945p);
            }
        }
    }

    public final synchronized void i(int i7, int i8, boolean z6) {
        if (this.f4947r) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z6 ? 1 : 0);
        this.f4944o.d(i7);
        this.f4944o.d(i8);
        this.f4944o.flush();
    }

    public final synchronized void j(int i7, int i8) {
        Z1.l.w(i8, "errorCode");
        if (this.f4947r) {
            throw new IOException("closed");
        }
        if (AbstractC1676i.b(i8) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d(i7, 4, 3, 0);
        this.f4944o.d(AbstractC1676i.b(i8));
        this.f4944o.flush();
    }

    public final synchronized void n(B b7) {
        try {
            AbstractC1209k.f(b7, "settings");
            if (this.f4947r) {
                throw new IOException("closed");
            }
            d(0, Integer.bitCount(b7.f4827a) * 6, 4, 0);
            int i7 = 0;
            while (i7 < 10) {
                boolean z6 = true;
                if (((1 << i7) & b7.f4827a) == 0) {
                    z6 = false;
                }
                if (z6) {
                    int i8 = i7 != 4 ? i7 != 7 ? i7 : 4 : 3;
                    S5.w wVar = this.f4944o;
                    if (wVar.f6820q) {
                        throw new IllegalStateException("closed");
                    }
                    C0427g c0427g = wVar.f6819p;
                    S5.z zVarZ = c0427g.z(2);
                    int i9 = zVarZ.f6827c;
                    byte[] bArr = zVarZ.f6825a;
                    bArr[i9] = (byte) ((i8 >>> 8) & 255);
                    bArr[i9 + 1] = (byte) (i8 & 255);
                    zVarZ.f6827c = i9 + 2;
                    c0427g.f6785p += 2;
                    wVar.b();
                    this.f4944o.d(b7.f4828b[i7]);
                }
                i7++;
            }
            this.f4944o.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(long j3, int i7) {
        if (this.f4947r) {
            throw new IOException("closed");
        }
        if (j3 == 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j3).toString());
        }
        d(i7, 4, 8, 0);
        this.f4944o.d((int) j3);
        this.f4944o.flush();
    }
}
