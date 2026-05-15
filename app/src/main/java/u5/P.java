package U5;

import D.h0;
import M.C0256e;
import M.D0;
import android.content.Context;
import d0.F0;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.C1670c;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;
import y0.C1987t;
import yos.music.player.MainActivity;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class P implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ T4.l f7162A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Context f7163B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f7164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f7165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D4.i f7167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n1.d f7168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f7169t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7170u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y3.x f7171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f7173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w.S f7174y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f7175z;

    public P(InterfaceC1765B interfaceC1765B, C1670c c1670c, C0888g0 c0888g0, D4.i iVar, n1.d dVar, float f7, MainActivity mainActivity, y3.x xVar, InterfaceC0878b0 interfaceC0878b0, InterfaceC1180a interfaceC1180a, w.S s7, float f8, T4.l lVar, Context context) {
        this.f7164o = interfaceC1765B;
        this.f7165p = c1670c;
        this.f7166q = c0888g0;
        this.f7167r = iVar;
        this.f7168s = dVar;
        this.f7169t = f7;
        this.f7170u = mainActivity;
        this.f7171v = xVar;
        this.f7172w = interfaceC0878b0;
        this.f7173x = interfaceC1180a;
        this.f7174y = s7;
        this.f7175z = f8;
        this.f7162A = lVar;
        this.f7163B = context;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.X(1311730677);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            n1.d dVar = this.f7168s;
            if (objK == w7) {
                objK = Float.valueOf(dVar.v(this.f7169t));
                c0912t.i0(objK);
            }
            float fFloatValue = ((Number) objK).floatValue();
            c0912t.p(false);
            c0912t.X(1311741082);
            Object objK2 = c0912t.K();
            if (objK2 == w7) {
                objK2 = Float.valueOf(dVar.v(7.5f));
                c0912t.i0(objK2);
            }
            float fFloatValue2 = ((Number) objK2).floatValue();
            c0912t.p(false);
            long jB = t6.a.b(C1987t.f20259f, AbstractC1959I.d(4280032286L), c0912t);
            System.out.getClass();
            c0912t.X(1311756155);
            InterfaceC1765B interfaceC1765B = this.f7164o;
            boolean zH = c0912t.h(interfaceC1765B);
            C1670c c1670c = this.f7165p;
            boolean zH2 = zH | c0912t.h(c1670c);
            Object objK3 = c0912t.K();
            if (zH2 || objK3 == w7) {
                objK3 = new h0(interfaceC1765B, 11, c1670c);
                c0912t.i0(objK3);
            }
            c0912t.p(false);
            z.Q qB = z.L.b((InterfaceC1182c) objK3, c0912t);
            InterfaceC1398p interfaceC1398pA = C1395m.f15634a;
            c0912t.X(1311767859);
            C0888g0 c0888g0 = this.f7166q;
            boolean zF = c0912t.f(c0888g0) | c0912t.h(c1670c);
            D4.i iVar = this.f7167r;
            boolean zF2 = zF | c0912t.f(iVar);
            Object objK4 = c0912t.K();
            if (zF2 || objK4 == w7) {
                objK4 = new C0256e(c0888g0, fFloatValue, iVar, 1);
                c0912t.i0(objK4);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.graphics.a.a(interfaceC1398pA, (InterfaceC1182c) objK4);
            c0912t.X(1311776482);
            if (iVar.p() < 1.0f) {
                c0912t.X(1311779805);
                boolean zF3 = c0912t.f(c0888g0) | c0912t.h(c1670c) | c0912t.f(iVar);
                Object objK5 = c0912t.K();
                if (zF3 || objK5 == w7) {
                    objK5 = new E(iVar, fFloatValue, c0888g0, fFloatValue2);
                    c0912t.i0(objK5);
                }
                c0912t.p(false);
                interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pA, (InterfaceC1182c) objK5);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pF = interfaceC1398pA2.f(interfaceC1398pA);
            EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
            c0912t.X(1311863562);
            boolean zH3 = c0912t.h(c1670c) | c0912t.f(c0888g0) | c0912t.h(interfaceC1765B);
            Object objK6 = c0912t.K();
            if (zH3 || objK6 == w7) {
                objK6 = new G(c1670c, c0888g0, interfaceC1765B, null);
                c0912t.i0(objK6);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA3 = z.L.a(interfaceC1398pF, qB, enumC2048l0, false, null, false, null, (l5.f) objK6, true, 60);
            c0912t.X(1311911023);
            boolean zF4 = c0912t.f(c0888g0);
            Object objK7 = c0912t.K();
            if (zF4 || objK7 == w7) {
                objK7 = new D0(1, c0888g0);
                c0912t.i0(objK7);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pB = androidx.compose.ui.layout.a.b(interfaceC1398pA3, (l5.f) objK7);
            long j3 = C1987t.f20261i;
            w.S s7 = this.f7174y;
            F0.a(interfaceC1398pB, null, j3, 0L, 0.0f, n0.e.e(-1061102719, new N(this.f7170u, this.f7171v, this.f7172w, this.f7166q, this.f7165p, iVar, this.f7173x, jB, this.f7169t, this.f7164o, s7, this.f7175z, this.f7162A, this.f7163B), c0912t), c0912t, 12583296, 122);
        }
        return Y4.o.f8736a;
    }
}
