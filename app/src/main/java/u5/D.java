package U5;

import I.C0211c;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.F0;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.Z0;
import f0.a1;
import j5.AbstractC1109c;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.C1670c;
import w5.InterfaceC1765B;
import y0.C1960J;
import yos.music.player.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class D implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7083A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Context f7084B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7085C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7086D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f7088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D4.i f7089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z0 f7091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f7093u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w.S f7094v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ T4.l f7095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y3.x f7096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0211c f7097y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7098z;

    public D(C0888g0 c0888g0, C1670c c1670c, D4.i iVar, int i7, Z0 z02, InterfaceC0878b0 interfaceC0878b0, InterfaceC1765B interfaceC1765B, w.S s7, T4.l lVar, y3.x xVar, C0211c c0211c, MainActivity mainActivity, InterfaceC0878b0 interfaceC0878b02, Context context, InterfaceC0878b0 interfaceC0878b03, C0888g0 c0888g02) {
        this.f7087o = c0888g0;
        this.f7088p = c1670c;
        this.f7089q = iVar;
        this.f7090r = i7;
        this.f7091s = z02;
        this.f7092t = interfaceC0878b0;
        this.f7093u = interfaceC1765B;
        this.f7094v = s7;
        this.f7095w = lVar;
        this.f7096x = xVar;
        this.f7097y = c0211c;
        this.f7098z = mainActivity;
        this.f7083A = interfaceC0878b02;
        this.f7084B = context;
        this.f7085C = interfaceC0878b03;
        this.f7086D = c0888g02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            System.out.getClass();
            InterfaceC1398p interfaceC1398pA = C1395m.f15634a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            c0912t.X(50857814);
            C0888g0 c0888g0 = this.f7087o;
            boolean zF = c0912t.f(c0888g0);
            C1670c c1670c = this.f7088p;
            boolean zH = zF | c0912t.h(c1670c);
            D4.i iVar = this.f7089q;
            boolean zF2 = zH | c0912t.f(iVar);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (zF2 || objK == w7) {
                objK = new C0443o(iVar, 0);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.graphics.a.a(fillElement, (InterfaceC1182c) objK);
            c0912t.X(50869729);
            if (iVar.p() > 0.0f && iVar.f1582p != 0) {
                c0912t.X(50872753);
                Object objK2 = c0912t.K();
                if (objK2 == w7) {
                    final int i7 = this.f7090r;
                    objK2 = new InterfaceC1182c() { // from class: U5.p
                        @Override // l5.InterfaceC1182c
                        public final Object b(Object obj3) {
                            C1960J c1960j = (C1960J) obj3;
                            AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                            c1960j.e(1);
                            c1960j.d(true);
                            c1960j.m(AbstractC1109c.i(i7, null, 6));
                            return Y4.o.f8736a;
                        }
                    };
                    c0912t.i0(objK2);
                }
                c0912t.p(false);
                interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pA, (InterfaceC1182c) objK2);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pF = interfaceC1398pA2.f(interfaceC1398pA);
            c0912t.X(50883125);
            boolean zF3 = c0912t.f(c0888g0) | c0912t.h(c1670c) | c0912t.f(iVar);
            Object objK3 = c0912t.K();
            if (zF3 || objK3 == w7) {
                objK3 = new C0443o(iVar, 1);
                c0912t.i0(objK3);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA3 = androidx.compose.ui.graphics.a.a(interfaceC1398pF, (InterfaceC1182c) objK3);
            a1 a1Var = AbstractC0805u.f11147a;
            F0.a(interfaceC1398pA3, null, ((C0803s) c0912t.j(a1Var)).f11106n, ((C0803s) c0912t.j(a1Var)).f11107o, 0.0f, n0.e.e(-400158473, new C(this.f7091s, this.f7092t, this.f7093u, this.f7088p, this.f7094v, this.f7095w, this.f7096x, this.f7097y, this.f7098z, this.f7083A, this.f7084B, this.f7085C, this.f7086D), c0912t), c0912t, 12582912, 114);
        }
        return Y4.o.f8736a;
    }
}
