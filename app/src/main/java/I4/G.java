package I4;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p implements RunnableFuture, h {

    /* JADX INFO: renamed from: v */
    public volatile F f3497v;

    public G(Callable callable) {
        this.f3497v = new F(this, callable);
    }

    @Override // I4.p
    public final void c() {
        F f7;
        Object obj = this.f3528o;
        if ((obj instanceof C0226a) && ((C0226a) obj).f3500a && (f7 = this.f3497v) != null) {
            C1.a aVar = F.f3494r;
            C1.a aVar2 = F.f3493q;
            Runnable runnable = (Runnable) f7.get();
            if (runnable instanceof Thread) {
                w wVar = new w(f7);
                w.a(wVar, Thread.currentThread());
                if (f7.compareAndSet(runnable, wVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) f7.getAndSet(aVar2)) == aVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.f3497v = null;
    }

    @Override // I4.p, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3528o instanceof C0226a;
    }

    @Override // I4.p
    public final String j() {
        F f7 = this.f3497v;
        if (f7 == null) {
            return super.j();
        }
        return "task=[" + f7 + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        F f7 = this.f3497v;
        if (f7 != null) {
            f7.run();
        }
        this.f3497v = null;
    }
}
