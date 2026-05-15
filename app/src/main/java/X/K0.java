package X;

import A2.C0001b;
import L2.C0247a;
import R0.InterfaceC0393l0;
import b1.AbstractC0607C;
import b1.C0613I;
import b1.C0622g;
import f0.C0879c;
import f0.C0894j0;
import g1.C0980v;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: A */
    public boolean f7938A;

    /* JADX INFO: renamed from: a */
    public final M.F0 f7939a;

    /* JADX INFO: renamed from: d */
    public M.Z f7942d;

    /* JADX INFO: renamed from: f */
    public InterfaceC1180a f7944f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0393l0 f7945g;
    public InterfaceC1765B h;

    /* JADX INFO: renamed from: i */
    public C0505y f7946i;

    /* JADX INFO: renamed from: j */
    public G0.a f7947j;

    /* JADX INFO: renamed from: k */
    public w0.p f7948k;
    public final C0894j0 l;

    /* JADX INFO: renamed from: m */
    public final C0894j0 f7949m;

    /* JADX INFO: renamed from: n */
    public long f7950n;

    /* JADX INFO: renamed from: o */
    public b1.L f7951o;

    /* JADX INFO: renamed from: p */
    public long f7952p;

    /* JADX INFO: renamed from: q */
    public final C0894j0 f7953q;

    /* JADX INFO: renamed from: r */
    public final C0894j0 f7954r;

    /* JADX INFO: renamed from: s */
    public int f7955s;

    /* JADX INFO: renamed from: t */
    public C0980v f7956t;

    /* JADX INFO: renamed from: u */
    public x0 f7957u;

    /* JADX INFO: renamed from: v */
    public b1.L f7958v;

    /* JADX INFO: renamed from: w */
    public final C0894j0 f7959w;

    /* JADX INFO: renamed from: x */
    public final C0247a f7960x;

    /* JADX INFO: renamed from: y */
    public final F0 f7961y;

    /* JADX INFO: renamed from: z */
    public final C0001b f7962z;

    /* JADX INFO: renamed from: b */
    public B2.m f7940b = M.V.f4488c;

    /* JADX INFO: renamed from: c */
    public InterfaceC1182c f7941c = new F.g(8);

    /* JADX INFO: renamed from: e */
    public final C0894j0 f7943e = C0879c.t(new C0980v(0, (String) null, 7));

    public K0(M.F0 f02) {
        this.f7939a = f02;
        Boolean bool = Boolean.TRUE;
        this.l = C0879c.t(bool);
        this.f7949m = C0879c.t(bool);
        this.f7950n = 0L;
        this.f7952p = 0L;
        this.f7953q = C0879c.t(null);
        this.f7954r = C0879c.t(null);
        this.f7955s = -1;
        this.f7956t = new C0980v(0L, (String) null, 7);
        this.f7959w = C0879c.t(null);
        this.f7960x = new C0247a(9, false);
        this.f7961y = new F0(this);
        this.f7962z = new C0001b(this);
    }

    public static final void a(K0 k02, b1.L l) {
        C0622g c0622gL;
        String str;
        InterfaceC1765B interfaceC1765B;
        if (l == null) {
            k02.getClass();
            return;
        }
        C0505y c0505y = k02.f7946i;
        if (c0505y == null || (c0622gL = k02.l()) == null || (str = c0622gL.f9970p) == null) {
            return;
        }
        B2.m mVar = k02.f7940b;
        long j3 = l.f9945a;
        int i7 = (int) (j3 >> 32);
        mVar.a(i7);
        int i8 = (int) (j3 & 4294967295L);
        mVar.a(i8);
        long jB = AbstractC0607C.b(i7, i8);
        if (str.length() <= 0 || b1.L.c(jB) || (interfaceC1765B = k02.h) == null) {
            return;
        }
        AbstractC1767D.t(interfaceC1765B, null, new G0(c0505y, str, jB, l, k02, mVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(X.K0 r13, e5.AbstractC0865c r14) {
        /*
            boolean r0 = r14 instanceof X.H0
            if (r0 == 0) goto L13
            r0 = r14
            X.H0 r0 = (X.H0) r0
            int r1 = r0.f7918q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7918q = r1
            goto L18
        L13:
            X.H0 r0 = new X.H0
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f7916o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f7918q
            Y4.o r3 = Y4.o.f8736a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            android.support.v4.media.session.b.K(r14)
            goto L88
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            android.support.v4.media.session.b.K(r14)
            b1.g r14 = r13.l()
            if (r14 == 0) goto L88
            java.lang.String r10 = r14.f9970p
            if (r10 == 0) goto L88
            b1.L r14 = r13.f7958v
            if (r14 == 0) goto L88
            X.y r8 = r13.f7946i
            if (r8 == 0) goto L88
            B2.m r2 = r13.f7940b
            r5 = 32
            long r6 = r14.f9945a
            long r11 = r6 >> r5
            int r14 = (int) r11
            r2.a(r14)
            B2.m r13 = r13.f7940b
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r11
            int r2 = (int) r6
            r13.a(r2)
            long r6 = b1.AbstractC0607C.b(r14, r2)
            r0.f7918q = r4
            int r13 = r10.length()
            if (r13 != 0) goto L6b
            goto L71
        L6b:
            boolean r13 = b1.L.c(r6)
            if (r13 == 0) goto L73
        L71:
            r13 = r3
            goto L85
        L73:
            X.t r5 = new X.t
            r9 = 0
            r5.<init>(r6, r8, r9, r10)
            X.w r13 = new X.w
            r14 = 0
            r13.<init>(r8, r5, r14)
            c5.i r14 = r8.f8205a
            java.lang.Object r13 = w5.AbstractC1767D.C(r14, r13, r0)
        L85:
            if (r13 != r1) goto L88
            return r1
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0.b(X.K0, e5.c):java.lang.Object");
    }

    public static final long c(K0 k02, C0980v c0980v, long j3, boolean z6, boolean z7, F f7, boolean z8) {
        M.E0 e0D;
        long j7;
        char c7;
        C0613I c0613i;
        E e7;
        boolean z9;
        boolean z10;
        G0.a aVar;
        int i7;
        M.Z z11 = k02.f7942d;
        if (z11 == null || (e0D = z11.d()) == null) {
            return b1.L.f9943b;
        }
        B2.m mVar = k02.f7940b;
        long j8 = c0980v.f12385b;
        int i8 = b1.L.f9944c;
        int i9 = (int) (j8 >> 32);
        mVar.a(i9);
        B2.m mVar2 = k02.f7940b;
        long j9 = c0980v.f12385b;
        int i10 = (int) (j9 & 4294967295L);
        mVar2.a(i10);
        long jB = AbstractC0607C.b(i9, i10);
        int iB = e0D.b(j3, false);
        int i11 = (z7 || z6) ? iB : (int) (jB >> 32);
        int i12 = (!z7 || z6) ? iB : (int) (jB & 4294967295L);
        x0 x0Var = k02.f7957u;
        int i13 = (z6 || x0Var == null || (i7 = k02.f7955s) == -1) ? -1 : i7;
        C0613I c0613i2 = e0D.f4386a;
        if (z6) {
            c0613i = c0613i2;
            e7 = null;
            c7 = ' ';
            j7 = 4294967295L;
        } else {
            j7 = 4294967295L;
            int i14 = (int) (jB >> 32);
            c7 = ' ';
            int i15 = (int) (jB & 4294967295L);
            c0613i = c0613i2;
            e7 = new E(new D(AbstractC0498r0.u(c0613i2, i14), i14, 1L), new D(AbstractC0498r0.u(c0613i2, i15), i15, 1L), b1.L.g(jB));
        }
        x0 x0Var2 = new x0(z7, 1, 1, e7, new B(1L, 1, i11, i12, i13, c0613i));
        if (x0Var2.m(x0Var)) {
            k02.f7957u = x0Var2;
            k02.f7955s = iB;
            E eA = f7.a(x0Var2);
            B2.m mVar3 = k02.f7940b;
            int i16 = eA.f7891a.f7888b;
            mVar3.b(i16);
            B2.m mVar4 = k02.f7940b;
            int i17 = eA.f7892b.f7888b;
            mVar4.b(i17);
            long jB2 = AbstractC0607C.b(i16, i17);
            if (!b1.L.b(jB2, j9)) {
                boolean z12 = b1.L.g(jB2) != b1.L.g(j9) && b1.L.b(AbstractC0607C.b((int) (jB2 & j7), (int) (jB2 >> c7)), j9);
                boolean z13 = b1.L.c(jB2) && b1.L.c(j9);
                C0622g c0622g = c0980v.f12384a;
                if (z8 && c0622g.f9970p.length() > 0 && !z12 && !z13 && (aVar = k02.f7947j) != null) {
                    aVar.a(9);
                }
                k02.f7941c.b(e(c0622g, jB2));
                k02.f7958v = new b1.L(jB2);
                if (!z8) {
                    k02.s(!b1.L.c(jB2));
                }
                M.Z z14 = k02.f7942d;
                if (z14 != null) {
                    z14.f4511q.setValue(Boolean.valueOf(z8));
                }
                M.Z z15 = k02.f7942d;
                if (z15 != null) {
                    z15.f4507m.setValue(Boolean.valueOf(!b1.L.c(jB2) && AbstractC0498r0.w(k02, true)));
                }
                M.Z z16 = k02.f7942d;
                if (z16 != null) {
                    if (b1.L.c(jB2)) {
                        z9 = false;
                    } else {
                        z9 = false;
                        if (AbstractC0498r0.w(k02, false)) {
                            z10 = true;
                        }
                        z16.f4508n.setValue(Boolean.valueOf(z10));
                    }
                    z10 = z9;
                    z16.f4508n.setValue(Boolean.valueOf(z10));
                } else {
                    z9 = false;
                }
                M.Z z17 = k02.f7942d;
                if (z17 != null) {
                    z17.f4509o.setValue(Boolean.valueOf((b1.L.c(jB2) && AbstractC0498r0.w(k02, true)) ? true : z9));
                }
                return jB2;
            }
        }
        return j9;
    }

    public static C0980v e(C0622g c0622g, long j3) {
        return new C0980v(c0622g, j3, (b1.L) null);
    }

    public final w5.w0 d(boolean z6) {
        InterfaceC1765B interfaceC1765B = this.h;
        if (interfaceC1765B == null) {
            return null;
        }
        EnumC1766C enumC1766C = EnumC1766C.f19467o;
        return AbstractC1767D.t(interfaceC1765B, null, new C0(this, z6, null), 1);
    }

    public final void f() {
        InterfaceC1765B interfaceC1765B = this.h;
        if (interfaceC1765B != null) {
            EnumC1766C enumC1766C = EnumC1766C.f19467o;
            AbstractC1767D.t(interfaceC1765B, null, new E0(this, null), 1);
        }
    }

    public final void g(C1892b c1892b) {
        int iE;
        if (!b1.L.c(m().f12385b)) {
            M.Z z6 = this.f7942d;
            M.E0 e0D = z6 != null ? z6.d() : null;
            if (c1892b == null || e0D == null) {
                iE = b1.L.e(m().f12385b);
            } else {
                B2.m mVar = this.f7940b;
                iE = e0D.b(c1892b.f19867a, true);
                mVar.b(iE);
            }
            C0980v c0980vA = C0980v.a(m(), null, AbstractC0607C.b(iE, iE), 5);
            this.f7941c.b(c0980vA);
            this.f7958v = new b1.L(c0980vA.f12385b);
        }
        p((c1892b == null || m().f12384a.f9970p.length() <= 0) ? M.N.f4425o : M.N.f4427q);
        s(false);
    }

    public final void h(boolean z6) {
        w0.p pVar;
        M.Z z7 = this.f7942d;
        if (z7 != null && !z7.b() && (pVar = this.f7948k) != null) {
            w0.p.b(pVar);
        }
        this.f7956t = m();
        s(z6);
        p(M.N.f4426p);
    }

    public final C1892b i() {
        return (C1892b) this.f7954r.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f7949m.getValue()).booleanValue();
    }

    public final long k(boolean z6) {
        M.E0 e0D;
        long j3;
        M.Z z7 = this.f7942d;
        if (z7 == null || (e0D = z7.d()) == null) {
            return 9205357640488583168L;
        }
        C0613I c0613i = e0D.f4386a;
        C0622g c0622gL = l();
        if (c0622gL == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC1209k.a(c0622gL.f9970p, c0613i.f9929a.f9920a.f9970p)) {
            return 9205357640488583168L;
        }
        C0980v c0980vM = m();
        if (z6) {
            long j7 = c0980vM.f12385b;
            int i7 = b1.L.f9944c;
            j3 = j7 >> 32;
        } else {
            long j8 = c0980vM.f12385b;
            int i8 = b1.L.f9944c;
            j3 = j8 & 4294967295L;
        }
        int i9 = (int) j3;
        this.f7940b.a(i9);
        return AbstractC0498r0.t(c0613i, i9, z6, b1.L.g(m().f12385b));
    }

    public final C0622g l() {
        M.i0 i0Var;
        M.Z z6 = this.f7942d;
        if (z6 == null || (i0Var = z6.f4497a) == null) {
            return null;
        }
        return i0Var.f4589a;
    }

    public final C0980v m() {
        return (C0980v) this.f7943e.getValue();
    }

    public final void n() {
        w5.w0 w0Var;
        S.h hVar = (S.h) this.f7960x.f4105p;
        if (hVar == null || (w0Var = hVar.f6720I) == null) {
            return;
        }
        w0Var.c(null);
        hVar.f6720I = null;
    }

    public final void o() {
        InterfaceC1765B interfaceC1765B = this.h;
        if (interfaceC1765B != null) {
            EnumC1766C enumC1766C = EnumC1766C.f19467o;
            AbstractC1767D.t(interfaceC1765B, null, new I0(this, null), 1);
        }
    }

    public final void p(M.N n7) {
        M.Z z6 = this.f7942d;
        if (z6 != null) {
            if (z6.a() == n7) {
                z6 = null;
            }
            if (z6 != null) {
                z6.f4506k.setValue(n7);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0026, code lost:
    
        if (((java.lang.Boolean) r3.f4511q.getValue()).booleanValue() == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r4 = this;
            p0.f r0 = d.C0746L.q()
            if (r0 == 0) goto Lb
            l5.c r1 = r0.e()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            p0.f r2 = d.C0746L.w(r0)
            boolean r3 = r4.j()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            M.Z r3 = r4.f7942d     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L29
            f0.j0 r3 = r3.f4511q     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L29
            goto L34
        L29:
            d.C0746L.z(r0, r2, r1)
            L2.a r0 = r4.f7960x
            r0.r()
            return
        L32:
            r3 = move-exception
            goto L38
        L34:
            d.C0746L.z(r0, r2, r1)
            return
        L38:
            d.C0746L.z(r0, r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0.q():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(e5.AbstractC0865c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.J0
            if (r0 == 0) goto L13
            r0 = r5
            X.J0 r0 = (X.J0) r0
            int r1 = r0.f7931r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7931r = r1
            goto L18
        L13:
            X.J0 r0 = new X.J0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7929p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f7931r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            X.K0 r0 = r0.f7928o
            android.support.v4.media.session.b.K(r5)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            android.support.v4.media.session.b.K(r5)
            R0.l0 r5 = r4.f7945g
            r2 = 0
            if (r5 == 0) goto L59
            r0.f7928o = r4
            r0.f7931r = r3
            R0.i r5 = (R0.C0386i) r5
            R0.j r5 = r5.f6464a
            android.content.ClipboardManager r5 = r5.f6469a
            android.content.ClipData r5 = r5.getPrimaryClip()
            if (r5 == 0) goto L50
            R0.k0 r0 = new R0.k0
            r0.<init>(r5)
            r5 = r0
            goto L51
        L50:
            r5 = r2
        L51:
            if (r5 != r1) goto L54
            return r1
        L54:
            r0 = r4
        L55:
            r2 = r5
            R0.k0 r2 = (R0.C0391k0) r2
            goto L5a
        L59:
            r0 = r4
        L5a:
            f0.j0 r5 = r0.f7959w
            r5.setValue(r2)
            Y4.o r5 = Y4.o.f8736a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0.r(e5.c):java.lang.Object");
    }

    public final void s(boolean z6) {
        M.Z z7 = this.f7942d;
        if (z7 != null) {
            z7.l.setValue(Boolean.valueOf(z6));
        }
        if (z6) {
            q();
        } else {
            n();
        }
    }
}
