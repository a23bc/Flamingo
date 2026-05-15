package f4;

import E0.C0095f;
import E0.K;
import O0.C0318o;
import O0.InterfaceC0319p;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.D0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e4.C0852a;
import e4.C0862k;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0906p0;
import f0.W;
import m5.AbstractC1209k;
import p4.C1297c;
import r0.AbstractC1383a;
import r0.InterfaceC1398p;
import y0.C1973f;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a */
    public static final q f12218a = new q();

    public static final void a(p4.h hVar, String str, InterfaceC1398p interfaceC1398p, InterfaceC0319p interfaceC0319p, C1980m c1980m, C0912t c0912t, int i7, int i8) {
        c0912t.Y(-941517612);
        if ((i8 & 256) != 0) {
            c1980m = null;
        }
        C1980m c1980m2 = c1980m;
        C0862k c0862kW = (C0862k) c0912t.j(x.f12239a);
        if (c0862kW == null) {
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            C0862k c0862k = C0852a.f11562b;
            if (c0862k == null) {
                synchronized (C0852a.f11561a) {
                    c0862k = C0852a.f11562b;
                    if (c0862k != null) {
                        c0862kW = c0862k;
                    } else {
                        context.getApplicationContext();
                        c0862kW = N5.d.w(context);
                        C0852a.f11562b = c0862kW;
                    }
                }
            } else {
                c0862kW = c0862k;
            }
        }
        b(hVar, str, c0862kW, interfaceC1398p, interfaceC0319p, c1980m2, c0912t, (i7 & 112) | 520 | ((i7 << 3) & 7168) | 12582912, 0);
        c0912t.p(false);
    }

    public static final void b(p4.h hVar, String str, C0862k c0862k, InterfaceC1398p interfaceC1398p, InterfaceC0319p interfaceC0319p, C1980m c1980m, C0912t c0912t, int i7, int i8) {
        p4.h hVarA;
        InterfaceC1398p interfaceC1398p2;
        InterfaceC1398p interfaceC1398pF;
        q4.i eVar;
        C0931b c0931b = C0931b.f12176r;
        c0912t.Z(-2030202961);
        int i9 = y.f12241b;
        c0912t.Y(402368983);
        C1297c c1297c = hVar.f15051E;
        W w7 = C0903o.f11850a;
        if (c1297c.f15015a == null) {
            if (interfaceC0319p.equals(C0318o.f5429e)) {
                eVar = new q4.e(q4.h.f15593c);
            } else {
                c0912t.Y(-492369756);
                Object objK = c0912t.K();
                if (objK == w7) {
                    objK = new t();
                    c0912t.i0(objK);
                }
                c0912t.p(false);
                eVar = (q4.i) objK;
            }
            p4.g gVarA = p4.h.a(hVar);
            gVarA.f15042t = eVar;
            gVarA.f15044v = null;
            gVarA.f15045w = null;
            gVarA.f15046x = null;
            hVarA = gVarA.a();
        } else {
            hVarA = hVar;
        }
        c0912t.p(false);
        int i10 = i7 >> 9;
        int i11 = 57344 & i10;
        c0912t.Y(-2020614074);
        Object obj = hVarA.f15054b;
        if (obj instanceof p4.g) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof C1973f) {
            d("ImageBitmap");
            throw null;
        }
        if (obj instanceof C0095f) {
            d("ImageVector");
            throw null;
        }
        if (obj instanceof D0.b) {
            d("Painter");
            throw null;
        }
        if (hVarA.f15055c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        c0912t.Y(-492369756);
        Object objK2 = c0912t.K();
        if (objK2 == w7) {
            objK2 = new p(hVarA, c0862k);
            c0912t.i0(objK2);
        }
        c0912t.p(false);
        p pVar = (p) objK2;
        pVar.f12217z = c0931b;
        pVar.f12204A = interfaceC0319p;
        pVar.f12205B = 1;
        pVar.f12206C = ((Boolean) c0912t.j(D0.f6266a)).booleanValue();
        pVar.f12209F.setValue(c0862k);
        pVar.f12208E.setValue(hVarA);
        pVar.a();
        c0912t.p(false);
        q4.i iVar = hVarA.f15074x;
        if (iVar instanceof t) {
            interfaceC1398p2 = interfaceC1398p;
            interfaceC1398pF = interfaceC1398p2.f((InterfaceC1398p) iVar);
        } else {
            interfaceC1398p2 = interfaceC1398p;
            interfaceC1398pF = interfaceC1398p2;
        }
        c(interfaceC1398pF, pVar, str, interfaceC0319p, c1980m, c0912t, ((i7 << 3) & 896) | (i10 & 7168) | i11 | (458752 & i10) | (3670016 & i10));
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R == null) {
            return;
        }
        c0915u0R.f11932d = new C0930a(hVar, str, c0862k, interfaceC1398p2, interfaceC0319p, c1980m, i7, i8);
    }

    public static final void c(InterfaceC1398p interfaceC1398p, p pVar, String str, InterfaceC0319p interfaceC0319p, C1980m c1980m, C0912t c0912t, int i7) {
        c0912t.Z(10290533);
        InterfaceC1398p interfaceC1398pF = j0.k.r(str != null ? Y0.l.a(interfaceC1398p, false, new Y0.m(str, 4)) : interfaceC1398p).f(new u(pVar, interfaceC0319p, c1980m));
        c cVar = c.f12178a;
        c0912t.Y(544976794);
        int iP = C0879c.p(c0912t);
        InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pF);
        InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
        InterfaceC0355k.f6047i.getClass();
        C0353i c0353i = C0354j.f6015b;
        c0912t.Y(1405779621);
        c0912t.b0();
        if (c0912t.f11890S) {
            c0912t.k(new K(23, c0353i));
        } else {
            c0912t.l0();
        }
        C0879c.y(c0912t, cVar, C0354j.f6019f);
        C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
        C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
        C0351h c0351h = C0354j.f6020g;
        if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(iP))) {
            n1.c.w(iP, c0912t, iP, c0351h);
        }
        c0912t.p(true);
        c0912t.p(false);
        c0912t.p(false);
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R == null) {
            return;
        }
        c0915u0R.f11932d = new d(interfaceC1398p, pVar, str, interfaceC0319p, c1980m, i7);
    }

    public static void d(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + Z1.l.q("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }
}
