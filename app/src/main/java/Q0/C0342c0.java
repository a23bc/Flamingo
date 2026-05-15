package Q0;

import R0.C0415x;
import h0.C0994b;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: renamed from: Q0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0342c0 extends O0.m0 implements O0.Y, InterfaceC0337a, InterfaceC0346e0 {

    /* JADX INFO: renamed from: B */
    public InterfaceC1182c f5941B;

    /* JADX INFO: renamed from: C */
    public B0.d f5942C;

    /* JADX INFO: renamed from: D */
    public float f5943D;

    /* JADX INFO: renamed from: F */
    public Object f5945F;

    /* JADX INFO: renamed from: G */
    public boolean f5946G;

    /* JADX INFO: renamed from: H */
    public boolean f5947H;

    /* JADX INFO: renamed from: I */
    public boolean f5948I;

    /* JADX INFO: renamed from: J */
    public boolean f5949J;

    /* JADX INFO: renamed from: K */
    public boolean f5950K;

    /* JADX INFO: renamed from: O */
    public boolean f5954O;

    /* JADX INFO: renamed from: S */
    public float f5958S;

    /* JADX INFO: renamed from: T */
    public boolean f5959T;

    /* JADX INFO: renamed from: U */
    public InterfaceC1182c f5960U;

    /* JADX INFO: renamed from: V */
    public B0.d f5961V;

    /* JADX INFO: renamed from: X */
    public float f5963X;
    public boolean Z;

    /* JADX INFO: renamed from: t */
    public final P f5965t;

    /* JADX INFO: renamed from: u */
    public boolean f5966u;

    /* JADX INFO: renamed from: x */
    public boolean f5969x;

    /* JADX INFO: renamed from: y */
    public boolean f5970y;

    /* JADX INFO: renamed from: v */
    public int f5967v = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: w */
    public int f5968w = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: z */
    public I f5971z = I.f5796q;

    /* JADX INFO: renamed from: A */
    public long f5940A = 0;

    /* JADX INFO: renamed from: E */
    public boolean f5944E = true;

    /* JADX INFO: renamed from: L */
    public final L f5951L = new L(this, 0);

    /* JADX INFO: renamed from: M */
    public final h0.e f5952M = new h0.e(new C0342c0[16]);

    /* JADX INFO: renamed from: N */
    public boolean f5953N = true;

    /* JADX INFO: renamed from: P */
    public long f5955P = n1.b.b(0, 0, 15);

    /* JADX INFO: renamed from: Q */
    public final C0340b0 f5956Q = new C0340b0(this, 1);

    /* JADX INFO: renamed from: R */
    public final C0340b0 f5957R = new C0340b0(this, 0);

    /* JADX INFO: renamed from: W */
    public long f5962W = 0;

    /* JADX INFO: renamed from: Y */
    public final C0340b0 f5964Y = new C0340b0(this, 2);

    public C0342c0(P p7) {
        this.f5965t = p7;
    }

    @Override // Q0.InterfaceC0337a
    public final void F(B0.b bVar) throws Exception {
        h0.e eVarA = this.f5965t.f5856a.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.b(((K) objArr[i8]).f5822U.f5869p);
        }
    }

    @Override // O0.Y
    public final int M(int i7) {
        P p7 = this.f5965t;
        if (!AbstractC0347f.s(p7.f5856a)) {
            m0();
            return p7.a().M(i7);
        }
        Y y6 = p7.f5870q;
        AbstractC1209k.c(y6);
        return y6.M(i7);
    }

    @Override // Q0.InterfaceC0337a
    public final void N() {
        K.V(this.f5965t.f5856a, false, 7);
    }

    @Override // O0.Y
    public final int P(int i7) {
        P p7 = this.f5965t;
        if (!AbstractC0347f.s(p7.f5856a)) {
            m0();
            return p7.a().P(i7);
        }
        Y y6 = p7.f5870q;
        AbstractC1209k.c(y6);
        return y6.P(i7);
    }

    @Override // O0.Y
    public final int Q(int i7) {
        P p7 = this.f5965t;
        if (!AbstractC0347f.s(p7.f5856a)) {
            m0();
            return p7.a().Q(i7);
        }
        Y y6 = p7.f5870q;
        AbstractC1209k.c(y6);
        return y6.Q(i7);
    }

    @Override // O0.m0
    public final int S() {
        return this.f5965t.a().S();
    }

    @Override // O0.m0
    public final int T() {
        return this.f5965t.a().T();
    }

    @Override // O0.m0
    public final void Z(long j3, float f7, B0.d dVar) throws Throwable {
        q0(j3, f7, null, dVar);
    }

    @Override // Q0.InterfaceC0337a
    public final L a() {
        return this.f5951L;
    }

    @Override // O0.m0
    public final void a0(long j3, float f7, InterfaceC1182c interfaceC1182c) throws Throwable {
        q0(j3, f7, interfaceC1182c, null);
    }

    @Override // O0.Y
    public final O0.m0 d(long j3) throws Throwable {
        I i7;
        P p7 = this.f5965t;
        K k7 = p7.f5856a;
        I i8 = k7.f5818Q;
        I i9 = I.f5796q;
        if (i8 == i9) {
            k7.c();
        }
        if (AbstractC0347f.s(p7.f5856a)) {
            Y y6 = p7.f5870q;
            AbstractC1209k.c(y6);
            y6.f5919x = i9;
            y6.d(j3);
        }
        K k8 = p7.f5856a;
        K kV = k8.v();
        if (kV != null) {
            if (this.f5971z != i9 && !k8.f5820S) {
                N0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            P p8 = kV.f5822U;
            int iOrdinal = p8.f5859d.ordinal();
            if (iOrdinal == 0) {
                i7 = I.f5794o;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + p8.f5859d);
                }
                i7 = I.f5795p;
            }
            this.f5971z = i7;
        } else {
            this.f5971z = i9;
        }
        r0(j3);
        return this;
    }

    @Override // O0.Y
    public final int e(int i7) {
        P p7 = this.f5965t;
        if (!AbstractC0347f.s(p7.f5856a)) {
            m0();
            return p7.a().e(i7);
        }
        Y y6 = p7.f5870q;
        AbstractC1209k.c(y6);
        return y6.e(i7);
    }

    public final List f0() {
        P p7 = this.f5965t;
        p7.f5856a.f0();
        boolean z6 = this.f5953N;
        h0.e eVar = this.f5952M;
        if (!z6) {
            return eVar.g();
        }
        K k7 = p7.f5856a;
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k8 = (K) objArr[i8];
            if (eVar.f12548q <= i8) {
                eVar.b(k8.f5822U.f5869p);
            } else {
                C0342c0 c0342c0 = k8.f5822U.f5869p;
                Object[] objArr2 = eVar.f12546o;
                Object obj = objArr2[i8];
                objArr2[i8] = c0342c0;
            }
        }
        eVar.m(((h0.e) ((C0994b) k7.o()).f12538p).f12548q, eVar.f12548q);
        this.f5953N = false;
        return eVar.g();
    }

    public final void g0() {
        boolean z6 = this.f5946G;
        this.f5946G = true;
        K k7 = this.f5965t.f5856a;
        if (!z6) {
            k7.f5821T.f6002c.V0();
            if (k7.r()) {
                K.V(k7, true, 6);
            } else if (k7.f5822U.f5860e) {
                K.T(k7, true, 6);
            }
        }
        C0352h0 c0352h0 = k7.f5821T;
        j0 j0Var = c0352h0.f6002c.f6027F;
        for (j0 j0Var2 = c0352h0.f6003d; !AbstractC1209k.a(j0Var2, j0Var) && j0Var2 != null; j0Var2 = j0Var2.f6027F) {
            if (j0Var2.f6045X) {
                j0Var2.Q0();
            }
        }
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k8 = (K) objArr[i8];
            if (k8.x() != Integer.MAX_VALUE) {
                k8.f5822U.f5869p.g0();
                K.W(k8);
            }
        }
    }

    @Override // O0.m0, O0.Y
    public final Object i() {
        return this.f5945F;
    }

    public final void j0() {
        if (this.f5946G) {
            this.f5946G = false;
            P p7 = this.f5965t;
            C0352h0 c0352h0 = p7.f5856a.f5821T;
            j0 j0Var = c0352h0.f6002c.f6027F;
            for (j0 j0Var2 = c0352h0.f6003d; !AbstractC1209k.a(j0Var2, j0Var) && j0Var2 != null; j0Var2 = j0Var2.f6027F) {
                AbstractC1397o abstractC1397oL0 = j0Var2.L0(k0.g(1048576));
                if (abstractC1397oL0 != null && (abstractC1397oL0.f15637o.f15640r & 1048576) != 0) {
                    boolean zG = k0.g(1048576);
                    AbstractC1397o abstractC1397oJ0 = j0Var2.J0();
                    if (zG || (abstractC1397oJ0 = abstractC1397oJ0.f15641s) != null) {
                        for (AbstractC1397o abstractC1397oL02 = j0Var2.L0(zG); abstractC1397oL02 != null && (abstractC1397oL02.f15640r & 1048576) != 0; abstractC1397oL02 = abstractC1397oL02.f15642t) {
                            if ((abstractC1397oL02.f15639q & 1048576) != 0) {
                                AbstractC1397o abstractC1397oF = abstractC1397oL02;
                                h0.e eVar = null;
                                while (abstractC1397oF != null) {
                                    if ((abstractC1397oF.f15639q & 1048576) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                        int i7 = 0;
                                        for (AbstractC1397o abstractC1397o = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
                                            if ((abstractC1397o.f15639q & 1048576) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    abstractC1397oF = abstractC1397o;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new h0.e(new AbstractC1397o[16]);
                                                    }
                                                    if (abstractC1397oF != null) {
                                                        eVar.b(abstractC1397oF);
                                                        abstractC1397oF = null;
                                                    }
                                                    eVar.b(abstractC1397o);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    abstractC1397oF = AbstractC0347f.f(eVar);
                                }
                            }
                            if (abstractC1397oL02 != abstractC1397oJ0) {
                            }
                        }
                    }
                }
                j0Var2.a1();
            }
            h0.e eVarA = p7.f5856a.A();
            Object[] objArr = eVarA.f12546o;
            int i8 = eVarA.f12548q;
            for (int i9 = 0; i9 < i8; i9++) {
                ((K) objArr[i9]).f5822U.f5869p.j0();
            }
        }
    }

    @Override // Q0.InterfaceC0346e0
    public final void l(boolean z6) {
        P p7 = this.f5965t;
        if (z6 != p7.a().f5884w) {
            p7.a().f5884w = z6;
            this.Z = true;
        }
    }

    public final void l0() {
        P p7 = this.f5965t;
        if (p7.l > 0) {
            h0.e eVarA = p7.f5856a.A();
            Object[] objArr = eVarA.f12546o;
            int i7 = eVarA.f12548q;
            for (int i8 = 0; i8 < i7; i8++) {
                K k7 = (K) objArr[i8];
                P p8 = k7.f5822U;
                boolean z6 = p8.f5864j;
                C0342c0 c0342c0 = p8.f5869p;
                if ((z6 || p8.f5865k) && !c0342c0.f5949J) {
                    k7.U(false);
                }
                c0342c0.l0();
            }
        }
    }

    public final void m0() {
        P p7 = this.f5965t;
        K.V(p7.f5856a, false, 7);
        K k7 = p7.f5856a;
        K kV = k7.v();
        if (kV == null || k7.f5818Q != I.f5796q) {
            return;
        }
        int iOrdinal = kV.f5822U.f5859d.ordinal();
        k7.f5818Q = iOrdinal != 0 ? iOrdinal != 2 ? kV.f5818Q : I.f5795p : I.f5794o;
    }

    public final void n0() throws Throwable {
        this.f5959T = true;
        P p7 = this.f5965t;
        K kV = p7.f5856a.v();
        float f7 = o().f6038Q;
        K k7 = p7.f5856a;
        C0352h0 c0352h0 = k7.f5821T;
        j0 j0Var = c0352h0.f6003d;
        while (j0Var != c0352h0.f6002c) {
            AbstractC1209k.d(j0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            D d4 = (D) j0Var;
            f7 += d4.f6038Q;
            j0Var = d4.f6027F;
        }
        if (f7 != this.f5958S) {
            this.f5958S = f7;
            if (kV != null) {
                kV.O();
            }
            if (kV != null) {
                kV.D();
            }
        }
        if (this.f5946G) {
            k7.f5821T.f6002c.V0();
        } else {
            if (kV != null) {
                kV.D();
            }
            g0();
            if (this.f5966u && kV != null) {
                kV.U(false);
            }
        }
        if (kV == null) {
            this.f5968w = 0;
        } else if (!this.f5966u) {
            P p8 = kV.f5822U;
            if (p8.f5859d == G.f5789q) {
                if (this.f5968w != Integer.MAX_VALUE) {
                    N0.a.b("Place was called on a node which was placed already");
                }
                int i7 = p8.f5863i;
                this.f5968w = i7;
                p8.f5863i = i7 + 1;
            }
        }
        r();
    }

    @Override // Q0.InterfaceC0337a
    public final C0365v o() {
        return this.f5965t.f5856a.f5821T.f6002c;
    }

    public final void o0(long j3) {
        P p7 = this.f5965t;
        G g6 = p7.f5859d;
        G g7 = G.f5791s;
        if (g6 != g7) {
            N0.a.b("layout state is not idle before measure starts");
        }
        this.f5955P = j3;
        G g8 = G.f5787o;
        p7.f5859d = g8;
        this.f5948I = false;
        K k7 = p7.f5856a;
        u0 snapshotObserver = ((C0415x) O.a(k7)).getSnapshotObserver();
        snapshotObserver.a(k7, snapshotObserver.f6077c, this.f5956Q);
        if (p7.f5859d == g8) {
            this.f5949J = true;
            this.f5950K = true;
            p7.f5859d = g7;
        }
    }

    public final void p0(long j3, float f7, InterfaceC1182c interfaceC1182c, B0.d dVar) throws Throwable {
        P p7 = this.f5965t;
        if (p7.f5856a.f5829e0) {
            N0.a.a("place is called on a deactivated node");
        }
        p7.f5859d = G.f5789q;
        this.f5940A = j3;
        this.f5943D = f7;
        this.f5941B = interfaceC1182c;
        this.f5942C = dVar;
        this.f5959T = false;
        K k7 = p7.f5856a;
        s0 s0VarA = O.a(k7);
        if (this.f5949J || !this.f5946G) {
            this.f5951L.f5846e = false;
            p7.f(false);
            this.f5960U = interfaceC1182c;
            this.f5962W = j3;
            this.f5963X = f7;
            this.f5961V = dVar;
            u0 snapshotObserver = ((C0415x) s0VarA).getSnapshotObserver();
            snapshotObserver.a(k7, snapshotObserver.f6080f, this.f5964Y);
        } else {
            j0 j0VarA = p7.a();
            j0VarA.Y0(n1.k.d(j3, j0VarA.f5420s), f7, interfaceC1182c, dVar);
            n0();
        }
        p7.f5859d = G.f5791s;
        this.f5970y = true;
    }

    @Override // Q0.InterfaceC0337a
    public final InterfaceC0337a q() {
        P p7;
        K kV = this.f5965t.f5856a.v();
        if (kV == null || (p7 = kV.f5822U) == null) {
            return null;
        }
        return p7.f5869p;
    }

    public final void q0(long j3, float f7, InterfaceC1182c interfaceC1182c, B0.d dVar) throws Throwable {
        boolean z6;
        O0.l0 placementScope;
        P p7 = this.f5965t;
        K k7 = p7.f5856a;
        boolean z7 = true;
        try {
            this.f5947H = true;
            if (!n1.k.b(j3, this.f5940A) || this.Z) {
                if (p7.f5865k || p7.f5864j || this.Z) {
                    this.f5949J = true;
                    this.Z = false;
                }
                l0();
            }
            Y y6 = p7.f5870q;
            if (y6 != null) {
                P p8 = y6.f5915t;
                if (AbstractC0347f.s(p8.f5856a)) {
                    z6 = true;
                } else {
                    if (y6.f5907E == V.f5896q && !p8.f5857b) {
                        p8.f5858c = true;
                    }
                    z6 = p8.f5858c;
                }
                if (z6) {
                    j0 j0Var = p7.a().f6028G;
                    K k8 = p7.f5856a;
                    if (j0Var == null || (placementScope = j0Var.f5887z) == null) {
                        placementScope = ((C0415x) O.a(k8)).getPlacementScope();
                    }
                    Y y7 = p7.f5870q;
                    AbstractC1209k.c(y7);
                    K kV = k8.v();
                    if (kV != null) {
                        kV.f5822U.h = 0;
                    }
                    y7.f5918w = Integer.MAX_VALUE;
                    O0.l0.h(placementScope, y7, (int) (j3 >> 32), (int) (4294967295L & j3));
                }
            }
            Y y8 = p7.f5870q;
            if (y8 == null || y8.f5920y) {
                z7 = false;
            }
            if (z7) {
                N0.a.b("Error: Placement happened before lookahead.");
            }
            p0(j3, f7, interfaceC1182c, dVar);
        } catch (Throwable th) {
            k7.Y(th);
            throw null;
        }
    }

    @Override // Q0.InterfaceC0337a
    public final void r() throws Throwable {
        boolean zR0;
        this.f5954O = true;
        L l = this.f5951L;
        l.h();
        boolean z6 = this.f5949J;
        P p7 = this.f5965t;
        if (z6) {
            h0.e eVarA = p7.f5856a.A();
            Object[] objArr = eVarA.f12546o;
            int i7 = eVarA.f12548q;
            for (int i8 = 0; i8 < i7; i8++) {
                K k7 = (K) objArr[i8];
                if (k7.r() && k7.s() == I.f5794o) {
                    P p8 = k7.f5822U;
                    C0342c0 c0342c0 = p8.f5869p;
                    n1.a aVar = c0342c0.f5969x ? new n1.a(c0342c0.f5419r) : null;
                    if (aVar != null) {
                        if (k7.f5818Q == I.f5796q) {
                            k7.c();
                        }
                        zR0 = p8.f5869p.r0(aVar.f14505a);
                    } else {
                        zR0 = false;
                    }
                    if (zR0) {
                        K.V(p7.f5856a, false, 7);
                    }
                }
            }
        }
        if (this.f5950K || (!o().f5886y && this.f5949J)) {
            this.f5949J = false;
            G g6 = p7.f5859d;
            p7.f5859d = G.f5789q;
            p7.g(false);
            K k8 = p7.f5856a;
            u0 snapshotObserver = ((C0415x) O.a(k8)).getSnapshotObserver();
            snapshotObserver.a(k8, snapshotObserver.f6079e, this.f5957R);
            p7.f5859d = g6;
            if (o().f5886y && p7.f5864j) {
                requestLayout();
            }
            this.f5950K = false;
        }
        if (l.f5843b && l.e()) {
            l.g();
        }
        this.f5954O = false;
    }

    public final boolean r0(long j3) throws Throwable {
        P p7 = this.f5965t;
        K k7 = p7.f5856a;
        K k8 = p7.f5856a;
        try {
            if (k7.f5829e0) {
                N0.a.a("measure is called on a deactivated node");
            }
            s0 s0VarA = O.a(k8);
            K kV = k8.v();
            boolean z6 = true;
            k8.f5820S = k8.f5820S || (kV != null && kV.f5820S);
            if (!k8.r() && n1.a.b(this.f5419r, j3)) {
                ((C0415x) s0VarA).p(k8, false);
                k8.X();
                return false;
            }
            this.f5951L.f5845d = false;
            h0.e eVarA = k8.A();
            Object[] objArr = eVarA.f12546o;
            int i7 = eVarA.f12548q;
            for (int i8 = 0; i8 < i7; i8++) {
                ((K) objArr[i8]).f5822U.f5869p.f5951L.getClass();
            }
            this.f5969x = true;
            long j7 = p7.a().f5418q;
            d0(j3);
            o0(j3);
            if (n1.m.b(p7.a().f5418q, j7) && p7.a().f5416o == this.f5416o && p7.a().f5417p == this.f5417p) {
                z6 = false;
            }
            c0((((long) p7.a().f5417p) & 4294967295L) | (((long) p7.a().f5416o) << 32));
            return z6;
        } catch (Throwable th) {
            k7.Y(th);
            throw null;
        }
    }

    @Override // Q0.InterfaceC0337a
    public final void requestLayout() {
        this.f5965t.f5856a.U(false);
    }

    @Override // Q0.InterfaceC0337a
    public final boolean u() {
        return this.f5946G;
    }
}
