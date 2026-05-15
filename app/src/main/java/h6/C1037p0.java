package h6;

import D.AbstractC0068i;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.content.Context;
import f0.C0879c;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.C1670c;

/* JADX INFO: renamed from: h6.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1037p0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1670c f13155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z0 f13156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f13157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f13161u;

    public C1037p0(C1670c c1670c, Z0 z02, Context context, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, C0890h0 c0890h0, float f7) {
        this.f13155o = c1670c;
        this.f13156p = z02;
        this.f13157q = context;
        this.f13158r = interfaceC0878b0;
        this.f13159s = interfaceC0878b02;
        this.f13160t = c0890h0;
        this.f13161u = f7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 52, 0.0f, 2), 0.0f, 50, 0.0f, 0.0f, 13), 30);
            c0912t.X(-1390012580);
            C1670c c1670c = this.f13155o;
            boolean zH = c0912t.h(c1670c);
            Object objK = c0912t.K();
            if (zH || objK == C0903o.f11850a) {
                objK = new C1011c0(c1670c, 1);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pC, (InterfaceC1182c) objK);
            D.q0 q0VarA = D.o0.a(AbstractC0068i.f1328b, C1385c.f15621x, c0912t, 6);
            long j3 = c0912t.f11891T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pA);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, q0VarA, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                n1.c.w(i7, c0912t, i7, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC2, C0354j.f6017d);
            M3.a.x(this.f13156p, this.f13157q, this.f13158r, this.f13159s, this.f13160t, this.f13161u, c0912t, 196614, 0);
            c0912t.p(true);
        }
        return Y4.o.f8736a;
    }
}
