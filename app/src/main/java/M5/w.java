package M5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a */
    public final int f4931a;

    /* JADX INFO: renamed from: b */
    public final o f4932b;

    /* JADX INFO: renamed from: c */
    public long f4933c;

    /* JADX INFO: renamed from: d */
    public long f4934d;

    /* JADX INFO: renamed from: e */
    public long f4935e;

    /* JADX INFO: renamed from: f */
    public long f4936f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f4937g;
    public boolean h;

    /* JADX INFO: renamed from: i */
    public final u f4938i;

    /* JADX INFO: renamed from: j */
    public final t f4939j;

    /* JADX INFO: renamed from: k */
    public final v f4940k;
    public final v l;

    /* JADX INFO: renamed from: m */
    public int f4941m;

    /* JADX INFO: renamed from: n */
    public IOException f4942n;

    public w(int i7, o oVar, boolean z6, boolean z7, F5.m mVar) {
        AbstractC1209k.f(oVar, "connection");
        this.f4931a = i7;
        this.f4932b = oVar;
        this.f4936f = oVar.f4882E.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4937g = arrayDeque;
        this.f4938i = new u(this, oVar.f4881D.a(), z7);
        this.f4939j = new t(this, z6);
        this.f4940k = new v(this);
        this.l = new v(this);
        if (mVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r2 = this;
            byte[] r0 = G5.b.f2765a
            monitor-enter(r2)
            M5.u r0 = r2.f4938i     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f4925p     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r0 = r0.f4928s     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            M5.t r0 = r2.f4939j     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f4920o     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            boolean r0 = r0.f4922q     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = move-exception
            goto L34
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r0 == 0) goto L2a
            r0 = 9
            r1 = 0
            r2.c(r0, r1)
            return
        L2a:
            if (r1 != 0) goto L33
            M5.o r0 = r2.f4932b
            int r1 = r2.f4931a
            r0.g(r1)
        L33:
            return
        L34:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.w.a():void");
    }

    public final void b() throws IOException {
        t tVar = this.f4939j;
        if (tVar.f4922q) {
            throw new IOException("stream closed");
        }
        if (tVar.f4920o) {
            throw new IOException("stream finished");
        }
        if (this.f4941m != 0) {
            IOException iOException = this.f4942n;
            if (iOException != null) {
                throw iOException;
            }
            int i7 = this.f4941m;
            Z1.l.v(i7);
            throw new C(i7);
        }
    }

    public final void c(int i7, IOException iOException) {
        Z1.l.w(i7, "rstStatusCode");
        if (d(i7, iOException)) {
            o oVar = this.f4932b;
            oVar.getClass();
            Z1.l.w(i7, "statusCode");
            oVar.f4888K.j(this.f4931a, i7);
        }
    }

    public final boolean d(int i7, IOException iOException) {
        byte[] bArr = G5.b.f2765a;
        synchronized (this) {
            if (this.f4941m != 0) {
                return false;
            }
            this.f4941m = i7;
            this.f4942n = iOException;
            notifyAll();
            if (this.f4938i.f4925p) {
                if (this.f4939j.f4920o) {
                    return false;
                }
            }
            this.f4932b.g(this.f4931a);
            return true;
        }
    }

    public final void e(int i7) {
        Z1.l.w(i7, "errorCode");
        if (d(i7, null)) {
            this.f4932b.n(this.f4931a, i7);
        }
    }

    public final synchronized int f() {
        return this.f4941m;
    }

    public final boolean g() {
        boolean z6 = (this.f4931a & 1) == 1;
        this.f4932b.getClass();
        return true == z6;
    }

    public final synchronized boolean h() {
        if (this.f4941m != 0) {
            return false;
        }
        u uVar = this.f4938i;
        if (uVar.f4925p || uVar.f4928s) {
            t tVar = this.f4939j;
            if (tVar.f4920o || tVar.f4922q) {
                if (this.h) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void i(F5.m mVar, boolean z6) {
        boolean zH;
        AbstractC1209k.f(mVar, "headers");
        byte[] bArr = G5.b.f2765a;
        synchronized (this) {
            try {
                if (this.h && z6) {
                    this.f4938i.getClass();
                } else {
                    this.h = true;
                    this.f4937g.add(mVar);
                }
                if (z6) {
                    this.f4938i.f4925p = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f4932b.g(this.f4931a);
    }

    public final synchronized void j(int i7) {
        Z1.l.w(i7, "errorCode");
        if (this.f4941m == 0) {
            this.f4941m = i7;
            notifyAll();
        }
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
