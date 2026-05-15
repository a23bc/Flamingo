package O0;

import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractC1397o implements Q0.A, Q0.F0 {

    /* JADX INFO: renamed from: C */
    public RunnableC0326x f5442C;

    /* JADX INFO: renamed from: D */
    public final K0.A f5443D;

    public s0(RunnableC0326x runnableC0326x) {
        this.f5442C = runnableC0326x;
        this.f5443D = new K0.A(this, 1, runnableC0326x);
    }

    @Override // Q0.A
    public final /* synthetic */ int c(Q0.T t7, Y y6, int i7) {
        return A0.e.d(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int d(Q0.T t7, Y y6, int i7) {
        return A0.e.m(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        m0 m0VarD = y6.d(j3);
        return interfaceC0298b0.B(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, this.f5443D, new p0(m0VarD, 1));
    }

    @Override // Q0.A
    public final /* synthetic */ int g(Q0.T t7, Y y6, int i7) {
        return A0.e.j(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int h(Q0.T t7, Y y6, int i7) {
        return A0.e.g(this, t7, y6, i7);
    }

    @Override // Q0.F0
    public final Object o() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
