package X;

import D.AbstractC0060d;
import D.C0078t;
import I.C0216h;
import K0.C0245m;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.AbstractC0403q0;
import R0.InterfaceC0393l0;
import a.AbstractC0509a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b1.AbstractC0607C;
import b1.C0612H;
import b1.C0613I;
import b1.C0630o;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o0.AbstractC1256m;
import r0.AbstractC1383a;
import r0.C1395m;
import r0.InterfaceC1386d;
import r0.InterfaceC1398p;
import r1.C1405D;
import r1.EnumC1406E;
import w5.InterfaceC1765B;
import x.AbstractC1860k0;
import x0.C1892b;
import x0.C1893c;
import y0.C1969b;
import y0.C1973f;

/* JADX INFO: renamed from: X.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0498r0 {

    /* JADX INFO: renamed from: a */
    public static final C1893c f8149a = new C1893c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static C1973f f8150b;

    /* JADX INFO: renamed from: c */
    public static C1969b f8151c;

    /* JADX INFO: renamed from: d */
    public static A0.c f8152d;

    public static final void a(InterfaceC0494p interfaceC0494p, InterfaceC1386d interfaceC1386d, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(-1090171650);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? c0912t.f(interfaceC0494p) : c0912t.h(interfaceC0494p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(interfaceC1386d) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(dVar) ? 256 : 128;
        }
        boolean z6 = true;
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            boolean z7 = (i8 & 112) == 32;
            if ((i8 & 14) != 4 && ((i8 & 8) == 0 || !c0912t.f(interfaceC0494p))) {
                z6 = false;
            }
            boolean z8 = z7 | z6;
            Object objK = c0912t.K();
            if (z8 || objK == C0903o.f11850a) {
                objK = new C0486l(interfaceC1386d, interfaceC0494p);
                c0912t.i0(objK);
            }
            r1.n.a((C0486l) objK, null, new C1405D(false, EnumC1406E.f15661o, false), dVar, c0912t, ((i8 << 3) & 7168) | 384, 2);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new H.I(i7, 4, interfaceC0494p, interfaceC1386d, dVar);
        }
    }

    public static final void b(C1395m c1395m, n0.d dVar, C0912t c0912t, int i7) {
        n0.d dVar2;
        C0912t c0912t2;
        c0912t.Z(1949207773);
        int i8 = i7 | 6;
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            C1395m c1395m2 = C1395m.f15634a;
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.t(null);
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            E e7 = (E) interfaceC0878b0.getValue();
            Object objK2 = c0912t.K();
            if (objK2 == w7) {
                objK2 = new M.t0(interfaceC0878b0, 8);
                c0912t.i0(objK2);
            }
            dVar2 = dVar;
            c0912t2 = c0912t;
            c(c1395m2, e7, (InterfaceC1182c) objK2, dVar2, c0912t2, 3462);
            c1395m = c1395m2;
        } else {
            dVar2 = dVar;
            c0912t2 = c0912t;
            c0912t2.Q();
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(c1395m, dVar2, i7, 9);
        }
    }

    public static final void c(InterfaceC1398p interfaceC1398p, E e7, InterfaceC1182c interfaceC1182c, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(-917932944);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(e7) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(interfaceC1182c) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.h(dVar) ? 2048 : 1024;
        }
        if (c0912t.N(i8 & 1, (i8 & 1171) != 1170)) {
            InterfaceC1398p interfaceC1398pA = C1395m.f15634a;
            Object[] objArr = new Object[0];
            V1.a aVar = u0.l;
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = new D.A0(14);
                c0912t.i0(objK);
            }
            u0 u0Var = (u0) AbstractC1256m.d(objArr, aVar, (InterfaceC1180a) objK, c0912t, 384);
            Object objK2 = c0912t.K();
            if (objK2 == obj) {
                objK2 = new C0495p0(u0Var);
                c0912t.i0(objK2);
            }
            C0495p0 c0495p0 = (C0495p0) objK2;
            Object obj2 = (InterfaceC0393l0) c0912t.j(AbstractC0403q0.f6507f);
            Object objK3 = c0912t.K();
            if (objK3 == obj) {
                objK3 = C0879c.l(c0912t);
                c0912t.i0(objK3);
            }
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) objK3;
            c0495p0.f8130e = (G0.a) c0912t.j(AbstractC0403q0.l);
            boolean zF = c0912t.f(interfaceC1765B) | c0912t.f(obj2);
            Object objK4 = c0912t.K();
            if (zF || objK4 == obj) {
                objK4 = new D.h0(interfaceC1765B, 12, obj2);
                c0912t.i0(objK4);
            }
            c0495p0.f8131f = (InterfaceC1182c) objK4;
            c0495p0.f8129d = new D.h0(c0495p0, 13, interfaceC1182c);
            c0495p0.m(e7);
            c0912t.X(-82306500);
            c0495p0.f8146w = A.b(C.f7882p, null, c0912t, 54);
            c0495p0.f8145v = interfaceC1765B;
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.input.key.a.a(K0.H.b(androidx.compose.foundation.a.f(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(androidx.compose.ui.layout.a.d(K0.H.b(interfaceC1398pA, Y4.o.f8736a, new M.I(c0495p0, 2, new M(c0495p0, 2))), new J(c0495p0, 4)), c0495p0.h), new J(c0495p0, 5)), true, null), 8675309, new C0216h(3, new J(c0495p0, 6))), new K0.E(3, c0495p0));
            if (c0495p0.f() != null && c0495p0.h()) {
                E eG = c0495p0.g();
                if (!(eG != null ? AbstractC1209k.a(eG.f7891a, eG.f7892b) : true) && AbstractC1860k0.a()) {
                    interfaceC1398pA = AbstractC1383a.a(interfaceC1398pA, new D.B0(6, c0495p0));
                }
            }
            f(interfaceC1398p.f(androidx.compose.foundation.text.contextmenu.modifier.a.a(interfaceC1398pA2.f(interfaceC1398pA), new D.D0(6, c0495p0))), n0.e.e(-1799563674, new O(c0495p0, u0Var, dVar), c0912t), c0912t, 48);
            boolean zH = c0912t.h(c0495p0);
            Object objK5 = c0912t.K();
            if (zH || objK5 == obj) {
                objK5 = new J(c0495p0, 0);
                c0912t.i0(objK5);
            }
            C0879c.d(c0495p0, (InterfaceC1182c) objK5, c0912t);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new K(interfaceC1398p, e7, interfaceC1182c, dVar, i7, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final X.InterfaceC0494p r18, final boolean r19, final m1.j r20, final boolean r21, long r22, final float r24, final androidx.compose.ui.input.pointer.SuspendPointerInputElement r25, f0.C0912t r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0498r0.d(X.p, boolean, m1.j, boolean, long, float, androidx.compose.ui.input.pointer.SuspendPointerInputElement, f0.t, int):void");
    }

    public static final void e(InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, boolean z6, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(2111672474);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8 | (c0912t.h(interfaceC1180a) ? 32 : 16) | (c0912t.g(z6) ? 256 : 128);
        if (c0912t.N(i9 & 1, (i9 & 147) != 146)) {
            AbstractC0060d.d(c0912t, AbstractC1383a.a(androidx.compose.foundation.layout.c.i(interfaceC1398p, Y.f8016a, Y.f8017b), new M.A0(1, interfaceC1180a, z6)));
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0464a(interfaceC1398p, interfaceC1180a, z6, i7);
        }
    }

    public static final void f(InterfaceC1398p interfaceC1398p, n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(-1854833411);
        int i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = w0.f8190a;
                c0912t.i0(objK);
            }
            O0.Z z6 = (O0.Z) objK;
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, z6, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            dVar.invoke(c0912t, 6);
            c0912t.p(true);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(interfaceC1398p, dVar, i7, 10);
        }
    }

    public static final void g(boolean z6, m1.j jVar, K0 k02, C0912t c0912t, int i7) {
        int i8;
        M.E0 e0D;
        c0912t.Z(-1344558920);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.g(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.d(jVar.ordinal()) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(k02) ? 256 : 128;
        }
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            int i9 = i8 & 14;
            boolean zF = (i9 == 4) | c0912t.f(k02);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (zF || objK == obj) {
                objK = new F0(k02, z6);
                c0912t.i0(objK);
            }
            M.j0 j0Var = (M.j0) objK;
            boolean zH = c0912t.h(k02) | (i9 == 4);
            Object objK2 = c0912t.K();
            if (zH || objK2 == obj) {
                objK2 = new L0(k02, z6);
                c0912t.i0(objK2);
            }
            InterfaceC0494p interfaceC0494p = (InterfaceC0494p) objK2;
            boolean zG = b1.L.g(k02.m().f12385b);
            int i10 = (int) (z6 ? k02.m().f12385b >> 32 : k02.m().f12385b & 4294967295L);
            M.Z z7 = k02.f7942d;
            float fT = (z7 == null || (e0D = z7.d()) == null) ? 0.0f : M.V.t(e0D.f4386a, i10);
            boolean zH2 = c0912t.h(j0Var);
            Object objK3 = c0912t.K();
            if (zH2 || objK3 == obj) {
                objK3 = new N(j0Var, 1);
                c0912t.i0(objK3);
            }
            d(interfaceC0494p, z6, jVar, zG, 0L, fT, new SuspendPointerInputElement(j0Var, null, null, (PointerInputEventHandler) objK3, 6), c0912t, (i8 << 3) & 1008);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0464a(z6, jVar, k02, i7, 1);
        }
    }

    public static final E h(Z z6, InterfaceC0480i interfaceC0480i) {
        boolean z7 = z6.k() == EnumC0482j.f8086o;
        return new E(m(z6.g(), z7, true, z6.h(), interfaceC0480i), m(z6.j(), z7, false, z6.i(), interfaceC0480i), z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004c  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x003e -> B:45:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(K0.L r7, e5.AbstractC0863a r8) {
        /*
            boolean r0 = r8 instanceof X.Q
            if (r0 == 0) goto L13
            r0 = r8
            X.Q r0 = (X.Q) r0
            int r1 = r0.f7985q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7985q = r1
            goto L18
        L13:
            X.Q r0 = new X.Q
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f7984p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f7985q
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            K0.L r7 = r0.f7983o
            android.support.v4.media.session.b.K(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            android.support.v4.media.session.b.K(r8)
        L34:
            K0.n r8 = K0.EnumC0246n.f3902p
            r0.f7983o = r7
            r0.f7985q = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            K0.m r8 = (K0.C0245m) r8
            java.lang.Object r2 = r8.f3896a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            K0.u r6 = (K0.u) r6
            boolean r6 = K0.t.a(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0498r0.i(K0.L, e5.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b9  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(K0.L r17, X.InterfaceC0488m r18, D4.i r19, K0.C0245m r20, e5.AbstractC0863a r21) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0498r0.j(K0.L, X.m, D4.i, K0.m, e5.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x009e, code lost:
    
        if (r14 == r1) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(K0.L r11, M.j0 r12, K0.C0245m r13, e5.AbstractC0863a r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0498r0.k(K0.L, M.j0, K0.m, e5.a):java.lang.Object");
    }

    public static final D l(final Z z6, final B b7, D d4) {
        final int i7 = z6.a() ? b7.f7875c : b7.f7876d;
        if ((z6.a() ? z6.h() : z6.i()) != b7.f7874b) {
            return b7.a(i7);
        }
        Y4.f fVar = Y4.f.f8724p;
        final Y4.e eVarN = AbstractC0509a.N(fVar, new InterfaceC1180a() { // from class: X.H
            @Override // l5.InterfaceC1180a
            public final Object a() {
                return Integer.valueOf(b7.f7878f.f9930b.d(i7));
            }
        });
        final int i8 = z6.a() ? b7.f7876d : b7.f7875c;
        Y4.e eVarN2 = AbstractC0509a.N(fVar, new InterfaceC1180a() { // from class: X.I
            /* JADX WARN: Type inference failed for: r2v0, types: [Y4.e, java.lang.Object] */
            @Override // l5.InterfaceC1180a
            public final Object a() {
                int iIntValue = ((Number) eVarN.getValue()).intValue();
                Z z7 = z6;
                boolean zA = z7.a();
                boolean z8 = z7.k() == EnumC0482j.f8086o;
                B b8 = b7;
                C0613I c0613i = b8.f7878f;
                int i9 = i7;
                long jK = c0613i.k(i9);
                int i10 = b1.L.f9944c;
                int iH = (int) (jK >> 32);
                C0613I c0613i2 = b8.f7878f;
                C0630o c0630o = c0613i2.f9930b;
                int iD = c0630o.d(iH);
                int i11 = c0630o.f9992f;
                if (iD != iIntValue) {
                    iH = iIntValue >= i11 ? c0613i2.h(i11 - 1) : c0613i2.h(iIntValue);
                }
                int iC = (int) (jK & 4294967295L);
                if (c0630o.d(iC) != iIntValue) {
                    iC = iIntValue >= i11 ? c0630o.c(i11 - 1, false) : c0630o.c(iIntValue, false);
                }
                int i12 = i8;
                if (iH == i12) {
                    return b8.a(iC);
                }
                if (iC == i12) {
                    return b8.a(iH);
                }
                if (!(zA ^ z8) ? i9 >= iH : i9 > iC) {
                    iH = iC;
                }
                return b8.a(iH);
            }
        });
        if (b7.f7873a != d4.f7889c) {
            return (D) eVarN2.getValue();
        }
        int i9 = b7.f7877e;
        if (i7 == i9) {
            return d4;
        }
        C0613I c0613i = b7.f7878f;
        if (((Number) eVarN.getValue()).intValue() != c0613i.f9930b.d(i9)) {
            return (D) eVarN2.getValue();
        }
        int i10 = d4.f7888b;
        long jK = c0613i.k(i10);
        boolean zA = z6.a();
        if (i9 != -1) {
            if (i7 != i9) {
                if (!(zA ^ (b7.b() == EnumC0482j.f8086o))) {
                }
            }
            return b7.a(i7);
        }
        int i11 = b1.L.f9944c;
        return (i10 == ((int) (jK >> 32)) || i10 == ((int) (jK & 4294967295L))) ? (D) eVarN2.getValue() : b7.a(i7);
    }

    public static final D m(B b7, boolean z6, boolean z7, int i7, InterfaceC0480i interfaceC0480i) {
        long j3;
        int i8 = z7 ? b7.f7875c : b7.f7876d;
        if (i7 != b7.f7874b) {
            return b7.a(i8);
        }
        long jA = interfaceC0480i.a(b7, i8);
        if (z6 ^ z7) {
            int i9 = b1.L.f9944c;
            j3 = jA >> 32;
        } else {
            int i10 = b1.L.f9944c;
            j3 = 4294967295L & jA;
        }
        return b7.a((int) j3);
    }

    public static final EnumC0484k n(EnumC0484k enumC0484k, EnumC0484k enumC0484k2, C0465a0 c0465a0, long j3, D d4) {
        if (d4 == null) {
            return x(enumC0484k, enumC0484k2);
        }
        int iCompare = c0465a0.f8029f.compare(Long.valueOf(d4.f7889c), Long.valueOf(j3));
        return iCompare < 0 ? EnumC0484k.f8092o : iCompare > 0 ? EnumC0484k.f8094q : EnumC0484k.f8093p;
    }

    public static final D o(D d4, B b7, int i7) {
        return new D(b7.f7878f.a(i7), i7, d4.f7889c);
    }

    public static final boolean p(C1893c c1893c, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        if (c1893c.f19869a > fIntBitsToFloat || fIntBitsToFloat > c1893c.f19871c) {
            return false;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return c1893c.f19870b <= fIntBitsToFloat2 && fIntBitsToFloat2 <= c1893c.f19872d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final y0.C1973f q(v0.d r21, float r22) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0498r0.q(v0.d, float):y0.f");
    }

    public static final long r(C0495p0 c0495p0, long j3, D d4) {
        O0.C c7;
        O0.C c8;
        int iB;
        long jB;
        float f7;
        C0630o c0630o;
        int iD;
        float fP;
        C0630o c0630o2;
        int iD2;
        C0630o c0630o3;
        int iD3;
        float fB;
        C0630o c0630o4;
        int iD4;
        C0492o c0492oD = c0495p0.d(d4);
        if (c0492oD == null || (c7 = c0495p0.l) == null || (c8 = c0492oD.c()) == null) {
            return 9205357640488583168L;
        }
        W.g gVar = c0492oD.f8117c;
        C0613I c0613i = (C0613I) gVar.a();
        int iB2 = c0613i == null ? 0 : c0492oD.b(c0613i);
        int i7 = d4.f7888b;
        if (i7 > iB2) {
            return 9205357640488583168L;
        }
        C1892b c1892b = (C1892b) c0495p0.f8142s.getValue();
        AbstractC1209k.c(c1892b);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c8.K(c7, c1892b.f19867a) >> 32));
        C0613I c0613i2 = (C0613I) gVar.a();
        if (c0613i2 != null && (iB = c0492oD.b(c0613i2)) >= 1) {
            int iQ = i6.h.q(i7, 0, iB - 1);
            C0630o c0630o5 = c0613i2.f9930b;
            int iD5 = c0630o5.d(iQ);
            jB = AbstractC0607C.b(c0613i2.h(iD5), c0630o5.c(iD5, true));
        } else {
            jB = b1.L.f9943b;
        }
        if (b1.L.c(jB)) {
            C0613I c0613i3 = (C0613I) gVar.a();
            fP = (c0613i3 != null && (iD4 = (c0630o4 = c0613i3.f9930b).d(i7)) < c0630o4.f9992f) ? c0613i3.f(iD4) : -1.0f;
            f7 = -1.0f;
        } else {
            f7 = -1.0f;
            int i8 = (int) (jB >> 32);
            C0613I c0613i4 = (C0613I) gVar.a();
            float f8 = (c0613i4 != null && (iD2 = (c0630o2 = c0613i4.f9930b).d(i8)) < c0630o2.f9992f) ? c0613i4.f(iD2) : -1.0f;
            int i9 = ((int) (jB & 4294967295L)) - 1;
            C0613I c0613i5 = (C0613I) gVar.a();
            float fG = (c0613i5 != null && (iD = (c0630o = c0613i5.f9930b).d(i9)) < c0630o.f9992f) ? c0613i5.g(iD) : -1.0f;
            fP = i6.h.p(fIntBitsToFloat, Math.min(f8, fG), Math.max(f8, fG));
        }
        if (fP == f7) {
            return 9205357640488583168L;
        }
        if (!n1.m.b(j3, 0L) && Math.abs(fIntBitsToFloat - fP) > ((int) (j3 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        C0613I c0613i6 = (C0613I) gVar.a();
        if (c0613i6 != null && (iD3 = (c0630o3 = c0613i6.f9930b).d(i7)) < c0630o3.f9992f) {
            float f9 = c0630o3.f(iD3);
            fB = ((c0630o3.b(iD3) - f9) / 2) + f9;
        } else {
            fB = f7;
        }
        if (fB == f7) {
            return 9205357640488583168L;
        }
        return c7.K(c8, (((long) Float.floatToRawIntBits(fP)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
    }

    public static final int s(long j3, C0613I c0613i) {
        int i7 = (int) (4294967295L & j3);
        if (Float.intBitsToFloat(i7) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i7);
        C0630o c0630o = c0613i.f9930b;
        return fIntBitsToFloat >= c0630o.f9991e ? c0613i.f9929a.f9920a.f9970p.length() : c0630o.g(j3);
    }

    public static final long t(C0613I c0613i, int i7, boolean z6, boolean z7) {
        C0630o c0630o = c0613i.f9930b;
        int iD = c0630o.d(i7);
        if (iD >= c0630o.f9992f) {
            return 9205357640488583168L;
        }
        float fE = c0613i.e(i7, c0613i.a(((!z6 || z7) && (z6 || !z7)) ? Math.max(i7 + (-1), 0) : i7) == c0613i.i(i7));
        long j3 = c0613i.f9931c;
        return (((long) Float.floatToRawIntBits(i6.h.p(c0630o.b(iD), 0.0f, (int) (j3 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(i6.h.p(fE, 0.0f, (int) (j3 >> 32)))) << 32);
    }

    public static final m1.j u(C0613I c0613i, int i7) {
        C0612H c0612h = c0613i.f9929a;
        if (c0612h.f9920a.f9970p.length() != 0) {
            C0630o c0630o = c0613i.f9930b;
            int iD = c0630o.d(i7);
            if ((i7 != 0 && iD == c0630o.d(i7 - 1)) || (i7 != c0612h.f9920a.f9970p.length() && iD == c0630o.d(i7 + 1))) {
                return c0613i.a(i7);
            }
        }
        return c0613i.i(i7);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean v(C0245m c0245m) {
        ?? r52 = c0245m.f3896a;
        int size = r52.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((K0.u) r52.get(i7)).f3917i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean w(K0 k02, boolean z6) {
        O0.C c7;
        M.Z z7 = k02.f7942d;
        if (z7 == null || (c7 = z7.c()) == null) {
            return false;
        }
        return p(y(c7), k02.k(z6));
    }

    public static final EnumC0484k x(EnumC0484k enumC0484k, EnumC0484k enumC0484k2) {
        int iOrdinal = enumC0484k2.ordinal();
        if (iOrdinal == 0) {
            return EnumC0484k.f8092o;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return EnumC0484k.f8094q;
            }
            throw new A2.W();
        }
        int iOrdinal2 = enumC0484k.ordinal();
        if (iOrdinal2 == 0) {
            return EnumC0484k.f8092o;
        }
        if (iOrdinal2 == 1) {
            return EnumC0484k.f8093p;
        }
        if (iOrdinal2 == 2) {
            return EnumC0484k.f8094q;
        }
        throw new A2.W();
    }

    public static final C1893c y(O0.C c7) {
        C1893c c1893cG = O0.w0.g(c7);
        long jG = c7.g(c1893cG.d());
        long jG2 = c7.g((((long) Float.floatToRawIntBits(c1893cG.f19871c)) << 32) | (((long) Float.floatToRawIntBits(c1893cG.f19872d)) & 4294967295L));
        return new C1893c(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & 4294967295L)), Float.intBitsToFloat((int) (jG2 >> 32)), Float.intBitsToFloat((int) (jG2 & 4294967295L)));
    }
}
