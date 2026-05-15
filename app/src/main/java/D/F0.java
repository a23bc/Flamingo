package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends AbstractC1397o implements Q0.A {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public D f1228C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public l5.e f1229D;

    @Override // Q0.A
    public final /* synthetic */ int c(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.d(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int d(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.m(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(final InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        final O0.m0 m0VarD = y6.d(n1.b.a(this.f1228C != D.f1213o ? 0 : n1.a.j(j3), n1.a.h(j3), this.f1228C == D.f1214p ? n1.a.i(j3) : 0, n1.a.g(j3)));
        final int iQ = i6.h.q(m0VarD.f5416o, n1.a.j(j3), n1.a.h(j3));
        final int iQ2 = i6.h.q(m0VarD.f5417p, n1.a.i(j3), n1.a.g(j3));
        return interfaceC0298b0.k(iQ, iQ2, Z4.w.f8819o, new InterfaceC1182c() { // from class: D.E0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                l5.e eVar = this.f1221o.f1229D;
                O0.m0 m0Var = m0VarD;
                O0.l0.i((O0.l0) obj, m0Var, ((n1.k) eVar.invoke(new n1.m((((long) (iQ - m0Var.f5416o)) << 32) | (((long) (iQ2 - m0Var.f5417p)) & 4294967295L)), interfaceC0298b0.getLayoutDirection())).f14514a);
                return Y4.o.f8736a;
            }
        });
    }

    @Override // Q0.A
    public final /* synthetic */ int g(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.j(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int h(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.g(this, t7, y6, i7);
    }
}
