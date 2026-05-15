package I4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: I4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0230e extends I0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3513g;

    public C0230e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3509c = atomicReferenceFieldUpdater;
        this.f3510d = atomicReferenceFieldUpdater2;
        this.f3511e = atomicReferenceFieldUpdater3;
        this.f3512f = atomicReferenceFieldUpdater4;
        this.f3513g = atomicReferenceFieldUpdater5;
    }

    @Override // I0.c
    public final void M(o oVar, o oVar2) {
        this.f3510d.lazySet(oVar, oVar2);
    }

    @Override // I0.c
    public final void N(o oVar, Thread thread) {
        this.f3509c.lazySet(oVar, thread);
    }

    @Override // I0.c
    public final boolean l(p pVar, C0229d c0229d, C0229d c0229d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3512f;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, c0229d, c0229d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == c0229d);
        return false;
    }

    @Override // I0.c
    public final boolean m(p pVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3513g;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == obj);
        return false;
    }

    @Override // I0.c
    public final boolean n(p pVar, o oVar, o oVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3511e;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, oVar, oVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == oVar);
        return false;
    }

    @Override // I0.c
    public final C0229d w(p pVar) {
        return (C0229d) this.f3512f.getAndSet(pVar, C0229d.f3505d);
    }

    @Override // I0.c
    public final o x(p pVar) {
        return (o) this.f3511e.getAndSet(pVar, o.f3521c);
    }
}
