package T4;

import D.J;
import O0.C;
import Q0.AbstractC0347f;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0360p;
import Q0.InterfaceC0361q;
import Q0.InterfaceC0369z;
import Q0.N;
import Q0.j0;
import R0.AbstractC0403q0;
import a.AbstractC0509a;
import j5.AbstractC1107a;
import m5.AbstractC1209k;
import p0.AbstractC1289f;
import p0.C1285b;
import r0.AbstractC1397o;
import x0.C1892b;
import x0.C1895e;
import y0.y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1397o implements InterfaceC0356l, InterfaceC0369z, InterfaceC0361q, InterfaceC0360p {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public l f6972C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public m f6973D;

    @Override // Q0.InterfaceC0369z
    public final void Q(C c7) {
        C1285b c1285bD;
        AbstractC1209k.f(c7, "coordinates");
        AbstractC1289f abstractC1289fK = p0.l.k();
        C1285b c1285b = abstractC1289fK instanceof C1285b ? (C1285b) abstractC1289fK : null;
        if (c1285b == null || (c1285bD = c1285b.D(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            AbstractC1289f abstractC1289fJ = c1285bD.j();
            try {
                a aVar = (a) this.f6972C.f6977a.getValue();
                long jE = AbstractC1107a.E(c7.G());
                aVar.getClass();
                aVar.f6942a.setValue(new C1895e(jE));
                aVar.f6943b.setValue(new C1892b(C1892b.h(c7.h(0L), n.a(this))));
                AbstractC1289f.q(abstractC1289fJ);
                c1285bD.w().d();
            } catch (Throwable th) {
                AbstractC1289f.q(abstractC1289fJ);
                throw th;
            }
        } finally {
            c1285bD.c();
        }
    }

    @Override // Q0.InterfaceC0360p
    public final void a(N n7) {
        if (!k.f6975a) {
            n7.a();
            return;
        }
        y yVar = (y) AbstractC0347f.i(this, AbstractC0403q0.f6508g);
        B0.d dVarB = this.f6972C.f6978b;
        if (dVarB == null) {
            dVarB = yVar.b();
        }
        this.f6972C.f6978b = dVarB;
        A0.e.J(n7, dVarB, new J(18, n7));
        AbstractC0509a.t(n7, dVarB);
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // Q0.InterfaceC0369z
    public final /* synthetic */ void r(long j3) {
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        a aVar = (a) this.f6972C.f6977a.getValue();
        m mVar = this.f6973D;
        aVar.getClass();
        AbstractC1209k.f(mVar, "<set-?>");
        aVar.f6944c.setValue(mVar);
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        B0.d dVar = this.f6972C.f6978b;
        if (dVar != null) {
            ((y) AbstractC0347f.i(this, AbstractC0403q0.f6508g)).a(dVar);
        }
        this.f6972C.f6978b = null;
    }

    @Override // Q0.InterfaceC0361q
    public final void z(j0 j0Var) {
        Q(j0Var);
    }
}
