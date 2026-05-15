package U5;

import D.A0;
import D.C0080v;
import I.C0211c;
import R0.AbstractC0403q0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.Z0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import o0.AbstractC1256m;
import w.AbstractC1671d;
import w.C1670c;
import w5.InterfaceC1765B;
import y3.AbstractC2010C;
import yos.music.player.MainActivity;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;
import z4.AbstractC2102u;

/* JADX INFO: renamed from: U5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0449v implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7273p;

    public /* synthetic */ C0449v(MainActivity mainActivity, int i7) {
        this.f7272o = i7;
        this.f7273p = mainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        w.S s7;
        int i8 = 8;
        f0.W w7 = C0903o.f11850a;
        int i9 = 7;
        MainActivity mainActivity = this.f7273p;
        Y4.o oVar = Y4.o.f8736a;
        int i10 = 2;
        switch (this.f7272o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    c0912t.X(-1360914525);
                    Object objK = c0912t.K();
                    if (objK == w7) {
                        objK = C0879c.t(Boolean.valueOf(!SettingsLibrary.INSTANCE.getScreenCornerSet()));
                        c0912t.i0(objK);
                    }
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
                    c0912t.p(false);
                    if (!((Boolean) interfaceC0878b0.getValue()).booleanValue()) {
                        c0912t.X(761823337);
                        mainActivity.l(0, c0912t);
                        c0912t.p(false);
                    } else {
                        c0912t.X(761584141);
                        c0912t.X(-1360904025);
                        Object objK2 = c0912t.K();
                        if (objK2 == w7) {
                            objK2 = new F.m(interfaceC0878b0, i9);
                            c0912t.i0(objK2);
                        }
                        c0912t.p(false);
                        i6.g.j(null, (InterfaceC1180a) objK2, c0912t, 48);
                        c0912t.p(false);
                    }
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    Context context = (Context) c0912t2.j(AndroidCompositionLocals_androidKt.f9324b);
                    n1.d dVar = (n1.d) c0912t2.j(AbstractC0403q0.h);
                    C0888g0 c0888g0 = (C0888g0) AbstractC1256m.e(new Object[]{"MainActivity_parentHeight"}, new A0(i9), c0912t2, 48);
                    c0912t2.X(-1728794035);
                    Object objK3 = c0912t2.K();
                    if (objK3 == w7) {
                        int i11 = Integer.parseInt(SettingsLibrary.INSTANCE.getScreenCorner());
                        objK3 = Integer.valueOf(i11 != 0 ? i11 + 3 : 1);
                        c0912t2.i0(objK3);
                    }
                    int iIntValue = ((Number) objK3).intValue();
                    c0912t2.p(false);
                    Object objK4 = c0912t2.K();
                    if (objK4 == w7) {
                        objK4 = C0879c.l(c0912t2);
                        c0912t2.i0(objK4);
                    }
                    InterfaceC1765B interfaceC1765B = (InterfaceC1765B) objK4;
                    System.out.getClass();
                    System.out.getClass();
                    float f7 = 62;
                    c0912t2.X(-1728765117);
                    Object objK5 = c0912t2.K();
                    if (objK5 == w7) {
                        objK5 = new C0888g0(0);
                        c0912t2.i0(objK5);
                    }
                    C0888g0 c0888g02 = (C0888g0) objK5;
                    Object objR = n1.c.r(-1728761967, c0912t2, false);
                    if (objR == w7) {
                        n1.g gVar = new n1.g(dVar.i0(c0888g02.h()) + f7);
                        c0912t2.i0(gVar);
                        objR = gVar;
                    }
                    float f8 = ((n1.g) objR).f14511o;
                    c0912t2.p(false);
                    y3.x xVarG = AbstractC1110d.G(new AbstractC2010C[0], c0912t2);
                    w.S s8 = new w.S(1.0f, 400.0f, Float.valueOf(0.001f));
                    InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) AbstractC1256m.c(new Object[0], null, "MainActivity_route", new A0(i8), c0912t2, 3456, 2);
                    AbstractC1110d.n(n0.e.e(-323588380, new C0080v(xVarG, 4, interfaceC0878b02), c0912t2), c0912t2, 6);
                    c0912t2.X(-1728727106);
                    Object objK6 = c0912t2.K();
                    if (objK6 == w7) {
                        objK6 = AbstractC1671d.a(0.0f);
                        c0912t2.i0(objK6);
                    }
                    C1670c c1670c = (C1670c) objK6;
                    c0912t2.p(false);
                    D4.i iVar = new D4.i(c0888g0, c1670c, iIntValue, i8);
                    c0912t2.X(-1728690225);
                    Object objK7 = c0912t2.K();
                    if (objK7 == w7) {
                        i7 = 0;
                        objK7 = C0879c.o(new C0442n(iVar, 0));
                        c0912t2.i0(objK7);
                    } else {
                        i7 = 0;
                    }
                    Z0 z02 = (Z0) objK7;
                    c0912t2.p(i7);
                    InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) AbstractC1256m.c(new Object[i7], null, "MainActivity_nowPageNowPlaying", new A0(9), c0912t2, 3456, 2);
                    c0912t2.X(-1728676381);
                    Object objK8 = c0912t2.K();
                    if (objK8 == w7) {
                        objK8 = new T4.l();
                        c0912t2.i0(objK8);
                    }
                    T4.l lVar = (T4.l) objK8;
                    c0912t2.p(false);
                    MainActivity mainActivity2 = this.f7273p;
                    AbstractC1110d.n(n0.e.e(1679704155, new C0080v(z02, 5, mainActivity2), c0912t2), c0912t2, 6);
                    String strS = I0.c.S(R.string.page_home_title, c0912t2);
                    Object[] objArr = new Object[0];
                    c0912t2.X(-1728622794);
                    boolean zF = c0912t2.f(strS);
                    Object objK9 = c0912t2.K();
                    if (zF || objK9 == w7) {
                        objK9 = new E3.e(12, strS);
                        c0912t2.i0(objK9);
                    }
                    c0912t2.p(false);
                    InterfaceC0878b0 interfaceC0878b04 = (InterfaceC0878b0) AbstractC1256m.c(objArr, null, "MainActivity_nowLabel", (InterfaceC1180a) objK9, c0912t2, 384, 2);
                    C0211c c0211cB = I.O.b(new A0(10), c0912t2);
                    c0912t2.X(-1728615332);
                    boolean zH = c0912t2.h(interfaceC1765B) | c0912t2.h(c1670c);
                    Object objK10 = c0912t2.K();
                    if (zH || objK10 == w7) {
                        s7 = s8;
                        objK10 = new F.n(interfaceC1765B, c1670c, s7, 3);
                        c0912t2.i0(objK10);
                    } else {
                        s7 = s8;
                    }
                    c0912t2.p(false);
                    w.S s9 = s7;
                    AbstractC1110d.n(n0.e.e(-451960932, new D(c0888g0, c1670c, iVar, iIntValue, z02, interfaceC0878b03, interfaceC1765B, s9, lVar, xVarG, c0211cB, mainActivity2, interfaceC0878b04, context, interfaceC0878b02, c0888g02), c0912t2), c0912t2, 6);
                    AbstractC1110d.n(n0.e.e(1711341277, new Q(c0888g02, c0888g0, c1670c, iVar, interfaceC1765B, dVar, f7, mainActivity2, xVarG, interfaceC0878b03, (InterfaceC1180a) objK10, s9, f8, lVar, context), c0912t2), c0912t2, 6);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    AbstractC2102u.a(false, false, n0.e.e(1492066017, new C0449v(mainActivity, i), c0912t3), c0912t3, 384);
                }
                break;
            default:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    t6.b.a(false, n0.e.e(-1747299077, new C0449v(mainActivity, i10), c0912t4), c0912t4, 384);
                }
                break;
        }
        return oVar;
    }
}
