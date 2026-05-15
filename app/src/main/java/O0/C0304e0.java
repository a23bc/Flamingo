package O0;

import D.AbstractC0060d;
import D.EnumC0063e0;
import D.InterfaceC0067h;
import Q0.AbstractC0347f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o0.C1247d;
import t.AbstractC1458m;
import t.C1455j;
import u.AbstractC1525a;

/* JADX INFO: renamed from: O0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0304e0 implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.S f5387a;

    public C0304e0(D.S s7) {
        this.f5387a = s7;
    }

    @Override // O0.Z
    public final int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        ArrayList arrayListK = AbstractC0347f.k(interfaceC0327y);
        D.S s7 = this.f5387a;
        s7.getClass();
        List list2 = (List) Z4.n.s0(1, arrayListK);
        Y y6 = list2 != null ? (Y) Z4.n.r0(list2) : null;
        List list3 = (List) Z4.n.s0(2, arrayListK);
        Y y7 = list3 != null ? (Y) Z4.n.r0(list3) : null;
        long jB = n1.b.b(i7, 0, 13);
        D.P p7 = s7.f1273f;
        p7.a(y6, y7, jB);
        List list4 = (List) Z4.n.r0(arrayListK);
        if (list4 == null) {
            list4 = Z4.v.f8818o;
        }
        return D.S.a(list4, i7, interfaceC0327y.L(s7.f1270c), interfaceC0327y.L(s7.f1272e), p7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O0.Z
    public final int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8;
        int[] iArr;
        D.P p7;
        List list2;
        int i9;
        C1455j c1455j;
        long jA;
        int i10;
        int i11;
        int i12;
        C1455j c1455j2;
        char c7 = 2;
        int i13 = 1;
        ArrayList arrayListK = AbstractC0347f.k(interfaceC0327y);
        D.S s7 = this.f5387a;
        s7.getClass();
        List list3 = (List) Z4.n.s0(1, arrayListK);
        Y y6 = list3 != null ? (Y) Z4.n.r0(list3) : null;
        List list4 = (List) Z4.n.s0(2, arrayListK);
        s7.f1273f.a(y6, list4 != null ? (Y) Z4.n.r0(list4) : null, n1.b.b(0, i7, 7));
        List list5 = (List) Z4.n.r0(arrayListK);
        if (list5 == null) {
            list5 = Z4.v.f8818o;
        }
        int iL = interfaceC0327y.L(s7.f1270c);
        int iL2 = interfaceC0327y.L(s7.f1272e);
        boolean zIsEmpty = list5.isEmpty();
        long jA2 = C1455j.a(0, 0);
        if (zIsEmpty) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        int i14 = 0;
        while (i14 < size3) {
            char c8 = c7;
            Y y7 = (Y) list5.get(i14);
            int iM = y7.M(i7);
            iArr2[i14] = iM;
            iArr3[i14] = y7.Q(iM);
            i14++;
            c7 = c8;
        }
        int size4 = list5.size();
        D.P p8 = s7.f1273f;
        if (Integer.MAX_VALUE < size4) {
            p8.getClass();
            D.N n7 = D.N.f1254o;
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            p8.getClass();
            D.N n8 = D.N.f1254o;
        }
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            i15 += iArr2[i16];
        }
        int size5 = ((list5.size() - 1) * iL) + i15;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i17 = iArr3[0];
        int i18 = size2 - 1;
        if (1 <= i18) {
            int i19 = 1;
            i8 = 0;
            while (true) {
                int i20 = iArr3[i19];
                if (i17 < i20) {
                    i17 = i20;
                }
                if (i19 == i18) {
                    break;
                }
                i19++;
            }
        } else {
            i8 = 0;
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr2[i8];
        int i22 = size - 1;
        if (1 <= i22) {
            int i23 = 1;
            while (true) {
                int i24 = iArr2[i23];
                if (i21 < i24) {
                    i21 = i24;
                }
                if (i23 == i22) {
                    break;
                }
                i23++;
            }
        }
        int i25 = size5;
        while (i21 <= i25 && i17 != i7) {
            int i26 = (i21 + i25) / 2;
            if (list5.isEmpty()) {
                i9 = i13;
                list2 = list5;
                jA = jA2;
                iArr = iArr3;
                p7 = p8;
            } else {
                int i27 = i8;
                iArr = iArr3;
                p7 = p8;
                D.I i28 = new D.I(p7, n1.b.a(i27, i26, i27, Integer.MAX_VALUE), iL, iL2);
                Y y8 = (Y) Z4.n.s0(i27, list5);
                int i29 = y8 != null ? iArr[i27] : i27;
                int i30 = y8 != null ? iArr2[i27] : i27;
                boolean z6 = list5.size() > i13 ? i13 : 0;
                long jA3 = C1455j.a(i26, Integer.MAX_VALUE);
                if (y8 == null) {
                    i9 = i13;
                    list2 = list5;
                    c1455j = null;
                } else {
                    list2 = list5;
                    i9 = i13;
                    c1455j = new C1455j(C1455j.a(i30, i29));
                }
                int i31 = 0;
                if (i28.b(z6, 0, jA3, c1455j, 0, 0, 0, false, false).f1231b) {
                    p7.getClass();
                    D.N n9 = D.N.f1254o;
                    jA = jA2;
                } else {
                    int size6 = list2.size();
                    int i32 = i26;
                    int i33 = i30;
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = i29;
                    int i39 = 0;
                    while (true) {
                        if (i36 >= size6) {
                            break;
                        }
                        int i40 = i32 - i33;
                        int i41 = size6;
                        int i42 = i36 + 1;
                        int iMax = Math.max(i35, i38);
                        Y y9 = (Y) Z4.n.s0(i42, list2);
                        i38 = y9 != null ? iArr[i42] : 0;
                        if (y9 != null) {
                            i10 = i42;
                            i11 = iArr2[i42] + iL;
                        } else {
                            i10 = i42;
                            i11 = 0;
                        }
                        boolean z7 = i36 + 2 < list2.size() ? i9 : 0;
                        int i43 = i10 - i37;
                        int i44 = i34;
                        long jA4 = C1455j.a(i40, Integer.MAX_VALUE);
                        if (y9 == null) {
                            i12 = i11;
                            c1455j2 = null;
                        } else {
                            i12 = i11;
                            c1455j2 = new C1455j(C1455j.a(i11, i38));
                        }
                        D.H hB = i28.b(z7, i43, jA4, c1455j2, i44, i31, iMax, false, false);
                        if (hB.f1230a) {
                            int i45 = iMax + iL2 + i31;
                            i28.a(hB, y9 != null ? i9 : 0, i44, i45, i40, i43);
                            int i46 = i12 - iL;
                            i34 = i44 + 1;
                            if (hB.f1231b) {
                                i31 = i45;
                                i39 = i10;
                                break;
                            }
                            i33 = i46;
                            i32 = i26;
                            i31 = i45;
                            i37 = i10;
                            i35 = 0;
                        } else {
                            i32 = i40;
                            i34 = i44;
                            i35 = iMax;
                            i33 = i12;
                        }
                        size6 = i41;
                        i36 = i10;
                        i39 = i36;
                    }
                    jA = C1455j.a(i31 - iL2, i39);
                }
            }
            i17 = (int) (jA >> 32);
            int i47 = (int) (jA & 4294967295L);
            if (i17 > i7 || i47 < iMin) {
                i21 = i26 + 1;
                if (i21 > i25) {
                    return i21;
                }
            } else {
                if (i17 >= i7) {
                    return i26;
                }
                i25 = i26 - 1;
            }
            size5 = i26;
            list5 = list2;
            p8 = p7;
            iArr3 = iArr;
            i13 = i9;
            i8 = 0;
        }
        return size5;
    }

    @Override // O0.Z
    public final int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        ArrayList arrayListK = AbstractC0347f.k(interfaceC0327y);
        D.S s7 = this.f5387a;
        s7.getClass();
        List list2 = (List) Z4.n.s0(1, arrayListK);
        Y y6 = list2 != null ? (Y) Z4.n.r0(list2) : null;
        List list3 = (List) Z4.n.s0(2, arrayListK);
        s7.f1273f.a(y6, list3 != null ? (Y) Z4.n.r0(list3) : null, n1.b.b(0, i7, 7));
        List list4 = (List) Z4.n.r0(arrayListK);
        if (list4 == null) {
            list4 = Z4.v.f8818o;
        }
        int iL = interfaceC0327y.L(s7.f1270c);
        int size = list4.size();
        int i8 = 0;
        int iMax = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < size) {
            int iP = ((Y) list4.get(i8)).P(i7) + iL;
            int i11 = i8 + 1;
            if (i11 - i9 == Integer.MAX_VALUE || i11 == list4.size()) {
                iMax = Math.max(iMax, (i10 + iP) - iL);
                i9 = i8;
                i10 = 0;
            } else {
                i10 += iP;
            }
            i8 = i11;
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0304e0) && AbstractC1209k.a(this.f5387a, ((C0304e0) obj).f5387a);
    }

    @Override // O0.Z
    public final int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        ArrayList arrayListK = AbstractC0347f.k(interfaceC0327y);
        D.S s7 = this.f5387a;
        s7.getClass();
        List list2 = (List) Z4.n.s0(1, arrayListK);
        Y y6 = list2 != null ? (Y) Z4.n.r0(list2) : null;
        List list3 = (List) Z4.n.s0(2, arrayListK);
        Y y7 = list3 != null ? (Y) Z4.n.r0(list3) : null;
        long jB = n1.b.b(i7, 0, 13);
        D.P p7 = s7.f1273f;
        p7.a(y6, y7, jB);
        List list4 = (List) Z4.n.r0(arrayListK);
        if (list4 == null) {
            list4 = Z4.v.f8818o;
        }
        return D.S.a(list4, i7, interfaceC0327y.L(s7.f1270c), interfaceC0327y.L(s7.f1272e), p7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [O0.m0[]] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [O0.m0[]] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        Y y6;
        h0.e eVar;
        Iterator it;
        int i7;
        C1455j c1455j;
        m0 m0Var;
        D.H h;
        int i8;
        ?? r8;
        Y y7;
        Y y8;
        int i9;
        m0 m0Var2;
        C1455j c1455j2;
        int i10;
        C1455j c1455j3;
        D.H h7;
        long jA;
        m0 m0Var3;
        long jA2;
        m0 m0VarD;
        int i11 = 16;
        final int i12 = 0;
        final int i13 = 1;
        ArrayList arrayListK = AbstractC0347f.k(interfaceC0298b0);
        final D.S s7 = this.f5387a;
        s7.getClass();
        boolean zIsEmpty = arrayListK.isEmpty();
        Z4.w wVar = Z4.w.f8819o;
        if (!zIsEmpty) {
            int iG = n1.a.g(j3);
            final D.P p7 = s7.f1273f;
            if (iG != 0) {
                List list2 = (List) Z4.n.q0(arrayListK);
                if (list2.isEmpty()) {
                    return interfaceC0298b0.k(0, 0, wVar, new C1247d(i11));
                }
                List list3 = (List) Z4.n.s0(1, arrayListK);
                Y y9 = list3 != null ? (Y) Z4.n.r0(list3) : null;
                List list4 = (List) Z4.n.s0(2, arrayListK);
                Y y10 = list4 != null ? (Y) Z4.n.r0(list4) : null;
                list2.size();
                p7.getClass();
                EnumC0063e0 enumC0063e0 = EnumC0063e0.f1315o;
                Y y11 = y10;
                long jM = AbstractC0060d.m(AbstractC0060d.g(AbstractC0060d.f(j3, enumC0063e0), 10));
                if (y9 != null) {
                    AbstractC0060d.k(y9, s7, jM, new InterfaceC1182c() { // from class: D.O
                        @Override // l5.InterfaceC1182c
                        public final Object b(Object obj) {
                            int iT;
                            int iS;
                            int iT2;
                            int iS2;
                            O0.m0 m0Var4 = (O0.m0) obj;
                            switch (i12) {
                                case 0:
                                    if (m0Var4 != null) {
                                        s7.getClass();
                                        iT = m0Var4.T();
                                        iS = m0Var4.S();
                                    } else {
                                        iT = 0;
                                        iS = 0;
                                    }
                                    new C1455j(C1455j.a(iT, iS));
                                    p7.getClass();
                                    break;
                                default:
                                    if (m0Var4 != null) {
                                        s7.getClass();
                                        iT2 = m0Var4.T();
                                        iS2 = m0Var4.S();
                                    } else {
                                        iT2 = 0;
                                        iS2 = 0;
                                    }
                                    new C1455j(C1455j.a(iT2, iS2));
                                    p7.getClass();
                                    break;
                            }
                            return Y4.o.f8736a;
                        }
                    });
                }
                if (y11 != null) {
                    AbstractC0060d.k(y11, s7, jM, new InterfaceC1182c() { // from class: D.O
                        @Override // l5.InterfaceC1182c
                        public final Object b(Object obj) {
                            int iT;
                            int iS;
                            int iT2;
                            int iS2;
                            O0.m0 m0Var4 = (O0.m0) obj;
                            switch (i13) {
                                case 0:
                                    if (m0Var4 != null) {
                                        s7.getClass();
                                        iT = m0Var4.T();
                                        iS = m0Var4.S();
                                    } else {
                                        iT = 0;
                                        iS = 0;
                                    }
                                    new C1455j(C1455j.a(iT, iS));
                                    p7.getClass();
                                    break;
                                default:
                                    if (m0Var4 != null) {
                                        s7.getClass();
                                        iT2 = m0Var4.T();
                                        iS2 = m0Var4.S();
                                    } else {
                                        iT2 = 0;
                                        iS2 = 0;
                                    }
                                    new C1455j(C1455j.a(iT2, iS2));
                                    p7.getClass();
                                    break;
                            }
                            return Y4.o.f8736a;
                        }
                    });
                }
                Iterator it2 = list2.iterator();
                long jF = AbstractC0060d.f(j3, enumC0063e0);
                h0.e eVar2 = new h0.e(new InterfaceC0296a0[16]);
                int iH = n1.a.h(jF);
                int iJ = n1.a.j(jF);
                int iG2 = n1.a.g(jF);
                t.y yVar = AbstractC1458m.f16088a;
                t.y yVar2 = new t.y();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(interfaceC0298b0.v(s7.f1270c));
                int iCeil2 = (int) Math.ceil(interfaceC0298b0.v(s7.f1272e));
                long jA3 = n1.b.a(0, iH, 0, iG2);
                long jM2 = AbstractC0060d.m(AbstractC0060d.g(jA3, 14));
                if (it2.hasNext()) {
                    try {
                        y6 = (Y) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        y6 = null;
                    }
                } else {
                    y6 = null;
                }
                if (y6 != null) {
                    if (AbstractC0060d.i(AbstractC0060d.h(y6)) == 0.0f) {
                        AbstractC0060d.h(y6);
                        m0VarD = y6.d(jM2);
                        eVar = eVar2;
                        jA2 = C1455j.a(m0VarD.T(), m0VarD.S());
                    } else {
                        eVar = eVar2;
                        int iM = y6.M(Integer.MAX_VALUE);
                        jA2 = C1455j.a(iM, y6.Q(iM));
                        m0VarD = null;
                    }
                    it = it2;
                    i7 = iJ;
                    c1455j = new C1455j(jA2);
                    m0Var = m0VarD;
                } else {
                    eVar = eVar2;
                    it = it2;
                    i7 = iJ;
                    c1455j = null;
                    m0Var = null;
                }
                m0 m0Var4 = m0Var;
                Integer numValueOf = c1455j != null ? Integer.valueOf((int) (c1455j.f16081a >> 32)) : null;
                Integer numValueOf2 = c1455j != null ? Integer.valueOf((int) (c1455j.f16081a & 4294967295L)) : null;
                C1455j c1455j4 = c1455j;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                int i14 = i7;
                t.z zVar = new t.z();
                Integer numValueOf3 = numValueOf2;
                D.P p8 = s7.f1273f;
                D.I i15 = new D.I(p8, jF, iCeil, iCeil2);
                D.H hB = i15.b(it.hasNext(), 0, C1455j.a(iH, iG2), c1455j4, 0, 0, 0, false, false);
                D.S s8 = s7;
                if (hB.f1231b) {
                    h = hB;
                    i15.a(h, c1455j4 != null, -1, 0, iH, 0);
                } else {
                    h = hB;
                }
                Y y12 = y6;
                int[] iArrCopyOf = iArr2;
                Y y13 = y12;
                int i16 = i14;
                int i17 = iCeil;
                Z4.w wVar2 = wVar;
                t.z zVar2 = zVar;
                D.H h8 = h;
                int[] iArrCopyOf2 = iArr;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = iH;
                int i26 = iG2;
                int i27 = 0;
                while (!h8.f1231b && y13 != null) {
                    AbstractC1209k.c(numValueOf);
                    int iIntValue = numValueOf.intValue();
                    AbstractC1209k.c(numValueOf3);
                    int i28 = i20;
                    int i29 = i21 + iIntValue;
                    int iMax = Math.max(i27, numValueOf3.intValue());
                    int i30 = i25 - iIntValue;
                    int i31 = i18 + 1;
                    p8.getClass();
                    arrayList.add(y13);
                    yVar2.h(i18, m0Var4);
                    boolean z6 = y13.i() instanceof D.n0;
                    int i32 = i31 - i22;
                    if (it.hasNext()) {
                        try {
                            y7 = (Y) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            y7 = null;
                        }
                    } else {
                        y7 = null;
                    }
                    if (y7 != null) {
                        if (AbstractC0060d.i(AbstractC0060d.h(y7)) == 0.0f) {
                            AbstractC0060d.h(y7);
                            m0 m0VarD2 = y7.d(jM2);
                            m0Var3 = m0VarD2;
                            jA = C1455j.a(m0VarD2.T(), m0Var3.S());
                        } else {
                            int iM2 = y7.M(Integer.MAX_VALUE);
                            jA = C1455j.a(iM2, y7.Q(iM2));
                            m0Var3 = null;
                        }
                        y8 = y7;
                        i9 = i31;
                        c1455j2 = new C1455j(jA);
                        m0Var2 = m0Var3;
                    } else {
                        y8 = y7;
                        i9 = i31;
                        m0Var2 = null;
                        c1455j2 = null;
                    }
                    m0 m0Var5 = m0Var2;
                    Integer numValueOf4 = c1455j2 != null ? Integer.valueOf(((int) (c1455j2.f16081a >> 32)) + i17) : null;
                    numValueOf3 = c1455j2 != null ? Integer.valueOf((int) (c1455j2.f16081a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jA4 = C1455j.a(i30, i26);
                    if (c1455j2 == null) {
                        i10 = i30;
                        c1455j3 = null;
                    } else {
                        AbstractC1209k.c(numValueOf4);
                        int iIntValue2 = numValueOf4.intValue();
                        AbstractC1209k.c(numValueOf3);
                        i10 = i30;
                        c1455j3 = new C1455j(C1455j.a(iIntValue2, numValueOf3.intValue()));
                    }
                    D.H hB2 = i15.b(zHasNext, i32, jA4, c1455j3, i23, i24, iMax, false, false);
                    if (hB2.f1230a) {
                        int iMin = Math.min(Math.max(i16, i29), iH);
                        int i33 = i24 + iMax;
                        h7 = hB2;
                        int i34 = i23;
                        i15.a(h7, c1455j2 != null, i34, i33, i10, i32);
                        int i35 = i28 + 1;
                        if (iArrCopyOf.length < i35) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i35, (iArrCopyOf.length * 3) / 2));
                            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
                        }
                        iArrCopyOf[i28] = iMax;
                        i20 = i28 + 1;
                        i26 = (iG2 - i33) - iCeil2;
                        int i36 = i19 + 1;
                        if (iArrCopyOf2.length < i36) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i36, (iArrCopyOf2.length * 3) / 2));
                            AbstractC1209k.e(iArrCopyOf2, "copyOf(...)");
                        }
                        iArrCopyOf2[i19] = i9;
                        i19++;
                        i23 = i34 + 1;
                        i24 = i33 + iCeil2;
                        i10 = iH;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i17) : null;
                        i16 = iMin;
                        i22 = i9;
                        i27 = 0;
                        i21 = 0;
                    } else {
                        h7 = hB2;
                        i21 = i29;
                        i20 = i28;
                        numValueOf = numValueOf4;
                        i27 = iMax;
                    }
                    y13 = y8;
                    h8 = h7;
                    i25 = i10;
                    i18 = i9;
                    m0Var4 = m0Var5;
                }
                int i37 = i20;
                int size = arrayList.size();
                ?? r22 = new m0[size];
                for (int i38 = 0; i38 < size; i38++) {
                    r22[i38] = yVar2.b(i38);
                }
                int[] iArr3 = new int[i19];
                int[] iArr4 = new int[i19];
                int[] iArr5 = iArrCopyOf;
                int i39 = 0;
                int i40 = 0;
                int i41 = 0;
                ?? r23 = r22;
                while (i40 < i19) {
                    int i42 = i19;
                    int i43 = iArrCopyOf2[i40];
                    if (i40 < 0 || i40 >= (i8 = i37)) {
                        AbstractC1525a.d("Index must be between 0 and size");
                        throw null;
                    }
                    int iG3 = iArr5[i40];
                    t.z zVar3 = zVar2;
                    if (zVar3.b(i40)) {
                        r8 = r23;
                    } else {
                        iG3 = n1.a.g(jA3) == Integer.MAX_VALUE ? Integer.MAX_VALUE : n1.a.g(jA3) - i41;
                        r8 = r23;
                    }
                    int[] iArr6 = iArr5;
                    int i44 = i16;
                    int[] iArr7 = iArr3;
                    int[] iArr8 = iArrCopyOf2;
                    zVar2 = zVar3;
                    i37 = i8;
                    D.S s9 = s8;
                    h0.e eVar3 = eVar;
                    int i45 = iG3;
                    int i46 = i17;
                    InterfaceC0296a0 interfaceC0296a0J = AbstractC0060d.j(s9, i44, n1.a.i(jA3), n1.a.h(jA3), i45, i46, interfaceC0298b0, arrayList, r8, i39, i43, iArr7, i40);
                    int iE = interfaceC0296a0J.e();
                    int iC = interfaceC0296a0J.c();
                    iArr4[i40] = iC;
                    int iMax2 = Math.max(i44, iE);
                    eVar3.b(interfaceC0296a0J);
                    i40++;
                    i16 = iMax2;
                    iArr3 = iArr7;
                    i17 = i46;
                    r23 = r8;
                    i39 = i43;
                    wVar2 = wVar2;
                    eVar = eVar3;
                    i19 = i42;
                    iArr5 = iArr6;
                    s8 = s9;
                    i41 += iC;
                    iArrCopyOf2 = iArr8;
                }
                int i47 = i16;
                int[] iArr9 = iArr3;
                int i48 = i47;
                int i49 = i41;
                D.S s10 = s8;
                h0.e eVar4 = eVar;
                Z4.w wVar3 = wVar2;
                if (eVar4.f12548q == 0) {
                    i48 = 0;
                    i49 = 0;
                }
                InterfaceC0067h interfaceC0067h = s10.f1269b;
                int iL = ((eVar4.f12548q - 1) * interfaceC0298b0.L(interfaceC0067h.a())) + i49;
                int i50 = n1.a.i(jF);
                int iG4 = n1.a.g(jF);
                if (iL < i50) {
                    iL = i50;
                }
                if (iL <= iG4) {
                    iG4 = iL;
                }
                interfaceC0067h.b(interfaceC0298b0, iG4, iArr4, iArr9);
                int iJ2 = n1.a.j(jF);
                int iH2 = n1.a.h(jF);
                if (i48 < iJ2) {
                    i48 = iJ2;
                }
                if (i48 <= iH2) {
                    iH2 = i48;
                }
                return interfaceC0298b0.k(iH2, iG4, wVar3, new D.J(0, eVar4));
            }
            p7.getClass();
            D.N n7 = D.N.f1254o;
            D.N n8 = D.N.f1254o;
        }
        return interfaceC0298b0.k(0, 0, wVar, new C1247d(16));
    }

    public final int hashCode() {
        return this.f5387a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f5387a + ')';
    }
}
