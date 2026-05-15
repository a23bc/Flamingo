package w5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: w5.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1792j0 extends p0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f19538q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1792j0(InterfaceC1786g0 interfaceC1786g0) {
        super(true);
        boolean z6 = true;
        R(interfaceC1786g0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.f19562p;
        InterfaceC1796n interfaceC1796n = (InterfaceC1796n) atomicReferenceFieldUpdater.get(this);
        C1797o c1797o = interfaceC1796n instanceof C1797o ? (C1797o) interfaceC1796n : null;
        if (c1797o == null) {
            z6 = false;
            break;
        }
        p0 p0VarK = c1797o.k();
        while (!p0VarK.L()) {
            InterfaceC1796n interfaceC1796n2 = (InterfaceC1796n) atomicReferenceFieldUpdater.get(p0VarK);
            C1797o c1797o2 = interfaceC1796n2 instanceof C1797o ? (C1797o) interfaceC1796n2 : null;
            if (c1797o2 == null) {
                z6 = false;
                break;
            }
            p0VarK = c1797o2.k();
        }
        this.f19538q = z6;
    }

    @Override // w5.p0
    public final boolean L() {
        return this.f19538q;
    }

    @Override // w5.p0
    public final boolean M() {
        return true;
    }
}
