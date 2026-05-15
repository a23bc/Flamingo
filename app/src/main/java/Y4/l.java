package Y4;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final class l implements e, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8729q = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "p");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile InterfaceC1180a f8730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile Object f8731p;

    @Override // Y4.e
    public final Object getValue() {
        Object obj = this.f8731p;
        n nVar = n.f8735a;
        if (obj != nVar) {
            return obj;
        }
        InterfaceC1180a interfaceC1180a = this.f8730o;
        if (interfaceC1180a != null) {
            Object objA = interfaceC1180a.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8729q;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != nVar) {
                }
            }
            this.f8730o = null;
            return objA;
        }
        return this.f8731p;
    }

    public final String toString() {
        return this.f8731p != n.f8735a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
