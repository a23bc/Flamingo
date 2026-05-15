package f0;

import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class C implements C0 {

    /* JADX INFO: renamed from: o */
    public final InterfaceC1765B f11644o;

    public C(InterfaceC1765B interfaceC1765B) {
        this.f11644o = interfaceC1765B;
    }

    @Override // f0.C0
    public final void e() {
        InterfaceC1765B interfaceC1765B = this.f11644o;
        if (interfaceC1765B instanceof F0) {
            ((F0) interfaceC1765B).b();
        } else {
            AbstractC1767D.f(interfaceC1765B, new L(1));
        }
    }

    @Override // f0.C0
    public final void f() {
        InterfaceC1765B interfaceC1765B = this.f11644o;
        if (interfaceC1765B instanceof F0) {
            ((F0) interfaceC1765B).b();
        } else {
            AbstractC1767D.f(interfaceC1765B, new L(1));
        }
    }

    @Override // f0.C0
    public final void a() {
    }
}
