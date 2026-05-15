package t4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: t4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1511f extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f17075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1510e f17076p;

    public C1511f(int i7, int i8, long j3, TimeUnit timeUnit, C1510e c1510e, ThreadFactoryC1513h threadFactoryC1513h) {
        super(i7, i8, j3, timeUnit, c1510e, threadFactoryC1513h);
        this.f17075o = new AtomicInteger();
        c1510e.f17073o = this;
        this.f17076p = c1510e;
    }

    public static C1511f a() {
        return new C1511f(0, 128, 60L, TimeUnit.SECONDS, new C1510e(0), new ThreadFactoryC1513h("cached"));
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        this.f17075o.decrementAndGet();
        super.afterExecute(runnable, th);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (isShutdown()) {
            return;
        }
        AtomicInteger atomicInteger = this.f17075o;
        atomicInteger.incrementAndGet();
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException unused) {
            this.f17076p.offer(runnable);
        } catch (Throwable unused2) {
            atomicInteger.decrementAndGet();
        }
    }
}
