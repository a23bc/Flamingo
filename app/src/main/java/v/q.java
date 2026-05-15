package V;

import M.Z;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0357m;
import Q0.InterfaceC0361q;
import Q0.j0;
import X.K0;
import f0.C0879c;
import f0.C0894j0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC1397o implements InterfaceC0356l, InterfaceC0361q, InterfaceC0357m {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public e f7347C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Z f7348D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public K0 f7349E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0894j0 f7350F = C0879c.t(null);

    public q(e eVar, Z z6, K0 k02) {
        this.f7347C = eVar;
        this.f7348D = z6;
        this.f7349E = k02;
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        e eVar = this.f7347C;
        if (eVar.f7314a != null) {
            C.b.c("Expected textInputModifierNode to be null");
        }
        eVar.f7314a = this;
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        this.f7347C.k(this);
    }

    @Override // Q0.InterfaceC0361q
    public final void z(j0 j0Var) {
        this.f7350F.setValue(j0Var);
    }
}
