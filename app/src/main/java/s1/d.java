package s1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.AbstractC1113a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1113a {

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f15848b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f15849c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f15850d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f15851e;

    /* JADX INFO: renamed from: f */
    public final AtomicReferenceFieldUpdater f15852f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f15848b = atomicReferenceFieldUpdater;
        this.f15849c = atomicReferenceFieldUpdater2;
        this.f15850d = atomicReferenceFieldUpdater3;
        this.f15851e = atomicReferenceFieldUpdater4;
        this.f15852f = atomicReferenceFieldUpdater5;
    }

    @Override // k.AbstractC1113a
    public final void K(f fVar, f fVar2) {
        this.f15849c.lazySet(fVar, fVar2);
    }

    @Override // k.AbstractC1113a
    public final void L(f fVar, Thread thread) {
        this.f15848b.lazySet(fVar, thread);
    }

    @Override // k.AbstractC1113a
    public final boolean t(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15851e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // k.AbstractC1113a
    public final boolean u(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15852f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // k.AbstractC1113a
    public final boolean v(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15850d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
