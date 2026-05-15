package t4;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: t4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1510e extends LinkedBlockingQueue {

    /* JADX INFO: renamed from: o */
    public volatile C1511f f17073o;

    /* JADX INFO: renamed from: p */
    public final int f17074p = 0;

    public C1510e(int i7) {
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    /* JADX INFO: renamed from: a */
    public final boolean offer(Runnable runnable) {
        if (this.f17074p > size() || this.f17073o == null || this.f17073o.getPoolSize() >= this.f17073o.getMaximumPoolSize()) {
            return super.offer(runnable);
        }
        return false;
    }
}
