package e5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1209k;
import w5.AbstractC1805x;
import w5.C1793k;

/* JADX INFO: renamed from: e5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0865c extends AbstractC0863a {
    private final c5.i _context;
    private transient c5.d intercepted;

    public AbstractC0865c(c5.d dVar, c5.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // c5.d
    public c5.i getContext() {
        c5.i iVar = this._context;
        AbstractC1209k.c(iVar);
        return iVar;
    }

    public final c5.d intercepted() {
        c5.d dVar = this.intercepted;
        if (dVar != null) {
            return dVar;
        }
        c5.f fVar = (c5.f) getContext().n(c5.e.f10684o);
        c5.d gVar = fVar != null ? new B5.g((AbstractC1805x) fVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // e5.AbstractC0863a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c5.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            c5.g gVarN = getContext().n(c5.e.f10684o);
            AbstractC1209k.c(gVarN);
            B5.g gVar = (B5.g) dVar;
            do {
                atomicReferenceFieldUpdater = B5.g.f888v;
            } while (atomicReferenceFieldUpdater.get(gVar) == B5.a.f879d);
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            C1793k c1793k = obj instanceof C1793k ? (C1793k) obj : null;
            if (c1793k != null) {
                c1793k.n();
            }
        }
        this.intercepted = C0864b.f11601o;
    }

    public AbstractC0865c(c5.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
