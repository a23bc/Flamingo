package w5;

import java.util.concurrent.locks.LockSupport;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: w5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1783f extends AbstractC1773a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Thread f19530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final W f19531s;

    public C1783f(c5.i iVar, Thread thread, W w7) {
        super(iVar, true);
        this.f19530r = thread;
        this.f19531s = w7;
    }

    @Override // w5.p0
    public final void x(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f19530r;
        if (AbstractC1209k.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
