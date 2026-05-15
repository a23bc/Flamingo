package b1;

import A2.W;
import D.A0;
import X.C0469c0;
import h1.AbstractC0996a;
import i1.AbstractC1061d;
import i1.C1059b;
import j5.AbstractC1110d;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1182c;
import m1.C1191a;
import y0.AbstractC1983p;
import y0.C1962L;

/* JADX INFO: renamed from: b1.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0607C {

    /* JADX INFO: renamed from: a */
    public static final V1.a f9897a = new V1.a(new x(1), new C0469c0(27));

    /* JADX INFO: renamed from: b */
    public static final V1.a f9898b = new V1.a(new x(2), new C0469c0(28));

    /* JADX INFO: renamed from: c */
    public static final V1.a f9899c = new V1.a(new x(3), new C0469c0(29));

    public static C0616a a(String str, M m7, long j3, n1.d dVar, f1.d dVar2, int i7, int i8) {
        Z4.v vVar = Z4.v.f8818o;
        return new C0616a(new j1.c(str, m7, vVar, vVar, dVar2, dVar), i7, 1, j3);
    }

    public static final long b(int i7, int i8) {
        if (i7 < 0 || i8 < 0) {
            AbstractC0996a.a("start and end cannot be negative. [start: " + i7 + ", end: " + i8 + ']');
        }
        long j3 = (((long) i8) & 4294967295L) | (((long) i7) << 32);
        int i9 = L.f9944c;
        return j3;
    }

    public static final long c(long j3, int i7) {
        int i8 = L.f9944c;
        int i9 = (int) (j3 >> 32);
        int i10 = i9 < 0 ? 0 : i9;
        if (i10 > i7) {
            i10 = i7;
        }
        int i11 = (int) (4294967295L & j3);
        int i12 = i11 >= 0 ? i11 : 0;
        if (i12 <= i7) {
            i7 = i12;
        }
        return (i10 == i9 && i7 == i11) ? j3 : b(i10, i7);
    }

    public static void d(A0.f fVar, C0613I c0613i, long j3, long j7, C1962L c1962l, int i7) {
        C1962L c1962l2 = (i7 & 16) != 0 ? null : c1962l;
        C0612H c0612h = c0613i.f9929a;
        if (c1962l2 == null) {
            c1962l2 = c0612h.f9921b.f9947a.f9911n;
        }
        C0608D c0608d = c0612h.f9921b.f9947a;
        m1.l lVar = c0608d.f9910m;
        A0.d dVar = c0608d.f9912o;
        A0.b bVarA = fVar.A();
        long jW = bVarA.W();
        bVarA.S().l();
        try {
            A.b bVar = (A.b) bVarA.f50p;
            bVar.J(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
            if (c0613i.d() && c0612h.f9925f != 3) {
                long j8 = c0613i.f9931c;
                bVar.o(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L), 1);
            }
            AbstractC1983p abstractC1983pC = c0612h.f9921b.f9947a.f9900a.c();
            C0630o c0630o = c0613i.f9930b;
            M m7 = c0612h.f9921b;
            if (abstractC1983pC == null || j3 != 16) {
                c0630o.i(fVar.A().S(), AbstractC1110d.B(j3 != 16 ? j3 : m7.b(), Float.NaN), c1962l2, lVar, dVar);
            } else {
                c0630o.j(fVar.A().S(), abstractC1983pC, Float.isNaN(Float.NaN) ? m7.f9947a.f9900a.a() : Float.NaN, c1962l2, lVar, dVar);
            }
            n1.c.A(bVarA, jW);
        } catch (Throwable th) {
            n1.c.A(bVarA, jW);
            throw th;
        }
    }

    public static final int e(int i7, List list) {
        int i8;
        int i9 = ((q) Z4.n.x0(list)).f9998c;
        if (i7 > ((q) Z4.n.x0(list)).f9998c) {
            AbstractC0996a.a("Index " + i7 + " should be less or equal than last line's end " + i9);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (true) {
            if (i10 > size) {
                i8 = -(i10 + 1);
                break;
            }
            i8 = (i10 + size) >>> 1;
            q qVar = (q) list.get(i8);
            byte b7 = qVar.f9997b > i7 ? (byte) 1 : qVar.f9998c <= i7 ? (byte) -1 : (byte) 0;
            if (b7 >= 0) {
                if (b7 <= 0) {
                    break;
                }
                size = i8 - 1;
            } else {
                i10 = i8 + 1;
            }
        }
        if (i8 >= 0 && i8 < list.size()) {
            return i8;
        }
        StringBuilder sbV = n1.c.v(i8, "Found paragraph index ", " should be in range [0, ");
        sbV.append(list.size());
        sbV.append(").\nDebug info: index=");
        sbV.append(i7);
        sbV.append(", paragraphs=[");
        sbV.append(p1.a.a(list, null, new C0469c0(4), 31));
        sbV.append(']');
        AbstractC0996a.a(sbV.toString());
        return i8;
    }

    public static final int f(int i7, List list) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            q qVar = (q) list.get(i9);
            byte b7 = qVar.f9999d > i7 ? (byte) 1 : qVar.f10000e <= i7 ? (byte) -1 : (byte) 0;
            if (b7 < 0) {
                i8 = i9 + 1;
            } else {
                if (b7 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final int g(ArrayList arrayList, float f7) {
        if (f7 <= 0.0f) {
            return 0;
        }
        if (f7 >= ((q) Z4.n.x0(arrayList)).f10002g) {
            return Z4.o.d0(arrayList);
        }
        int size = arrayList.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            q qVar = (q) arrayList.get(i8);
            byte b7 = qVar.f10001f > f7 ? (byte) 1 : qVar.f10002g <= f7 ? (byte) -1 : (byte) 0;
            if (b7 < 0) {
                i7 = i8 + 1;
            } else {
                if (b7 <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final void h(ArrayList arrayList, long j3, InterfaceC1182c interfaceC1182c) {
        int size = arrayList.size();
        for (int iE = e(L.f(j3), arrayList); iE < size; iE++) {
            q qVar = (q) arrayList.get(iE);
            if (qVar.f9997b >= L.e(j3)) {
                return;
            }
            if (qVar.f9997b != qVar.f9998c) {
                interfaceC1182c.b(qVar);
            }
        }
    }

    public static final M i(M m7, n1.n nVar) {
        C0608D c0608d = m7.f9947a;
        m1.o oVar = AbstractC0609E.f9916d;
        m1.o oVarE = c0608d.f9900a.e(new A0(17));
        n1.q[] qVarArr = n1.p.f14525b;
        long j3 = c0608d.f9901b;
        if ((j3 & 1095216660480L) == 0) {
            j3 = AbstractC0609E.f9913a;
        }
        long j7 = j3;
        f1.k kVar = c0608d.f9902c;
        if (kVar == null) {
            kVar = f1.k.f12002t;
        }
        f1.k kVar2 = kVar;
        f1.i iVar = c0608d.f9903d;
        f1.i iVar2 = new f1.i(iVar != null ? iVar.f11996a : 0);
        f1.j jVar = c0608d.f9904e;
        f1.j jVar2 = new f1.j(jVar != null ? jVar.f11997a : 65535);
        f1.n nVar2 = c0608d.f9905f;
        if (nVar2 == null) {
            nVar2 = f1.n.f12012a;
        }
        f1.n nVar3 = nVar2;
        String str = c0608d.f9906g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j8 = c0608d.h;
        if ((j8 & 1095216660480L) == 0) {
            j8 = AbstractC0609E.f9914b;
        }
        long j9 = j8;
        C1191a c1191a = c0608d.f9907i;
        C1191a c1191a2 = new C1191a(c1191a != null ? c1191a.f14326a : 0.0f);
        m1.p pVar = c0608d.f9908j;
        if (pVar == null) {
            pVar = m1.p.f14351c;
        }
        m1.p pVar2 = pVar;
        C1059b c1059bS = c0608d.f9909k;
        if (c1059bS == null) {
            C1059b c1059b = C1059b.f13289q;
            c1059bS = AbstractC1061d.f13292a.s();
        }
        C1059b c1059b2 = c1059bS;
        long j10 = c0608d.l;
        if (j10 == 16) {
            j10 = AbstractC0609E.f9915c;
        }
        long j11 = j10;
        m1.l lVar = c0608d.f9910m;
        if (lVar == null) {
            lVar = m1.l.f14345b;
        }
        m1.l lVar2 = lVar;
        C1962L c1962l = c0608d.f9911n;
        if (c1962l == null) {
            c1962l = C1962L.f20207d;
        }
        C1962L c1962l2 = c1962l;
        A0.d dVar = c0608d.f9912o;
        if (dVar == null) {
            dVar = A0.h.f59b;
        }
        C0608D c0608d2 = new C0608D(oVarE, j7, kVar2, iVar2, jVar2, nVar3, str2, j9, c1191a2, pVar2, c1059b2, j11, lVar2, c1962l2, dVar);
        int i7 = u.f10015b;
        t tVar = m7.f9948b;
        int i8 = tVar.f10006a;
        int i9 = 5;
        int i10 = i8 == Integer.MIN_VALUE ? 5 : i8;
        int i11 = tVar.f10007b;
        if (i11 == 3) {
            int iOrdinal = nVar.ordinal();
            if (iOrdinal == 0) {
                i9 = 4;
            } else if (iOrdinal != 1) {
                throw new W();
            }
        } else if (i11 == Integer.MIN_VALUE) {
            int iOrdinal2 = nVar.ordinal();
            if (iOrdinal2 == 0) {
                i9 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new W();
                }
                i9 = 2;
            }
        } else {
            i9 = i11;
        }
        long j12 = tVar.f10008c;
        if ((j12 & 1095216660480L) == 0) {
            j12 = u.f10014a;
        }
        m1.q qVar = tVar.f10009d;
        if (qVar == null) {
            qVar = m1.q.f14354c;
        }
        m1.q qVar2 = qVar;
        int i12 = m1.e.f14331b;
        int i13 = tVar.f10012g;
        if (i13 == 0) {
            i13 = m1.e.f14331b;
        }
        int i14 = i13;
        int i15 = tVar.h;
        int i16 = i15 == Integer.MIN_VALUE ? 1 : i15;
        m1.s sVar = tVar.f10013i;
        if (sVar == null) {
            sVar = m1.s.f14358c;
        }
        return new M(c0608d2, new t(i10, i9, j12, qVar2, tVar.f10010e, tVar.f10011f, i14, i16, sVar), m7.f9949c);
    }
}
