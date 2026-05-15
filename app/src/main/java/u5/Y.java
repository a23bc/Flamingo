package U5;

import D.AbstractC0074o;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import androidx.compose.foundation.layout.FillElement;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.F0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.a1;
import j5.AbstractC1110d;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.AbstractC1671d;
import w.AbstractC1691y;
import w.C1687u;
import w.n0;
import yos.music.player.SettingsActivity;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7210o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ y3.x f7211p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ SettingsActivity f7212q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC0878b0 f7213r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0878b0 f7214s;

    public /* synthetic */ Y(y3.x xVar, SettingsActivity settingsActivity, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, int i7) {
        this.f7210o = i7;
        this.f7211p = xVar;
        this.f7212q = settingsActivity;
        this.f7213r = interfaceC0878b0;
        this.f7214s = interfaceC0878b02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7210o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    C1687u c1687u = AbstractC1691y.f18765d;
                    n0 n0VarL = AbstractC1671d.l(340, 0, c1687u, 2);
                    n0 n0VarL2 = AbstractC1671d.l(180, 0, c1687u, 2);
                    C1395m c1395m = C1395m.f15634a;
                    O0.Z zD = AbstractC0074o.d(C1385c.f15612o, false);
                    long j3 = c0912t.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, c1395m);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(c0353i);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, zD, C0354j.f6019f);
                    C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t, i7, c0351h);
                    }
                    C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                    c0912t.X(1761741830);
                    boolean zF = c0912t.f(n0VarL2) | c0912t.f(n0VarL);
                    Object objK = c0912t.K();
                    f0.W w7 = C0903o.f11850a;
                    if (zF || objK == w7) {
                        objK = new C0446s(n0VarL2, n0VarL, 4);
                        c0912t.i0(objK);
                    }
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK;
                    c0912t.p(false);
                    c0912t.X(1761758023);
                    boolean zF2 = c0912t.f(n0VarL2) | c0912t.f(n0VarL);
                    Object objK2 = c0912t.K();
                    if (zF2 || objK2 == w7) {
                        objK2 = new C0446s(n0VarL2, n0VarL, 5);
                        c0912t.i0(objK2);
                    }
                    InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) objK2;
                    c0912t.p(false);
                    c0912t.X(1761774371);
                    boolean zF3 = c0912t.f(n0VarL2) | c0912t.f(n0VarL);
                    Object objK3 = c0912t.K();
                    if (zF3 || objK3 == w7) {
                        objK3 = new C0446s(n0VarL2, n0VarL, 6);
                        c0912t.i0(objK3);
                    }
                    InterfaceC1182c interfaceC1182c3 = (InterfaceC1182c) objK3;
                    c0912t.p(false);
                    c0912t.X(1761790570);
                    boolean zF4 = c0912t.f(n0VarL2) | c0912t.f(n0VarL);
                    Object objK4 = c0912t.K();
                    if (zF4 || objK4 == w7) {
                        objK4 = new C0446s(n0VarL2, n0VarL, 7);
                        c0912t.i0(objK4);
                    }
                    InterfaceC1182c interfaceC1182c4 = (InterfaceC1182c) objK4;
                    c0912t.p(false);
                    c0912t.X(1761807379);
                    SettingsActivity settingsActivity = this.f7212q;
                    boolean zF5 = c0912t.f(settingsActivity);
                    y3.x xVar = this.f7211p;
                    boolean zH = zF5 | c0912t.h(xVar);
                    InterfaceC0878b0 interfaceC0878b0 = this.f7213r;
                    boolean zF6 = zH | c0912t.f(interfaceC0878b0);
                    Object objK5 = c0912t.K();
                    if (zF6 || objK5 == w7) {
                        G.u uVar = new G.u(settingsActivity, xVar, this.f7214s, interfaceC0878b0, 4);
                        c0912t.i0(uVar);
                        objK5 = uVar;
                    }
                    c0912t.p(false);
                    z3.u.a(xVar, "Main", null, null, null, interfaceC1182c, interfaceC1182c2, interfaceC1182c3, interfaceC1182c4, (InterfaceC1182c) objK5, c0912t, 48, 28);
                    c0912t.p(true);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    AbstractC1110d.n(AbstractC0433e.f7228a, c0912t2, 6);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    a1 a1Var = AbstractC0805u.f11147a;
                    F0.a(fillElement, null, ((C0803s) c0912t2.j(a1Var)).f11100f, ((C0803s) c0912t2.j(a1Var)).f11107o, 0.0f, n0.e.e(-1016478148, new Y(this.f7211p, this.f7212q, this.f7213r, this.f7214s, 0), c0912t2), c0912t2, 12582918, 114);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
