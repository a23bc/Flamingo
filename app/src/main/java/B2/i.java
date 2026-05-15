package B2;

import A2.C0013n;
import A2.J;
import A2.N;
import A2.r;
import E4.I;
import E4.K;
import H2.A;
import H2.C0205w;
import H2.E;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import t2.C1476e;
import t2.C1482k;
import t2.G;
import t2.L;
import t2.P;
import t2.Q;
import t2.T;
import t2.U;
import t2.V;
import t2.W;
import t2.X;
import t2.e0;
import t2.g0;
import t2.h0;
import t2.n0;
import t2.p0;
import t2.s0;
import v2.C1636c;
import w2.AbstractC1697a;
import w2.q;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class i implements V, E, D2.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w2.o f755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0 f756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray f759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w2.j f760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public N f761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f763w;

    public i(w2.o oVar) {
        oVar.getClass();
        this.f755o = oVar;
        this.f760t = new w2.j(t.o(), oVar, new r(23));
        e0 e0Var = new e0();
        this.f756p = e0Var;
        this.f757q = new g0();
        this.f758r = new h(e0Var);
        this.f759s = new SparseArray();
    }

    @Override // D2.o
    public final void A(int i7, A a4, int i8) {
        Z(X(i7, a4), 1022, new d(25));
    }

    @Override // D2.o
    public final void B(int i7, A a4) {
        Z(X(i7, a4), 1023, new r(13));
    }

    @Override // t2.V
    public final void C(W w7, W w8, int i7) {
        if (i7 == 1) {
            this.f763w = false;
        }
        N n7 = this.f761u;
        n7.getClass();
        h hVar = this.f758r;
        hVar.f752d = h.d(n7, (I) hVar.f750b, (A) hVar.f753e, (e0) hVar.f749a);
        a aVarA = a();
        Z(aVarA, 11, new A2.A(aVarA, i7, w7, w8));
    }

    @Override // t2.V
    public final void D(p0 p0Var) {
        Z(a(), 2, new d(3));
    }

    @Override // t2.V
    public final void E(int i7, G g6) {
        Z(a(), 1, new r(6));
    }

    @Override // t2.V
    public final void F(s0 s0Var) {
        a aVarY = Y();
        Z(aVarY, 25, new J(aVarY, s0Var));
    }

    @Override // t2.V
    public final void G(int i7) {
        Z(a(), 4, new r(27));
    }

    @Override // t2.V
    public final void H(long j3) {
        Z(a(), 18, new d(12));
    }

    @Override // H2.E
    public final void I(int i7, A a4, H2.r rVar, C0205w c0205w) {
        Z(X(i7, a4), 1001, new d(24));
    }

    @Override // t2.V
    public final void J(h0 h0Var, int i7) {
        N n7 = this.f761u;
        n7.getClass();
        h hVar = this.f758r;
        hVar.f752d = h.d(n7, (I) hVar.f750b, (A) hVar.f753e, (e0) hVar.f749a);
        hVar.i(n7.m0());
        Z(a(), 0, new r(5));
    }

    @Override // t2.V
    public final void K(boolean z6) {
        Z(a(), 9, new d(9));
    }

    @Override // t2.V
    public final void L(int i7, int i8) {
        Z(Y(), 24, new d(10));
    }

    @Override // H2.E
    public final void M(int i7, A a4, H2.r rVar, C0205w c0205w, IOException iOException, boolean z6) {
        a aVarX = X(i7, a4);
        Z(aVarX, 1003, new d(aVarX, rVar, c0205w, iOException, z6));
    }

    @Override // D2.o
    public final void N(int i7, A a4, Exception exc) {
        Z(X(i7, a4), 1024, new d(26));
    }

    @Override // t2.V
    public final void O(Q q7) {
        Z(a(), 12, new r(24));
    }

    @Override // t2.V
    public final void P(C1476e c1476e) {
        Z(Y(), 20, new r(10));
    }

    @Override // H2.E
    public final void Q(int i7, A a4, H2.r rVar, C0205w c0205w) {
        Z(X(i7, a4), 1002, new d(23));
    }

    @Override // t2.V
    public final void R(t2.J j3) {
        Z(a(), 14, new d(28));
    }

    @Override // t2.V
    public final void S(C1482k c1482k) {
        Z(a(), 29, new r(28));
    }

    @Override // D2.o
    public final void T(int i7, A a4) {
        Z(X(i7, a4), 1025, new r(3));
    }

    @Override // t2.V
    public final void U(int i7, boolean z6) {
        Z(a(), 30, new r(20));
    }

    @Override // t2.V
    public final void V(boolean z6) {
        Z(a(), 7, new r(14));
    }

    public final a W(h0 h0Var, int i7, A a4) {
        A a7 = h0Var.p() ? null : a4;
        this.f755o.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = h0Var.equals(this.f761u.m0()) && i7 == this.f761u.V();
        long jN = 0;
        if (a7 == null || !a7.b()) {
            if (z6) {
                jN = this.f761u.v();
            } else if (!h0Var.p()) {
                jN = t.N(h0Var.m(i7, this.f757q, 0L).f16463k);
            }
        } else if (z6 && this.f761u.U() == a7.f2974b && this.f761u.e0() == a7.f2975c) {
            jN = this.f761u.F0();
        }
        return new a(jElapsedRealtime, h0Var, i7, a7, jN, this.f761u.m0(), this.f761u.V(), (A) this.f758r.f752d, this.f761u.F0(), this.f761u.w());
    }

    public final a X(int i7, A a4) {
        this.f761u.getClass();
        if (a4 != null) {
            return ((h0) ((K) this.f758r.f751c).get(a4)) != null ? b(a4) : W(h0.f16472a, i7, a4);
        }
        h0 h0VarM0 = this.f761u.m0();
        if (i7 >= h0VarM0.o()) {
            h0VarM0 = h0.f16472a;
        }
        return W(h0VarM0, i7, null);
    }

    public final a Y() {
        return b((A) this.f758r.f754f);
    }

    public final void Z(a aVar, int i7, w2.g gVar) {
        this.f759s.put(i7, aVar);
        this.f760t.f(i7, gVar);
    }

    public final a a() {
        return b((A) this.f758r.f752d);
    }

    public final void a0(N n7, Looper looper) {
        AbstractC1697a.i(this.f761u == null || ((I) this.f758r.f750b).isEmpty());
        n7.getClass();
        this.f761u = n7;
        this.f762v = this.f755o.a(looper, null);
        w2.j jVar = this.f760t;
        this.f760t = new w2.j(jVar.f18853d, looper, jVar.f18850a, new b(this, 0, n7), jVar.f18857i);
    }

    public final a b(A a4) {
        this.f761u.getClass();
        h0 h0Var = a4 == null ? null : (h0) ((K) this.f758r.f751c).get(a4);
        if (a4 != null && h0Var != null) {
            return W(h0Var, h0Var.g(a4.f2973a, this.f756p).f16428c, a4);
        }
        int iV = this.f761u.V();
        h0 h0VarM0 = this.f761u.m0();
        if (iV >= h0VarM0.o()) {
            h0VarM0 = h0.f16472a;
        }
        return W(h0VarM0, iV, null);
    }

    @Override // t2.V
    public final void c(int i7) {
        Z(a(), 8, new d(5));
    }

    @Override // t2.V
    public final void d(T t7) {
        Z(a(), 13, new r(4));
    }

    @Override // t2.V
    public final void e(n0 n0Var) {
        Z(a(), 19, new d(13));
    }

    @Override // t2.V
    public final void f(int i7) {
        Z(a(), 6, new r(16));
    }

    @Override // t2.V
    public final void g(long j3) {
        Z(a(), 16, new d(11));
    }

    @Override // t2.V
    public final void j(long j3) {
        Z(a(), 17, new d(15));
    }

    @Override // D2.o
    public final void k(int i7, A a4) {
        Z(X(i7, a4), 1027, new d(27));
    }

    @Override // t2.V
    public final void l(L l) {
        Z(a(), 28, new r(11));
    }

    @Override // H2.E
    public final void m(int i7, A a4, C0205w c0205w) {
        a aVarX = X(i7, a4);
        Z(aVarX, 1004, new b(aVarX, 1, c0205w));
    }

    @Override // t2.V
    public final void n(C1636c c1636c) {
        Z(a(), 27, new d(20));
    }

    @Override // t2.V
    public final void o(boolean z6) {
        Z(a(), 3, new g(0));
    }

    @Override // t2.V
    public final void q(t2.J j3) {
        Z(a(), 15, new d(0));
    }

    @Override // t2.V
    public final void r(boolean z6) {
        Z(Y(), 23, new d(17));
    }

    @Override // t2.V
    public final void s(List list) {
        Z(a(), 27, new r(22));
    }

    @Override // H2.E
    public final void u(int i7, A a4, H2.r rVar, C0205w c0205w) {
        Z(X(i7, a4), 1000, new d(21));
    }

    @Override // t2.V
    public final void v(P p7) {
        A a4;
        Z((!(p7 instanceof C0013n) || (a4 = ((C0013n) p7).f371C) == null) ? a() : b(a4), 10, new r(19));
    }

    @Override // t2.V
    public final void w(int i7, boolean z6) {
        Z(a(), -1, new r(9));
    }

    @Override // t2.V
    public final void x(int i7, boolean z6) {
        Z(a(), 5, new r(21));
    }

    @Override // t2.V
    public final void y(P p7) {
        A a4;
        a aVarA = (!(p7 instanceof C0013n) || (a4 = ((C0013n) p7).f371C) == null) ? a() : b(a4);
        Z(aVarA, 10, new c(aVarA, p7));
    }

    @Override // t2.V
    public final void z(float f7) {
        Z(Y(), 22, new r(7));
    }

    @Override // t2.V
    public final void p() {
    }

    @Override // t2.V
    public final void h(boolean z6) {
    }

    @Override // t2.V
    public final void i(int i7) {
    }

    @Override // t2.V
    public final void t(X x6, U u7) {
    }
}
