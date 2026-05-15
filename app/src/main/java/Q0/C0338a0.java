package Q0;

import L2.C0247a;
import R0.C0411v;
import R0.C0415x;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import y0.C1960J;

/* JADX INFO: renamed from: Q0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0338a0 {

    /* JADX INFO: renamed from: a */
    public final K f5925a;

    /* JADX INFO: renamed from: c */
    public boolean f5927c;

    /* JADX INFO: renamed from: d */
    public boolean f5928d;

    /* JADX INFO: renamed from: i */
    public n1.a f5932i;

    /* JADX INFO: renamed from: b */
    public final A0.b f5926b = new A0.b(10);

    /* JADX INFO: renamed from: e */
    public final V.o f5929e = new V.o(26, (byte) 0);

    /* JADX INFO: renamed from: f */
    public final h0.e f5930f = new h0.e(new K[16]);

    /* JADX INFO: renamed from: g */
    public final long f5931g = 1;
    public final h0.e h = new h0.e(new Z[16]);

    public C0338a0(K k7) {
        this.f5925a = k7;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(Q0.K r5, n1.a r6) throws java.lang.Throwable {
        /*
            Q0.K r0 = r5.f5837v
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Q0.P r2 = r5.f5822U
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            Q0.Y r0 = r2.f5870q
            m5.AbstractC1209k.c(r0)
            long r2 = r6.f14505a
            boolean r6 = r0.o0(r2)
            goto L2f
        L18:
            r6 = r1
            goto L2f
        L1a:
            Q0.Y r6 = r2.f5870q
            if (r6 == 0) goto L21
            n1.a r2 = r6.f5903A
            goto L22
        L21:
            r2 = 0
        L22:
            if (r2 == 0) goto L18
            if (r0 == 0) goto L18
            m5.AbstractC1209k.c(r6)
            long r2 = r2.f14505a
            boolean r6 = r6.o0(r2)
        L2f:
            Q0.K r0 = r5.v()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            Q0.K r2 = r0.f5837v
            r3 = 3
            if (r2 != 0) goto L40
            Q0.K.V(r0, r1, r3)
            return r6
        L40:
            Q0.I r2 = r5.t()
            Q0.I r4 = Q0.I.f5794o
            if (r2 != r4) goto L4c
            Q0.K.T(r0, r1, r3)
            return r6
        L4c:
            Q0.I r5 = r5.t()
            Q0.I r2 = Q0.I.f5795p
            if (r5 != r2) goto L57
            r0.S(r1)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0338a0.c(Q0.K, n1.a):boolean");
    }

    public static boolean d(K k7, n1.a aVar) throws Throwable {
        boolean zR0;
        if (aVar != null) {
            if (k7.f5818Q == I.f5796q) {
                k7.c();
            }
            zR0 = k7.f5822U.f5869p.r0(aVar.f14505a);
        } else {
            C0342c0 c0342c0 = k7.f5822U.f5869p;
            n1.a aVar2 = c0342c0.f5969x ? new n1.a(c0342c0.f5419r) : null;
            if (aVar2 != null) {
                if (k7.f5818Q == I.f5796q) {
                    k7.c();
                }
                zR0 = k7.f5822U.f5869p.r0(aVar2.f14505a);
            } else {
                k7.getClass();
                zR0 = false;
            }
        }
        K kV = k7.v();
        if (zR0 && kV != null) {
            if (k7.s() == I.f5794o) {
                K.V(kV, false, 3);
                return zR0;
            }
            if (k7.s() == I.f5795p) {
                kV.U(false);
            }
        }
        return zR0;
    }

    public static boolean i(K k7) {
        Y y6;
        L l;
        if (k7.f5822U.f5860e) {
            return (k7.t() == I.f5796q && ((y6 = k7.f5822U.f5870q) == null || (l = y6.f5908F) == null || !l.e())) ? false : true;
        }
        return false;
    }

    public static boolean j(K k7) {
        if (!k7.r()) {
            return false;
        }
        do {
            if (k7.s() == I.f5796q && !k7.f5822U.f5869p.f5951L.e()) {
                K kV = k7.v();
                if ((kV != null ? kV.f5822U.f5859d : null) != G.f5787o) {
                    return false;
                }
            }
            k7 = k7.v();
            if (k7 == null) {
                return false;
            }
        } while (!k7.J());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v5 */
    public final void a() {
        AbstractC1397o abstractC1397o;
        h0.e eVar = this.f5930f;
        Object[] objArr = eVar.f12546o;
        int i7 = eVar.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            C0352h0 c0352h0 = ((K) objArr[i8]).f5821T;
            C0365v c0365v = c0352h0.f6002c;
            boolean zG = k0.g(128);
            if (zG) {
                abstractC1397o = c0365v.f6083f0;
            } else {
                abstractC1397o = c0365v.f6083f0.f15641s;
                if (abstractC1397o == null) {
                }
            }
            C1960J c1960j = j0.a0;
            for (AbstractC1397o abstractC1397oL0 = c0365v.L0(zG); abstractC1397oL0 != null && (abstractC1397oL0.f15640r & 128) != 0; abstractC1397oL0 = abstractC1397oL0.f15642t) {
                if ((abstractC1397oL0.f15639q & 128) != 0) {
                    ?? F6 = abstractC1397oL0;
                    ?? eVar2 = 0;
                    while (F6 != 0) {
                        if (F6 instanceof InterfaceC0369z) {
                            ((InterfaceC0369z) F6).Q(c0352h0.f6002c);
                        } else if ((F6.f15639q & 128) != 0 && (F6 instanceof AbstractC0358n)) {
                            AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F6).f6056D;
                            int i9 = 0;
                            F6 = F6;
                            eVar2 = eVar2;
                            while (abstractC1397o2 != null) {
                                if ((abstractC1397o2.f15639q & 128) != 0) {
                                    i9++;
                                    eVar2 = eVar2;
                                    if (i9 == 1) {
                                        F6 = abstractC1397o2;
                                    } else {
                                        if (eVar2 == 0) {
                                            eVar2 = new h0.e(new AbstractC1397o[16]);
                                        }
                                        if (F6 != 0) {
                                            eVar2.b(F6);
                                            F6 = 0;
                                        }
                                        eVar2.b(abstractC1397o2);
                                    }
                                }
                                abstractC1397o2 = abstractC1397o2.f15642t;
                                F6 = F6;
                                eVar2 = eVar2;
                            }
                            if (i9 == 1) {
                            }
                        }
                        F6 = AbstractC0347f.f(eVar2);
                    }
                }
                if (abstractC1397oL0 != abstractC1397o) {
                }
            }
        }
        eVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            V.o r1 = r7.f5929e
            if (r8 == 0) goto L1a
            r1.getClass()
            Q0.K r8 = r7.f5925a
            int r2 = r8.f5828d0
            if (r2 <= 0) goto L1a
            java.lang.Object r2 = r1.f7342p
            h0.e r2 = (h0.e) r2
            r2.h()
            r2.b(r8)
            r8.f5827c0 = r0
        L1a:
            java.lang.Object r8 = r1.f7342p
            h0.e r8 = (h0.e) r8
            int r2 = r8.f12548q
            if (r2 == 0) goto L65
            Q0.p0 r3 = Q0.p0.f6062p
            java.lang.Object[] r4 = r8.f12546o
            r5 = 0
            Z4.l.o0(r4, r3, r5, r2)
            int r2 = r8.f12548q
            java.lang.Object r3 = r1.f7343q
            Q0.K[] r3 = (Q0.K[]) r3
            if (r3 == 0) goto L35
            int r4 = r3.length
            if (r4 >= r2) goto L3d
        L35:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            Q0.K[] r3 = new Q0.K[r3]
        L3d:
            r4 = 0
            r1.f7343q = r4
        L40:
            if (r5 >= r2) goto L4b
            java.lang.Object[] r6 = r8.f12546o
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L40
        L4b:
            r8.h()
            int r2 = r2 - r0
        L4f:
            r8 = -1
            if (r8 >= r2) goto L63
            r8 = r3[r2]
            m5.AbstractC1209k.c(r8)
            boolean r0 = r8.f5827c0
            if (r0 == 0) goto L5e
            V.o.l(r8)
        L5e:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4f
        L63:
            r1.f7343q = r3
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0338a0.b(boolean):void");
    }

    public final void e() {
        h0.e eVar = this.h;
        int i7 = eVar.f12548q;
        if (i7 != 0) {
            Object[] objArr = eVar.f12546o;
            for (int i8 = 0; i8 < i7; i8++) {
                Z z6 = (Z) objArr[i8];
                if (z6.f5922a.I()) {
                    boolean z7 = z6.f5923b;
                    boolean z8 = z6.f5924c;
                    K k7 = z6.f5922a;
                    if (z7) {
                        K.T(k7, z8, 2);
                    } else {
                        K.V(k7, z8, 2);
                    }
                }
            }
            eVar.h();
        }
    }

    public final void f(K k7) {
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k8 = (K) objArr[i8];
            if (AbstractC1209k.a(k8.K(), Boolean.TRUE) && !k8.f5829e0) {
                if (this.f5926b.M(k8)) {
                    k8.L();
                }
                f(k8);
            }
        }
    }

    public final void g(K k7, boolean z6) {
        if (!this.f5927c) {
            N0.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z6 ? k7.f5822U.f5860e : k7.r()) {
            N0.a.a("node not yet measured");
        }
        h(k7, z6);
    }

    public final void h(K k7, boolean z6) {
        Y y6;
        L l;
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k8 = (K) objArr[i8];
            if ((!z6 && (k8.s() == I.f5794o || k8.f5822U.f5869p.f5951L.e())) || (z6 && (k8.t() == I.f5794o || ((y6 = k8.f5822U.f5870q) != null && (l = y6.f5908F) != null && l.e())))) {
                boolean zS = AbstractC0347f.s(k8);
                P p7 = k8.f5822U;
                if (zS && !z6) {
                    if (p7.f5860e && this.f5926b.M(k8)) {
                        n(k8, true, false);
                    } else {
                        g(k8, true);
                    }
                }
                if (z6 ? p7.f5860e : k8.r()) {
                    n(k8, z6, false);
                }
                if (!(z6 ? p7.f5860e : k8.r())) {
                    h(k8, z6);
                }
            }
        }
        if (z6 ? k7.f5822U.f5860e : k7.r()) {
            n(k7, z6, false);
        }
    }

    public final boolean k(C0411v c0411v) {
        boolean z6;
        boolean z7;
        K k7;
        boolean z8;
        A0.b bVar = this.f5926b;
        K k8 = this.f5925a;
        if (!k8.I()) {
            N0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!k8.J()) {
            N0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5927c) {
            N0.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z9 = false;
        if (this.f5932i != null) {
            this.f5927c = true;
            this.f5928d = true;
            try {
                boolean zB0 = bVar.b0();
                C0247a c0247a = (C0247a) bVar.f50p;
                if (zB0) {
                    z6 = false;
                    while (true) {
                        C0247a c0247a2 = (C0247a) bVar.f52r;
                        C0247a c0247a3 = (C0247a) bVar.f51q;
                        if (!((B0) c0247a.f4105p).isEmpty()) {
                            k7 = (K) ((B0) c0247a.f4105p).first();
                            c0247a.p(k7);
                            z8 = k7.f5837v != null;
                            z7 = false;
                        } else if (!((B0) c0247a3.f4105p).isEmpty()) {
                            k7 = (K) ((B0) c0247a3.f4105p).first();
                            c0247a3.p(k7);
                            z8 = k7.f5837v != null;
                            z7 = true;
                        } else {
                            if (((B0) c0247a2.f4105p).isEmpty()) {
                                break;
                            }
                            K k9 = (K) ((B0) c0247a2.f4105p).first();
                            c0247a2.p(k9);
                            z7 = true;
                            k7 = k9;
                            z8 = false;
                        }
                        boolean zN = n(k7, z8, z7);
                        if (!z7) {
                            if (k7.f5822U.f5861f) {
                                bVar.K(k7, EnumC0367x.f6090p);
                            }
                            if (k7.q()) {
                                bVar.K(k7, EnumC0367x.f6092r);
                            }
                        }
                        if (k7 == k8 && zN) {
                            z6 = true;
                        }
                    }
                    if (c0411v != null) {
                        c0411v.a();
                    }
                } else {
                    z6 = false;
                }
                this.f5927c = false;
                this.f5928d = false;
                z9 = z6;
            } finally {
            }
        }
        a();
        return z9;
    }

    public final void l(K k7, long j3) {
        if (k7.f5829e0) {
            return;
        }
        K k8 = this.f5925a;
        if (k7.equals(k8)) {
            N0.a.a("measureAndLayout called on root");
        }
        if (!k8.I()) {
            N0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!k8.J()) {
            N0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5927c) {
            N0.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f5932i != null) {
            this.f5927c = true;
            this.f5928d = false;
            try {
                A0.b bVar = this.f5926b;
                ((C0247a) bVar.f50p).p(k7);
                ((C0247a) bVar.f51q).p(k7);
                ((C0247a) bVar.f52r).p(k7);
                boolean zC = c(k7, new n1.a(j3));
                P p7 = k7.f5822U;
                if ((zC || p7.f5861f) && AbstractC1209k.a(k7.K(), Boolean.TRUE)) {
                    k7.L();
                }
                f(k7);
                if (k7.f5818Q == I.f5796q) {
                    k7.c();
                }
                boolean zR0 = p7.f5869p.r0(j3);
                K kV = k7.v();
                if (zR0 && kV != null) {
                    if (k7.s() == I.f5794o) {
                        K.V(kV, false, 3);
                    } else if (k7.s() == I.f5795p) {
                        kV.U(false);
                    }
                }
                if (k7.q() && k7.J()) {
                    k7.R();
                    V.o oVar = this.f5929e;
                    oVar.getClass();
                    if (k7.f5828d0 > 0) {
                        ((h0.e) oVar.f7342p).b(k7);
                        k7.f5827c0 = true;
                    }
                }
                e();
            } finally {
            }
        }
        a();
    }

    public final void m() {
        A0.b bVar = this.f5926b;
        if (bVar.b0()) {
            K k7 = this.f5925a;
            if (!k7.I()) {
                N0.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!k7.J()) {
                N0.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f5927c) {
                N0.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f5932i != null) {
                this.f5927c = true;
                this.f5928d = false;
                try {
                    if (!((B0) ((C0247a) bVar.f52r).f4105p).isEmpty() && !((B0) ((C0247a) bVar.f50p).f4105p).isEmpty()) {
                        if (k7.f5837v != null) {
                            p(k7, true);
                        } else {
                            o(k7);
                        }
                    }
                    p(k7, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f5927c = false;
                        this.f5928d = false;
                    }
                }
            }
        }
    }

    public final boolean n(K k7, boolean z6, boolean z7) {
        n1.a aVar;
        boolean zC;
        O0.l0 placementScope;
        C0365v c0365v;
        K kV;
        Y y6;
        L l;
        if (!k7.f5829e0) {
            boolean zJ = k7.J();
            P p7 = k7.f5822U;
            if (zJ || p7.f5869p.f5947H || j(k7) || AbstractC1209k.a(k7.K(), Boolean.TRUE) || i(k7) || p7.f5869p.f5951L.e() || ((y6 = p7.f5870q) != null && (l = y6.f5908F) != null && l.e())) {
                K k8 = this.f5925a;
                if (k7 == k8) {
                    aVar = this.f5932i;
                    AbstractC1209k.c(aVar);
                } else {
                    aVar = null;
                }
                if (z6) {
                    zC = p7.f5860e ? c(k7, aVar) : false;
                    if (z7 && ((zC || p7.f5861f) && AbstractC1209k.a(k7.K(), Boolean.TRUE))) {
                        k7.L();
                    }
                } else {
                    boolean zD = k7.r() ? d(k7, aVar) : false;
                    if (z7 && k7.q() && (k7 == k8 || ((kV = k7.v()) != null && kV.J() && p7.f5869p.f5947H))) {
                        if (k7 == k8) {
                            if (k7.f5818Q == I.f5796q) {
                                k7.d();
                            }
                            K kV2 = k7.v();
                            if (kV2 == null || (c0365v = kV2.f5821T.f6002c) == null || (placementScope = c0365v.f5887z) == null) {
                                placementScope = ((C0415x) O.a(k7)).getPlacementScope();
                            }
                            O0.l0.j(placementScope, p7.f5869p, 0, 0);
                        } else {
                            k7.R();
                        }
                        V.o oVar = this.f5929e;
                        oVar.getClass();
                        if (k7.f5828d0 > 0) {
                            ((h0.e) oVar.f7342p).b(k7);
                            k7.f5827c0 = true;
                        }
                        ((C0415x) O.a(k7)).getRectManager().d(k7);
                    }
                    zC = zD;
                }
                e();
                return zC;
            }
        }
        return false;
    }

    public final void o(K k7) throws Throwable {
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k8 = (K) objArr[i8];
            if (k8.s() == I.f5794o || k8.f5822U.f5869p.f5951L.e()) {
                if (AbstractC0347f.s(k8)) {
                    p(k8, true);
                } else {
                    o(k8);
                }
            }
        }
    }

    public final void p(K k7, boolean z6) throws Throwable {
        n1.a aVar;
        if (k7.f5829e0) {
            return;
        }
        if (k7 == this.f5925a) {
            aVar = this.f5932i;
            AbstractC1209k.c(aVar);
        } else {
            aVar = null;
        }
        if (z6) {
            c(k7, aVar);
        } else {
            d(k7, aVar);
        }
    }

    public final boolean q(K k7, boolean z6) {
        int iOrdinal = k7.f5822U.f5859d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new Z(k7, false, z6));
            } else {
                if (iOrdinal != 4) {
                    throw new A2.W();
                }
                if (!k7.r() || z6) {
                    k7.f5822U.f5869p.f5948I = true;
                    if (!k7.f5829e0 && (k7.J() || j(k7))) {
                        K kV = k7.v();
                        if (kV == null || !kV.r()) {
                            this.f5926b.K(k7, EnumC0367x.f6091q);
                        }
                        if (!this.f5928d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void r(long j3) {
        n1.a aVar = this.f5932i;
        if (aVar == null ? false : n1.a.b(aVar.f14505a, j3)) {
            return;
        }
        if (this.f5927c) {
            N0.a.a("updateRootConstraints called while measuring");
        }
        this.f5932i = new n1.a(j3);
        K k7 = this.f5925a;
        K k8 = k7.f5837v;
        P p7 = k7.f5822U;
        if (k8 != null) {
            p7.f5860e = true;
        }
        p7.f5869p.f5948I = true;
        this.f5926b.K(k7, k8 != null ? EnumC0367x.f6089o : EnumC0367x.f6091q);
    }
}
