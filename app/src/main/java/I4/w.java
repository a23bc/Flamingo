package I4;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: o */
    public final F f3539o;

    public w(F f7) {
        this.f3539o = f7;
    }

    public static void a(w wVar, Thread thread) {
        wVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f3539o.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
