package M5;

import S5.C0427g;
import S5.G;
import java.net.SocketTimeoutException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class t implements S5.C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0427g f4921p = new C0427g();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f4923r;

    public t(w wVar, boolean z6) {
        this.f4923r = wVar;
        this.f4920o = z6;
    }

    @Override // S5.C
    public final G a() {
        return this.f4923r.l;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z6) throws SocketTimeoutException {
        long jMin;
        boolean z7;
        w wVar = this.f4923r;
        synchronized (wVar) {
            wVar.l.h();
            while (wVar.f4935e >= wVar.f4936f && !this.f4920o && !this.f4922q && wVar.f() == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.l.k();
                    throw th;
                }
            }
            wVar.l.k();
            wVar.b();
            jMin = Math.min(wVar.f4936f - wVar.f4935e, this.f4921p.f6785p);
            wVar.f4935e += jMin;
            z7 = z6 && jMin == this.f4921p.f6785p;
        }
        this.f4923r.l.h();
        try {
            w wVar2 = this.f4923r;
            wVar2.f4932b.j(wVar2.f4931a, z7, this.f4921p, jMin);
        } finally {
            this.f4923r.l.k();
        }
    }

    @Override // S5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        w wVar = this.f4923r;
        byte[] bArr = G5.b.f2765a;
        synchronized (wVar) {
            if (this.f4922q) {
                return;
            }
            boolean z6 = wVar.f() == 0;
            w wVar2 = this.f4923r;
            if (!wVar2.f4939j.f4920o) {
                if (this.f4921p.f6785p > 0) {
                    while (this.f4921p.f6785p > 0) {
                        b(true);
                    }
                } else if (z6) {
                    wVar2.f4932b.j(wVar2.f4931a, true, null, 0L);
                }
            }
            synchronized (this.f4923r) {
                this.f4922q = true;
            }
            this.f4923r.f4932b.flush();
            this.f4923r.a();
        }
    }

    @Override // S5.C
    public final void e(long j3, C0427g c0427g) throws SocketTimeoutException {
        AbstractC1209k.f(c0427g, "source");
        byte[] bArr = G5.b.f2765a;
        C0427g c0427g2 = this.f4921p;
        c0427g2.e(j3, c0427g);
        while (c0427g2.f6785p >= 16384) {
            b(false);
        }
    }

    @Override // S5.C, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        w wVar = this.f4923r;
        byte[] bArr = G5.b.f2765a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f4921p.f6785p > 0) {
            b(false);
            this.f4923r.f4932b.flush();
        }
    }
}
