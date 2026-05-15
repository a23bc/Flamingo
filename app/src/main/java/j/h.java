package J;

import F.n;
import K0.C0236d;
import O0.C;
import Q0.AbstractC0347f;
import Q0.InterfaceC0369z;
import Q0.j0;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0865c;
import r0.AbstractC1397o;
import w5.AbstractC1767D;
import x0.C1893c;
import z.C2039h;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1397o implements V0.a, InterfaceC0369z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C2039h f3587C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f3588D;

    public static final C1893c B0(h hVar, j0 j0Var, C0236d c0236d) {
        C1893c c1893c;
        if (hVar.f15636B && hVar.f3588D) {
            j0 j0VarW = AbstractC0347f.w(hVar);
            if (!j0Var.J0().f15636B) {
                j0Var = null;
            }
            if (j0Var != null && (c1893c = (C1893c) c0236d.a()) != null) {
                return c1893c.i(j0VarW.m(j0Var, false).d());
            }
        }
        return null;
    }

    @Override // V0.a
    public final Object P(j0 j0Var, C0236d c0236d, AbstractC0865c abstractC0865c) {
        Object objH = AbstractC1767D.h(new g(this, j0Var, c0236d, new n(this, j0Var, c0236d, 2), null), abstractC0865c);
        return objH == EnumC0830a.f11264o ? objH : o.f8736a;
    }

    @Override // Q0.InterfaceC0369z
    public final void Q(C c7) {
        this.f3588D = true;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // Q0.InterfaceC0369z
    public final /* synthetic */ void r(long j3) {
    }
}
