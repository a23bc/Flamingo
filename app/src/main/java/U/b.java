package U;

import I.C0216h;
import K0.C0245m;
import K0.EnumC0246n;
import K0.H;
import K0.N;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0343d;
import Q0.C0359o;
import Q0.D0;
import Q0.x0;
import l5.InterfaceC1180a;
import n1.d;
import w0.e;
import w0.q;
import w0.t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0358n implements x0, e, q {

    /* JADX INFO: renamed from: E */
    public InterfaceC1180a f7022E;

    /* JADX INFO: renamed from: F */
    public boolean f7023F;

    /* JADX INFO: renamed from: G */
    public final N f7024G;

    public b(InterfaceC1180a interfaceC1180a) {
        this.f7022E = interfaceC1180a;
        N nA = H.a(new C0216h(2, this));
        B0(nA);
        this.f7024G = nA;
    }

    @Override // Q0.x0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // Q0.x0
    public final void X() {
        Z();
    }

    @Override // Q0.x0
    public final void Z() {
        this.f7024G.Z();
    }

    @Override // Q0.x0
    public final /* synthetic */ void g0() {
    }

    @Override // w0.e
    public final void l0(t tVar) {
        this.f7023F = tVar.b();
    }

    @Override // Q0.x0
    public final long q() {
        C0359o c0359o = androidx.compose.foundation.text.handwriting.a.f9243a;
        d dVar = AbstractC0347f.x(this).f5814M;
        c0359o.getClass();
        int i7 = D0.f5782b;
        return C0343d.c(dVar.L(c0359o.f6057a), dVar.L(c0359o.f6058b), dVar.L(c0359o.f6059c), dVar.L(c0359o.f6060d));
    }

    @Override // r0.AbstractC1397o
    public final void s0() {
        Z();
    }

    @Override // Q0.x0
    public final void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        this.f7024G.u(c0245m, enumC0246n, j3);
    }
}
