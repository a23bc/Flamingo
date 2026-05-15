package w5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: w5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1777c extends k0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19520v = AtomicReferenceFieldUpdater.newUpdater(C1777c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1793k f19521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public N f19522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1781e f19523u;

    public C1777c(C1781e c1781e, C1793k c1793k) {
        this.f19523u = c1781e;
        this.f19521s = c1793k;
    }

    @Override // w5.InterfaceC1780d0
    public final void c(Throwable th) {
        C1793k c1793k = this.f19521s;
        if (th != null) {
            c1793k.getClass();
            B5.u uVarD = c1793k.D(new C1800s(th, false), null);
            if (uVarD != null) {
                c1793k.w(uVarD);
                C1779d c1779d = (C1779d) f19520v.get(this);
                if (c1779d != null) {
                    c1779d.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1781e.f19526b;
        C1781e c1781e = this.f19523u;
        if (atomicIntegerFieldUpdater.decrementAndGet(c1781e) == 0) {
            InterfaceC1770G[] interfaceC1770GArr = c1781e.f19527a;
            ArrayList arrayList = new ArrayList(interfaceC1770GArr.length);
            for (InterfaceC1770G interfaceC1770G : interfaceC1770GArr) {
                arrayList.add(interfaceC1770G.d());
            }
            c1793k.resumeWith(arrayList);
        }
    }
}
