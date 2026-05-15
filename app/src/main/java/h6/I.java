package h6;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import j5.AbstractC1110d;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class I implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f12864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12866q;

    public I(float f7, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02) {
        this.f12864o = f7;
        this.f12865p = interfaceC0878b0;
        this.f12866q = interfaceC0878b02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            O3.f fVar = new O3.f((Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b), 2);
            c0912t.X(1201978206);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = n1.c.q(c0912t);
            }
            B.k kVar = (B.k) objK;
            c0912t.p(false);
            c0912t.X(1201972475);
            boolean zF = c0912t.f(fVar);
            Object objK2 = c0912t.K();
            if (zF || objK2 == w7) {
                objK2 = new G(fVar, 1);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.a.c(c1395m, kVar, null, false, (InterfaceC1180a) objK2, 28);
            D.q0 q0VarA = D.o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t, 48);
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
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t, q0VarA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                n1.c.w(i7, c0912t, i7, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
            float f7 = this.f12864o;
            InterfaceC1398p interfaceC1398pC3 = androidx.compose.foundation.layout.c.c(c1395m, f7);
            C1390h c1390h = C1385c.f15616s;
            O0.Z zD = AbstractC0074o.d(c1390h, false);
            long j7 = c0912t.f11891T;
            int i8 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
            InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t, interfaceC1398pC3);
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD, c0351h);
            C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                n1.c.w(i8, c0912t, i8, c0351h3);
            }
            C0879c.y(c0912t, interfaceC1398pC4, c0351h4);
            InterfaceC0878b0 interfaceC0878b0 = this.f12865p;
            AbstractC1110d.a(interfaceC0878b0.getValue(), null, new b6.k(9), c1390h, null, null, n0.e.e(-665828578, new C(3, f7), c0912t), c0912t, 1576320, 50);
            c0912t.p(true);
            AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.k(c1395m, 6));
            AbstractC1113a.b(((Boolean) interfaceC0878b0.getValue()).booleanValue(), null, androidx.compose.animation.b.h(null, 0.3f, 5).a(androidx.compose.animation.b.e(null, 3)), androidx.compose.animation.b.j(null, 0.3f, 5).a(androidx.compose.animation.b.f(null, 3)), null, n0.e.e(-1113831059, new H(this.f12866q, 1), c0912t), c0912t, 1600518, 18);
            c0912t.p(true);
        }
        return Y4.o.f8736a;
    }
}
