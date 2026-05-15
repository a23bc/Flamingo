package Q0;

import K0.C0236d;
import R0.C0415x;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends O0.m0 implements O0.Y, InterfaceC0337a, InterfaceC0346e0 {

    /* JADX INFO: renamed from: A */
    public n1.a f5903A;

    /* JADX INFO: renamed from: C */
    public InterfaceC1182c f5905C;

    /* JADX INFO: renamed from: D */
    public B0.d f5906D;

    /* JADX INFO: renamed from: I */
    public boolean f5911I;

    /* JADX INFO: renamed from: K */
    public Object f5913K;

    /* JADX INFO: renamed from: L */
    public boolean f5914L;

    /* JADX INFO: renamed from: t */
    public final P f5915t;

    /* JADX INFO: renamed from: u */
    public boolean f5916u;

    /* JADX INFO: renamed from: y */
    public boolean f5920y;

    /* JADX INFO: renamed from: z */
    public boolean f5921z;

    /* JADX INFO: renamed from: v */
    public int f5917v = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: w */
    public int f5918w = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: x */
    public I f5919x = I.f5796q;

    /* JADX INFO: renamed from: B */
    public long f5904B = 0;

    /* JADX INFO: renamed from: E */
    public V f5907E = V.f5896q;

    /* JADX INFO: renamed from: F */
    public final L f5908F = new L(this, 1);

    /* JADX INFO: renamed from: G */
    public final h0.e f5909G = new h0.e(new Y[16]);

    /* JADX INFO: renamed from: H */
    public boolean f5910H = true;

    /* JADX INFO: renamed from: J */
    public boolean f5912J = true;

    public Y(P p7) {
        this.f5915t = p7;
        this.f5913K = p7.f5869p.f5945F;
    }

    @Override // Q0.InterfaceC0337a
    public final void F(B0.b bVar) throws Exception {
        h0.e eVarA = this.f5915t.f5856a.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            Y y6 = ((K) objArr[i8]).f5822U.f5870q;
            AbstractC1209k.c(y6);
            bVar.b(y6);
        }
    }

    @Override // O0.Y
    public final int M(int i7) {
        l0();
        U uH0 = this.f5915t.a().H0();
        AbstractC1209k.c(uH0);
        return uH0.M(i7);
    }

    @Override // Q0.InterfaceC0337a
    public final void N() {
        K.T(this.f5915t.f5856a, false, 7);
    }

    @Override // O0.Y
    public final int P(int i7) {
        l0();
        U uH0 = this.f5915t.a().H0();
        AbstractC1209k.c(uH0);
        return uH0.P(i7);
    }

    @Override // O0.Y
    public final int Q(int i7) {
        l0();
        U uH0 = this.f5915t.a().H0();
        AbstractC1209k.c(uH0);
        return uH0.Q(i7);
    }

    @Override // O0.m0
    public final int S() {
        U uH0 = this.f5915t.a().H0();
        AbstractC1209k.c(uH0);
        return uH0.S();
    }

    @Override // O0.m0
    public final int T() {
        U uH0 = this.f5915t.a().H0();
        AbstractC1209k.c(uH0);
        return uH0.T();
    }

    @Override // O0.m0
    public final void Z(long j3, float f7, B0.d dVar) throws Throwable {
        n0(j3, dVar, null);
    }

    @Override // Q0.InterfaceC0337a
    public final L a() {
        return this.f5908F;
    }

    @Override // O0.m0
    public final void a0(long j3, float f7, InterfaceC1182c interfaceC1182c) throws Throwable {
        n0(j3, null, interfaceC1182c);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0025  */
    @Override // O0.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O0.m0 d(long r6) throws java.lang.Throwable {
        /*
            r5 = this;
            Q0.P r0 = r5.f5915t
            Q0.K r1 = r0.f5856a
            Q0.K r1 = r1.v()
            r2 = 0
            if (r1 == 0) goto L10
            Q0.P r1 = r1.f5822U
            Q0.G r1 = r1.f5859d
            goto L11
        L10:
            r1 = r2
        L11:
            Q0.G r3 = Q0.G.f5788p
            if (r1 == r3) goto L25
            Q0.K r1 = r0.f5856a
            Q0.K r1 = r1.v()
            if (r1 == 0) goto L21
            Q0.P r1 = r1.f5822U
            Q0.G r2 = r1.f5859d
        L21:
            Q0.G r1 = Q0.G.f5790r
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f5857b = r1
        L28:
            Q0.K r1 = r0.f5856a
            Q0.K r2 = r1.v()
            if (r2 == 0) goto L72
            Q0.I r3 = r5.f5919x
            Q0.I r4 = Q0.I.f5796q
            if (r3 == r4) goto L40
            boolean r1 = r1.f5820S
            if (r1 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            N0.a.b(r1)
        L40:
            Q0.P r1 = r2.f5822U
            Q0.G r2 = r1.f5859d
            int r2 = r2.ordinal()
            if (r2 == 0) goto L6d
            r3 = 1
            if (r2 == r3) goto L6d
            r3 = 2
            if (r2 == r3) goto L6a
            r3 = 3
            if (r2 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            Q0.G r0 = r1.f5859d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            Q0.I r1 = Q0.I.f5795p
            goto L6f
        L6d:
            Q0.I r1 = Q0.I.f5794o
        L6f:
            r5.f5919x = r1
            goto L76
        L72:
            Q0.I r1 = Q0.I.f5796q
            r5.f5919x = r1
        L76:
            Q0.K r0 = r0.f5856a
            Q0.I r1 = r0.f5818Q
            Q0.I r2 = Q0.I.f5796q
            if (r1 != r2) goto L81
            r0.c()
        L81:
            r5.o0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.Y.d(long):O0.m0");
    }

    @Override // O0.Y
    public final int e(int i7) {
        l0();
        U uH0 = this.f5915t.a().H0();
        AbstractC1209k.c(uH0);
        return uH0.e(i7);
    }

    public final void f0(boolean z6) {
        P p7 = this.f5915t;
        if (z6 && p7.f5858c) {
            return;
        }
        if (z6 || p7.f5858c) {
            this.f5907E = V.f5896q;
            h0.e eVarA = p7.f5856a.A();
            Object[] objArr = eVarA.f12546o;
            int i7 = eVarA.f12548q;
            for (int i8 = 0; i8 < i7; i8++) {
                Y y6 = ((K) objArr[i8]).f5822U.f5870q;
                AbstractC1209k.c(y6);
                y6.f0(true);
            }
        }
    }

    public final void g0() {
        V v3 = this.f5907E;
        P p7 = this.f5915t;
        if (p7.f5858c) {
            this.f5907E = V.f5895p;
        } else {
            this.f5907E = V.f5894o;
        }
        V v7 = V.f5894o;
        K k7 = p7.f5856a;
        if (v3 != v7 && p7.f5860e) {
            K.T(k7, true, 6);
        }
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k8 = (K) objArr[i8];
            Y y6 = k8.f5822U.f5870q;
            if (y6 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (y6.f5918w != Integer.MAX_VALUE) {
                y6.g0();
                K.W(k8);
            }
        }
    }

    @Override // O0.m0, O0.Y
    public final Object i() {
        return this.f5913K;
    }

    public final void j0() {
        P p7 = this.f5915t;
        if (p7.f5868o > 0) {
            h0.e eVarA = p7.f5856a.A();
            Object[] objArr = eVarA.f12546o;
            int i7 = eVarA.f12548q;
            for (int i8 = 0; i8 < i7; i8++) {
                K k7 = (K) objArr[i8];
                P p8 = k7.f5822U;
                if ((p8.f5866m || p8.f5867n) && !p8.f5861f) {
                    k7.S(false);
                }
                Y y6 = p8.f5870q;
                if (y6 != null) {
                    y6.j0();
                }
            }
        }
    }

    @Override // Q0.InterfaceC0346e0
    public final void l(boolean z6) {
        U uH0;
        P p7 = this.f5915t;
        U uH02 = p7.a().H0();
        if (Boolean.valueOf(z6).equals(uH02 != null ? Boolean.valueOf(uH02.f5884w) : null) || (uH0 = p7.a().H0()) == null) {
            return;
        }
        uH0.f5884w = z6;
    }

    public final void l0() {
        P p7 = this.f5915t;
        K.T(p7.f5856a, false, 7);
        K k7 = p7.f5856a;
        K kV = k7.v();
        if (kV == null || k7.f5818Q != I.f5796q) {
            return;
        }
        int iOrdinal = kV.f5822U.f5859d.ordinal();
        k7.f5818Q = iOrdinal != 0 ? iOrdinal != 2 ? kV.f5818Q : I.f5795p : I.f5794o;
    }

    public final void m0() {
        P p7;
        G g6;
        this.f5914L = true;
        P p8 = this.f5915t;
        K kV = p8.f5856a.v();
        V v3 = this.f5907E;
        if ((v3 != V.f5894o && !p8.f5858c) || (v3 != V.f5895p && p8.f5858c)) {
            g0();
            if (this.f5916u && kV != null) {
                kV.S(false);
            }
        }
        if (kV == null) {
            this.f5918w = 0;
        } else if (!this.f5916u && ((g6 = (p7 = kV.f5822U).f5859d) == G.f5789q || g6 == G.f5790r)) {
            if (this.f5918w != Integer.MAX_VALUE) {
                N0.a.b("Place was called on a node which was placed already");
            }
            int i7 = p7.h;
            this.f5918w = i7;
            p7.h = i7 + 1;
        }
        r();
    }

    public final void n0(long j3, B0.d dVar, InterfaceC1182c interfaceC1182c) throws Throwable {
        P p7 = this.f5915t;
        K k7 = p7.f5856a;
        K k8 = p7.f5856a;
        try {
            K kV = k7.v();
            G g6 = kV != null ? kV.f5822U.f5859d : null;
            G g7 = G.f5790r;
            if (g6 == g7) {
                p7.f5858c = false;
            }
            if (k8.f5829e0) {
                N0.a.a("place is called on a deactivated node");
            }
            p7.f5859d = g7;
            this.f5920y = true;
            this.f5914L = false;
            if (!n1.k.b(j3, this.f5904B)) {
                if (p7.f5867n || p7.f5866m) {
                    p7.f5861f = true;
                }
                j0();
            }
            s0 s0VarA = O.a(k8);
            if (p7.f5861f || !u()) {
                p7.h(false);
                this.f5908F.f5846e = false;
                u0 snapshotObserver = ((C0415x) s0VarA).getSnapshotObserver();
                X x6 = new X(this, s0VarA, j3);
                snapshotObserver.getClass();
                if (k8.f5837v != null) {
                    snapshotObserver.a(k8, snapshotObserver.f6081g, x6);
                } else {
                    snapshotObserver.a(k8, snapshotObserver.f6080f, x6);
                }
            } else {
                U uH0 = p7.a().H0();
                AbstractC1209k.c(uH0);
                uH0.B0(n1.k.d(j3, uH0.f5420s));
                m0();
            }
            this.f5904B = j3;
            this.f5905C = interfaceC1182c;
            this.f5906D = dVar;
            p7.f5859d = G.f5791s;
        } catch (Throwable th) {
            k7.Y(th);
            throw null;
        }
    }

    @Override // Q0.InterfaceC0337a
    public final C0365v o() {
        return this.f5915t.f5856a.f5821T.f6002c;
    }

    public final boolean o0(long j3) throws Throwable {
        long j7;
        P p7 = this.f5915t;
        K k7 = p7.f5856a;
        K k8 = p7.f5856a;
        try {
            if (k7.f5829e0) {
                N0.a.a("measure is called on a deactivated node");
            }
            K kV = k8.v();
            k8.f5820S = k8.f5820S || (kV != null && kV.f5820S);
            if (!k8.f5822U.f5860e) {
                n1.a aVar = this.f5903A;
                if (aVar == null ? false : n1.a.b(aVar.f14505a, j3)) {
                    C0415x c0415x = k8.f5803B;
                    if (c0415x != null) {
                        c0415x.p(k8, true);
                    }
                    k8.X();
                    return false;
                }
            }
            this.f5903A = new n1.a(j3);
            d0(j3);
            this.f5908F.f5845d = false;
            h0.e eVarA = k8.A();
            Object[] objArr = eVarA.f12546o;
            int i7 = eVarA.f12548q;
            for (int i8 = 0; i8 < i7; i8++) {
                Y y6 = ((K) objArr[i8]).f5822U.f5870q;
                AbstractC1209k.c(y6);
                y6.f5908F.getClass();
            }
            if (this.f5921z) {
                j7 = this.f5418q;
            } else {
                long j8 = Integer.MIN_VALUE;
                j7 = (j8 & 4294967295L) | (j8 << 32);
            }
            this.f5921z = true;
            U uH0 = p7.a().H0();
            if (!(uH0 != null)) {
                N0.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            p7.c(j3);
            c0((((long) uH0.f5417p) & 4294967295L) | (((long) uH0.f5416o) << 32));
            return (((int) (j7 >> 32)) == uH0.f5416o && ((int) (j7 & 4294967295L)) == uH0.f5417p) ? false : true;
        } catch (Throwable th) {
            k7.Y(th);
            throw null;
        }
    }

    @Override // Q0.InterfaceC0337a
    public final InterfaceC0337a q() {
        P p7;
        K kV = this.f5915t.f5856a.v();
        if (kV == null || (p7 = kV.f5822U) == null) {
            return null;
        }
        return p7.f5870q;
    }

    @Override // Q0.InterfaceC0337a
    public final void r() {
        this.f5911I = true;
        L l = this.f5908F;
        l.h();
        P p7 = this.f5915t;
        boolean z6 = p7.f5861f;
        K k7 = p7.f5856a;
        if (z6) {
            h0.e eVarA = k7.A();
            Object[] objArr = eVarA.f12546o;
            int i7 = eVarA.f12548q;
            for (int i8 = 0; i8 < i7; i8++) {
                K k8 = (K) objArr[i8];
                if (k8.f5822U.f5860e && k8.t() == I.f5794o) {
                    P p8 = k8.f5822U;
                    Y y6 = p8.f5870q;
                    AbstractC1209k.c(y6);
                    Y y7 = p8.f5870q;
                    n1.a aVar = y7 != null ? y7.f5903A : null;
                    AbstractC1209k.c(aVar);
                    if (y6.o0(aVar.f14505a)) {
                        K.T(k7, false, 7);
                    }
                }
            }
        }
        C0364u c0364u = o().f6084g0;
        AbstractC1209k.c(c0364u);
        if (p7.f5862g || (!c0364u.f5886y && p7.f5861f)) {
            p7.f5861f = false;
            G g6 = p7.f5859d;
            p7.f5859d = G.f5790r;
            s0 s0VarA = O.a(k7);
            p7.i(false);
            u0 snapshotObserver = ((C0415x) s0VarA).getSnapshotObserver();
            C0236d c0236d = new C0236d(this, 2, c0364u);
            snapshotObserver.getClass();
            if (k7.f5837v != null) {
                snapshotObserver.a(k7, snapshotObserver.h, c0236d);
            } else {
                snapshotObserver.a(k7, snapshotObserver.f6079e, c0236d);
            }
            p7.f5859d = g6;
            if (p7.f5866m && c0364u.f5886y) {
                requestLayout();
            }
            p7.f5862g = false;
        }
        if (l.f5843b && l.e()) {
            l.g();
        }
        this.f5911I = false;
    }

    @Override // Q0.InterfaceC0337a
    public final void requestLayout() {
        this.f5915t.f5856a.S(false);
    }

    @Override // Q0.InterfaceC0337a
    public final boolean u() {
        return this.f5907E != V.f5896q;
    }
}
