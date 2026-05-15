package V4;

import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import j5.AbstractC1110d;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: V4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0461h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0461h f7504a = new C0461h();

    public final void a(H h, C1395m c1395m, C0458e c0458e, C0912t c0912t, int i7) {
        int i8;
        C1395m c1395m2;
        C1395m c1395m3;
        AbstractC1209k.f(h, "sliderPositions");
        c0912t.Z(2083759566);
        if ((i7 & 14) == 0) {
            i8 = (c0912t.f(h) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8 | 48;
        if ((i7 & 896) == 0) {
            i9 |= c0912t.f(c0458e) ? 256 : 128;
        }
        if ((i7 & 7168) == 0) {
            i9 |= c0912t.g(true) ? 2048 : 1024;
        }
        if ((57344 & i7) == 0) {
            i9 |= c0912t.f(this) ? 16384 : 8192;
        }
        if ((46811 & i9) == 9362 && c0912t.z()) {
            c0912t.Q();
            c1395m3 = c1395m;
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                c1395m2 = C1395m.f15634a;
            } else {
                c0912t.Q();
                c1395m2 = c1395m;
            }
            c0912t.q();
            InterfaceC0878b0 interfaceC0878b0B = c0458e.b(false, c0912t);
            InterfaceC0878b0 interfaceC0878b0B2 = c0458e.b(true, c0912t);
            InterfaceC0878b0 interfaceC0878b0A = c0458e.a(false, c0912t);
            InterfaceC0878b0 interfaceC0878b0A2 = c0458e.a(true, c0912t);
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(c1395m2, 1.0f), x.f7591c);
            c0912t.Y(159986843);
            boolean zF = c0912t.f(interfaceC0878b0B) | ((i9 & 14) == 4) | c0912t.f(interfaceC0878b0B2) | c0912t.f(interfaceC0878b0A) | c0912t.f(interfaceC0878b0A2);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                C0459f c0459f = new C0459f(interfaceC0878b0B, h, interfaceC0878b0B2, interfaceC0878b0A, interfaceC0878b0A2);
                c0912t.i0(c0459f);
                objK = c0459f;
            }
            c0912t.p(false);
            AbstractC1110d.f(interfaceC1398pC, (InterfaceC1182c) objK, c0912t, 0);
            c1395m3 = c1395m2;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0460g(this, h, c1395m3, c0458e, i7, 0);
        }
    }
}
