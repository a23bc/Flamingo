package B5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w5.AbstractC1769F;
import w5.AbstractC1805x;
import w5.C1793k;
import w5.D0;
import w5.InterfaceC1772I;
import w5.N;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1805x implements InterfaceC1772I {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f893v = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC1805x f894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f895r;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1772I f896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f898u;

    /* JADX WARN: Multi-variable type inference failed */
    public h(AbstractC1805x abstractC1805x, int i7) {
        this.f894q = abstractC1805x;
        this.f895r = i7;
        InterfaceC1772I interfaceC1772I = abstractC1805x instanceof InterfaceC1772I ? (InterfaceC1772I) abstractC1805x : null;
        this.f896s = interfaceC1772I == null ? AbstractC1769F.f19488a : interfaceC1772I;
        this.f897t = new k();
        this.f898u = new Object();
    }

    @Override // w5.AbstractC1805x
    public final void A(c5.i iVar, Runnable runnable) {
        Runnable runnableE;
        this.f897t.a(runnable);
        if (f893v.get(this) >= this.f895r || !F() || (runnableE = E()) == null) {
            return;
        }
        this.f894q.A(this, new I4.t(1, this, runnableE, false));
    }

    @Override // w5.AbstractC1805x
    public final void B(c5.i iVar, Runnable runnable) {
        Runnable runnableE;
        this.f897t.a(runnable);
        if (f893v.get(this) >= this.f895r || !F() || (runnableE = E()) == null) {
            return;
        }
        this.f894q.B(this, new I4.t(1, this, runnableE, false));
    }

    public final Runnable E() {
        while (true) {
            Runnable runnable = (Runnable) this.f897t.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f898u) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f893v;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f897t.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean F() {
        synchronized (this.f898u) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f893v;
            if (atomicIntegerFieldUpdater.get(this) >= this.f895r) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // w5.InterfaceC1772I
    public final N g(long j3, D0 d02, c5.i iVar) {
        return this.f896s.g(j3, d02, iVar);
    }

    @Override // w5.InterfaceC1772I
    public final void w(long j3, C1793k c1793k) {
        this.f896s.w(j3, c1793k);
    }
}
