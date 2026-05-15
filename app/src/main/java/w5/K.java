package w5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class K extends B5.r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19495s = AtomicIntegerFieldUpdater.newUpdater(K.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // B5.r, w5.p0
    public final void A(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f19495s;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                B5.a.h(I0.c.D(this.f914r), AbstractC1767D.v(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    @Override // B5.r, w5.p0
    public final void x(Object obj) {
        A(obj);
    }
}
