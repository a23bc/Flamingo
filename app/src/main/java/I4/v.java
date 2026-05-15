package I4;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class v implements y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v f3536p = new v(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x f3537q = new x(v.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f3538o;

    public v(Object obj) {
        this.f3538o = obj;
    }

    @Override // I4.y
    public final void b(Runnable runnable, Executor executor) {
        N5.d.q(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            f3537q.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f3538o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f3538o + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f3538o;
    }
}
