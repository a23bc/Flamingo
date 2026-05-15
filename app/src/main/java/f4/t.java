package f4;

import O0.G;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.Y;
import O0.m0;
import O0.p0;
import Q0.T;
import e4.C0859h;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import z5.J;
import z5.z;

/* JADX INFO: loaded from: classes.dex */
public final class t implements q4.i, G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f12222a = z.b(new n1.a(y.f12240a));

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // O0.G
    public final /* synthetic */ int c(T t7, Y y6, int i7) {
        return A0.e.b(this, t7, y6, i7);
    }

    @Override // O0.G
    public final /* synthetic */ int d(T t7, Y y6, int i7) {
        return A0.e.k(this, t7, y6, i7);
    }

    @Override // O0.G
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        n1.a aVar = new n1.a(j3);
        J j7 = this.f12222a;
        j7.getClass();
        j7.j(null, aVar);
        m0 m0VarD = y6.d(j3);
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new p0(m0VarD, 2));
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // O0.G
    public final /* synthetic */ int g(T t7, Y y6, int i7) {
        return A0.e.h(this, t7, y6, i7);
    }

    @Override // O0.G
    public final /* synthetic */ int h(T t7, Y y6, int i7) {
        return A0.e.e(this, t7, y6, i7);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    @Override // q4.i
    public final Object k(C0859h c0859h) {
        return z.g(new n(this.f12222a, 1), c0859h);
    }
}
