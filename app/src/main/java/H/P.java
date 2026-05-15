package H;

import android.graphics.RenderEffect;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import f0.C0877b;
import java.util.ArrayList;
import java.util.List;
import m5.AbstractC1209k;
import t.AbstractC1458m;
import t2.C1476e;
import t2.C1482k;
import t2.C1488q;
import t2.s0;
import v2.C1636c;

/* JADX INFO: loaded from: classes.dex */
public abstract class P implements t2.X {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2812a;

    /* JADX INFO: renamed from: b */
    public Object f2813b;

    public /* synthetic */ P(int i7, Object obj) {
        this.f2812a = i7;
        this.f2813b = obj;
    }

    @Override // t2.X
    public void A(t2.V v3) {
        ((t2.X) this.f2813b).A(new C1488q(this, v3));
    }

    @Override // t2.X
    public void A0(float f7) {
        ((t2.X) this.f2813b).A0(f7);
    }

    @Override // t2.X
    public long B() {
        return ((t2.X) this.f2813b).B();
    }

    @Override // t2.X
    public t2.J B0() {
        return ((t2.X) this.f2813b).B0();
    }

    @Override // t2.X
    public boolean C() {
        return ((t2.X) this.f2813b).C();
    }

    @Override // t2.X
    public void C0(List list) {
        ((t2.X) this.f2813b).C0(list);
    }

    @Override // t2.X
    public void D() {
        switch (this.f2812a) {
            case 3:
                ((A2.N) this).u0(0, Integer.MAX_VALUE);
                break;
            default:
                ((t2.X) this.f2813b).D();
                break;
        }
    }

    @Override // t2.X
    public void D0() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                if (n7.m0().p() || n7.r()) {
                    W0();
                } else {
                    boolean zV0 = V0();
                    if (!O0() || H0()) {
                        if (zV0) {
                            long jF0 = n7.F0();
                            n7.x1();
                            if (jF0 <= n7.f140x) {
                                a1(7);
                            }
                        }
                        Y0(n7.V(), 0L, false);
                    } else if (!zV0) {
                        W0();
                    } else {
                        a1(7);
                    }
                }
                break;
            default:
                ((t2.X) this.f2813b).D0();
                break;
        }
    }

    @Override // t2.X
    public void E(boolean z6) {
        ((t2.X) this.f2813b).E(z6);
    }

    @Override // t2.X
    public void E0(t2.G g6, long j3) {
        switch (this.f2812a) {
            case 3:
                ((A2.N) this).m(E4.I.t(g6), 0, j3);
                break;
            default:
                ((t2.X) this.f2813b).E0(g6, j3);
                break;
        }
    }

    @Override // t2.X
    public void F() {
        int iE;
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                t2.h0 h0VarM0 = n7.m0();
                if (h0VarM0.p()) {
                    iE = -1;
                } else {
                    int iV = n7.V();
                    n7.x1();
                    int i7 = n7.f95G;
                    if (i7 == 1) {
                        i7 = 0;
                    }
                    n7.x1();
                    iE = h0VarM0.e(iV, i7, n7.f96H);
                }
                if (iE == -1) {
                    W0();
                } else if (iE != n7.V()) {
                    Y0(iE, -9223372036854775807L, false);
                } else {
                    Y0(n7.V(), -9223372036854775807L, true);
                }
                break;
            default:
                ((t2.X) this.f2813b).F();
                break;
        }
    }

    @Override // t2.X
    public long F0() {
        return ((t2.X) this.f2813b).F0();
    }

    @Override // t2.X
    public void G(int i7) {
        ((t2.X) this.f2813b).G(i7);
    }

    @Override // t2.X
    public long G0() {
        return ((t2.X) this.f2813b).G0();
    }

    @Override // t2.X
    public t2.p0 H() {
        return ((t2.X) this.f2813b).H();
    }

    @Override // t2.X
    public boolean H0() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                t2.h0 h0VarM0 = n7.m0();
                return !h0VarM0.p() && h0VarM0.m(n7.V(), (t2.g0) this.f2813b, 0L).f16460g;
            default:
                return ((t2.X) this.f2813b).H0();
        }
    }

    @Override // t2.X
    public int I() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                long jB = n7.B();
                long jL0 = n7.l0();
                if (jB == -9223372036854775807L || jL0 == -9223372036854775807L) {
                    return 0;
                }
                if (jL0 == 0) {
                    return 100;
                }
                return w2.t.g((int) ((jB * 100) / jL0), 0, 100);
            default:
                return ((t2.X) this.f2813b).I();
        }
    }

    @Override // t2.X
    public t2.G I0() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                t2.h0 h0VarM0 = n7.m0();
                if (h0VarM0.p()) {
                    return null;
                }
                return h0VarM0.m(n7.V(), (t2.g0) this.f2813b, 0L).f16456c;
            default:
                return ((t2.X) this.f2813b).I0();
        }
    }

    @Override // t2.X
    public long J() {
        return ((t2.X) this.f2813b).J();
    }

    @Override // t2.X
    public void J0(t2.V v3) {
        ((t2.X) this.f2813b).J0(new C1488q(this, v3));
    }

    @Override // t2.X
    public t2.J K() {
        return ((t2.X) this.f2813b).K();
    }

    @Override // t2.X
    public boolean K0(int i7) {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                n7.x1();
                return n7.f101M.a(i7);
            default:
                return ((t2.X) this.f2813b).K0(i7);
        }
    }

    @Override // t2.X
    public boolean L() {
        A2.N n7 = (A2.N) this;
        return n7.d() == 3 && n7.C() && n7.i0() == 0;
    }

    @Override // t2.X
    public boolean L0() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                t2.h0 h0VarM0 = n7.m0();
                return !h0VarM0.p() && h0VarM0.m(n7.V(), (t2.g0) this.f2813b, 0L).h;
            default:
                return ((t2.X) this.f2813b).L0();
        }
    }

    @Override // t2.X
    public long M() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                t2.h0 h0VarM0 = n7.m0();
                if (h0VarM0.p()) {
                    return -9223372036854775807L;
                }
                return w2.t.N(h0VarM0.m(n7.V(), (t2.g0) this.f2813b, 0L).l);
            default:
                return ((t2.X) this.f2813b).M();
        }
    }

    @Override // t2.X
    public Looper M0() {
        return ((t2.X) this.f2813b).M0();
    }

    @Override // t2.X
    public int N() {
        return ((t2.X) this.f2813b).N();
    }

    @Override // t2.X
    public boolean N0() {
        switch (this.f2812a) {
            case 3:
                return true;
            default:
                return ((t2.X) this.f2813b).N0();
        }
    }

    @Override // t2.X
    public C1636c O() {
        return ((t2.X) this.f2813b).O();
    }

    @Override // t2.X
    public boolean O0() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                t2.h0 h0VarM0 = n7.m0();
                return !h0VarM0.p() && h0VarM0.m(n7.V(), (t2.g0) this.f2813b, 0L).a();
            default:
                return ((t2.X) this.f2813b).O0();
        }
    }

    @Override // t2.X
    public s0 P() {
        return ((t2.X) this.f2813b).P();
    }

    public RenderEffect P0() {
        RenderEffect renderEffect = (RenderEffect) this.f2813b;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectQ0 = Q0();
        this.f2813b = renderEffectQ0;
        return renderEffectQ0;
    }

    @Override // t2.X
    public void Q() {
        switch (this.f2812a) {
            case 3:
                a1(6);
                break;
            default:
                ((t2.X) this.f2813b).Q();
                break;
        }
    }

    public abstract RenderEffect Q0();

    @Override // t2.X
    public float R() {
        return ((t2.X) this.f2813b).R();
    }

    public boolean R0(f0.O o7, Object obj) {
        ArrayList arrayList = o7.f11726a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof C0877b) {
                if (AbstractC1209k.a(obj2, obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof f0.O)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (R0((f0.O) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t2.X
    public void S() {
        switch (this.f2812a) {
            case 3:
                Y0(((A2.N) this).V(), -9223372036854775807L, false);
                break;
            default:
                ((t2.X) this.f2813b).S();
                break;
        }
    }

    public abstract O S0(int i7, int i8, int i9, long j3);

    @Override // t2.X
    public C1476e T() {
        return ((t2.X) this.f2813b).T();
    }

    public List T0(N n7, int i7, long j3) {
        t.y yVar = (t.y) this.f2813b;
        List list = (List) yVar.b(i7);
        if (list != null) {
            return list;
        }
        List listA = n7.a(i7);
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((O0.Y) listA.get(i8)).d(j3));
        }
        yVar.h(i7, arrayList);
        return arrayList;
    }

    @Override // t2.X
    public int U() {
        return ((t2.X) this.f2813b).U();
    }

    public boolean U0() {
        int iE;
        A2.N n7 = (A2.N) this;
        t2.h0 h0VarM0 = n7.m0();
        if (h0VarM0.p()) {
            iE = -1;
        } else {
            int iV = n7.V();
            n7.x1();
            int i7 = n7.f95G;
            if (i7 == 1) {
                i7 = 0;
            }
            n7.x1();
            iE = h0VarM0.e(iV, i7, n7.f96H);
        }
        return iE != -1;
    }

    @Override // t2.X
    public int V() {
        return ((t2.X) this.f2813b).V();
    }

    public boolean V0() {
        int iK;
        A2.N n7 = (A2.N) this;
        t2.h0 h0VarM0 = n7.m0();
        if (h0VarM0.p()) {
            iK = -1;
        } else {
            int iV = n7.V();
            n7.x1();
            int i7 = n7.f95G;
            if (i7 == 1) {
                i7 = 0;
            }
            n7.x1();
            iK = h0VarM0.k(iV, i7, n7.f96H);
        }
        return iK != -1;
    }

    @Override // t2.X
    public void W(int i7, boolean z6) {
        ((t2.X) this.f2813b).W(i7, z6);
    }

    public void W0() {
        ((A2.N) this).x1();
    }

    @Override // t2.X
    public C1482k X() {
        return ((t2.X) this.f2813b).X();
    }

    @Override // t2.X
    public void Y() {
        ((t2.X) this.f2813b).Y();
    }

    public abstract void Y0(int i7, long j3, boolean z6);

    @Override // t2.X
    public void Z(t2.n0 n0Var) {
        ((t2.X) this.f2813b).Z(n0Var);
    }

    public void Z0(long j3, int i7) {
        A2.N n7 = (A2.N) this;
        long jF0 = n7.F0() + j3;
        long jL0 = n7.l0();
        if (jL0 != -9223372036854775807L) {
            jF0 = Math.min(jF0, jL0);
        }
        Y0(n7.V(), Math.max(jF0, 0L), false);
    }

    @Override // t2.X
    public void a() {
        ((t2.X) this.f2813b).a();
    }

    @Override // t2.X
    public void a0(C1476e c1476e, boolean z6) {
        ((t2.X) this.f2813b).a0(c1476e, z6);
    }

    public void a1(int i7) {
        int iK;
        A2.N n7 = (A2.N) this;
        t2.h0 h0VarM0 = n7.m0();
        if (h0VarM0.p()) {
            iK = -1;
        } else {
            int iV = n7.V();
            n7.x1();
            int i8 = n7.f95G;
            if (i8 == 1) {
                i8 = 0;
            }
            n7.x1();
            iK = h0VarM0.k(iV, i8, n7.f96H);
        }
        if (iK == -1) {
            W0();
        } else if (iK == n7.V()) {
            Y0(n7.V(), -9223372036854775807L, true);
        } else {
            Y0(iK, -9223372036854775807L, false);
        }
    }

    @Override // t2.X
    public void b() {
        ((t2.X) this.f2813b).b();
    }

    @Override // t2.X
    public void b0(int i7, int i8) {
        ((t2.X) this.f2813b).b0(i7, i8);
    }

    @Override // t2.X
    public boolean c() {
        return ((t2.X) this.f2813b).c();
    }

    @Override // t2.X
    public void c0(boolean z6) {
        ((t2.X) this.f2813b).c0(z6);
    }

    @Override // t2.X
    public int d() {
        return ((t2.X) this.f2813b).d();
    }

    @Override // t2.X
    public void d0(int i7) {
        ((t2.X) this.f2813b).d0(i7);
    }

    @Override // t2.X
    public void e() {
        switch (this.f2812a) {
            case 3:
                ((A2.N) this).p(true);
                break;
            default:
                ((t2.X) this.f2813b).e();
                break;
        }
    }

    @Override // t2.X
    public int e0() {
        return ((t2.X) this.f2813b).e0();
    }

    @Override // t2.X
    public void f(int i7) {
        ((t2.X) this.f2813b).f(i7);
    }

    @Override // t2.X
    public void f0(t2.J j3) {
        ((t2.X) this.f2813b).f0(j3);
    }

    @Override // t2.X
    public void g() {
        switch (this.f2812a) {
            case 3:
                ((A2.N) this).p(false);
                break;
            default:
                ((t2.X) this.f2813b).g();
                break;
        }
    }

    @Override // t2.X
    public void g0(int i7, int i8) {
        switch (this.f2812a) {
            case 3:
                if (i7 != i8) {
                    ((A2.N) this).h0(i7, i7 + 1, i8);
                }
                break;
            default:
                ((t2.X) this.f2813b).g0(i7, i8);
                break;
        }
    }

    @Override // t2.X
    public void h(t2.Q q7) {
        ((t2.X) this.f2813b).h(q7);
    }

    @Override // t2.X
    public void h0(int i7, int i8, int i9) {
        ((t2.X) this.f2813b).h0(i7, i8, i9);
    }

    @Override // t2.X
    public int i() {
        return ((t2.X) this.f2813b).i();
    }

    @Override // t2.X
    public int i0() {
        return ((t2.X) this.f2813b).i0();
    }

    @Override // t2.X
    public t2.Q j() {
        return ((t2.X) this.f2813b).j();
    }

    @Override // t2.X
    public void j0(int i7, int i8, List list) {
        ((t2.X) this.f2813b).j0(i7, i8, list);
    }

    @Override // t2.X
    public void k(long j3) {
        switch (this.f2812a) {
            case 3:
                Y0(((A2.N) this).V(), j3, false);
                break;
            default:
                ((t2.X) this.f2813b).k(j3);
                break;
        }
    }

    @Override // t2.X
    public void k0(List list) {
        switch (this.f2812a) {
            case 3:
                ((A2.N) this).x(Integer.MAX_VALUE, list);
                break;
            default:
                ((t2.X) this.f2813b).k0(list);
                break;
        }
    }

    @Override // t2.X
    public void l(float f7) {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                n7.h(new t2.Q(f7, n7.j().f16349b));
                break;
            default:
                ((t2.X) this.f2813b).l(f7);
                break;
        }
    }

    @Override // t2.X
    public long l0() {
        return ((t2.X) this.f2813b).l0();
    }

    @Override // t2.X
    public void m(List list, int i7, long j3) {
        ((t2.X) this.f2813b).m(list, i7, j3);
    }

    @Override // t2.X
    public t2.h0 m0() {
        return ((t2.X) this.f2813b).m0();
    }

    @Override // t2.X
    public t2.P n() {
        return ((t2.X) this.f2813b).n();
    }

    @Override // t2.X
    public boolean n0() {
        return ((t2.X) this.f2813b).n0();
    }

    @Override // t2.X
    public int o() {
        return ((t2.X) this.f2813b).o();
    }

    @Override // t2.X
    public void o0(int i7) {
        switch (this.f2812a) {
            case 3:
                ((A2.N) this).u0(i7, i7 + 1);
                break;
            default:
                ((t2.X) this.f2813b).o0(i7);
                break;
        }
    }

    @Override // t2.X
    public void p(boolean z6) {
        ((t2.X) this.f2813b).p(z6);
    }

    @Override // t2.X
    public void p0(int i7, t2.G g6) {
        switch (this.f2812a) {
            case 3:
                ((A2.N) this).j0(i7, i7 + 1, E4.I.t(g6));
                break;
            default:
                ((t2.X) this.f2813b).p0(i7, g6);
                break;
        }
    }

    @Override // t2.X
    public void q(Surface surface) {
        ((t2.X) this.f2813b).q(surface);
    }

    @Override // t2.X
    public void q0() {
        ((t2.X) this.f2813b).q0();
    }

    @Override // t2.X
    public boolean r() {
        return ((t2.X) this.f2813b).r();
    }

    @Override // t2.X
    public boolean r0() {
        return ((t2.X) this.f2813b).r0();
    }

    @Override // t2.X
    public void s(int i7) {
        switch (this.f2812a) {
            case 3:
                Y0(i7, -9223372036854775807L, false);
                break;
            default:
                ((t2.X) this.f2813b).s(i7);
                break;
        }
    }

    @Override // t2.X
    public t2.n0 s0() {
        return ((t2.X) this.f2813b).s0();
    }

    @Override // t2.X
    public void stop() {
        ((t2.X) this.f2813b).stop();
    }

    @Override // t2.X
    public long t() {
        return ((t2.X) this.f2813b).t();
    }

    @Override // t2.X
    public long t0() {
        return ((t2.X) this.f2813b).t0();
    }

    @Override // t2.X
    public long u() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                t2.h0 h0VarM0 = n7.m0();
                if (h0VarM0.p()) {
                    return -9223372036854775807L;
                }
                int iV = n7.V();
                t2.g0 g0Var = (t2.g0) this.f2813b;
                if (h0VarM0.m(iV, g0Var, 0L).f16458e == -9223372036854775807L) {
                    return -9223372036854775807L;
                }
                long j3 = g0Var.f16459f;
                return ((j3 == -9223372036854775807L ? System.currentTimeMillis() : j3 + SystemClock.elapsedRealtime()) - g0Var.f16458e) - n7.v();
            default:
                return ((t2.X) this.f2813b).u();
        }
    }

    @Override // t2.X
    public void u0(int i7, int i8) {
        ((t2.X) this.f2813b).u0(i7, i8);
    }

    @Override // t2.X
    public long v() {
        return ((t2.X) this.f2813b).v();
    }

    @Override // t2.X
    public void v0(int i7) {
        ((t2.X) this.f2813b).v0(i7);
    }

    @Override // t2.X
    public long w() {
        return ((t2.X) this.f2813b).w();
    }

    @Override // t2.X
    public void w0() {
        int iE;
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                if (n7.m0().p() || n7.r()) {
                    W0();
                } else if (U0()) {
                    t2.h0 h0VarM0 = n7.m0();
                    if (h0VarM0.p()) {
                        iE = -1;
                    } else {
                        int iV = n7.V();
                        n7.x1();
                        int i7 = n7.f95G;
                        if (i7 == 1) {
                            i7 = 0;
                        }
                        n7.x1();
                        iE = h0VarM0.e(iV, i7, n7.f96H);
                    }
                    if (iE == -1) {
                        W0();
                    } else if (iE != n7.V()) {
                        Y0(iE, -9223372036854775807L, false);
                    } else {
                        Y0(n7.V(), -9223372036854775807L, true);
                    }
                } else if (O0() && L0()) {
                    Y0(n7.V(), -9223372036854775807L, false);
                } else {
                    W0();
                }
                break;
            default:
                ((t2.X) this.f2813b).w0();
                break;
        }
    }

    @Override // t2.X
    public void x(int i7, List list) {
        ((t2.X) this.f2813b).x(i7, list);
    }

    @Override // t2.X
    public void x0() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                n7.x1();
                Z0(n7.f139w, 12);
                break;
            default:
                ((t2.X) this.f2813b).x0();
                break;
        }
    }

    @Override // t2.X
    public t2.T y() {
        return ((t2.X) this.f2813b).y();
    }

    @Override // t2.X
    public void y0() {
        switch (this.f2812a) {
            case 3:
                A2.N n7 = (A2.N) this;
                n7.x1();
                Z0(-n7.f138v, 11);
                break;
            default:
                ((t2.X) this.f2813b).y0();
                break;
        }
    }

    @Override // t2.X
    public void z(t2.G g6) {
        switch (this.f2812a) {
            case 3:
                ((A2.N) this).C0(E4.I.t(g6));
                break;
            default:
                ((t2.X) this.f2813b).z(g6);
                break;
        }
    }

    @Override // t2.X
    public void z0(long j3, int i7) {
        switch (this.f2812a) {
            case 3:
                Y0(i7, j3, false);
                break;
            default:
                ((t2.X) this.f2813b).z0(j3, i7);
                break;
        }
    }

    public P(int i7) {
        this.f2812a = i7;
        switch (i7) {
            case 2:
                this.f2813b = new ArrayList();
                break;
            case 3:
                this.f2813b = new t2.g0();
                break;
            case 4:
            default:
                t.y yVar = AbstractC1458m.f16088a;
                this.f2813b = new t.y();
                break;
            case 5:
                break;
        }
    }

    public void X0(f0.O o7, Object obj) {
    }
}
