package I4;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class D extends A implements ScheduledExecutorService {

    /* JADX INFO: renamed from: p */
    public final ScheduledExecutorService f3492p;

    public D(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f3492p = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        G g6 = new G(callable);
        return new B(g6, this.f3492p.schedule(g6, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j7, TimeUnit timeUnit) {
        C c7 = new C(runnable);
        return new B(c7, this.f3492p.scheduleAtFixedRate(c7, j3, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j7, TimeUnit timeUnit) {
        C c7 = new C(runnable);
        return new B(c7, this.f3492p.scheduleWithFixedDelay(c7, j3, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        G g6 = new G(Executors.callable(runnable, null));
        return new B(g6, this.f3492p.schedule(g6, j3, timeUnit));
    }
}
