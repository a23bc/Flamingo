package X3;

import I4.t;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Executor {

    /* JADX INFO: renamed from: p */
    public final ExecutorService f8279p;

    /* JADX INFO: renamed from: r */
    public volatile Runnable f8281r;

    /* JADX INFO: renamed from: o */
    public final ArrayDeque f8278o = new ArrayDeque();

    /* JADX INFO: renamed from: q */
    public final Object f8280q = new Object();

    public g(ExecutorService executorService) {
        this.f8279p = executorService;
    }

    public final boolean a() {
        boolean z6;
        synchronized (this.f8280q) {
            z6 = !this.f8278o.isEmpty();
        }
        return z6;
    }

    public final void b() {
        synchronized (this.f8280q) {
            try {
                Runnable runnable = (Runnable) this.f8278o.poll();
                this.f8281r = runnable;
                if (runnable != null) {
                    this.f8279p.execute(this.f8281r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f8280q) {
            try {
                this.f8278o.add(new t(this, 7, runnable));
                if (this.f8281r == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
