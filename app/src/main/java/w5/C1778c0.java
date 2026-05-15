package w5;

import l5.InterfaceC1182c;

/* JADX INFO: renamed from: w5.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1778c0 implements InterfaceC1780d0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1182c f19524o;

    public C1778c0(InterfaceC1182c interfaceC1182c) {
        this.f19524o = interfaceC1182c;
    }

    @Override // w5.InterfaceC1780d0
    public final void c(Throwable th) {
        this.f19524o.b(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f19524o.getClass().getSimpleName() + '@' + AbstractC1767D.m(this) + ']';
    }
}
