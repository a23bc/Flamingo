package w5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: w5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1795m extends AbstractC1790i0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1793k f19547s;

    public C1795m(C1793k c1793k) {
        this.f19547s = c1793k;
    }

    @Override // w5.InterfaceC1780d0
    public final void c(Throwable th) {
        p0 p0VarK = k();
        C1793k c1793k = this.f19547s;
        Throwable thP = c1793k.p(p0VarK);
        if (c1793k.v()) {
            c5.d dVar = c1793k.f19542r;
            AbstractC1209k.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            B5.g gVar = (B5.g) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B5.g.f888v;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                B5.u uVar = B5.a.f879d;
                if (!AbstractC1209k.a(obj, uVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, uVar, thP)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != uVar) {
                        break;
                    }
                }
                return;
            }
        }
        c1793k.l(thP);
        if (c1793k.v()) {
            return;
        }
        c1793k.n();
    }
}
