package A0;

import D.D0;
import D.J;
import D2.k;
import F.A;
import F.C0130c;
import F.r;
import F.u;
import H.W;
import N5.l;
import O0.B;
import O0.C0320q;
import O0.EnumC0300c0;
import O0.EnumC0302d0;
import O0.EnumC0328z;
import O0.G;
import O0.InterfaceC0327y;
import O0.Y;
import O0.Z;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0352h0;
import Q0.K;
import Q0.N;
import Q0.T;
import Q0.l0;
import Q0.m0;
import android.os.Build;
import android.view.Window;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import b1.M;
import d.C0746L;
import d2.C0821i;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1221w;
import m5.C1211m;
import o5.AbstractC1267a;
import p0.AbstractC1289f;
import r0.AbstractC1397o;
import r0.InterfaceC1398p;
import w.AbstractC1671d;
import w.S;
import w.t0;
import w2.AbstractC1697a;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.AbstractC1983p;
import y0.C1973f;
import y0.C1976i;
import y0.C1980m;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static void A(G.g gVar, String str, InterfaceC1182c interfaceC1182c, n0.d dVar) {
        gVar.getClass();
        gVar.f2507d.b(1, new G.f(new J(1, str), new D0(1, interfaceC1182c), new F.g(0), new n0.d(-291643851, new F.h(1, dVar), true)));
        gVar.f2508e = true;
    }

    public static int B(int i7, int i8, M m7) {
        return (m7.hashCode() + i7) * i8;
    }

    public static int C(String str, int i7, int i8) {
        return (str.hashCode() + i7) * i8;
    }

    public static String D(String str, long j3) {
        return str + j3;
    }

    public static C1211m E(Class cls, String str, String str2, int i7) {
        C1211m c1211m = new C1211m(cls, str, str2, i7);
        AbstractC1221w.b(c1211m);
        return c1211m;
    }

    public static void F(int i7, int i8, int i9, int i10, int i11) {
        AbstractC1267a.b(i7);
        AbstractC1267a.b(i8);
        AbstractC1267a.b(i9);
        AbstractC1267a.b(i10);
        AbstractC1267a.b(i11);
    }

    public static /* synthetic */ void G(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void H(String str, String str2) {
        AbstractC1697a.w(str + str2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y4.e, java.lang.Object] */
    public static void I(String str, Throwable th) {
        AbstractC1209k.f(str.concat(l.R(th)), "msg");
        ((w4.c) w4.c.f19446a.getValue()).getClass();
    }

    public static void J(N n7, B0.d dVar, InterfaceC1182c interfaceC1182c) {
        long jF = n7.f();
        n7.d((((long) ((int) Float.intBitsToFloat((int) (jF >> 32)))) << 32) | (4294967295L & ((long) ((int) Float.intBitsToFloat((int) (jF & 4294967295L))))), dVar, interfaceC1182c);
    }

    public static void K(k kVar, k kVar2) {
        if (kVar == kVar2) {
            return;
        }
        if (kVar2 != null) {
            kVar2.e(null);
        }
        if (kVar != null) {
            kVar.c(null);
        }
    }

    public static W L(A.b bVar, int i7) {
        A a4 = (A) bVar.f3p;
        AbstractC1289f abstractC1289fQ = C0746L.q();
        InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
        AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
        try {
            r rVar = (r) a4.f2029f.getValue();
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
            return a4.f2037p.a(i7, rVar.f2123j, a4.f2027d, new F.g(i7, rVar));
        } catch (Throwable th) {
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
            throw th;
        }
    }

    public static void M(B4.a aVar, long j3, boolean z6, int i7) {
        boolean z7 = (i7 & 4) != 0;
        B4.b bVar = B4.c.f875b;
        aVar.getClass();
        AbstractC1209k.f(bVar, "transformColorForLightContent");
        A.b bVar2 = aVar.f872b;
        if (bVar2 != null) {
            ((I0.c) bVar2.f3p).P(z6);
        }
        int i8 = Build.VERSION.SDK_INT;
        Window window = aVar.f871a;
        if (i8 >= 29 && window != null) {
            window.setNavigationBarContrastEnforced(z7);
        }
        if (window == null) {
            return;
        }
        if (z6 && (bVar2 == null || !((I0.c) bVar2.f3p).E())) {
            j3 = ((C1987t) bVar.b(new C1987t(j3))).f20264a;
        }
        window.setNavigationBarColor(AbstractC1959I.x(j3));
    }

    public static void N(B4.a aVar, long j3, boolean z6) {
        B4.b bVar = B4.c.f875b;
        AbstractC1209k.f(bVar, "transformColorForLightContent");
        A.b bVar2 = aVar.f872b;
        if (bVar2 != null) {
            ((I0.c) bVar2.f3p).Q(z6);
        }
        Window window = aVar.f871a;
        if (window == null) {
            return;
        }
        if (z6 && (bVar2 == null || !((I0.c) bVar2.f3p).F())) {
            j3 = ((C1987t) bVar.b(new C1987t(j3))).f20264a;
        }
        window.setStatusBarColor(AbstractC1959I.x(j3));
    }

    public static /* synthetic */ String O(int i7) {
        switch (i7) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return "NULL";
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static InterfaceC1398p P(InterfaceC1398p interfaceC1398p) {
        if (1.0f <= 0.0d) {
            E.a.a("invalid weight; must be greater than zero");
        }
        return interfaceC1398p.f(new LayoutWeightElement(1.0f, true));
    }

    public static InterfaceC1398p Q(InterfaceC1398p interfaceC1398p, float f7) {
        if (f7 <= 0.0d) {
            E.a.a("invalid weight; must be greater than zero");
        }
        if (f7 > Float.MAX_VALUE) {
            f7 = Float.MAX_VALUE;
        }
        return interfaceC1398p.f(new LayoutWeightElement(f7, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [P0.d, Q0.m] */
    public static Object a(P0.d dVar, P0.f fVar) {
        C0352h0 c0352h0;
        AbstractC1397o abstractC1397o = (AbstractC1397o) dVar;
        if (!abstractC1397o.f15637o.f15636B) {
            N0.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!abstractC1397o.f15637o.f15636B) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15637o.f15641s;
        K kX = AbstractC0347f.x(dVar);
        while (kX != null) {
            if ((kX.f5821T.f6005f.f15640r & 32) != 0) {
                while (abstractC1397o2 != null) {
                    if ((abstractC1397o2.f15639q & 32) != 0) {
                        ?? F6 = abstractC1397o2;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            if (F6 instanceof P0.d) {
                                P0.d dVar2 = (P0.d) F6;
                                if (dVar2.j().s(fVar)) {
                                    return dVar2.j().z(fVar);
                                }
                            } else if ((F6.f15639q & 32) != 0 && (F6 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o3 = ((AbstractC0358n) F6).f6056D;
                                int i7 = 0;
                                F6 = F6;
                                eVar = eVar;
                                while (abstractC1397o3 != null) {
                                    if ((abstractC1397o3.f15639q & 32) != 0) {
                                        i7++;
                                        eVar = eVar;
                                        if (i7 == 1) {
                                            F6 = abstractC1397o3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar.b(F6);
                                                F6 = 0;
                                            }
                                            eVar.b(abstractC1397o3);
                                        }
                                    }
                                    abstractC1397o3 = abstractC1397o3.f15642t;
                                    F6 = F6;
                                    eVar = eVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F6 = AbstractC0347f.f(eVar);
                        }
                    }
                    abstractC1397o2 = abstractC1397o2.f15641s;
                }
            }
            kX = kX.v();
            abstractC1397o2 = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
        }
        return fVar.f5709a.a();
    }

    public static int b(G g6, T t7, Y y6, int i7) {
        return g6.e(new B(t7, t7.getLayoutDirection()), new C0320q(y6, EnumC0300c0.f5377p, EnumC0302d0.f5380p, 1), n1.b.b(i7, 0, 13)).c();
    }

    public static int c(Z z6, InterfaceC0327y interfaceC0327y, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C0320q((Y) list.get(i8), EnumC0328z.f5474p, O0.A.f5276p, 0));
        }
        return z6.g(new B(interfaceC0327y, interfaceC0327y.getLayoutDirection()), arrayList, n1.b.b(i7, 0, 13)).c();
    }

    public static int d(Q0.A a4, InterfaceC0327y interfaceC0327y, Y y6, int i7) {
        return a4.e(new B(interfaceC0327y, interfaceC0327y.getLayoutDirection()), new C0320q(y6, l0.f6050p, m0.f6053p, 2), n1.b.b(i7, 0, 13)).c();
    }

    public static int e(G g6, T t7, Y y6, int i7) {
        return g6.e(new B(t7, t7.getLayoutDirection()), new C0320q(y6, EnumC0300c0.f5377p, EnumC0302d0.f5379o, 1), n1.b.b(0, i7, 7)).e();
    }

    public static int f(Z z6, InterfaceC0327y interfaceC0327y, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C0320q((Y) list.get(i8), EnumC0328z.f5474p, O0.A.f5275o, 0));
        }
        return z6.g(new B(interfaceC0327y, interfaceC0327y.getLayoutDirection()), arrayList, n1.b.b(0, i7, 7)).e();
    }

    public static int g(Q0.A a4, InterfaceC0327y interfaceC0327y, Y y6, int i7) {
        return a4.e(new B(interfaceC0327y, interfaceC0327y.getLayoutDirection()), new C0320q(y6, l0.f6050p, m0.f6052o, 2), n1.b.b(0, i7, 7)).e();
    }

    public static int h(G g6, T t7, Y y6, int i7) {
        return g6.e(new B(t7, t7.getLayoutDirection()), new C0320q(y6, EnumC0300c0.f5376o, EnumC0302d0.f5380p, 1), n1.b.b(i7, 0, 13)).c();
    }

    public static int i(Z z6, InterfaceC0327y interfaceC0327y, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C0320q((Y) list.get(i8), EnumC0328z.f5473o, O0.A.f5276p, 0));
        }
        return z6.g(new B(interfaceC0327y, interfaceC0327y.getLayoutDirection()), arrayList, n1.b.b(i7, 0, 13)).c();
    }

    public static int j(Q0.A a4, InterfaceC0327y interfaceC0327y, Y y6, int i7) {
        return a4.e(new B(interfaceC0327y, interfaceC0327y.getLayoutDirection()), new C0320q(y6, l0.f6049o, m0.f6053p, 2), n1.b.b(i7, 0, 13)).c();
    }

    public static int k(G g6, T t7, Y y6, int i7) {
        return g6.e(new B(t7, t7.getLayoutDirection()), new C0320q(y6, EnumC0300c0.f5376o, EnumC0302d0.f5379o, 1), n1.b.b(0, i7, 7)).e();
    }

    public static int l(Z z6, InterfaceC0327y interfaceC0327y, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C0320q((Y) list.get(i8), EnumC0328z.f5473o, O0.A.f5275o, 0));
        }
        return z6.g(new B(interfaceC0327y, interfaceC0327y.getLayoutDirection()), arrayList, n1.b.b(0, i7, 7)).e();
    }

    public static int m(Q0.A a4, InterfaceC0327y interfaceC0327y, Y y6, int i7) {
        return a4.e(new B(interfaceC0327y, interfaceC0327y.getLayoutDirection()), new C0320q(y6, l0.f6049o, m0.f6052o, 2), n1.b.b(0, i7, 7)).e();
    }

    public static void n(v.Y y6, P0.f fVar, Object obj) {
        if (y6.f18022E == P0.b.f5702g) {
            N0.a.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        P0.g gVar = y6.f18022E;
        if (!gVar.s(fVar)) {
            N0.a.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + fVar + " was not found.");
        }
        gVar.V(fVar, obj);
    }

    public static long o(long j3, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static InterfaceC1398p p(C0130c c0130c) {
        C1893c c1893c = t0.f18746a;
        S sK = AbstractC1671d.k(0.0f, 400.0f, new n1.k(i6.h.a(1, 1)), 1);
        c0130c.getClass();
        return new LazyLayoutAnimateItemElement(sK);
    }

    public static int r(int i7, int i8, int i9, int i10) {
        return i7 | i8 | i9 | 128 | i10;
    }

    public static /* synthetic */ void s(float f7, int i7, long j3, long j7, f fVar) {
        if ((i7 & 4) != 0) {
            j7 = fVar.R();
        }
        fVar.p(f7, j3, j7);
    }

    public static void t(f fVar, C1973f c1973f, long j3, long j7, float f7, C1980m c1980m, int i7, int i8) {
        fVar.h0(c1973f, 0L, j3, (i8 & 16) != 0 ? j3 : j7, (i8 & 32) != 0 ? 1.0f : f7, c1980m, (i8 & 512) != 0 ? 1 : i7);
    }

    public static /* synthetic */ void u(f fVar, C1976i c1976i, AbstractC1983p abstractC1983p, float f7, i iVar, int i7) {
        if ((i7 & 4) != 0) {
            f7 = 1.0f;
        }
        float f8 = f7;
        d dVar = iVar;
        if ((i7 & 8) != 0) {
            dVar = h.f59b;
        }
        fVar.W(c1976i, abstractC1983p, f8, dVar, (i7 & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void w(f fVar, AbstractC1983p abstractC1983p, long j3, long j7, float f7, d dVar, C1980m c1980m, int i7) {
        if ((i7 & 2) != 0) {
            j3 = 0;
        }
        long j8 = j3;
        fVar.J(abstractC1983p, j8, (i7 & 4) != 0 ? o(fVar.f(), j8) : j7, (i7 & 8) != 0 ? 1.0f : f7, (i7 & 16) != 0 ? h.f59b : dVar, (i7 & 32) != 0 ? null : c1980m, (i7 & 64) != 0 ? 3 : 6);
    }

    public static /* synthetic */ void x(float f7, int i7, long j3, long j7, f fVar) {
        long jO = (i7 & 4) != 0 ? o(fVar.f(), 0L) : j7;
        if ((i7 & 8) != 0) {
            f7 = 1.0f;
        }
        fVar.U(j3, 0L, jO, f7, h.f59b, (i7 & 64) != 0 ? 3 : 0);
    }

    public static boolean y(int i7, boolean z6) {
        int i8 = i7 & 7;
        if (i8 != 4) {
            return z6 && i8 == 3;
        }
        return true;
    }

    public static /* synthetic */ void z(u uVar, String str, n0.d dVar, int i7) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        uVar.a(str, dVar);
    }
}
