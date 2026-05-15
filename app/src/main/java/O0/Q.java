package O0;

import D.AbstractC0074o;
import Q0.C0345e;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.C0415x;
import R0.N0;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import d0.C0787f0;
import d0.C0799n;
import d0.C0801p;
import d2.C0821i;
import f0.AbstractC0914u;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f2.C0928a;
import g0.C0943a;
import g0.C0944b;
import g0.C0951i;
import j5.AbstractC1107a;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1217s;
import o0.C1249f;
import r0.AbstractC1383a;
import r0.C1395m;
import r0.InterfaceC1398p;
import r1.C1411e;
import r1.C1413g;
import v.C1614k;
import y0.C1960J;
import y0.InterfaceC1985r;
import y3.C2019h;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f5348p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f5349q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f5350r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(Object obj, int i7, Object obj2) {
        super(2);
        this.f5348p = i7;
        this.f5349q = obj;
        this.f5350r = obj2;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        Y4.o oVar = Y4.o.f8736a;
        Object obj3 = this.f5350r;
        Object obj4 = this.f5349q;
        switch (this.f5348p) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0912t.Q();
                } else {
                    Boolean bool = (Boolean) ((J) obj4).f5326g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    c0912t.a0(bool);
                    boolean zG = c0912t.g(zBooleanValue);
                    if (zBooleanValue) {
                        ((l5.e) obj3).invoke(c0912t, 0);
                    } else {
                        if (c0912t.l != 0) {
                            AbstractC0914u.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!c0912t.f11890S) {
                            if (zG) {
                                f0.H0 h02 = c0912t.f11878G;
                                int i7 = h02.f11673g;
                                int i8 = h02.h;
                                C0944b c0944b = c0912t.f11884M;
                                c0944b.getClass();
                                c0944b.e(false);
                                C0943a c0943a = c0944b.f12281b;
                                c0943a.getClass();
                                c0943a.f12279u.g0(C0951i.f12297c);
                                AbstractC0914u.a(c0912t.f11909s, i7, i8);
                                c0912t.f11878G.t();
                            } else {
                                c0912t.P();
                            }
                        }
                    }
                    if (c0912t.f11915y && c0912t.f11878G.f11674i == c0912t.f11916z) {
                        c0912t.f11916z = -1;
                        c0912t.f11915y = false;
                    }
                    c0912t.p(false);
                }
                break;
            case 1:
                InterfaceC1985r interfaceC1985r = (InterfaceC1985r) obj;
                B0.d dVar = (B0.d) obj2;
                Q0.j0 j0Var = (Q0.j0) obj4;
                if (!j0Var.f6024C.J()) {
                    j0Var.f6045X = true;
                } else {
                    j0Var.f6042U = interfaceC1985r;
                    j0Var.f6041T = dVar;
                    Q0.u0 snapshotObserver = ((C0415x) Q0.O.a(j0Var.f6024C)).getSnapshotObserver();
                    C1960J c1960j = Q0.j0.a0;
                    snapshotObserver.a(j0Var, C0345e.f5977s, (Q0.i0) obj3);
                    j0Var.f6045X = false;
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((C0415x) obj4, (n0.d) obj3, (C0912t) obj, C0879c.B(1));
                break;
            case 3:
                ((Number) obj2).intValue();
                N5.l.e((C0928a) obj4, (n0.d) obj3, (C0912t) obj, 49);
                break;
            case 4:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                C0801p c0801p = ((C0799n) obj4).f11047a;
                c0801p.f11063i.j(fFloatValue);
                c0801p.f11064j.j(fFloatValue2);
                ((C1217s) obj3).f14436o = fFloatValue;
                break;
            case 5:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    d0.H0.a(((d0.I0) obj4).f10881j, (n0.d) obj3, c0912t2, 0);
                }
                break;
            case 6:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    InterfaceC1398p interfaceC1398pA = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pA2 = AbstractC1383a.a(Y0.l.a(interfaceC1398pA, false, C0787f0.f10994q), new D.B0(0, (D.x0) obj4));
                    if (Build.VERSION.SDK_INT >= 33) {
                        interfaceC1398pA = AbstractC1383a.a(interfaceC1398pA, new D.C0(0));
                    }
                    InterfaceC1398p interfaceC1398pF = interfaceC1398pA2.f(interfaceC1398pA);
                    c0912t3.Y(733328855);
                    D.r rVarE = AbstractC0074o.e(0, c0912t3, false);
                    c0912t3.Y(-1323940314);
                    int iP = C0879c.p(c0912t3);
                    InterfaceC0906p0 interfaceC0906p0L = c0912t3.l();
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    n0.d dVarK = w0.k(interfaceC1398pF);
                    c0912t3.b0();
                    if (c0912t3.f11890S) {
                        c0912t3.k(c0353i);
                    } else {
                        c0912t3.l0();
                    }
                    C0879c.y(c0912t3, rVarE, C0354j.f6019f);
                    C0879c.y(c0912t3, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(iP))) {
                        n1.c.w(iP, c0912t3, iP, c0351h);
                    }
                    dVarK.d(new f0.G0(c0912t3), c0912t3, 0);
                    c0912t3.Y(2058660585);
                    ((l5.e) ((InterfaceC0878b0) obj3).getValue()).invoke(c0912t3, 0);
                    c0912t3.p(false);
                    c0912t3.p(true);
                    c0912t3.p(false);
                    c0912t3.p(false);
                }
                break;
            case 7:
                ((Number) obj2).intValue();
                d0.H0.a((b1.M) obj4, (n0.d) obj3, (C0912t) obj, C0879c.B(1));
                break;
            case 8:
                C0912t c0912t4 = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c0912t4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0912t4.Q();
                } else {
                    Object objK = c0912t4.K();
                    f0.W w7 = C0903o.f11850a;
                    if (objK == w7) {
                        objK = C1411e.f15676t;
                        c0912t4.i0(objK);
                    }
                    AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((InterfaceC1182c) objK, false);
                    r1.z zVar = (r1.z) obj4;
                    boolean zH = c0912t4.h(zVar);
                    Object objK2 = c0912t4.K();
                    if (zH || objK2 == w7) {
                        objK2 = new r1.l(zVar, 1);
                        c0912t4.i0(objK2);
                    }
                    InterfaceC1398p interfaceC1398pL = i6.h.l(androidx.compose.ui.layout.a.f(appendedSemanticsElement, (InterfaceC1182c) objK2), zVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                    l5.e eVar = (l5.e) ((InterfaceC0878b0) obj3).getValue();
                    Object objK3 = c0912t4.K();
                    if (objK3 == w7) {
                        objK3 = C1413g.f15685c;
                        c0912t4.i0(objK3);
                    }
                    Z z6 = (Z) objK3;
                    long j3 = c0912t4.f11891T;
                    int i9 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t4.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t4, interfaceC1398pL);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t4.b0();
                    if (c0912t4.f11890S) {
                        c0912t4.k(c0353i2);
                    } else {
                        c0912t4.l0();
                    }
                    C0879c.y(c0912t4, z6, C0354j.f6019f);
                    C0879c.y(c0912t4, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t4, i9, c0351h2);
                    }
                    C0879c.y(c0912t4, interfaceC1398pC, C0354j.f6017d);
                    eVar.invoke(c0912t4, 0);
                    c0912t4.p(true);
                }
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                int iIntValue3 = ((Number) obj).intValue();
                Y0.o oVar2 = (Y0.o) obj2;
                if (!((N0) obj4).f6362b.b(oVar2.f8487g)) {
                    t0.c cVar = (t0.c) obj3;
                    cVar.o(iIntValue3, oVar2);
                    cVar.f16151v.k(oVar);
                }
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                ((Number) obj2).intValue();
                v.n0.a((C1395m) obj4, (n0.d) obj3, (C0912t) obj, C0879c.B(49));
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    ((z3.k) obj4).f21156x.d((C2019h) obj3, c0912t5, 8);
                }
                break;
            case 12:
                ((Number) obj2).intValue();
                j0.k.i((p0.p) obj4, (List) obj3, (C0912t) obj, C0879c.B(65));
                break;
            case 13:
                C0912t c0912t6 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    AbstractC1107a.h((C1249f) obj4, (n0.d) obj3, c0912t6, 56);
                }
                break;
            default:
                C0912t c0912t7 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0912t7.z()) {
                    c0912t7.Q();
                } else {
                    C2019h c2019h = (C2019h) obj4;
                    y3.s sVar = c2019h.f20407p;
                    AbstractC1209k.d(sVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((z3.f) sVar).f21144w.h((C1614k) obj3, c2019h, c0912t7, 72);
                }
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(Object obj, Object obj2, int i7, int i8) {
        super(2);
        this.f5348p = i8;
        this.f5349q = obj;
        this.f5350r = obj2;
    }
}
