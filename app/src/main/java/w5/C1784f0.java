package w5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: w5.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1784f0 extends AbstractC1790i0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19532t = AtomicIntegerFieldUpdater.newUpdater(C1784f0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC1780d0 f19533s;

    public C1784f0(InterfaceC1780d0 interfaceC1780d0) {
        this.f19533s = interfaceC1780d0;
    }

    @Override // w5.InterfaceC1780d0
    public final void c(Throwable th) {
        if (f19532t.compareAndSet(this, 0, 1)) {
            this.f19533s.c(th);
        }
    }
}
