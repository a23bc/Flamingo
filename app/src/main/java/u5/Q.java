package U5;

import D.AbstractC0074o;
import D.h0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import f0.C0879c;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.InterfaceC1398p;
import w.C1670c;
import w5.InterfaceC1765B;
import yos.music.player.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ float f7176A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ T4.l f7177B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Context f7178C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1670c f7181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D4.i f7182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f7183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n1.d f7184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f7185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y3.x f7187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f7189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w.S f7190z;

    public Q(C0888g0 c0888g0, C0888g0 c0888g02, C1670c c1670c, D4.i iVar, InterfaceC1765B interfaceC1765B, n1.d dVar, float f7, MainActivity mainActivity, y3.x xVar, InterfaceC0878b0 interfaceC0878b0, InterfaceC1180a interfaceC1180a, w.S s7, float f8, T4.l lVar, Context context) {
        this.f7179o = c0888g0;
        this.f7180p = c0888g02;
        this.f7181q = c1670c;
        this.f7182r = iVar;
        this.f7183s = interfaceC1765B;
        this.f7184t = dVar;
        this.f7185u = f7;
        this.f7186v = mainActivity;
        this.f7187w = xVar;
        this.f7188x = interfaceC0878b0;
        this.f7189y = interfaceC1180a;
        this.f7190z = s7;
        this.f7176A = f8;
        this.f7177B = lVar;
        this.f7178C = context;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            C0888g0 c0888g0 = this.f7179o;
            if (c0888g0.h() != 0) {
                FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                c0912t.X(51405065);
                C0888g0 c0888g02 = this.f7180p;
                boolean zF = c0912t.f(c0888g02);
                Object objK = c0912t.K();
                f0.W w7 = C0903o.f11850a;
                if (zF || objK == w7) {
                    objK = new C0452y(c0888g02, 1);
                    c0912t.i0(objK);
                }
                c0912t.p(false);
                InterfaceC1398p interfaceC1398pF = androidx.compose.ui.layout.a.f(fillElement, (InterfaceC1182c) objK);
                c0912t.X(51410984);
                boolean zF2 = c0912t.f(c0888g02) | c0912t.h(this.f7181q);
                D4.i iVar = this.f7182r;
                boolean zF3 = zF2 | c0912t.f(iVar);
                Object objK2 = c0912t.K();
                if (zF3 || objK2 == w7) {
                    objK2 = new h0(iVar, 10, c0888g0);
                    c0912t.i0(objK2);
                }
                c0912t.p(false);
                InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pF, (InterfaceC1182c) objK2);
                O0.Z zD = AbstractC0074o.d(C1385c.f15619v, false);
                long j3 = c0912t.f11891T;
                int i7 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pA);
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
                AbstractC1110d.n(n0.e.e(-2052125210, new P(this.f7183s, this.f7181q, this.f7180p, iVar, this.f7184t, this.f7185u, this.f7186v, this.f7187w, this.f7188x, this.f7189y, this.f7190z, this.f7176A, this.f7177B, this.f7178C), c0912t), c0912t, 6);
                c0912t.p(true);
            }
        }
        return Y4.o.f8736a;
    }
}
