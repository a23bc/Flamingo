package N3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f5108o = new AtomicInteger(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f5109p;

    public a(boolean z6) {
        this.f5109p = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f5109p ? "WM.task-" : "androidx.work-") + this.f5108o.incrementAndGet());
    }
}
