package S;

import I.C0216h;
import K0.H;
import Q0.AbstractC0358n;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0361q;
import Q0.j0;
import e5.AbstractC0871i;
import f0.C0894j0;
import f0.W;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0358n implements InterfaceC0356l, InterfaceC0361q {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AbstractC0871i f6710E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0894j0 f6711F = new C0894j0(null, W.f11764q);

    /* JADX WARN: Multi-variable type inference failed */
    public f(InterfaceC1182c interfaceC1182c) {
        this.f6710E = (AbstractC0871i) interfaceC1182c;
        B0(H.a(new C0216h(1, this)));
    }

    @Override // Q0.InterfaceC0361q
    public final void z(j0 j0Var) {
        this.f6711F.setValue(j0Var);
    }
}
