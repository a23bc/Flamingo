package Q0;

import O0.C0305f;
import O0.C0311i;
import O0.C0320q;
import O0.C0322t;
import R0.C0415x;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import t.C1443E;
import y0.AbstractC1959I;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class D extends j0 {

    /* JADX INFO: renamed from: j0 */
    public static final w2.l f5776j0;

    /* JADX INFO: renamed from: f0 */
    public A f5777f0;

    /* JADX INFO: renamed from: g0 */
    public n1.a f5778g0;

    /* JADX INFO: renamed from: h0 */
    public B f5779h0;

    /* JADX INFO: renamed from: i0 */
    public C0311i f5780i0;

    static {
        w2.l lVarG = AbstractC1959I.g();
        lVarG.h(C1987t.h);
        lVarG.n(1.0f);
        lVarG.o(1);
        f5776j0 = lVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D(K k7, A a4) {
        super(k7);
        this.f5777f0 = a4;
        this.f5779h0 = k7.f5837v != null ? new B(this) : null;
        this.f5780i0 = (((AbstractC1397o) a4).f15637o.f15639q & 512) != 0 ? new C0311i(this, (v.Y) a4) : null;
    }

    @Override // Q0.j0
    public final void E0() {
        if (this.f5779h0 == null) {
            this.f5779h0 = new B(this);
        }
    }

    @Override // Q0.j0
    public final U H0() {
        return this.f5779h0;
    }

    @Override // Q0.j0
    public final AbstractC1397o J0() {
        return ((AbstractC1397o) this.f5777f0).f15637o;
    }

    @Override // O0.Y
    public final int M(int i7) {
        C0311i c0311i = this.f5780i0;
        if (c0311i == null) {
            A a4 = this.f5777f0;
            j0 j0Var = this.f6027F;
            AbstractC1209k.c(j0Var);
            return a4.d(this, j0Var, i7);
        }
        v.Y y6 = c0311i.f5402p;
        j0 j0Var2 = this.f6027F;
        AbstractC1209k.c(j0Var2);
        j0 j0Var3 = y6.f15637o.f15644v;
        AbstractC1209k.c(j0Var3);
        U uH0 = j0Var3.H0();
        AbstractC1209k.c(uH0);
        if (!uH0.p0()) {
            return j0Var2.M(i7);
        }
        return y6.C0(new C0305f(c0311i, c0311i.getLayoutDirection()), new C0320q(j0Var2, l0.f6049o, m0.f6052o, 2), n1.b.b(0, i7, 7)).e();
    }

    @Override // O0.Y
    public final int P(int i7) {
        C0311i c0311i = this.f5780i0;
        if (c0311i == null) {
            A a4 = this.f5777f0;
            j0 j0Var = this.f6027F;
            AbstractC1209k.c(j0Var);
            return a4.h(this, j0Var, i7);
        }
        v.Y y6 = c0311i.f5402p;
        j0 j0Var2 = this.f6027F;
        AbstractC1209k.c(j0Var2);
        j0 j0Var3 = y6.f15637o.f15644v;
        AbstractC1209k.c(j0Var3);
        U uH0 = j0Var3.H0();
        AbstractC1209k.c(uH0);
        if (!uH0.p0()) {
            return j0Var2.P(i7);
        }
        return y6.C0(new C0305f(c0311i, c0311i.getLayoutDirection()), new C0320q(j0Var2, l0.f6050p, m0.f6052o, 2), n1.b.b(0, i7, 7)).e();
    }

    @Override // O0.Y
    public final int Q(int i7) {
        C0311i c0311i = this.f5780i0;
        if (c0311i == null) {
            A a4 = this.f5777f0;
            j0 j0Var = this.f6027F;
            AbstractC1209k.c(j0Var);
            return a4.g(this, j0Var, i7);
        }
        v.Y y6 = c0311i.f5402p;
        j0 j0Var2 = this.f6027F;
        AbstractC1209k.c(j0Var2);
        j0 j0Var3 = y6.f15637o.f15644v;
        AbstractC1209k.c(j0Var3);
        U uH0 = j0Var3.H0();
        AbstractC1209k.c(uH0);
        if (!uH0.p0()) {
            return j0Var2.Q(i7);
        }
        return y6.C0(new C0305f(c0311i, c0311i.getLayoutDirection()), new C0320q(j0Var2, l0.f6049o, m0.f6053p, 2), n1.b.b(i7, 0, 13)).c();
    }

    @Override // Q0.j0
    public final void X0(InterfaceC1985r interfaceC1985r, B0.d dVar) {
        j0 j0Var;
        j0 j0Var2 = this.f6027F;
        AbstractC1209k.c(j0Var2);
        j0Var2.C0(interfaceC1985r, dVar);
        if (!((C0415x) O.a(this.f6024C)).getShowLayoutBounds() || (j0Var = this.f6027F) == null) {
            return;
        }
        if (n1.m.b(this.f5418q, j0Var.f5418q) && n1.k.b(j0Var.f6037P, 0L)) {
            return;
        }
        long j3 = this.f5418q;
        interfaceC1985r.t(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, f5776j0);
    }

    @Override // Q0.j0, O0.m0
    public final void Z(long j3, float f7, B0.d dVar) {
        if (this.f6025D) {
            U uH0 = H0();
            AbstractC1209k.c(uH0);
            Y0(uH0.f5889D, f7, null, dVar);
        } else {
            Y0(j3, f7, null, dVar);
        }
        j1();
    }

    @Override // O0.m0
    public final void a0(long j3, float f7, InterfaceC1182c interfaceC1182c) {
        if (this.f6025D) {
            U uH0 = H0();
            AbstractC1209k.c(uH0);
            Y0(uH0.f5889D, f7, interfaceC1182c, null);
        } else {
            Y0(j3, f7, interfaceC1182c, null);
        }
        j1();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0057  */
    @Override // O0.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O0.m0 d(long r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.D.d(long):O0.m0");
    }

    @Override // O0.Y
    public final int e(int i7) {
        C0311i c0311i = this.f5780i0;
        if (c0311i == null) {
            A a4 = this.f5777f0;
            j0 j0Var = this.f6027F;
            AbstractC1209k.c(j0Var);
            return a4.c(this, j0Var, i7);
        }
        v.Y y6 = c0311i.f5402p;
        j0 j0Var2 = this.f6027F;
        AbstractC1209k.c(j0Var2);
        j0 j0Var3 = y6.f15637o.f15644v;
        AbstractC1209k.c(j0Var3);
        U uH0 = j0Var3.H0();
        AbstractC1209k.c(uH0);
        if (!uH0.p0()) {
            return j0Var2.e(i7);
        }
        return y6.C0(new C0305f(c0311i, c0311i.getLayoutDirection()), new C0320q(j0Var2, l0.f6050p, m0.f6053p, 2), n1.b.b(i7, 0, 13)).c();
    }

    @Override // Q0.T
    public final int g0(C0322t c0322t) {
        B b7 = this.f5779h0;
        if (b7 == null) {
            return AbstractC0347f.c(this, c0322t);
        }
        C1443E c1443e = b7.f5893H;
        int iD = c1443e.d(c0322t);
        if (iD >= 0) {
            return c1443e.f15979c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j1() {
        /*
            r7 = this;
            boolean r0 = r7.f5885x
            if (r0 == 0) goto L5
            return
        L5:
            r7.V0()
            O0.i r0 = r7.f5780i0
            r1 = 0
            if (r0 == 0) goto L5a
            Q0.B r2 = r7.f5779h0
            m5.AbstractC1209k.c(r2)
            boolean r0 = r0.f5403q
            if (r0 != 0) goto L52
            long r2 = r7.f5418q
            Q0.B r0 = r7.f5779h0
            r4 = 0
            if (r0 == 0) goto L27
            long r5 = r0.z0()
            n1.m r0 = new n1.m
            r0.<init>(r5)
            goto L28
        L27:
            r0 = r4
        L28:
            boolean r0 = n1.m.a(r2, r0)
            if (r0 == 0) goto L52
            Q0.j0 r0 = r7.f6027F
            m5.AbstractC1209k.c(r0)
            long r2 = r0.f5418q
            Q0.j0 r0 = r7.f6027F
            m5.AbstractC1209k.c(r0)
            Q0.U r0 = r0.H0()
            if (r0 == 0) goto L4a
            long r4 = r0.z0()
            n1.m r0 = new n1.m
            r0.<init>(r4)
            r4 = r0
        L4a:
            boolean r0 = n1.m.a(r2, r4)
            if (r0 == 0) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = r1
        L53:
            Q0.j0 r2 = r7.f6027F
            m5.AbstractC1209k.c(r2)
            r2.f6025D = r0
        L5a:
            O0.a0 r0 = r7.r0()
            r0.b()
            Q0.j0 r0 = r7.f6027F
            m5.AbstractC1209k.c(r0)
            r0.f6025D = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.D.j1():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1(A a4) {
        if (!a4.equals(this.f5777f0)) {
            if ((((AbstractC1397o) a4).f15637o.f15639q & 512) != 0) {
                v.Y y6 = (v.Y) a4;
                C0311i c0311i = this.f5780i0;
                if (c0311i != null) {
                    c0311i.f5402p = y6;
                } else {
                    c0311i = new C0311i(this, y6);
                }
                this.f5780i0 = c0311i;
            } else {
                this.f5780i0 = null;
            }
        }
        this.f5777f0 = a4;
    }
}
