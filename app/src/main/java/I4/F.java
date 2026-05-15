package I4;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1.a f3493q = new C1.a(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1.a f3494r = new C1.a(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable f3495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f3496p;

    public F(G g6, Callable callable) {
        this.f3496p = g6;
        callable.getClass();
        this.f3495o = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        w wVar = null;
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            boolean z7 = runnable instanceof w;
            C1.a aVar = f3494r;
            if (!z7 && runnable != aVar) {
                break;
            }
            if (z7) {
                wVar = (w) runnable;
            }
            i7++;
            if (i7 <= 1000) {
                Thread.yield();
            } else if (runnable == aVar || compareAndSet(runnable, aVar)) {
                z6 = Thread.interrupted() || z6;
                LockSupport.park(wVar);
            }
            runnable = (Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objCall = null;
        if (compareAndSet(null, threadCurrentThread)) {
            G g6 = this.f3496p;
            boolean zIsDone = g6.isDone();
            C1.a aVar = f3493q;
            if (!zIsDone) {
                try {
                    objCall = this.f3495o.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, aVar)) {
                            a(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        g6.m(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, aVar)) {
                            a(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            g6.l(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f3493q) {
            str = "running=[DONE]";
        } else if (runnable instanceof w) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + this.f3495o.toString();
    }
}
