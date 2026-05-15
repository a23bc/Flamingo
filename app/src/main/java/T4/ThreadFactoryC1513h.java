package t4;

import S5.C0422b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: t4.h */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1513h extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: q */
    public static final AtomicInteger f17077q = new AtomicInteger(1);

    /* JADX INFO: renamed from: o */
    public final String f17078o;

    /* JADX INFO: renamed from: p */
    public final int f17079p = 5;

    public ThreadFactoryC1513h(String str) {
        this.f17078o = str + "-pool-" + f17077q.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        C0422b c0422b = new C0422b(runnable, this.f17078o + getAndIncrement());
        c0422b.setDaemon(false);
        c0422b.setUncaughtExceptionHandler(new C1512g());
        c0422b.setPriority(this.f17079p);
        return c0422b;
    }
}
