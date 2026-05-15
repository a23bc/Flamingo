package h6;

import D.AbstractC0074o;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0445q;
import android.content.Context;
import f0.C0879c;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z0 f12927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f12928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f12931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f12932t;

    public R0(Z0 z02, Context context, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, C0890h0 c0890h0, float f7) {
        this.f12927o = z02;
        this.f12928p = context;
        this.f12929q = interfaceC0878b0;
        this.f12930r = interfaceC0878b02;
        this.f12931s = c0890h0;
        this.f12932t = f7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            InterfaceC1398p interfaceC1398pL = i6.h.l(AbstractC1109c.v(c0912t, C1395m.f15634a), 0.4f);
            boolean zBooleanValue = ((Boolean) this.f12927o.getValue()).booleanValue();
            c0912t.X(-756985199);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = n1.c.q(c0912t);
            }
            B.k kVar = (B.k) objK;
            c0912t.p(false);
            c0912t.X(-757003485);
            Context context = this.f12928p;
            boolean zF = c0912t.f(context);
            InterfaceC0878b0 interfaceC0878b0 = this.f12929q;
            boolean zF2 = zF | c0912t.f(interfaceC0878b0);
            InterfaceC0878b0 interfaceC0878b02 = this.f12930r;
            boolean zF3 = zF2 | c0912t.f(interfaceC0878b02);
            C0890h0 c0890h0 = this.f12931s;
            boolean zF4 = zF3 | c0912t.f(c0890h0);
            Object objK2 = c0912t.K();
            if (zF4 || objK2 == w7) {
                C0445q c0445q = new C0445q(context, interfaceC0878b0, interfaceC0878b02, c0890h0, 4);
                c0912t.i0(c0445q);
                objK2 = c0445q;
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.a.c(interfaceC1398pL, kVar, null, zBooleanValue, (InterfaceC1180a) objK2, 24);
            O0.Z zD = AbstractC0074o.d(C1385c.f15616s, false);
            long j3 = c0912t.f11891T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pC);
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
            C0879c.y(c0912t, interfaceC1398pC2, C0354j.f6017d);
            AbstractC1110d.a(interfaceC0878b0.getValue(), null, new b6.k(27), null, null, null, n0.e.e(-1419160506, new C(6, this.f12932t), c0912t), c0912t, 1573248, 58);
            c0912t.p(true);
        }
        return Y4.o.f8736a;
    }
}
