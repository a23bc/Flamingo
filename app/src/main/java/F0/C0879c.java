package f0;

import g0.C0942B;
import g0.C0943a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;
import z5.InterfaceC2110e;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0879c {

    /* JADX INFO: renamed from: a */
    public static final Object f11791a = new Object();

    /* JADX INFO: renamed from: b */
    public static final J f11792b = new J();

    public static final int A(t.x xVar) {
        int iB;
        int i7 = xVar.f16127b;
        int iB2 = xVar.b(0);
        while (xVar.f16127b != 0 && xVar.b(0) == iB2) {
            xVar.e(0, xVar.c());
            xVar.d(xVar.f16127b - 1);
            int i8 = xVar.f16127b;
            int i9 = i8 >>> 1;
            int i10 = 0;
            while (i10 < i9) {
                int iB3 = xVar.b(i10);
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iB4 = xVar.b(i12);
                if (i11 >= i8 || (iB = xVar.b(i11)) <= iB4) {
                    if (iB4 > iB3) {
                        xVar.e(i10, iB4);
                        xVar.e(i12, iB3);
                        i10 = i12;
                    }
                } else if (iB > iB3) {
                    xVar.e(i10, iB);
                    xVar.e(i11, iB3);
                    i10 = i11;
                }
            }
        }
        return iB2;
    }

    public static final int B(int i7) {
        int i8 = 306783378 & i7;
        int i9 = 613566756 & i7;
        return (i7 & (-920350135)) | (i9 >> 1) | i8 | ((i8 << 1) & i9);
    }

    public static final n0.i C(C0913t0[] c0913t0Arr, InterfaceC0906p0 interfaceC0906p0, InterfaceC0906p0 interfaceC0906p02) {
        n0.i iVar = n0.i.f14490r;
        n0.h hVar = new n0.h(iVar);
        hVar.f14489u = iVar;
        for (C0913t0 c0913t0 : c0913t0Arr) {
            AbstractC0911s0 abstractC0911s0 = (AbstractC0911s0) c0913t0.f11920d;
            if (c0913t0.f11919c || !((n0.i) interfaceC0906p0).containsKey(abstractC0911s0)) {
                hVar.put(abstractC0911s0, abstractC0911s0.c(c0913t0, (c1) ((n0.i) interfaceC0906p02).get(abstractC0911s0)));
            }
        }
        return hVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(f0.C0913t0 r10, n0.d r11, f0.C0912t r12, int r13) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0879c.a(f0.t0, n0.d, f0.t, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(f0.C0913t0[] r7, n0.d r8, f0.C0912t r9, int r10) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r9.Z(r0)
            f0.p0 r0 = r9.l()
            f0.d0 r1 = f0.AbstractC0914u.f11924b
            r2 = 201(0xc9, float:2.82E-43)
            r9.T(r2, r1)
            boolean r1 = r9.f11890S
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L25
            n0.i r1 = n0.i.f14490r
            n0.i r1 = C(r7, r0, r1)
            n0.i r0 = r9.h0(r0, r1)
            r9.f11881J = r3
        L23:
            r1 = r2
            goto L72
        L25:
            f0.H0 r1 = r9.f11878G
            int r4 = r1.f11673g
            java.lang.Object r1 = r1.h(r4, r2)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            m5.AbstractC1209k.d(r1, r4)
            f0.p0 r1 = (f0.InterfaceC0906p0) r1
            f0.H0 r5 = r9.f11878G
            int r6 = r5.f11673g
            java.lang.Object r5 = r5.h(r6, r3)
            m5.AbstractC1209k.d(r5, r4)
            f0.p0 r5 = (f0.InterfaceC0906p0) r5
            n0.i r4 = C(r7, r0, r5)
            boolean r6 = r9.z()
            if (r6 == 0) goto L63
            boolean r6 = r9.f11915y
            if (r6 != 0) goto L63
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L56
            goto L63
        L56:
            int r0 = r9.l
            f0.H0 r4 = r9.f11878G
            int r4 = r4.s()
            int r4 = r4 + r0
            r9.l = r4
            r0 = r1
            goto L23
        L63:
            n0.i r0 = r9.h0(r0, r4)
            boolean r4 = r9.f11915y
            if (r4 != 0) goto L71
            boolean r1 = m5.AbstractC1209k.a(r0, r1)
            if (r1 != 0) goto L23
        L71:
            r1 = r3
        L72:
            if (r1 == 0) goto L7b
            boolean r4 = r9.f11890S
            if (r4 != 0) goto L7b
            r9.I(r0)
        L7b:
            boolean r4 = r9.f11913w
            Q0.w r5 = r9.f11914x
            r5.c(r4)
            r9.f11913w = r1
            r9.f11882K = r0
            f0.d0 r1 = f0.AbstractC0914u.f11925c
            r4 = 202(0xca, float:2.83E-43)
            r9.R(r4, r1, r0, r2)
            int r0 = r10 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.invoke(r9, r0)
            r9.p(r2)
            r9.p(r2)
            int r0 = r5.b()
            if (r0 == 0) goto La5
            r2 = r3
        La5:
            r9.f11913w = r2
            r0 = 0
            r9.f11882K = r0
            f0.u0 r9 = r9.r()
            if (r9 == 0) goto Lb8
            F.j r0 = new F.j
            r1 = 5
            r0.<init>(r7, r8, r10, r1)
            r9.f11932d = r0
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0879c.b(f0.t0[], n0.d, f0.t, int):void");
    }

    public static final void c(Object obj, Object obj2, InterfaceC1182c interfaceC1182c, C0912t c0912t) {
        boolean zF = c0912t.f(obj) | c0912t.f(obj2);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            objK = new H(interfaceC1182c);
            c0912t.i0(objK);
        }
    }

    public static final void d(Object obj, InterfaceC1182c interfaceC1182c, C0912t c0912t) {
        boolean zF = c0912t.f(obj);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            objK = new H(interfaceC1182c);
            c0912t.i0(objK);
        }
    }

    public static final void e(C0912t c0912t, Object obj, l5.e eVar) {
        c5.i iVar = c0912t.f11889R;
        boolean zF = c0912t.f(obj);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            objK = new U(iVar, eVar);
            c0912t.i0(objK);
        }
    }

    public static final void f(Object obj, Object obj2, l5.e eVar, C0912t c0912t) {
        c5.i iVar = c0912t.f11889R;
        boolean zF = c0912t.f(obj) | c0912t.f(obj2);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            objK = new U(iVar, eVar);
            c0912t.i0(objK);
        }
    }

    public static final void g(InterfaceC1180a interfaceC1180a, C0912t c0912t) {
        C0943a c0943a = c0912t.f11884M.f12281b;
        c0943a.getClass();
        C0942B c0942b = C0942B.f12263c;
        g0.L l = c0943a.f12279u;
        l.g0(c0942b);
        N5.l.P(l, 0, interfaceC1180a);
    }

    public static final void h(t.x xVar, int i7) {
        if (xVar.f16127b == 0 || !(xVar.b(0) == i7 || xVar.b(xVar.f16127b - 1) == i7)) {
            int i8 = xVar.f16127b;
            xVar.a(i7);
            while (i8 > 0) {
                int i9 = ((i8 + 1) >>> 1) - 1;
                int iB = xVar.b(i9);
                if (i7 <= iB) {
                    break;
                }
                xVar.e(i8, iB);
                i8 = i9;
            }
            xVar.e(i8, i7);
        }
    }

    public static void i(L0 l02, List list, C0924z c0924z) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            int iC = l02.c((C0877b) list.get(i7));
            int iM = l02.M(l02.f11695b, l02.r(iC));
            Object obj = iM < l02.g(l02.f11695b, l02.r(iC + 1)) ? l02.f11696c[l02.h(iM)] : C0903o.f11850a;
            C0915u0 c0915u0 = obj instanceof C0915u0 ? (C0915u0) obj : null;
            if (c0915u0 != null) {
                c0915u0.f11929a = c0924z;
            }
        }
    }

    public static final InterfaceC0878b0 j(InterfaceC2110e interfaceC2110e, Object obj, c5.i iVar, C0912t c0912t, int i7, int i8) {
        if ((i8 & 2) != 0) {
            iVar = c5.j.f10685o;
        }
        boolean zH = c0912t.h(iVar) | c0912t.h(interfaceC2110e);
        Object objK = c0912t.K();
        Object obj2 = C0903o.f11850a;
        if (zH || objK == obj2) {
            objK = new W0(iVar, interfaceC2110e, null);
            c0912t.i0(objK);
        }
        l5.e eVar = (l5.e) objK;
        Object objK2 = c0912t.K();
        if (objK2 == obj2) {
            objK2 = t(obj);
            c0912t.i0(objK2);
        }
        InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK2;
        boolean zH2 = c0912t.h(eVar);
        Object objK3 = c0912t.K();
        if (zH2 || objK3 == obj2) {
            objK3 = new T0(eVar, interfaceC0878b0, null);
            c0912t.i0(objK3);
        }
        f(interfaceC2110e, iVar, (l5.e) objK3, c0912t);
        return interfaceC0878b0;
    }

    public static final InterfaceC0878b0 k(z5.H h, C0912t c0912t, int i7) {
        return j(h, h.getValue(), c5.j.f10685o, c0912t, i7 & 14, 0);
    }

    public static final InterfaceC1765B l(C0912t c0912t) {
        return new F0(c0912t.f11889R);
    }

    public static final h0.e m() {
        A0.b bVar = R0.f11738b;
        h0.e eVar = (h0.e) bVar.R();
        if (eVar != null) {
            return eVar;
        }
        h0.e eVar2 = new h0.e(new C0910s[0]);
        bVar.l0(eVar2);
        return eVar2;
    }

    public static final G n(Q0 q02, InterfaceC1180a interfaceC1180a) {
        A0.b bVar = R0.f11737a;
        return new G(q02, interfaceC1180a);
    }

    public static final G o(InterfaceC1180a interfaceC1180a) {
        A0.b bVar = R0.f11737a;
        return new G(null, interfaceC1180a);
    }

    public static final int p(C0912t c0912t) {
        long j3 = c0912t.f11891T;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static final X q(c5.i iVar) {
        X x6 = (X) iVar.n(W.f11763p);
        if (x6 != null) {
            return x6;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void r() {
        throw new IllegalStateException("Invalid applier");
    }

    public static List s(L0 l02, int i7, L0 l03, boolean z6, boolean z7, boolean z8) {
        List list;
        boolean zH;
        int i8;
        int i9;
        int iT = l02.t(i7);
        int i10 = i7 + iT;
        int iF = l02.f(i7);
        int iF2 = l02.f(i10);
        int i11 = iF2 - iF;
        boolean z9 = i7 >= 0 && (l02.f11695b[(l02.r(i7) * 5) + 1] & 201326592) != 0;
        l03.v(iT);
        l03.w(i11, l03.f11711t);
        if (l02.f11700g < i10) {
            l02.A(i10);
        }
        if (l02.f11703k < iF2) {
            l02.B(iF2, i10);
        }
        int[] iArr = l03.f11695b;
        int i12 = l03.f11711t;
        int i13 = i12 * 5;
        Z4.l.V(i13, i7 * 5, i10 * 5, l02.f11695b, iArr);
        Object[] objArr = l03.f11696c;
        int i14 = l03.f11701i;
        System.arraycopy(l02.f11696c, iF, objArr, i14, i11);
        int i15 = l03.f11713v;
        iArr[i13 + 2] = i15;
        int i16 = i12 - i7;
        int i17 = i12 + iT;
        int iG = i14 - l03.g(iArr, i12);
        int i18 = l03.f11704m;
        int i19 = l03.l;
        int length = objArr.length;
        boolean z10 = z9;
        int i20 = i18;
        int i21 = i12;
        while (i21 < i17) {
            if (i21 != i12) {
                int i22 = (i21 * 5) + 2;
                iArr[i22] = iArr[i22] + i16;
            }
            int[] iArr2 = iArr;
            int iG2 = l03.g(iArr, i21) + iG;
            if (i20 < i21) {
                i8 = i12;
                i9 = 0;
            } else {
                i8 = i12;
                i9 = l03.f11703k;
            }
            iArr2[(i21 * 5) + 4] = L0.i(iG2, i9, i19, length);
            if (i21 == i20) {
                i20++;
            }
            i21++;
            i12 = i8;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        l03.f11704m = i20;
        int iB = K0.b(l02.f11697d, i7, l02.p());
        int iB2 = K0.b(l02.f11697d, i10, l02.p());
        if (iB < iB2) {
            ArrayList arrayList = l02.f11697d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i23 = iB; i23 < iB2; i23++) {
                C0877b c0877b = (C0877b) arrayList.get(i23);
                c0877b.f11789a += i16;
                arrayList2.add(c0877b);
            }
            l03.f11697d.addAll(K0.b(l03.f11697d, l03.f11711t, l03.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = Z4.v.f8818o;
        }
        if (!list.isEmpty()) {
            HashMap map = l02.f11698e;
            HashMap map2 = l03.f11698e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i24 = 0; i24 < size; i24++) {
                }
            }
        }
        int i25 = l03.f11713v;
        l03.N(i15);
        int iD = l02.D(l02.f11695b, i7);
        if (!z8) {
            zH = false;
        } else if (z6) {
            boolean z11 = iD >= 0;
            if (z11) {
                l02.O();
                l02.a(iD - l02.f11711t);
                l02.O();
            }
            l02.a(i7 - l02.f11711t);
            boolean zG = l02.G();
            if (z11) {
                l02.L();
                l02.j();
                l02.L();
                l02.j();
            }
            zH = zG;
        } else {
            zH = l02.H(i7, iT);
            l02.I(iF, i11, i7 - 1);
        }
        if (zH) {
            AbstractC0914u.c("Unexpectedly removed anchors");
        }
        int i26 = l03.f11706o;
        int i27 = iArr3[i13 + 1];
        l03.f11706o = i26 + ((1073741824 & i27) == 0 ? i27 & 67108863 : 1);
        if (z7) {
            l03.f11711t = i17;
            l03.f11701i = i14 + i11;
        }
        if (z10) {
            l03.S(i15);
        }
        return list;
    }

    public static C0894j0 t(Object obj) {
        return new C0894j0(obj, W.f11767t);
    }

    public static final InterfaceC0878b0 u(C0912t c0912t, Object obj, l5.e eVar) {
        Object objK = c0912t.K();
        W w7 = C0903o.f11850a;
        if (objK == w7) {
            objK = t(obj);
            c0912t.i0(objK);
        }
        InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
        Y4.o oVar = Y4.o.f8736a;
        boolean zH = c0912t.h(eVar);
        Object objK2 = c0912t.K();
        if (zH || objK2 == w7) {
            objK2 = new S0(eVar, interfaceC0878b0, null);
            c0912t.i0(objK2);
        }
        e(c0912t, oVar, (l5.e) objK2);
        return interfaceC0878b0;
    }

    public static final Object v(InterfaceC0906p0 interfaceC0906p0, AbstractC0911s0 abstractC0911s0) {
        AbstractC1209k.d(abstractC0911s0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        n0.i iVar = (n0.i) interfaceC0906p0;
        Object objB = iVar.get(abstractC0911s0);
        if (objB == null) {
            objB = abstractC0911s0.b();
        }
        return ((c1) objB).a(iVar);
    }

    public static final r w(C0912t c0912t) {
        C0912t c0912t2;
        c0912t.T(206, AbstractC0914u.f11927e);
        if (c0912t.f11890S) {
            L0.y(c0912t.f11880I);
        }
        Object objC = c0912t.C();
        C0907q c0907q = objC instanceof C0907q ? (C0907q) objC : null;
        if (c0907q == null) {
            long j3 = c0912t.f11891T;
            boolean z6 = c0912t.f11907q;
            boolean z7 = c0912t.f11874C;
            C0924z c0924z = c0912t.h;
            if (!(c0924z instanceof C0924z)) {
                c0924z = null;
            }
            c0912t2 = c0912t;
            c0907q = new C0907q(new r(c0912t2, j3, z6, z7, c0924z != null ? c0924z.f11963H : null));
            c0912t2.j0(c0907q);
        } else {
            c0912t2 = c0912t;
        }
        InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
        r rVar = c0907q.f11859o;
        rVar.f11865f.setValue(interfaceC0906p0L);
        c0912t2.p(false);
        return rVar;
    }

    public static final InterfaceC0878b0 x(Object obj, C0912t c0912t) {
        Object objK = c0912t.K();
        if (objK == C0903o.f11850a) {
            objK = t(obj);
            c0912t.i0(objK);
        }
        InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
        interfaceC0878b0.setValue(obj);
        return interfaceC0878b0;
    }

    public static final void y(C0912t c0912t, Object obj, l5.e eVar) {
        if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), obj)) {
            c0912t.i0(obj);
            c0912t.b(obj, eVar);
        }
    }

    public static final z3.t z(InterfaceC1180a interfaceC1180a) {
        return new z3.t(new X0(interfaceC1180a, null));
    }
}
