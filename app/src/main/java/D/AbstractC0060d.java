package D;

import O0.C0304e0;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import f0.AbstractC0875a;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0906p0;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1389g;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import y1.C1993b;

/* JADX INFO: renamed from: D.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060d {

    /* JADX INFO: renamed from: a */
    public static final C0058c f1304a = new C0058c(0);

    /* JADX INFO: renamed from: b */
    public static final C0058c f1305b = new C0058c(1);

    /* JADX INFO: renamed from: c */
    public static final P0.f f1306c = new P0.f(new A0(0));

    /* JADX INFO: renamed from: d */
    public static final int f1307d = 9;

    /* JADX INFO: renamed from: e */
    public static final int f1308e = 6;

    /* JADX INFO: renamed from: f */
    public static final int f1309f = 10;

    /* JADX INFO: renamed from: g */
    public static final int f1310g = 5;
    public static final int h = 48;

    public static final void a(InterfaceC1398p interfaceC1398p, C1390h c1390h, n0.d dVar, C0912t c0912t, int i7, int i8) {
        int i9;
        c0912t.Z(380139498);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i11 = i9 | 432;
        if (c0912t.N(i11 & 1, (i11 & 1171) != 1170)) {
            if (i10 != 0) {
                interfaceC1398p = C1395m.f15634a;
            }
            c1390h = C1385c.f15612o;
            O0.Z zD = AbstractC0074o.d(c1390h, false);
            boolean zF = c0912t.f(zD);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = new C0078t(zD, 0, dVar);
                c0912t.i0(objK);
            }
            O0.w0.c(interfaceC1398p, (l5.e) objK, c0912t, i11 & 14);
        } else {
            c0912t.Q();
        }
        InterfaceC1398p interfaceC1398p2 = interfaceC1398p;
        C1390h c1390h2 = c1390h;
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0079u(interfaceC1398p2, c1390h2, dVar, i7, i8);
        }
    }

    public static final void b(InterfaceC1398p interfaceC1398p, InterfaceC0064f interfaceC0064f, InterfaceC0067h interfaceC0067h, T t7, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        Object obj;
        C1389g c1389g = C1385c.f15621x;
        c0912t.Z(-1956591841);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(interfaceC0064f) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.f(interfaceC0067h) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.f(c1389g) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t.d(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0912t.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            obj = t7;
            i8 |= c0912t.f(obj) ? 1048576 : 524288;
        } else {
            obj = t7;
        }
        if ((i7 & 12582912) == 0) {
            i8 |= c0912t.h(dVar) ? 8388608 : 4194304;
        }
        int i9 = i8;
        if (c0912t.N(i9 & 1, (i9 & 4793491) != 4793490)) {
            int i10 = i9 & 3670016;
            boolean z6 = i10 == 1048576;
            Object objK = c0912t.K();
            Object obj2 = C0903o.f11850a;
            if (z6 || objK == obj2) {
                obj.getClass();
                N n7 = N.f1254o;
                objK = new P();
                c0912t.i0(objK);
            }
            P p7 = (P) objK;
            int i11 = i9 >> 3;
            boolean zF = ((((57344 & i11) ^ 24576) > 16384 && c0912t.d(Integer.MAX_VALUE)) || (i11 & 24576) == 16384) | ((((i11 & 14) ^ 6) > 4 && c0912t.f(interfaceC0064f)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && c0912t.f(interfaceC0067h)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && c0912t.f(c1389g)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && c0912t.d(Integer.MAX_VALUE)) || (i11 & 3072) == 2048) | c0912t.f(p7);
            Object objK2 = c0912t.K();
            if (zF || objK2 == obj2) {
                Object s7 = new S(interfaceC0064f, interfaceC0067h, interfaceC0064f.a(), new C(c1389g), interfaceC0067h.a(), p7);
                c0912t.i0(s7);
                objK2 = s7;
            }
            S s8 = (S) objK2;
            boolean z7 = (i10 == 1048576) | ((i9 & 29360128) == 8388608) | ((i9 & 458752) == 131072);
            Object objK3 = c0912t.K();
            Object obj3 = objK3;
            if (z7 || objK3 == obj2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new n0.d(-1192950673, new M(0, dVar), true));
                t7.getClass();
                N n8 = N.f1254o;
                c0912t.i0(arrayList);
                obj3 = arrayList;
            }
            n0.d dVar2 = new n0.d(1271844412, new O0.E(0, (List) obj3), true);
            boolean zF2 = c0912t.f(s8);
            Object objK4 = c0912t.K();
            if (zF2 || objK4 == obj2) {
                objK4 = new C0304e0(s8);
                c0912t.i0(objK4);
            }
            O0.Z z8 = (O0.Z) objK4;
            long j3 = c0912t.f11891T;
            int i12 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, z8, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i12))) {
                n1.c.w(i12, c0912t, i12, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            dVar2.invoke(c0912t, 0);
            c0912t.p(true);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new L(interfaceC1398p, interfaceC0064f, interfaceC0067h, t7, dVar, i7, 0);
        }
    }

    public static final void c(final InterfaceC1398p interfaceC1398p, final InterfaceC0064f interfaceC0064f, final InterfaceC0067h interfaceC0067h, C1389g c1389g, int i7, int i8, final n0.d dVar, C0912t c0912t, final int i9) {
        final C1389g c1389g2;
        final int i10;
        final int i11;
        c0912t.Z(-1303174015);
        int i12 = i9 | 224256;
        if (c0912t.N(i12 & 1, (599187 & i12) != 599186)) {
            C1389g c1389g3 = C1385c.f15621x;
            b(interfaceC1398p, interfaceC0064f, interfaceC0067h, T.f1274i, dVar, c0912t, 14380470);
            i10 = Integer.MAX_VALUE;
            i11 = Integer.MAX_VALUE;
            c1389g2 = c1389g3;
        } else {
            c0912t.Q();
            c1389g2 = c1389g;
            i10 = i7;
            i11 = i8;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(interfaceC0064f, interfaceC0067h, c1389g2, i10, i11, dVar, i9) { // from class: D.K

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0064f f1239p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0067h f1240q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C1389g f1241r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ int f1242s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ int f1243t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ n0.d f1244u;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iB = C0879c.B(1573303);
                    InterfaceC0064f interfaceC0064f2 = this.f1239p;
                    InterfaceC0067h interfaceC0067h2 = this.f1240q;
                    n0.d dVar2 = this.f1244u;
                    AbstractC0060d.c(this.f1238o, interfaceC0064f2, interfaceC0067h2, this.f1241r, this.f1242s, this.f1243t, dVar2, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void d(C0912t c0912t, InterfaceC1398p interfaceC1398p) {
        C0073n c0073n = C0073n.f1353c;
        long j3 = c0912t.f11891T;
        int i7 = (int) (j3 ^ (j3 >>> 32));
        InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p);
        InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
        InterfaceC0355k.f6047i.getClass();
        C0353i c0353i = C0354j.f6015b;
        AbstractC0875a abstractC0875a = c0912t.f11893a;
        c0912t.b0();
        if (c0912t.f11890S) {
            c0912t.k(c0353i);
        } else {
            c0912t.l0();
        }
        C0879c.y(c0912t, c0073n, C0354j.f6019f);
        C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
        C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
        C0351h c0351h = C0354j.f6020g;
        if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
            n1.c.w(i7, c0912t, i7, c0351h);
        }
        c0912t.p(true);
    }

    public static long f(long j3, EnumC0063e0 enumC0063e0) {
        EnumC0063e0 enumC0063e02 = EnumC0063e0.f1315o;
        return n1.b.a(enumC0063e0 == enumC0063e02 ? n1.a.j(j3) : n1.a.i(j3), enumC0063e0 == enumC0063e02 ? n1.a.h(j3) : n1.a.g(j3), enumC0063e0 == enumC0063e02 ? n1.a.i(j3) : n1.a.j(j3), enumC0063e0 == enumC0063e02 ? n1.a.g(j3) : n1.a.h(j3));
    }

    public static long g(long j3, int i7) {
        return n1.b.a(0, n1.a.h(j3), (i7 & 4) != 0 ? n1.a.i(j3) : 0, n1.a.g(j3));
    }

    public static final n0 h(O0.Y y6) {
        Object objI = y6.i();
        if (objI instanceof n0) {
            return (n0) objI;
        }
        return null;
    }

    public static final float i(n0 n0Var) {
        if (n0Var != null) {
            return n0Var.f1355a;
        }
        return 0.0f;
    }

    public static final InterfaceC0296a0 j(m0 m0Var, int i7, int i8, int i9, int i10, int i11, InterfaceC0298b0 interfaceC0298b0, List list, O0.m0[] m0VarArr, int i12, int i13, int[] iArr, int i14) {
        int i15;
        float f7;
        long j3;
        int i16;
        int i17;
        int i18;
        List list2 = list;
        long j7 = i11;
        int i19 = i13 - i12;
        int[] iArr2 = new int[i19];
        int i20 = i12;
        int iMax = 0;
        int i21 = 0;
        int i22 = 0;
        int iMin = 0;
        float f8 = 0.0f;
        while (i20 < i13) {
            O0.Y y6 = (O0.Y) list2.get(i20);
            float fI = i(h(y6));
            if (fI > 0.0f) {
                f8 += fI;
                i21++;
                j3 = j7;
                i16 = i20;
            } else {
                int i23 = i9 - i22;
                O0.m0 m0VarD = m0VarArr[i20];
                j3 = j7;
                if (m0VarD == null) {
                    if (i9 == Integer.MAX_VALUE) {
                        i16 = i20;
                        i17 = i21;
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i16 = i20;
                        i17 = i21;
                        i18 = i23 < 0 ? 0 : i23;
                    }
                    m0VarD = y6.d(m0Var.c(0, i18, i10, false));
                } else {
                    i16 = i20;
                    i17 = i21;
                }
                O0.m0 m0Var2 = m0VarD;
                int iJ = m0Var.j(m0Var2);
                int iH = m0Var.h(m0Var2);
                iArr2[i16 - i12] = iJ;
                int i24 = i23 - iJ;
                if (i24 < 0) {
                    i24 = 0;
                }
                iMin = Math.min(i11, i24);
                i22 += iJ + iMin;
                iMax = Math.max(iMax, iH);
                m0VarArr[i16] = m0Var2;
                i21 = i17;
            }
            i20 = i16 + 1;
            j7 = j3;
        }
        long j8 = j7;
        int i25 = i21;
        if (i25 == 0) {
            i22 -= iMin;
            i15 = 0;
        } else {
            long j9 = ((long) (i25 - 1)) * j8;
            long jRound = ((long) ((i9 != Integer.MAX_VALUE ? i9 : i7) - i22)) - j9;
            if (jRound < 0) {
                jRound = 0;
            }
            float f9 = jRound / f8;
            for (int i26 = i12; i26 < i13; i26++) {
                jRound -= (long) Math.round(i(h((O0.Y) list2.get(i26))) * f9);
            }
            int i27 = i12;
            int i28 = iMax;
            int i29 = 0;
            while (i27 < i13) {
                if (m0VarArr[i27] == null) {
                    O0.Y y7 = (O0.Y) list2.get(i27);
                    f7 = f9;
                    n0 n0VarH = h(y7);
                    float fI2 = i(n0VarH);
                    if (fI2 <= 0.0f) {
                        E.a.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j10 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fI2 * f7) + iSignum);
                    O0.m0 m0VarD2 = y7.d(m0Var.c((!(n0VarH != null ? n0VarH.f1356b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i10, true));
                    int iJ2 = m0Var.j(m0VarD2);
                    int iH2 = m0Var.h(m0VarD2);
                    iArr2[i27 - i12] = iJ2;
                    i29 += iJ2;
                    int iMax3 = Math.max(i28, iH2);
                    m0VarArr[i27] = m0VarD2;
                    i28 = iMax3;
                    jRound = j10;
                } else {
                    f7 = f9;
                }
                i27++;
                list2 = list;
                f9 = f7;
            }
            i15 = (int) (((long) i29) + j9);
            int i30 = i9 - i22;
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 > i30) {
                i15 = i30;
            }
            iMax = i28;
        }
        int i31 = i15 + i22;
        if (i31 < 0) {
            i31 = 0;
        }
        int iMax4 = Math.max(i31, i7);
        int iMax5 = Math.max(iMax, Math.max(i8, 0));
        int[] iArr3 = new int[i19];
        m0Var.e(iMax4, iArr2, iArr3, interfaceC0298b0);
        return m0Var.i(m0VarArr, interfaceC0298b0, iArr3, iMax4, iMax5, iArr, i14, i12, i13);
    }

    public static final void k(O0.Y y6, S s7, long j3, InterfaceC1182c interfaceC1182c) {
        if (i(h(y6)) != 0.0f) {
            s7.getClass();
            y6.Q(y6.M(Integer.MAX_VALUE));
            return;
        }
        h(y6);
        O0.m0 m0VarD = y6.d(j3);
        interfaceC1182c.b(m0VarD);
        s7.getClass();
        m0VarD.T();
        m0VarD.S();
    }

    public static final InterfaceC1398p l(InterfaceC1398p interfaceC1398p) {
        return AbstractC1383a.a(interfaceC1398p, new C0(2));
    }

    public static final long m(long j3) {
        EnumC0063e0 enumC0063e0 = EnumC0063e0.f1315o;
        return n1.b.a(n1.a.j(j3), n1.a.h(j3), n1.a.i(j3), n1.a.g(j3));
    }

    public static final Z n(C1993b c1993b) {
        return new Z(c1993b.f20271a, c1993b.f20272b, c1993b.f20273c, c1993b.f20274d);
    }

    public static final void o(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public abstract int e(int i7, n1.n nVar);
}
