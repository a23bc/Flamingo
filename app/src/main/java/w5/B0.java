package w5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements InterfaceC1780d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19464q = AtomicIntegerFieldUpdater.newUpdater(B0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Thread f19465o = Thread.currentThread();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public N f19466p;

    public B0(InterfaceC1786g0 interfaceC1786g0) {
    }

    public static void b(int i7) {
        throw new IllegalStateException(("Illegal state " + i7).toString());
    }

    public final void a() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19464q;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i7);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i7, 1)) {
                N n7 = this.f19466p;
                if (n7 != null) {
                    n7.a();
                    return;
                }
                return;
            }
        }
    }

    @Override // w5.InterfaceC1780d0
    public final void c(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f19464q;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    return;
                }
                b(i7);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 2));
        this.f19465o.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }
}
