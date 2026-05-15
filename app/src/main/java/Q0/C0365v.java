package Q0;

import O0.C0322t;
import R0.C0415x;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import y0.AbstractC1959I;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: renamed from: Q0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0365v extends j0 {

    /* JADX INFO: renamed from: h0 */
    public static final w2.l f6082h0;

    /* JADX INFO: renamed from: f0 */
    public final C0 f6083f0;

    /* JADX INFO: renamed from: g0 */
    public C0364u f6084g0;

    static {
        w2.l lVarG = AbstractC1959I.g();
        lVarG.h(C1987t.f20260g);
        lVarG.n(1.0f);
        lVarG.o(1);
        f6082h0 = lVarG;
    }

    public C0365v(K k7) {
        super(k7);
        C0 c02 = new C0();
        c02.f15640r = 0;
        this.f6083f0 = c02;
        c02.f15644v = this;
        this.f6084g0 = k7.f5837v != null ? new C0364u(this) : null;
    }

    @Override // Q0.j0
    public final void E0() {
        if (this.f6084g0 == null) {
            this.f6084g0 = new C0364u(this);
        }
    }

    @Override // Q0.j0
    public final U H0() {
        return this.f6084g0;
    }

    @Override // Q0.j0
    public final AbstractC1397o J0() {
        return this.f6083f0;
    }

    @Override // O0.Y
    public final int M(int i7) {
        V.o oVarU = this.f6024C.u();
        O0.Z zS = oVarU.s();
        K k7 = (K) oVarU.f7342p;
        return zS.b(k7.f5821T.f6003d, k7.n(), i7);
    }

    @Override // O0.Y
    public final int P(int i7) {
        V.o oVarU = this.f6024C.u();
        O0.Z zS = oVarU.s();
        K k7 = (K) oVarU.f7342p;
        return zS.d(k7.f5821T.f6003d, k7.n(), i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r6v10, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // Q0.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P0(Q0.C0343d r19, long r20, Q0.C0363t r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0365v.P0(Q0.d, long, Q0.t, int, boolean):void");
    }

    @Override // O0.Y
    public final int Q(int i7) {
        V.o oVarU = this.f6024C.u();
        O0.Z zS = oVarU.s();
        K k7 = (K) oVarU.f7342p;
        return zS.a(k7.f5821T.f6003d, k7.n(), i7);
    }

    @Override // Q0.j0
    public final void X0(InterfaceC1985r interfaceC1985r, B0.d dVar) throws Throwable {
        K k7 = this.f6024C;
        s0 s0VarA = O.a(k7);
        h0.e eVarZ = k7.z();
        Object[] objArr = eVarZ.f12546o;
        int i7 = eVarZ.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k8 = (K) objArr[i8];
            if (k8.J()) {
                k8.j(interfaceC1985r, dVar);
            }
        }
        if (((C0415x) s0VarA).getShowLayoutBounds()) {
            long j3 = this.f5418q;
            interfaceC1985r.t(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, f6082h0);
        }
    }

    @Override // Q0.j0, O0.m0
    public final void Z(long j3, float f7, B0.d dVar) throws Throwable {
        C0365v c0365v;
        if (this.f6025D) {
            U uH0 = H0();
            AbstractC1209k.c(uH0);
            c0365v = this;
            c0365v.Y0(uH0.f5889D, f7, null, dVar);
        } else {
            Y0(j3, f7, null, dVar);
            c0365v = this;
        }
        if (c0365v.f5885x) {
            return;
        }
        c0365v.f6024C.f5822U.f5869p.n0();
    }

    @Override // O0.m0
    public final void a0(long j3, float f7, InterfaceC1182c interfaceC1182c) throws Throwable {
        if (this.f6025D) {
            U uH0 = H0();
            AbstractC1209k.c(uH0);
            Y0(uH0.f5889D, f7, interfaceC1182c, null);
        } else {
            Y0(j3, f7, interfaceC1182c, null);
        }
        if (this.f5885x) {
            return;
        }
        this.f6024C.f5822U.f5869p.n0();
    }

    @Override // O0.Y
    public final O0.m0 d(long j3) {
        if (this.f6026E) {
            C0364u c0364u = this.f6084g0;
            AbstractC1209k.c(c0364u);
            j3 = c0364u.f5419r;
        }
        d0(j3);
        K k7 = this.f6024C;
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            ((K) objArr[i8]).f5822U.f5869p.f5971z = I.f5796q;
        }
        b1(k7.f5812K.g(this, k7.n(), j3));
        U0();
        return this;
    }

    @Override // O0.Y
    public final int e(int i7) {
        V.o oVarU = this.f6024C.u();
        O0.Z zS = oVarU.s();
        K k7 = (K) oVarU.f7342p;
        return zS.f(k7.f5821T.f6003d, k7.n(), i7);
    }

    @Override // Q0.T
    public final int g0(C0322t c0322t) throws Throwable {
        C0364u c0364u = this.f6084g0;
        if (c0364u != null) {
            return c0364u.g0(c0322t);
        }
        C0342c0 c0342c0 = this.f6024C.f5822U.f5869p;
        G g6 = c0342c0.f5965t.f5859d;
        G g7 = G.f5787o;
        L l = c0342c0.f5951L;
        if (g6 == g7) {
            l.f5845d = true;
            if (l.f5843b) {
                c0342c0.f5949J = true;
                c0342c0.f5950K = true;
            }
        } else {
            l.f5846e = true;
        }
        c0342c0.o().f5886y = true;
        c0342c0.r();
        c0342c0.o().f5886y = false;
        Integer num = (Integer) l.f5848g.get(c0322t);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
