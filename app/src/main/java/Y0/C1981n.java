package y0;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.Y;
import O0.m0;
import Q0.A0;
import Q0.T;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: renamed from: y0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1981n extends AbstractC1397o implements Q0.A, A0 {

    /* JADX INFO: renamed from: C */
    public InterfaceC1182c f20249C;

    public C1981n(InterfaceC1182c interfaceC1182c) {
        this.f20249C = interfaceC1182c;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A
    public final /* synthetic */ int c(T t7, Y y6, int i7) {
        return A0.e.d(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int d(T t7, Y y6, int i7) {
        return A0.e.m(this, t7, y6, i7);
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        m0 m0VarD = y6.d(j3);
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new K0.A(m0VarD, 27, this));
    }

    @Override // Q0.A
    public final /* synthetic */ int g(T t7, Y y6, int i7) {
        return A0.e.j(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int h(T t7, Y y6, int i7) {
        return A0.e.g(this, t7, y6, i7);
    }

    @Override // Q0.A0
    public final boolean i() {
        return false;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f20249C + ')';
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
    }
}
