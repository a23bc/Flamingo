package R;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0058c;
import D.C0084z;
import D.o0;
import D.q0;
import M.t0;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0445q;
import U5.C0452y;
import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import e4.C0862k;
import f0.C0879c;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.Z0;
import h6.G0;
import h6.Q;
import h6.V;
import h6.X;
import j5.AbstractC1107a;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1389g;
import r0.C1395m;
import r0.InterfaceC1398p;
import u6.K;
import v6.EnumC1649c;
import w.C1670c;
import w.InterfaceC1690x;
import w.S;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class s implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f6213o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f6214p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f6215q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f6216r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f6217s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f6218t;

    public /* synthetic */ s(Object obj, InterfaceC0878b0 interfaceC0878b0, Object obj2, Object obj3, Object obj4, int i7) {
        this.f6213o = i7;
        this.f6215q = obj;
        this.f6214p = interfaceC0878b0;
        this.f6216r = obj2;
        this.f6217s = obj3;
        this.f6218t = obj4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0353i c0353i;
        C0351h c0351h;
        switch (this.f6213o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = c0912t.K();
                    if (objK == C0903o.f11850a) {
                        objK = new t0((InterfaceC0878b0) this.f6214p, 3);
                        c0912t.i0(objK);
                    }
                    InterfaceC1398p interfaceC1398pD = androidx.compose.ui.layout.a.d((InterfaceC1398p) this.f6215q, (InterfaceC1182c) objK);
                    Z zD = AbstractC0074o.d(C1385c.f15612o, true);
                    long j3 = c0912t.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pD);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(c0353i2);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, zD, C0354j.f6019f);
                    C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t, i7, c0351h2);
                    }
                    C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                    ((n0.d) this.f6216r).invoke(c0912t, 0);
                    ((T.c) this.f6217s).b((InterfaceC1180a) this.f6218t, c0912t, 6);
                    c0912t.p(true);
                } else {
                    c0912t.Q();
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    boolean zBooleanValue = ((Boolean) ((Z0) this.f6215q).getValue()).booleanValue();
                    c0912t2.X(151067693);
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f6214p;
                    boolean zF = c0912t2.f(interfaceC0878b0);
                    InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f6216r;
                    boolean zH = zF | c0912t2.h(interfaceC1765B);
                    C1670c c1670c = (C1670c) this.f6217s;
                    boolean zH2 = zH | c0912t2.h(c1670c);
                    Object objK2 = c0912t2.K();
                    if (zH2 || objK2 == C0903o.f11850a) {
                        objK2 = new C0445q(interfaceC0878b0, interfaceC1765B, c1670c, (S) this.f6218t);
                        c0912t2.i0(objK2);
                    }
                    c0912t2.p(false);
                    I0.c.a(zBooleanValue, (InterfaceC1180a) objK2, c0912t2, 0);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    c0912t3.X(-923804653);
                    C1670c c1670c2 = (C1670c) this.f6215q;
                    boolean zH3 = c0912t3.h(c1670c2);
                    Object objK3 = c0912t3.K();
                    W w7 = C0903o.f11850a;
                    if (zH3 || objK3 == w7) {
                        objK3 = new V((Z0) this.f6217s, c1670c2);
                        c0912t3.i0(objK3);
                    }
                    c0912t3.p(false);
                    InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(c1395m, (InterfaceC1182c) objK3);
                    c0912t3.X(-923784452);
                    InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) this.f6214p;
                    boolean zF2 = c0912t3.f(interfaceC0878b02);
                    Object objK4 = c0912t3.K();
                    if (zF2 || objK4 == w7) {
                        objK4 = new F.m(interfaceC0878b02, 18);
                        c0912t3.i0(objK4);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK4;
                    c0912t3.p(false);
                    c0912t3.X(-923780749);
                    boolean zF3 = c0912t3.f(interfaceC0878b02);
                    Object objK5 = c0912t3.K();
                    if (zF3 || objK5 == w7) {
                        objK5 = new t0(interfaceC0878b02, 10);
                        c0912t3.i0(objK5);
                    }
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK5;
                    c0912t3.p(false);
                    c0912t3.X(-923770729);
                    C0888g0 c0888g0 = (C0888g0) this.f6216r;
                    boolean zF4 = c0912t3.f(c0888g0);
                    Object objK6 = c0912t3.K();
                    if (zF4 || objK6 == w7) {
                        objK6 = new X(c0888g0, 0);
                        c0912t3.i0(objK6);
                    }
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK6;
                    c0912t3.p(false);
                    c0912t3.X(-923767284);
                    boolean zF5 = c0912t3.f(c0888g0);
                    Object objK7 = c0912t3.K();
                    if (zF5 || objK7 == w7) {
                        objK7 = new C0452y(c0888g0, 2);
                        c0912t3.i0(objK7);
                    }
                    InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) objK7;
                    Object objR = n1.c.r(-923759270, c0912t3, false);
                    if (objR == w7) {
                        objR = new F.m((InterfaceC0878b0) this.f6218t, 19);
                        c0912t3.i0(objR);
                    }
                    c0912t3.p(false);
                    M3.a.o(interfaceC1398pA, interfaceC1180a, interfaceC1182c, interfaceC1180a2, interfaceC1182c2, (InterfaceC1180a) objR, c0912t3, 196608);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    C1395m c1395m2 = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pC2 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(c1395m2, 1.0f), 28.5f, 0.0f, 2), 0.0f, 22, 0.0f, 0.0f, 13), 70);
                    C1389g c1389g = C1385c.f15622y;
                    C0058c c0058c = AbstractC0068i.f1327a;
                    q0 q0VarA = o0.a(c0058c, c1389g, c0912t4, 48);
                    long j7 = c0912t4.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t4.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t4, interfaceC1398pC2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i3 = C0354j.f6015b;
                    c0912t4.b0();
                    if (c0912t4.f11890S) {
                        c0912t4.k(c0353i3);
                    } else {
                        c0912t4.l0();
                    }
                    C0351h c0351h3 = C0354j.f6019f;
                    C0879c.y(c0912t4, q0VarA, c0351h3);
                    C0351h c0351h4 = C0354j.f6018e;
                    C0879c.y(c0912t4, interfaceC0906p0L2, c0351h4);
                    C0351h c0351h5 = C0354j.f6020g;
                    if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t4, i8, c0351h5);
                    }
                    C0351h c0351h6 = C0354j.f6017d;
                    C0879c.y(c0912t4, interfaceC1398pC3, c0351h6);
                    InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g((InterfaceC1398p) this.f6215q, 69);
                    c0912t4.X(2797723);
                    Object objK8 = c0912t4.K();
                    if (objK8 == C0903o.f11850a) {
                        objK8 = n1.c.q(c0912t4);
                    }
                    c0912t4.p(false);
                    float f7 = 5;
                    AbstractC1109c.f((InterfaceC1180a) this.f6214p, androidx.compose.foundation.a.c(interfaceC1398pG, (B.k) objK8, null, false, (InterfaceC1180a) this.f6218t, 28), 0.0f, w6.c.f19593s, true, f7, EnumC1649c.f18349p, false, c0912t4, 14377008, 264);
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b((InterfaceC1398p) this.f6216r, 1.0f);
                    q0 q0VarA2 = o0.a(c0058c, c1389g, c0912t4, 48);
                    long j8 = c0912t4.f11891T;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t4.l();
                    InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t4, interfaceC1398pB);
                    c0912t4.b0();
                    if (c0912t4.f11890S) {
                        c0353i = c0353i3;
                        c0912t4.k(c0353i);
                    } else {
                        c0353i = c0353i3;
                        c0912t4.l0();
                    }
                    C0879c.y(c0912t4, q0VarA2, c0351h3);
                    C0879c.y(c0912t4, interfaceC0906p0L3, c0351h4);
                    if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i9))) {
                        c0351h = c0351h5;
                        n1.c.w(i9, c0912t4, i9, c0351h);
                    } else {
                        c0351h = c0351h5;
                    }
                    C0879c.y(c0912t4, interfaceC1398pC4, c0351h6);
                    InterfaceC1398p interfaceC1398pB2 = androidx.compose.foundation.layout.c.b(c1395m2, 1.0f);
                    if (1.0f <= 0.0d) {
                        E.a.a("invalid weight; must be greater than zero");
                    }
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(interfaceC1398pB2.f(new LayoutWeightElement(1.0f, true)), 0.0f, 0.0f, f7, 0.0f, 11);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t4, 0);
                    long j9 = c0912t4.f11891T;
                    int i10 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L4 = c0912t4.l();
                    InterfaceC1398p interfaceC1398pC5 = AbstractC1383a.c(c0912t4, interfaceC1398pJ);
                    c0912t4.b0();
                    if (c0912t4.f11890S) {
                        c0912t4.k(c0353i);
                    } else {
                        c0912t4.l0();
                    }
                    C0879c.y(c0912t4, c0084zA, c0351h3);
                    C0879c.y(c0912t4, interfaceC0906p0L4, c0351h4);
                    if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i10))) {
                        n1.c.w(i10, c0912t4, i10, c0351h);
                    }
                    C0879c.y(c0912t4, interfaceC1398pC5, c0351h6);
                    v6.h hVarN = AbstractC1107a.n(c0912t4);
                    n1.n nVar = hVarN.f18370d;
                    AbstractC1209k.f(nVar, "direction");
                    InterfaceC1690x interfaceC1690x = hVarN.f18371e;
                    AbstractC1209k.f(interfaceC1690x, "easing");
                    v6.h hVar = new v6.h(13500, true, hVarN.f18369c, nVar, interfaceC1690x, 3000L, 12);
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) this.f6217s;
                    AbstractC1107a.d(null, hVar, n0.e.e(2072158481, new G0(interfaceC1180a3, 0), c0912t4), c0912t4, 384);
                    AbstractC1107a.d(null, hVar, n0.e.e(430413178, new G0(interfaceC1180a3, 1), c0912t4), c0912t4, 384);
                    c0912t4.p(true);
                    AbstractC1110d.n(n0.e.e(-881091440, new Q(interfaceC1180a3, 2), c0912t4), c0912t4, 6);
                    c0912t4.p(true);
                    c0912t4.p(true);
                }
                break;
            default:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) this.f6218t;
                    Object objA = interfaceC1180a4.a();
                    c0912t5.X(803227672);
                    boolean zF6 = c0912t5.f(interfaceC1180a4);
                    Context context = (Context) this.f6215q;
                    boolean zF7 = zF6 | c0912t5.f(context);
                    C0862k c0862k = (C0862k) this.f6216r;
                    boolean zH4 = zF7 | c0912t5.h(c0862k) | c0912t5.f((InterfaceC0878b0) this.f6214p);
                    Object objK9 = c0912t5.K();
                    if (zH4 || objK9 == C0903o.f11850a) {
                        K k7 = new K(context, null, c0862k, (InterfaceC0878b0) this.f6214p, (InterfaceC0878b0) this.f6217s, (InterfaceC1180a) this.f6218t);
                        c0912t5.i0(k7);
                        objK9 = k7;
                    }
                    c0912t5.p(false);
                    C0879c.e(c0912t5, objA, (l5.e) objK9);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public s(InterfaceC1180a interfaceC1180a, Context context, C0862k c0862k, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02) {
        this.f6213o = 4;
        this.f6218t = interfaceC1180a;
        this.f6215q = context;
        this.f6216r = c0862k;
        this.f6214p = interfaceC0878b0;
        this.f6217s = interfaceC0878b02;
    }

    public s(InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1398p interfaceC1398p2, InterfaceC1180a interfaceC1180a3) {
        this.f6213o = 3;
        this.f6215q = interfaceC1398p;
        this.f6218t = interfaceC1180a;
        this.f6214p = interfaceC1180a2;
        this.f6216r = interfaceC1398p2;
        this.f6217s = interfaceC1180a3;
    }
}
