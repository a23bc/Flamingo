package B5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f883a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f884b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(s sVar) {
        this._prev$volatile = sVar;
    }

    public final void a() {
        f884b.set(this, null);
    }

    public final c b() {
        Object obj = f883a.get(this);
        if (obj == a.f877b) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean d();

    public final void e() {
        c cVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f884b;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.d()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c cVarB2 = b();
            AbstractC1209k.c(cVarB2);
            while (cVarB2.d() && (cVarB = cVarB2.b()) != null) {
                cVarB2 = cVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(cVarB2);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(cVarB2, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(cVarB2) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                f883a.set(cVar, cVarB2);
            }
            if (!cVarB2.d() || cVarB2.b() == null) {
                if (cVar == null || !cVar.d()) {
                    return;
                }
            }
        }
    }
}
