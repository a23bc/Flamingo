package w5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends B5.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f19557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f19558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f19559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1774a0 f19560e;

    public o0(k0 k0Var, p0 p0Var, InterfaceC1774a0 interfaceC1774a0) {
        this.f19559d = p0Var;
        this.f19560e = interfaceC1774a0;
        this.f19557b = k0Var;
    }

    @Override // B5.b
    public final void b(Object obj, Object obj2) {
        B5.j jVar = (B5.j) obj;
        boolean z6 = obj2 == null;
        B5.j jVar2 = this.f19557b;
        B5.j jVar3 = z6 ? jVar2 : this.f19558c;
        if (jVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B5.j.f900o;
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, this, jVar3)) {
                if (atomicReferenceFieldUpdater.get(jVar) != this) {
                    return;
                }
            }
            if (z6) {
                B5.j jVar4 = this.f19558c;
                AbstractC1209k.c(jVar4);
                jVar2.g(jVar4);
            }
        }
    }

    @Override // B5.b
    public final B5.u c(Object obj) {
        if (this.f19559d.O() == this.f19560e) {
            return null;
        }
        return B5.a.f880e;
    }
}
