package x;

import Q0.AbstractC0347f;
import Q0.InterfaceC0360p;
import Q0.InterfaceC0361q;
import android.view.View;
import f0.C0879c;
import f0.C0894j0;
import j5.AbstractC1107a;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import x0.C1892b;

/* JADX INFO: renamed from: x.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1858j0 extends AbstractC1397o implements InterfaceC0361q, InterfaceC0360p, Q0.A0, Q0.n0 {

    /* JADX INFO: renamed from: C */
    public InterfaceC1182c f19754C;

    /* JADX INFO: renamed from: D */
    public InterfaceC1182c f19755D;

    /* JADX INFO: renamed from: E */
    public InterfaceC1884w0 f19756E;

    /* JADX INFO: renamed from: F */
    public View f19757F;

    /* JADX INFO: renamed from: G */
    public n1.d f19758G;

    /* JADX INFO: renamed from: H */
    public InterfaceC1882v0 f19759H;

    /* JADX INFO: renamed from: J */
    public f0.G f19761J;

    /* JADX INFO: renamed from: L */
    public n1.m f19763L;

    /* JADX INFO: renamed from: M */
    public y5.c f19764M;

    /* JADX INFO: renamed from: I */
    public final C0894j0 f19760I = new C0894j0(null, f0.W.f11764q);

    /* JADX INFO: renamed from: K */
    public long f19762K = 9205357640488583168L;

    public C1858j0(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, InterfaceC1884w0 interfaceC1884w0) {
        this.f19754C = interfaceC1182c;
        this.f19755D = interfaceC1182c2;
        this.f19756E = interfaceC1884w0;
    }

    public final long B0() {
        if (this.f19761J == null) {
            this.f19761J = C0879c.o(new C1854h0(this, 2));
        }
        f0.G g6 = this.f19761J;
        if (g6 != null) {
            return ((C1892b) g6.getValue()).f19867a;
        }
        return 9205357640488583168L;
    }

    public final void C0() {
        InterfaceC1882v0 interfaceC1882v0 = this.f19759H;
        if (interfaceC1882v0 != null) {
            ((C1886x0) interfaceC1882v0).b();
        }
        View viewZ = this.f19757F;
        if (viewZ == null) {
            viewZ = AbstractC0347f.z(this);
        }
        this.f19757F = viewZ;
        n1.d dVar = this.f19758G;
        if (dVar == null) {
            dVar = AbstractC0347f.x(this).f5814M;
        }
        this.f19758G = dVar;
        this.f19759H = this.f19756E.b(viewZ, dVar);
        E0();
    }

    public final void D0() {
        n1.d dVar = this.f19758G;
        if (dVar == null) {
            dVar = AbstractC0347f.x(this).f5814M;
            this.f19758G = dVar;
        }
        long j3 = ((C1892b) this.f19754C.b(dVar)).f19867a;
        if ((j3 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & B0()) == 9205357640488583168L) {
            this.f19762K = 9205357640488583168L;
            InterfaceC1882v0 interfaceC1882v0 = this.f19759H;
            if (interfaceC1882v0 != null) {
                ((C1886x0) interfaceC1882v0).b();
                return;
            }
            return;
        }
        this.f19762K = C1892b.h(B0(), j3);
        if (this.f19759H == null) {
            C0();
        }
        InterfaceC1882v0 interfaceC1882v02 = this.f19759H;
        if (interfaceC1882v02 != null) {
            interfaceC1882v02.a(this.f19762K, 9205357640488583168L);
        }
        E0();
    }

    public final void E0() {
        n1.d dVar;
        InterfaceC1882v0 interfaceC1882v0 = this.f19759H;
        if (interfaceC1882v0 == null || (dVar = this.f19758G) == null) {
            return;
        }
        C1886x0 c1886x0 = (C1886x0) interfaceC1882v0;
        if (n1.m.a(c1886x0.c(), this.f19763L)) {
            return;
        }
        this.f19755D.b(new n1.i(dVar.t(AbstractC1107a.E(c1886x0.c()))));
        this.f19763L = new n1.m(c1886x0.c());
    }

    @Override // Q0.n0
    public final void F() {
        AbstractC0347f.t(this, new C1854h0(this, 0));
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        jVar.i(AbstractC1860k0.f19768a, new C1854h0(this, 1));
    }

    @Override // Q0.InterfaceC0360p
    public final void a(Q0.N n7) {
        n7.a();
        y5.c cVar = this.f19764M;
        if (cVar != null) {
            cVar.k(Y4.o.f8736a);
        }
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        F();
        this.f19764M = y5.j.a(0, 7, null);
        InterfaceC1765B interfaceC1765BN0 = n0();
        EnumC1766C enumC1766C = EnumC1766C.f19467o;
        AbstractC1767D.t(interfaceC1765BN0, null, new C1856i0(this, null), 1);
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        InterfaceC1882v0 interfaceC1882v0 = this.f19759H;
        if (interfaceC1882v0 != null) {
            ((C1886x0) interfaceC1882v0).b();
        }
        this.f19759H = null;
    }

    @Override // Q0.InterfaceC0361q
    public final void z(Q0.j0 j0Var) {
        this.f19760I.setValue(j0Var);
    }
}
