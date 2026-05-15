package v;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import f0.InterfaceC0878b0;
import j5.AbstractC1107a;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: v.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1617n implements O0.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.c0 f18125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0878b0 f18126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1618o f18127c;

    public C1617n(C1618o c1618o, w.c0 c0Var, InterfaceC0878b0 interfaceC0878b0) {
        this.f18127c = c1618o;
        this.f18125a = c0Var;
        this.f18126b = interfaceC0878b0;
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // O0.G
    public final int c(Q0.T t7, O0.Y y6, int i7) {
        return y6.e(i7);
    }

    @Override // O0.G
    public final int d(Q0.T t7, O0.Y y6, int i7) {
        return y6.M(i7);
    }

    @Override // O0.G
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        O0.m0 m0VarD = y6.d(j3);
        C1618o c1618o = this.f18127c;
        long jB = interfaceC0298b0.s() ? AbstractC1107a.b(m0VarD.f5416o, m0VarD.f5417p) : ((n1.m) this.f18125a.a(new K0.A(c1618o, 19, this), new B0.b(29, c1618o)).getValue()).f14520a;
        return interfaceC0298b0.k((int) (jB >> 32), (int) (4294967295L & jB), Z4.w.f8819o, new C1616m(c1618o, m0VarD, jB));
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // O0.G
    public final int g(Q0.T t7, O0.Y y6, int i7) {
        return y6.Q(i7);
    }

    @Override // O0.G
    public final int h(Q0.T t7, O0.Y y6, int i7) {
        return y6.P(i7);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }
}
