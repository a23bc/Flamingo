package S5;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: S5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0422b extends Thread {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6771o = 1;

    public /* synthetic */ C0422b(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.f6771o) {
            case 0:
                break;
            default:
                try {
                    super.run();
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
        while (true) {
            try {
                reentrantLock = C0425e.h;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
                continue;
            }
            try {
                C0425e c0425eJ = I0.c.j();
                if (c0425eJ == C0425e.l) {
                    C0425e.l = null;
                    return;
                } else {
                    reentrantLock.unlock();
                    if (c0425eJ != null) {
                        c0425eJ.j();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public /* synthetic */ C0422b(String str) {
        super(str);
    }
}
