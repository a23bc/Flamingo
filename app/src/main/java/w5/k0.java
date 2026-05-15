package w5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends B5.j implements InterfaceC1780d0, N, InterfaceC1774a0 {

    /* JADX INFO: renamed from: r */
    public p0 f19544r;

    @Override // w5.N
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        p0 p0VarK = k();
        while (true) {
            Object objO = p0VarK.O();
            if (objO instanceof k0) {
                if (objO != this) {
                    return;
                }
                P p7 = AbstractC1767D.f19481j;
                do {
                    atomicReferenceFieldUpdater2 = p0.f19561o;
                    if (atomicReferenceFieldUpdater2.compareAndSet(p0VarK, objO, p7)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(p0VarK) == objO);
            } else {
                if (!(objO instanceof InterfaceC1774a0) || ((InterfaceC1774a0) objO).e() == null) {
                    return;
                }
                while (true) {
                    Object objH = h();
                    if (objH instanceof B5.p) {
                        B5.j jVar = ((B5.p) objH).f913a;
                        return;
                    }
                    if (objH == this) {
                        return;
                    }
                    AbstractC1209k.d(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    B5.j jVar2 = (B5.j) objH;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = B5.j.f902q;
                    B5.p pVar = (B5.p) atomicReferenceFieldUpdater3.get(jVar2);
                    if (pVar == null) {
                        pVar = new B5.p(jVar2);
                        atomicReferenceFieldUpdater3.set(jVar2, pVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = B5.j.f900o;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objH, pVar)) {
                            jVar2.f();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objH);
                }
            }
        }
    }

    @Override // w5.InterfaceC1774a0
    public final boolean b() {
        return true;
    }

    @Override // w5.InterfaceC1774a0
    public final r0 e() {
        return null;
    }

    public InterfaceC1786g0 getParent() {
        return k();
    }

    public final p0 k() {
        p0 p0Var = this.f19544r;
        if (p0Var != null) {
            return p0Var;
        }
        AbstractC1209k.m("job");
        throw null;
    }

    @Override // B5.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1767D.m(this) + "[job@" + AbstractC1767D.m(k()) + ']';
    }
}
