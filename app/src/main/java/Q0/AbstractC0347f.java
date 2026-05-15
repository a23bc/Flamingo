package Q0;

import O0.C0322t;
import O0.InterfaceC0327y;
import R0.C0415x;
import android.view.View;
import f0.AbstractC0911s0;
import f0.C0879c;
import h0.C0994b;
import java.util.ArrayList;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: renamed from: Q0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0347f {

    /* JADX INFO: renamed from: a */
    public static final p0 f5986a = new p0(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [l5.c] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void A(InterfaceC0357m interfaceC0357m, Object obj, InterfaceC1182c interfaceC1182c) {
        C0352h0 c0352h0;
        AbstractC1397o abstractC1397o = (AbstractC1397o) interfaceC0357m;
        if (!abstractC1397o.f15637o.f15636B) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15637o.f15641s;
        K kX = x(interfaceC0357m);
        while (kX != null) {
            if ((kX.f5821T.f6005f.f15640r & 262144) != 0) {
                while (abstractC1397o2 != null) {
                    if ((abstractC1397o2.f15639q & 262144) != 0) {
                        ?? F6 = abstractC1397o2;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            if (F6 instanceof F0) {
                                F0 f02 = (F0) F6;
                                if (!(obj.equals(f02.o()) ? ((Boolean) interfaceC1182c.b(f02)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((F6.f15639q & 262144) != 0) && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o3 = ((AbstractC0358n) F6).f6056D;
                                    int i7 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC1397o3 != null) {
                                        if ((abstractC1397o3.f15639q & 262144) != 0) {
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
                            }
                            F6 = f(eVar);
                        }
                    }
                    abstractC1397o2 = abstractC1397o2.f15641s;
                }
            }
            kX = kX.v();
            abstractC1397o2 = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [Q0.F0, Q0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [l5.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void B(F0 f02, InterfaceC1182c interfaceC1182c) {
        C0352h0 c0352h0;
        AbstractC1397o abstractC1397o = (AbstractC1397o) f02;
        if (!abstractC1397o.f15637o.f15636B) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15637o.f15641s;
        K kX = x(f02);
        while (kX != null) {
            if ((kX.f5821T.f6005f.f15640r & 262144) != 0) {
                while (abstractC1397o2 != null) {
                    if ((abstractC1397o2.f15639q & 262144) != 0) {
                        ?? F6 = abstractC1397o2;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            boolean zBooleanValue = true;
                            if (F6 instanceof F0) {
                                F0 f03 = (F0) F6;
                                if (AbstractC1209k.a(f02.o(), f03.o()) && f02.getClass() == f03.getClass()) {
                                    zBooleanValue = ((Boolean) interfaceC1182c.b(f03)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((F6.f15639q & 262144) != 0) && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o3 = ((AbstractC0358n) F6).f6056D;
                                    int i7 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC1397o3 != null) {
                                        if ((abstractC1397o3.f15639q & 262144) != 0) {
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
                            }
                            F6 = f(eVar);
                        }
                    }
                    abstractC1397o2 = abstractC1397o2.f15641s;
                }
            }
            kX = kX.v();
            abstractC1397o2 = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [Q0.F0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [l5.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void C(F0 f02, InterfaceC1182c interfaceC1182c) {
        AbstractC1397o abstractC1397o = (AbstractC1397o) f02;
        if (!abstractC1397o.f15637o.f15636B) {
            N0.a.b("visitSubtreeIf called on an unattached node");
        }
        h0.e eVar = new h0.e(new AbstractC1397o[16]);
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15637o;
        AbstractC1397o abstractC1397o3 = abstractC1397o2.f15642t;
        if (abstractC1397o3 == null) {
            b(eVar, abstractC1397o2);
        } else {
            eVar.b(abstractC1397o3);
        }
        while (true) {
            int i7 = eVar.f12548q;
            if (i7 == 0) {
                return;
            }
            AbstractC1397o abstractC1397o4 = (AbstractC1397o) eVar.l(i7 - 1);
            if ((abstractC1397o4.f15640r & 262144) != 0) {
                for (AbstractC1397o abstractC1397o5 = abstractC1397o4; abstractC1397o5 != null; abstractC1397o5 = abstractC1397o5.f15642t) {
                    if ((abstractC1397o5.f15639q & 262144) != 0) {
                        ?? F6 = abstractC1397o5;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof F0) {
                                F0 f03 = (F0) F6;
                                E0 e02 = (AbstractC1209k.a(f02.o(), f03.o()) && f02.getClass() == f03.getClass()) ? (E0) interfaceC1182c.b(f03) : E0.f5783o;
                                if (e02 == E0.f5785q) {
                                    return;
                                }
                                if (e02 == E0.f5784p) {
                                    break;
                                }
                            } else if ((F6.f15639q & 262144) != 0 && (F6 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o6 = ((AbstractC0358n) F6).f6056D;
                                int i8 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC1397o6 != null) {
                                    if ((abstractC1397o6.f15639q & 262144) != 0) {
                                        i8++;
                                        eVar2 = eVar2;
                                        if (i8 == 1) {
                                            F6 = abstractC1397o6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.b(F6);
                                                F6 = 0;
                                            }
                                            eVar2.b(abstractC1397o6);
                                        }
                                    }
                                    abstractC1397o6 = abstractC1397o6.f15642t;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i8 == 1) {
                                }
                            }
                            F6 = f(eVar2);
                        }
                    }
                }
            }
            b(eVar, abstractC1397o4);
        }
    }

    public static final long a(float f7, boolean z6, boolean z7) {
        return (((z6 ? 1L : 0L) | (z7 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f7)) << 32);
    }

    public static final void b(h0.e eVar, AbstractC1397o abstractC1397o) {
        h0.e eVarA = x(abstractC1397o).A();
        int i7 = eVarA.f12548q - 1;
        Object[] objArr = eVarA.f12546o;
        if (i7 < objArr.length) {
            while (i7 >= 0) {
                eVar.b(((K) objArr[i7]).f5821T.f6005f);
                i7--;
            }
        }
    }

    public static final int c(T t7, C0322t c0322t) {
        T tN0 = t7.n0();
        if (tN0 == null) {
            N0.a.b("Child of " + t7 + " cannot be null when calculating alignment line");
        }
        if (t7.r0().a().containsKey(c0322t)) {
            Integer num = (Integer) t7.r0().a().get(c0322t);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM0 = tN0.m0(c0322t);
            if (iM0 != Integer.MIN_VALUE) {
                tN0.f5885x = true;
                t7.f5886y = true;
                t7.x0();
                tN0.f5885x = false;
                t7.f5886y = false;
                return c0322t instanceof C0322t ? iM0 + ((int) (tN0.t0() & 4294967295L)) : iM0 + ((int) (tN0.t0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(C0341c c0341c) {
        C0 c02 = x(c0341c).f5821T.f6004e;
        AbstractC1209k.d(c02, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return c02.f5775C;
    }

    public static final AbstractC1397o e(InterfaceC0357m interfaceC0357m, int i7) {
        AbstractC1397o abstractC1397o = ((AbstractC1397o) interfaceC0357m).f15637o.f15642t;
        if (abstractC1397o == null || (abstractC1397o.f15640r & i7) == 0) {
            return null;
        }
        while (abstractC1397o != null) {
            int i8 = abstractC1397o.f15639q;
            if ((i8 & 2) != 0) {
                return null;
            }
            if ((i8 & i7) != 0) {
                return abstractC1397o;
            }
            abstractC1397o = abstractC1397o.f15642t;
        }
        return null;
    }

    public static final AbstractC1397o f(h0.e eVar) {
        int i7;
        if (eVar == null || (i7 = eVar.f12548q) == 0) {
            return null;
        }
        return (AbstractC1397o) eVar.l(i7 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final A g(AbstractC1397o abstractC1397o) {
        if ((abstractC1397o.f15639q & 2) != 0) {
            if (abstractC1397o instanceof A) {
                return (A) abstractC1397o;
            }
            if (abstractC1397o instanceof AbstractC0358n) {
                AbstractC1397o abstractC1397o2 = ((AbstractC0358n) abstractC1397o).f6056D;
                while (abstractC1397o2 != 0) {
                    if (abstractC1397o2 instanceof A) {
                        return (A) abstractC1397o2;
                    }
                    abstractC1397o2 = (!(abstractC1397o2 instanceof AbstractC0358n) || (abstractC1397o2.f15639q & 2) == 0) ? abstractC1397o2.f15642t : ((AbstractC0358n) abstractC1397o2).f6056D;
                }
            }
        }
        return null;
    }

    public static final int h(long j3, long j7) {
        boolean zQ = q(j3);
        if (zQ != q(j7)) {
            return zQ ? -1 : 1;
        }
        return (Math.min(l(j3), l(j7)) >= 0.0f && p(j3) != p(j7)) ? p(j3) ? -1 : 1 : (int) Math.signum(l(j3) - l(j7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(InterfaceC0356l interfaceC0356l, AbstractC0911s0 abstractC0911s0) {
        if (!((AbstractC1397o) interfaceC0356l).f15637o.f15636B) {
            N0.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        n0.i iVar = (n0.i) x(interfaceC0356l).f5817P;
        iVar.getClass();
        return C0879c.v(iVar, abstractC0911s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [Q0.F0, Q0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final F0 j(F0 f02) {
        C0352h0 c0352h0;
        AbstractC1397o abstractC1397o = (AbstractC1397o) f02;
        if (!abstractC1397o.f15637o.f15636B) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15637o.f15641s;
        K kX = x(f02);
        while (kX != null) {
            if ((kX.f5821T.f6005f.f15640r & 262144) != 0) {
                while (abstractC1397o2 != null) {
                    if ((abstractC1397o2.f15639q & 262144) != 0) {
                        ?? F6 = abstractC1397o2;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            if (F6 instanceof F0) {
                                F0 f03 = (F0) F6;
                                if (AbstractC1209k.a(f02.o(), f03.o()) && f02.getClass() == f03.getClass()) {
                                    return f03;
                                }
                            } else if ((F6.f15639q & 262144) != 0 && (F6 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o3 = ((AbstractC0358n) F6).f6056D;
                                int i7 = 0;
                                F6 = F6;
                                eVar = eVar;
                                while (abstractC1397o3 != null) {
                                    if ((abstractC1397o3.f15639q & 262144) != 0) {
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
                            F6 = f(eVar);
                        }
                    }
                    abstractC1397o2 = abstractC1397o2.f15641s;
                }
            }
            kX = kX.v();
            abstractC1397o2 = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
        }
        return null;
    }

    public static final ArrayList k(InterfaceC0327y interfaceC0327y) {
        AbstractC1209k.d(interfaceC0327y, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        K kQ0 = ((T) interfaceC0327y).q0();
        boolean zR = r(kQ0);
        C0994b c0994b = (C0994b) kQ0.p();
        h0.e eVar = (h0.e) c0994b.f12538p;
        ArrayList arrayList = new ArrayList(eVar.f12548q);
        int i7 = eVar.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k7 = (K) c0994b.get(i8);
            arrayList.add(zR ? k7.m() : k7.n());
        }
        return arrayList;
    }

    public static final float l(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(InterfaceC0360p interfaceC0360p) {
        if (((AbstractC1397o) interfaceC0360p).f15637o.f15636B) {
            v(interfaceC0360p, 1).Q0();
        }
    }

    public static final void n(A a4) {
        x(a4).F();
    }

    public static final void o(A0 a0) {
        x(a0).G();
    }

    public static final boolean p(long j3) {
        return (j3 & 2) != 0;
    }

    public static final boolean q(long j3) {
        return (j3 & 1) != 0;
    }

    public static final boolean r(K k7) {
        int iOrdinal = k7.f5822U.f5859d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new A2.W();
                }
                K kV = k7.v();
                if (kV != null) {
                    return r(kV);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static final boolean s(K k7) {
        if (k7.f5837v == null) {
            return false;
        }
        K kV = k7.v();
        return (kV != null ? kV.f5837v : null) == null || k7.f5822U.f5857b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(AbstractC1397o abstractC1397o, InterfaceC1180a interfaceC1180a) {
        o0 o0Var = abstractC1397o.f15643u;
        if (o0Var == null) {
            o0Var = new o0((n0) abstractC1397o);
            abstractC1397o.f15643u = o0Var;
        }
        ((C0415x) y(abstractC1397o)).getSnapshotObserver().a(o0Var, C0345e.f5979u, interfaceC1180a);
    }

    public static final void u(InterfaceC0357m interfaceC0357m) {
        s0.c cVar;
        K kX = x(interfaceC0357m);
        if (kX.f5809H) {
            return;
        }
        C0415x c0415x = (C0415x) O.a(kX);
        if (!C0415x.k() || (cVar = c0415x.f6598T) == null) {
            return;
        }
        cVar.f15827d.f8739a.B(kX.f5831p, new s0.b(cVar, kX));
    }

    public static final j0 v(InterfaceC0357m interfaceC0357m, int i7) {
        j0 j0Var = ((AbstractC1397o) interfaceC0357m).f15637o.f15644v;
        AbstractC1209k.c(j0Var);
        if (j0Var.J0() != interfaceC0357m || !k0.g(i7)) {
            return j0Var;
        }
        j0 j0Var2 = j0Var.f6027F;
        AbstractC1209k.c(j0Var2);
        return j0Var2;
    }

    public static final j0 w(InterfaceC0357m interfaceC0357m) {
        if (!((AbstractC1397o) interfaceC0357m).f15637o.f15636B) {
            N0.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        j0 j0VarV = v(interfaceC0357m, 2);
        if (!j0VarV.J0().f15636B) {
            N0.a.b("LayoutCoordinates is not attached.");
        }
        return j0VarV;
    }

    public static final K x(InterfaceC0357m interfaceC0357m) {
        j0 j0Var = ((AbstractC1397o) interfaceC0357m).f15637o.f15644v;
        if (j0Var != null) {
            return j0Var.f6024C;
        }
        throw n1.c.p("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final s0 y(InterfaceC0357m interfaceC0357m) {
        C0415x c0415x = x(interfaceC0357m).f5803B;
        if (c0415x != null) {
            return c0415x;
        }
        throw n1.c.p("This node does not have an owner.");
    }

    public static final View z(InterfaceC0357m interfaceC0357m) {
        if (!((AbstractC1397o) interfaceC0357m).f15637o.f15636B) {
            N0.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) O.a(x(interfaceC0357m));
    }
}
