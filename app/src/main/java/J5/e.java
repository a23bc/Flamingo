package J5;

import F5.o;
import M.J;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import w5.C1793k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J f3762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile AtomicInteger f3763p = new AtomicInteger(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h f3764q;

    public e(h hVar, J j3) {
        this.f3764q = hVar;
        this.f3762o = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U3.h hVar;
        String strConcat = "OkHttp ".concat(((o) this.f3764q.f3771p.f2441p).f());
        h hVar2 = this.f3764q;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            hVar2.f3773r.h();
            boolean z6 = false;
            try {
                try {
                } catch (IOException e7) {
                    e = e7;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    ((C1793k) this.f3762o.f4417q).resumeWith(hVar2.f());
                    hVar = hVar2.f3770o.f2420o;
                } catch (IOException e8) {
                    e = e8;
                    z6 = true;
                    if (z6) {
                        N5.n nVar = N5.n.f5271a;
                        N5.n nVar2 = N5.n.f5271a;
                        String str = "Callback failure for " + h.a(hVar2);
                        nVar2.getClass();
                        N5.n.i(str, 4, e);
                    } else {
                        J j3 = this.f3762o;
                        if (!hVar2.f3767A) {
                            ((C1793k) j3.f4417q).resumeWith(android.support.v4.media.session.b.l(e));
                        }
                    }
                    hVar = hVar2.f3770o.f2420o;
                } catch (Throwable th2) {
                    th = th2;
                    z6 = true;
                    hVar2.d();
                    if (!z6) {
                        IOException iOException = new IOException("canceled due to " + th);
                        N5.l.k(iOException, th);
                        J j7 = this.f3762o;
                        if (!hVar2.f3767A) {
                            ((C1793k) j7.f4417q).resumeWith(android.support.v4.media.session.b.l(iOException));
                        }
                    }
                    throw th;
                }
                hVar.H(this);
            } catch (Throwable th3) {
                hVar2.f3770o.f2420o.H(this);
                throw th3;
            }
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
