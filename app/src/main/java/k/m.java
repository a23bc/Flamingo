package k;

import A2.RunnableC0022x;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Executor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f13922o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f13923p = new ArrayDeque();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f13924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Runnable f13925r;

    public m(n nVar) {
        this.f13924q = nVar;
    }

    public final void a() {
        synchronized (this.f13922o) {
            try {
                Runnable runnable = (Runnable) this.f13923p.poll();
                this.f13925r = runnable;
                if (runnable != null) {
                    this.f13924q.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f13922o) {
            try {
                this.f13923p.add(new RunnableC0022x(this, 9, runnable));
                if (this.f13925r == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
