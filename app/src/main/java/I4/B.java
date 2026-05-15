package I4;

import E4.AbstractC0119q;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0119q implements ScheduledFuture, y, Future {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f3489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledFuture f3490q;

    public B(p pVar, ScheduledFuture scheduledFuture) {
        this.f3489p = pVar;
        this.f3490q = scheduledFuture;
    }

    @Override // I4.y
    public final void b(Runnable runnable, Executor executor) {
        this.f3489p.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean zV = v(z6);
        if (zV) {
            this.f3490q.cancel(z6);
        }
        return zV;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f3490q.compareTo(delayed);
    }

    @Override // E4.AbstractC0119q
    public final Object f() {
        return this.f3489p;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f3489p.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f3490q.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3489p.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3489p.isDone();
    }

    public final boolean v(boolean z6) {
        return this.f3489p.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f3489p.get(j3, timeUnit);
    }
}
