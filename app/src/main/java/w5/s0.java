package w5;

import e5.AbstractC0865c;
import java.util.concurrent.CancellationException;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends c5.a implements InterfaceC1786g0 {

    /* JADX INFO: renamed from: p */
    public static final s0 f19571p = new s0(C1806y.f19581p);

    @Override // w5.InterfaceC1786g0
    public final boolean b() {
        return true;
    }

    @Override // w5.InterfaceC1786g0
    public final InterfaceC1786g0 getParent() {
        return null;
    }

    @Override // w5.InterfaceC1786g0
    public final InterfaceC1796n i(p0 p0Var) {
        return t0.f19572o;
    }

    @Override // w5.InterfaceC1786g0
    public final Object j(AbstractC0865c abstractC0865c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // w5.InterfaceC1786g0
    public final N o(boolean z6, boolean z7, M.r0 r0Var) {
        return t0.f19572o;
    }

    @Override // w5.InterfaceC1786g0
    public final CancellationException q() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // w5.InterfaceC1786g0
    public final boolean start() {
        return false;
    }

    @Override // w5.InterfaceC1786g0
    public final N t(InterfaceC1182c interfaceC1182c) {
        return t0.f19572o;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // w5.InterfaceC1786g0
    public final void c(CancellationException cancellationException) {
    }
}
