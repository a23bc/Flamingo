package U5;

import I.C0211c;
import f0.C0888g0;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.Z0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import v.k0;
import w.AbstractC1671d;
import w.C1670c;
import w5.InterfaceC1765B;
import yos.music.player.MainActivity;

/* JADX INFO: renamed from: U5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0451x implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7281o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1670c f7283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z0 f7284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7291y;

    public C0451x(Z0 z02, InterfaceC0878b0 interfaceC0878b0, InterfaceC1765B interfaceC1765B, C1670c c1670c, w.S s7, T4.l lVar, y3.x xVar, C0211c c0211c, MainActivity mainActivity, InterfaceC0878b0 interfaceC0878b02) {
        this.f7284r = z02;
        this.f7282p = interfaceC0878b0;
        this.f7286t = interfaceC1765B;
        this.f7283q = c1670c;
        this.f7287u = s7;
        this.f7288v = lVar;
        this.f7289w = xVar;
        this.f7290x = c0211c;
        this.f7291y = mainActivity;
        this.f7285s = interfaceC0878b02;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f7281o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((k0) obj, "$this$SharedTransitionLayout");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    AbstractC1110d.n(n0.e.e(1632928726, new R.s(this.f7284r, this.f7282p, (InterfaceC1765B) this.f7286t, this.f7283q, (w.S) this.f7287u, 1), c0912t), c0912t, 6);
                    AbstractC1110d.n(n0.e.e(-795176769, new C0450w(this.f7284r, (T4.l) this.f7288v, (y3.x) this.f7289w, (C0211c) this.f7290x, (MainActivity) this.f7291y, this.f7285s, 0), c0912t), c0912t, 6);
                }
                break;
            default:
                k0 k0Var = (k0) obj;
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f(k0Var, "$this$SharedTransitionLayout");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0912t2.f(k0Var) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    i6.g.a(((InterfaceC1180a) this.f7286t).a(), androidx.compose.foundation.layout.a.j(AbstractC1383a.a(androidx.compose.foundation.layout.c.f9203c, h6.P.f12914r), 0.0f, 22, 0.0f, 0.0f, 13), AbstractC1671d.l(300, 0, null, 6), null, n0.e.e(1548056659, new h6.Y((InterfaceC1180a) this.f7286t, k0Var, (InterfaceC1180a) this.f7287u, this.f7282p, this.f7283q, this.f7284r, (InterfaceC1182c) this.f7288v, (Z0) this.f7289w, this.f7285s, (C0888g0) this.f7290x, (Z0) this.f7291y), c0912t2), c0912t2, 24960, 8);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public C0451x(InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC0878b0 interfaceC0878b0, C1670c c1670c, Z0 z02, InterfaceC1182c interfaceC1182c, Z0 z03, InterfaceC0878b0 interfaceC0878b02, C0888g0 c0888g0, Z0 z04) {
        this.f7286t = interfaceC1180a;
        this.f7287u = interfaceC1180a2;
        this.f7282p = interfaceC0878b0;
        this.f7283q = c1670c;
        this.f7284r = z02;
        this.f7288v = interfaceC1182c;
        this.f7289w = z03;
        this.f7285s = interfaceC0878b02;
        this.f7290x = c0888g0;
        this.f7291y = z04;
    }
}
