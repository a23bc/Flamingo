package v;

import f0.C0879c;
import f0.C0894j0;
import r0.AbstractC1383a;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: v.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1627x implements InterfaceC1626w {

    /* JADX INFO: renamed from: a */
    public final w.j0 f18191a;

    /* JADX INFO: renamed from: b */
    public final C0894j0 f18192b = C0879c.t(new n1.m(0));

    public C1627x(w.j0 j0Var) {
        this.f18191a = j0Var;
    }

    @Override // v.InterfaceC1626w
    public final InterfaceC1398p a(InterfaceC1398p interfaceC1398p, C1598P c1598p, C1599Q c1599q) {
        return AbstractC1383a.a(interfaceC1398p, new C1625v(this, c1598p, c1599q));
    }
}
