package N3;

import I4.y;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import w5.C1792j0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y3.j f5140o = new Y3.j();

    public k(C1792j0 c1792j0) {
        c1792j0.t(new B0.b(5, this));
    }

    @Override // I4.y
    public final void b(Runnable runnable, Executor executor) {
        this.f5140o.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f5140o.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5140o.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5140o.f8716o instanceof Y3.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5140o.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f5140o.get(j3, timeUnit);
    }
}
