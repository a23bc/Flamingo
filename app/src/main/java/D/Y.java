package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import f0.C0879c;
import f0.C0894j0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1396n;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements O0.G, InterfaceC1396n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f1285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0894j0 f1286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0894j0 f1287c;

    public Y(x0 x0Var) {
        this.f1285a = x0Var;
        this.f1286b = C0879c.t(x0Var);
        this.f1287c = C0879c.t(x0Var);
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // O0.G
    public final /* synthetic */ int c(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.b(this, t7, y6, i7);
    }

    @Override // O0.G
    public final /* synthetic */ int d(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.k(this, t7, y6, i7);
    }

    @Override // O0.G
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        C0894j0 c0894j0 = this.f1286b;
        int iC = ((x0) c0894j0.getValue()).c(interfaceC0298b0, interfaceC0298b0.getLayoutDirection());
        int iB = ((x0) c0894j0.getValue()).b(interfaceC0298b0);
        int iD = ((x0) c0894j0.getValue()).d(interfaceC0298b0, interfaceC0298b0.getLayoutDirection()) + iC;
        int iA = ((x0) c0894j0.getValue()).a(interfaceC0298b0) + iB;
        O0.m0 m0VarD = y6.d(n1.b.i(-iD, -iA, j3));
        return interfaceC0298b0.k(n1.b.g(j3, m0VarD.f5416o + iD), n1.b.f(j3, m0VarD.f5417p + iA), Z4.w.f8819o, new X(m0VarD, iC, iB, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            return AbstractC1209k.a(((Y) obj).f1285a, this.f1285a);
        }
        return false;
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // O0.G
    public final /* synthetic */ int g(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.h(this, t7, y6, i7);
    }

    @Override // O0.G
    public final /* synthetic */ int h(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.e(this, t7, y6, i7);
    }

    public final int hashCode() {
        return this.f1285a.hashCode();
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }
}
