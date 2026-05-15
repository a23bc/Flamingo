package T5;

import D.AbstractC0074o;
import D.r;
import K0.A;
import L2.C0247a;
import N2.z;
import O0.Q;
import O0.w0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import S5.y;
import Y4.o;
import d0.C0795j0;
import d0.C0803s;
import d0.H;
import d0.I0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.G0;
import f0.InterfaceC0906p0;
import f0.W;
import j5.AbstractC1107a;
import java.io.IOException;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1220v;
import o0.C1249f;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.C1628y;
import w.C1681n;
import w.InterfaceC1652A;
import w.f0;
import w.j0;
import w.m0;
import w.o0;
import w.p0;
import y3.C2019h;
import z3.k;
import z3.l;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f7013q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7014r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7015s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7016t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(2);
        this.f7012p = i7;
        this.f7013q = obj;
        this.f7014r = obj2;
        this.f7015s = obj3;
        this.f7016t = obj4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i7 = 11;
        o oVar = o.f8736a;
        Object obj3 = this.f7014r;
        Object obj4 = this.f7016t;
        Object obj5 = this.f7013q;
        Object obj6 = this.f7015s;
        int i8 = 2;
        switch (this.f7012p) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    y yVar = (y) obj5;
                    byte bD = yVar.d();
                    boolean z6 = (bD & 1) == 1;
                    boolean z7 = (bD & 2) == 2;
                    boolean z8 = (bD & 4) == 4;
                    long j3 = z6 ? 5L : 1L;
                    if (z7) {
                        j3 += 4;
                    }
                    if (z8) {
                        j3 += 4;
                    }
                    if (jLongValue < j3) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z6) {
                        ((C1220v) obj3).f14439o = Long.valueOf(((long) yVar.j()) * 1000);
                    }
                    if (z7) {
                        ((C1220v) obj6).f14439o = Long.valueOf(((long) yVar.j()) * 1000);
                    }
                    if (z8) {
                        ((C1220v) obj4).f14439o = Long.valueOf(((long) yVar.j()) * 1000);
                    }
                }
                return oVar;
            case 1:
                ((Number) obj2).intValue();
                I0.c.b((X4.a) obj5, (z) obj3, (C0247a) obj6, (n0.d) obj4, (C0912t) obj, C0879c.B(3073));
                return oVar;
            case 2:
                ((Number) obj2).intValue();
                H.a((C0803s) obj5, (C0795j0) obj3, (I0) obj6, (n0.d) obj4, (C0912t) obj, C0879c.B(385));
                return oVar;
            case 3:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    o0 o0Var = p0.f18727a;
                    j0 j0Var = (j0) obj5;
                    Object objC = j0Var.c();
                    c0912t.X(-438678252);
                    float f7 = AbstractC1209k.a(objC, obj6) ? 1.0f : 0.0f;
                    c0912t.p(false);
                    Float fValueOf = Float.valueOf(f7);
                    Object value = j0Var.f18691d.getValue();
                    c0912t.X(-438678252);
                    float f8 = AbstractC1209k.a(value, obj6) ? 1.0f : 0.0f;
                    c0912t.p(false);
                    Float fValueOf2 = Float.valueOf(f8);
                    j0Var.f();
                    c0912t.X(438406499);
                    c0912t.p(false);
                    int i9 = m0.f18715a;
                    boolean zF = c0912t.f(j0Var);
                    Object objK = c0912t.K();
                    W w7 = C0903o.f11850a;
                    if (zF || objK == w7) {
                        C1681n c1681n = new C1681n(f8);
                        c1681n.d();
                        objK = new f0(j0Var, fValueOf, c1681n, o0Var);
                        c0912t.i0(objK);
                    }
                    f0 f0Var = (f0) objK;
                    InterfaceC1652A interfaceC1652A = (InterfaceC1652A) obj3;
                    if (j0Var.g()) {
                        f0Var.e(fValueOf, fValueOf2, interfaceC1652A);
                    } else {
                        f0Var.f(fValueOf2, interfaceC1652A);
                    }
                    boolean zF2 = c0912t.f(j0Var) | c0912t.f(f0Var);
                    Object objK2 = c0912t.K();
                    if (zF2 || objK2 == w7) {
                        objK2 = new A(j0Var, 25, f0Var);
                        c0912t.i0(objK2);
                    }
                    C0879c.d(f0Var, (InterfaceC1182c) objK2, c0912t);
                    C1395m c1395m = C1395m.f15634a;
                    boolean zF3 = c0912t.f(f0Var);
                    Object objK3 = c0912t.K();
                    if (zF3 || objK3 == w7) {
                        objK3 = new C1628y(i8, f0Var);
                        c0912t.i0(objK3);
                    }
                    InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(c1395m, (InterfaceC1182c) objK3);
                    c0912t.Y(733328855);
                    r rVarE = AbstractC0074o.e(0, c0912t, false);
                    c0912t.Y(-1323940314);
                    int iP = C0879c.p(c0912t);
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    n0.d dVarK = w0.k(interfaceC1398pA);
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(c0353i);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, rVarE, C0354j.f6019f);
                    C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(iP))) {
                        n1.c.w(iP, c0912t, iP, c0351h);
                    }
                    dVarK.d(new G0(c0912t), c0912t, 0);
                    c0912t.Y(2058660585);
                    ((n0.d) obj4).d(obj6, c0912t, 0);
                    c0912t.p(false);
                    c0912t.p(true);
                    c0912t.p(false);
                    c0912t.p(false);
                }
                return oVar;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C2019h c2019h = (C2019h) obj5;
                    C0879c.d(c2019h, new z3.h((l) obj6, 0, c2019h), c0912t2);
                    AbstractC1107a.c(c2019h, (C1249f) obj3, n0.e.b(c0912t2, -497631156, new Q((k) obj4, i7, c2019h)), c0912t2, 456);
                }
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, n0.d dVar, int i7, int i8) {
        super(2);
        this.f7012p = i8;
        this.f7013q = obj;
        this.f7014r = obj2;
        this.f7015s = obj3;
        this.f7016t = dVar;
    }
}
