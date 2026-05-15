package d0;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import Q0.AbstractC0347f;
import Q0.InterfaceC0356l;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC1397o implements InterfaceC0356l, Q0.A {
    @Override // Q0.A
    public final /* synthetic */ int c(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.d(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int d(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.m(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        long j7 = AbstractC0775B.f10816b;
        O0.m0 m0VarD = y6.d(j3);
        boolean z6 = this.f15636B && ((Boolean) AbstractC0347f.i(this, AbstractC0775B.f10815a)).booleanValue();
        int iMax = z6 ? Math.max(m0VarD.f5416o, interfaceC0298b0.L(n1.i.b(j7))) : m0VarD.f5416o;
        int iMax2 = z6 ? Math.max(m0VarD.f5417p, interfaceC0298b0.L(n1.i.a(j7))) : m0VarD.f5417p;
        return interfaceC0298b0.k(iMax, iMax2, Z4.w.f8819o, new I(iMax, m0VarD, iMax2));
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
