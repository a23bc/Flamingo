package h6;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import D.InterfaceC0077s;
import F.C0130c;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.content.Context;
import f0.C0879c;
import f0.C0886f0;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import r5.C1420a;
import u5.AbstractC1545g;
import v.InterfaceC1626w;
import w5.InterfaceC1765B;
import y.AbstractC1950f;
import y.C1947c;
import y0.AbstractC1959I;
import y0.C1960J;
import y0.C1987t;
import y0.InterfaceC1963M;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f13281o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f13282p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f13283q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f13284r;

    public /* synthetic */ z0(Object obj, Z0 z02, Object obj2, int i7) {
        this.f13281o = i7;
        this.f13282p = obj;
        this.f13284r = z02;
        this.f13283q = obj2;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f13281o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((d0.D0) obj, "it");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    M3.a.w(new d0.B0(new C1420a(0.0f, ((C0886f0) this.f13282p).h() / ((C0890h0) this.f13283q).h())), null, ((n1.g) ((Z0) this.f13284r).getValue()).f14511o, c0912t, 0);
                }
                break;
            case 1:
                C0130c c0130c = (C0130c) obj;
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f(c0130c, "$this$item");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0912t2.f(c0130c) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    String string = ((Context) this.f13282p).getString(R.string.page_library_playlists_fav_title);
                    AbstractC1209k.e(string, "getString(...)");
                    l6.a aVar = l6.a.f14253p;
                    c0912t2.X(-1943134631);
                    InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f13283q;
                    boolean zH = c0912t2.h(interfaceC1765B) | c0912t2.f(string);
                    y3.x xVar = (y3.x) this.f13284r;
                    boolean zH2 = zH | c0912t2.h(xVar);
                    Object objK = c0912t2.K();
                    if (zH2 || objK == C0903o.f11850a) {
                        objK = new F.n(interfaceC1765B, string, xVar, 8);
                        c0912t2.i0(objK);
                    }
                    c0912t2.p(false);
                    i6.h.f(c0130c, aVar, string, (InterfaceC1180a) objK, c0912t2, (iIntValue2 & 14) | 48);
                    AbstractC0060d.d(c0912t2, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(i6.h.l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 102, 0.0f, 0.0f, 0.0f, 14), 0.15f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t2), AbstractC1959I.f20180a));
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj2;
                ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
                InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 0.0f, 10, 1);
                C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t3, 0);
                long j3 = c0912t3.f11891T;
                int i7 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L = c0912t3.l();
                InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t3, interfaceC1398pI);
                InterfaceC0355k.f6047i.getClass();
                C0353i c0353i = C0354j.f6015b;
                c0912t3.b0();
                if (c0912t3.f11890S) {
                    c0912t3.k(c0353i);
                } else {
                    c0912t3.l0();
                }
                C0879c.y(c0912t3, c0084zA, C0354j.f6019f);
                C0879c.y(c0912t3, interfaceC0906p0L, C0354j.f6018e);
                C0351h c0351h = C0354j.f6020g;
                if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(i7))) {
                    n1.c.w(i7, c0912t3, i7, c0351h);
                }
                C0879c.y(c0912t3, interfaceC1398pC, C0354j.f6017d);
                c0912t3.X(-1987653774);
                for (String str : (List) this.f13282p) {
                    c0912t3.U(1534905985, str);
                    c0912t3.X(1534908443);
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f13284r;
                    boolean zF = c0912t3.f(interfaceC0878b0);
                    Object objK2 = c0912t3.K();
                    if (zF || objK2 == C0903o.f11850a) {
                        objK2 = new M.t0(interfaceC0878b0, 20);
                        c0912t3.i0(objK2);
                    }
                    c0912t3.p(false);
                    i6.g.m(str, (InterfaceC1182c) this.f13283q, (InterfaceC1182c) objK2, c0912t3, 0);
                    c0912t3.p(false);
                }
                c0912t3.p(false);
                c0912t3.p(true);
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue3 & 17) == 16 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    String strS = I0.c.S(R.string.settings_library_refresh_now, c0912t4);
                    c0912t4.X(1809254824);
                    y3.x xVar2 = (y3.x) this.f13282p;
                    boolean zH3 = c0912t4.h(xVar2);
                    Object objK3 = c0912t4.K();
                    f0.W w7 = C0903o.f11850a;
                    if (zH3 || objK3 == w7) {
                        objK3 = new i6.d(xVar2, 29);
                        c0912t4.i0(objK3);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK3;
                    Object objR = n1.c.r(1809257121, c0912t4, false);
                    if (objR == w7) {
                        objR = new p6.e((Z0) this.f13284r, (List) this.f13283q, 0);
                        c0912t4.i0(objR);
                    }
                    c0912t4.p(false);
                    AbstractC1110d.h(strS, null, true, interfaceC1180a, null, null, null, 0.0f, true, (InterfaceC1182c) objR, c0912t4, 905970048, 242);
                }
                break;
            case 4:
                C0912t c0912t5 = (C0912t) obj2;
                ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
                i6.g.a(((InterfaceC0878b0) this.f13282p).getValue(), null, null, null, n0.e.e(1347423674, new S0((Z0) this.f13284r, (Z0) this.f13283q, 1), c0912t5), c0912t5, 24576, 14);
                break;
            case 5:
                C0912t c0912t6 = (C0912t) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC1209k.f((D.A) obj, "$this$ModalBottomSheet");
                if ((iIntValue4 & 17) == 16 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    float f7 = 5;
                    InterfaceC1398p interfaceC1398pH = androidx.compose.foundation.layout.a.h(C1395m.f15634a, f7, f7);
                    c0912t6.X(1129353738);
                    final InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f13282p;
                    boolean zF2 = c0912t6.f(interfaceC1180a2);
                    final t6.d dVar = (t6.d) this.f13283q;
                    boolean zF3 = zF2 | c0912t6.f(dVar);
                    Object objK4 = c0912t6.K();
                    f0.W w8 = C0903o.f11850a;
                    if (zF3 || objK4 == w8) {
                        final int i8 = 0;
                        objK4 = new InterfaceC1182c() { // from class: v6.C
                            @Override // l5.InterfaceC1182c
                            public final Object b(Object obj4) {
                                C1960J c1960j = (C1960J) obj4;
                                switch (i8) {
                                    case 0:
                                        InterfaceC1180a interfaceC1180a3 = interfaceC1180a2;
                                        AbstractC1209k.f(interfaceC1180a3, "$cornerRadius");
                                        InterfaceC1963M interfaceC1963M = dVar;
                                        AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                                        if (n1.g.a(((n1.g) interfaceC1180a3.a()).f14511o, 0)) {
                                            interfaceC1963M = AbstractC1959I.f20180a;
                                        }
                                        c1960j.m(interfaceC1963M);
                                        c1960j.l(10.0f);
                                        c1960j.o(C1987t.f20255b);
                                        break;
                                    default:
                                        InterfaceC1180a interfaceC1180a4 = interfaceC1180a2;
                                        AbstractC1209k.f(interfaceC1180a4, "$cornerRadius");
                                        InterfaceC1963M interfaceC1963M2 = dVar;
                                        AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                                        c1960j.d(true);
                                        if (n1.g.a(((n1.g) interfaceC1180a4.a()).f14511o, 0)) {
                                            interfaceC1963M2 = AbstractC1959I.f20180a;
                                        }
                                        c1960j.m(interfaceC1963M2);
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t6.i0(objK4);
                    }
                    c0912t6.p(false);
                    InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pH, (InterfaceC1182c) objK4);
                    c0912t6.X(1129364111);
                    boolean zF4 = c0912t6.f(interfaceC1180a2) | c0912t6.f(dVar);
                    Object objK5 = c0912t6.K();
                    if (zF4 || objK5 == w8) {
                        final int i9 = 1;
                        objK5 = new InterfaceC1182c() { // from class: v6.C
                            @Override // l5.InterfaceC1182c
                            public final Object b(Object obj4) {
                                C1960J c1960j = (C1960J) obj4;
                                switch (i9) {
                                    case 0:
                                        InterfaceC1180a interfaceC1180a3 = interfaceC1180a2;
                                        AbstractC1209k.f(interfaceC1180a3, "$cornerRadius");
                                        InterfaceC1963M interfaceC1963M = dVar;
                                        AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                                        if (n1.g.a(((n1.g) interfaceC1180a3.a()).f14511o, 0)) {
                                            interfaceC1963M = AbstractC1959I.f20180a;
                                        }
                                        c1960j.m(interfaceC1963M);
                                        c1960j.l(10.0f);
                                        c1960j.o(C1987t.f20255b);
                                        break;
                                    default:
                                        InterfaceC1180a interfaceC1180a4 = interfaceC1180a2;
                                        AbstractC1209k.f(interfaceC1180a4, "$cornerRadius");
                                        InterfaceC1963M interfaceC1963M2 = dVar;
                                        AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                                        c1960j.d(true);
                                        if (n1.g.a(((n1.g) interfaceC1180a4.a()).f14511o, 0)) {
                                            interfaceC1963M2 = AbstractC1959I.f20180a;
                                        }
                                        c1960j.m(interfaceC1963M2);
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t6.i0(objK5);
                    }
                    c0912t6.p(false);
                    InterfaceC1398p interfaceC1398pR = j0.k.r(androidx.compose.ui.graphics.a.a(interfaceC1398pA, (InterfaceC1182c) objK5));
                    long j7 = C1987t.f20259f;
                    long j8 = C1987t.f20255b;
                    d0.F0.a(interfaceC1398pR, null, t6.a.b(j7, j8, c0912t6), t6.a.b(j8, j7, c0912t6), 0.0f, n0.e.e(-581691264, new D.M(4, (n0.d) this.f13284r), c0912t6), c0912t6, 12582912, 114);
                }
                break;
            default:
                C1947c c1947c = (C1947c) obj;
                C0912t c0912t7 = (C0912t) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c0912t7.f(c1947c) ? 4 : 2;
                }
                if (c0912t7.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    String str2 = (String) ((l5.e) this.f13282p).invoke(c0912t7, 0);
                    if (AbstractC1545g.Z(str2)) {
                        C.b.c("Label must not be blank");
                    }
                    AbstractC1950f.c(str2, c1947c, (l5.f) this.f13283q, (InterfaceC1180a) this.f13284r, c0912t7, (iIntValue5 << 6) & 896);
                } else {
                    c0912t7.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ z0(Object obj, Object obj2, Object obj3, int i7) {
        this.f13281o = i7;
        this.f13282p = obj;
        this.f13283q = obj2;
        this.f13284r = obj3;
    }
}
