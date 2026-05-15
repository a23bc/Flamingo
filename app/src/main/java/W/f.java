package W;

import A2.W;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.Y;
import Q0.A;
import Q0.AbstractC0358n;
import Q0.InterfaceC0360p;
import Q0.InterfaceC0361q;
import Q0.N;
import Q0.T;
import Q0.j0;
import X.J;
import X.u0;
import b1.C0622g;
import b1.M;
import l5.InterfaceC1182c;
import y0.InterfaceC1988u;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0358n implements A, InterfaceC0360p, InterfaceC0361q {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public h f7667E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final m f7668F;

    public f(C0622g c0622g, M m7, f1.d dVar, InterfaceC1182c interfaceC1182c, int i7, boolean z6, int i8, int i9, h hVar, InterfaceC1988u interfaceC1988u) {
        this.f7667E = hVar;
        m mVar = new m(c0622g, m7, dVar, interfaceC1182c, i7, z6, i8, i9, hVar, interfaceC1988u);
        B0(mVar);
        this.f7668F = mVar;
        if (this.f7667E != null) {
            return;
        }
        C.b.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new W();
    }

    @Override // Q0.InterfaceC0360p
    public final void a(N n7) throws Throwable {
        this.f7668F.a(n7);
    }

    @Override // Q0.A
    public final int c(T t7, Y y6, int i7) {
        return this.f7668F.c(t7, y6, i7);
    }

    @Override // Q0.A
    public final int d(T t7, Y y6, int i7) {
        return this.f7668F.d(t7, y6, i7);
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        return this.f7668F.e(interfaceC0298b0, y6, j3);
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // Q0.A
    public final int g(T t7, Y y6, int i7) {
        return this.f7668F.g(t7, y6, i7);
    }

    @Override // Q0.A
    public final int h(T t7, Y y6, int i7) {
        return this.f7668F.h(t7, y6, i7);
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // Q0.InterfaceC0361q
    public final void z(j0 j0Var) {
        h hVar = this.f7667E;
        if (hVar != null) {
            hVar.f7674r = j.a(hVar.f7674r, j0Var, null, 2);
            u0 u0Var = hVar.f7672p;
            u0Var.f8173a = false;
            J j3 = u0Var.f8177e;
            if (j3 != null) {
                j3.b(Long.valueOf(hVar.f7671o));
            }
        }
    }
}
