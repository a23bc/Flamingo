package M5;

import S5.C0427g;
import S5.E;
import S5.G;
import java.io.IOException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class u implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f4924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0427g f4926q = new C0427g();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0427g f4927r = new C0427g();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f4929t;

    public u(w wVar, long j3, boolean z6) {
        this.f4929t = wVar;
        this.f4924o = j3;
        this.f4925p = z6;
    }

    @Override // S5.E
    public final G a() {
        return this.f4929t.f4940k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j3;
        w wVar = this.f4929t;
        synchronized (wVar) {
            this.f4928s = true;
            C0427g c0427g = this.f4927r;
            j3 = c0427g.f6785p;
            c0427g.w(j3);
            wVar.notifyAll();
        }
        if (j3 > 0) {
            byte[] bArr = G5.b.f2765a;
            this.f4929t.f4932b.i(j3);
        }
        this.f4929t.a();
    }

    @Override // S5.E
    public final long k(long j3, C0427g c0427g) throws Throwable {
        Throwable c7;
        boolean z6;
        long jK;
        AbstractC1209k.f(c0427g, "sink");
        long j7 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(A0.e.D("byteCount < 0: ", j3).toString());
        }
        while (true) {
            w wVar = this.f4929t;
            synchronized (wVar) {
                wVar.f4940k.h();
                try {
                    if (wVar.f() == 0 || this.f4925p) {
                        c7 = null;
                    } else {
                        c7 = wVar.f4942n;
                        if (c7 == null) {
                            int iF = wVar.f();
                            Z1.l.v(iF);
                            c7 = new C(iF);
                        }
                    }
                    if (this.f4928s) {
                        throw new IOException("stream closed");
                    }
                    C0427g c0427g2 = this.f4927r;
                    long j8 = c0427g2.f6785p;
                    z6 = false;
                    if (j8 > j7) {
                        jK = c0427g2.k(Math.min(j3, j8), c0427g);
                        long j9 = wVar.f4933c + jK;
                        wVar.f4933c = j9;
                        long j10 = j9 - wVar.f4934d;
                        if (c7 == null && j10 >= wVar.f4932b.f4881D.a() / 2) {
                            wVar.f4932b.o(j10, wVar.f4931a);
                            wVar.f4934d = wVar.f4933c;
                        }
                    } else {
                        if (!this.f4925p && c7 == null) {
                            wVar.k();
                            z6 = true;
                        }
                        jK = -1;
                    }
                    wVar.f4940k.k();
                } finally {
                }
            }
            if (!z6) {
                if (jK != -1) {
                    return jK;
                }
                if (c7 == null) {
                    return -1L;
                }
                throw c7;
            }
            j7 = 0;
        }
    }
}
