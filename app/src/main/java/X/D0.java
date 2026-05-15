package X;

import b1.AbstractC0607C;
import m5.AbstractC1209k;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements M.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K0 f7890a;

    public D0(K0 k02) {
        this.f7890a = k02;
    }

    @Override // M.j0
    public final void a() {
        K0 k02 = this.f7890a;
        k02.f7953q.setValue(null);
        k02.f7954r.setValue(null);
    }

    @Override // M.j0
    public final void b() {
        K0 k02 = this.f7890a;
        k02.f7953q.setValue(null);
        k02.f7954r.setValue(null);
    }

    @Override // M.j0
    public final void c(long j3) {
        M.E0 e0D;
        K0 k02 = this.f7890a;
        long jA = Y.a(k02.k(true));
        M.Z z6 = k02.f7942d;
        if (z6 == null || (e0D = z6.d()) == null) {
            return;
        }
        long jE = e0D.e(jA);
        k02.f7950n = jE;
        k02.f7954r.setValue(new C1892b(jE));
        k02.f7952p = 0L;
        k02.f7953q.setValue(M.M.f4421o);
        k02.s(false);
    }

    @Override // M.j0
    public final void e(long j3) {
        M.E0 e0D;
        G0.a aVar;
        K0 k02 = this.f7890a;
        k02.f7952p = C1892b.h(k02.f7952p, j3);
        M.Z z6 = k02.f7942d;
        if (z6 == null || (e0D = z6.d()) == null) {
            return;
        }
        k02.f7954r.setValue(new C1892b(C1892b.h(k02.f7950n, k02.f7952p)));
        B2.m mVar = k02.f7940b;
        C1892b c1892bI = k02.i();
        AbstractC1209k.c(c1892bI);
        int iB = e0D.b(c1892bI.f19867a, true);
        mVar.b(iB);
        long jB = AbstractC0607C.b(iB, iB);
        if (b1.L.b(jB, k02.m().f12385b)) {
            return;
        }
        M.Z z7 = k02.f7942d;
        if ((z7 == null || ((Boolean) z7.f4511q.getValue()).booleanValue()) && (aVar = k02.f7947j) != null) {
            aVar.a(9);
        }
        k02.f7941c.b(K0.e(k02.m().f12384a, jB));
        k02.f7958v = new b1.L(jB);
    }

    @Override // M.j0
    public final void d() {
    }

    @Override // M.j0
    public final void onCancel() {
    }
}
