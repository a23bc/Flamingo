package K2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Handler implements Runnable {

    /* JADX INFO: renamed from: o */
    public final int f4022o;

    /* JADX INFO: renamed from: p */
    public final k f4023p;

    /* JADX INFO: renamed from: q */
    public Object f4024q;

    /* JADX INFO: renamed from: r */
    public IOException f4025r;

    /* JADX INFO: renamed from: s */
    public int f4026s;

    /* JADX INFO: renamed from: t */
    public Thread f4027t;

    /* JADX INFO: renamed from: u */
    public boolean f4028u;

    /* JADX INFO: renamed from: v */
    public volatile boolean f4029v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ m f4030w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Looper looper, k kVar, h hVar, int i7, long j3) {
        super(looper);
        this.f4030w = mVar;
        this.f4023p = kVar;
        this.f4024q = hVar;
        this.f4022o = i7;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [K2.h, java.lang.Object] */
    public final void a(boolean z6) {
        this.f4029v = z6;
        this.f4025r = null;
        if (hasMessages(1)) {
            this.f4028u = true;
            removeMessages(1);
            if (!z6) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f4028u = true;
                    this.f4023p.b();
                    Thread thread = this.f4027t;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z6) {
            this.f4030w.f4034b = null;
            SystemClock.elapsedRealtime();
            ?? r42 = this.f4024q;
            r42.getClass();
            r42.l(this.f4023p, true);
            this.f4024q = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [K2.h, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f4029v) {
            return;
        }
        int i7 = message.what;
        if (i7 == 1) {
            this.f4025r = null;
            m mVar = this.f4030w;
            ExecutorService executorService = mVar.f4033a;
            j jVar = mVar.f4034b;
            jVar.getClass();
            executorService.execute(jVar);
            return;
        }
        if (i7 == 4) {
            throw ((Error) message.obj);
        }
        this.f4030w.f4034b = null;
        SystemClock.elapsedRealtime();
        ?? r02 = this.f4024q;
        r02.getClass();
        if (this.f4028u) {
            r02.l(this.f4023p, false);
            return;
        }
        int i8 = message.what;
        if (i8 == 2) {
            try {
                r02.a(this.f4023p);
                return;
            } catch (RuntimeException e7) {
                AbstractC1697a.n("Unexpected exception handling load completed", e7);
                this.f4030w.f4035c = new l(e7);
                return;
            }
        }
        if (i8 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f4025r = iOException;
        int i9 = this.f4026s + 1;
        this.f4026s = i9;
        i iVarM = r02.m(this.f4023p, iOException, i9);
        int i10 = iVarM.f4020a;
        if (i10 == 3) {
            this.f4030w.f4035c = this.f4025r;
            return;
        }
        if (i10 != 2) {
            if (i10 == 1) {
                this.f4026s = 1;
            }
            long jMin = iVarM.f4021b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f4026s - 1) * 1000, 5000);
            }
            m mVar2 = this.f4030w;
            AbstractC1697a.i(mVar2.f4034b == null);
            mVar2.f4034b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                this.f4025r = null;
                mVar2.f4033a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            synchronized (this) {
                z6 = this.f4028u;
                this.f4027t = Thread.currentThread();
            }
            if (!z6) {
                Trace.beginSection("load:".concat(this.f4023p.getClass().getSimpleName()));
                try {
                    this.f4023p.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f4027t = null;
                Thread.interrupted();
            }
            if (this.f4029v) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e7) {
            if (this.f4029v) {
                return;
            }
            obtainMessage(3, e7).sendToTarget();
        } catch (OutOfMemoryError e8) {
            if (this.f4029v) {
                return;
            }
            AbstractC1697a.n("OutOfMemory error loading stream", e8);
            obtainMessage(3, new l(e8)).sendToTarget();
        } catch (Error e9) {
            if (!this.f4029v) {
                AbstractC1697a.n("Unexpected error loading stream", e9);
                obtainMessage(4, e9).sendToTarget();
            }
            throw e9;
        } catch (Exception e10) {
            if (this.f4029v) {
                return;
            }
            AbstractC1697a.n("Unexpected exception loading stream", e10);
            obtainMessage(3, new l(e10)).sendToTarget();
        }
    }
}
