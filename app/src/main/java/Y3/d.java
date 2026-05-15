package Y3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class d extends N5.d {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f8702a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f8703b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f8704c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f8705d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f8706e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8702a = atomicReferenceFieldUpdater;
        this.f8703b = atomicReferenceFieldUpdater2;
        this.f8704c = atomicReferenceFieldUpdater3;
        this.f8705d = atomicReferenceFieldUpdater4;
        this.f8706e = atomicReferenceFieldUpdater5;
    }

    @Override // N5.d
    public final void R(g gVar, g gVar2) {
        this.f8703b.lazySet(gVar, gVar2);
    }

    @Override // N5.d
    public final void S(g gVar, Thread thread) {
        this.f8702a.lazySet(gVar, thread);
    }

    @Override // N5.d
    public final boolean l(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8705d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // N5.d
    public final boolean m(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8706e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // N5.d
    public final boolean n(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8704c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
