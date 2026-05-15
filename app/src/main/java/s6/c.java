package s6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import F.C0130c;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import Y4.o;
import androidx.compose.foundation.layout.FillElement;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import h6.C1026k;
import i6.h;
import i6.r;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.InterfaceC1398p;
import v6.E;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class c implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f15946o = new c();

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC1209k.f((C0130c) obj, "$this$item");
        if ((iIntValue & 17) == 16 && c0912t.z()) {
            c0912t.Q();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            long j3 = c0912t.f11891T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, fillElement);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                n1.c.w(i7, c0912t, i7, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            E.a(null, null, 0L, d.f15947a, c0912t, 3072, 7);
            h.b(I0.c.S(R.string.settings_performance_ui_blur_effect_desc, c0912t), c0912t, 0);
            AbstractC1113a.m(null, c0912t, 0);
            c0912t.X(-73110157);
            Object objK = c0912t.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.t(Boolean.FALSE);
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            c0912t.p(false);
            E.a(null, null, 0L, n0.e.e(1504696596, new C1026k(interfaceC0878b0, 7), c0912t), c0912t, 3072, 7);
            h.b(I0.c.S(R.string.settings_performance_ui_screen_corner_desc, c0912t), c0912t, 0);
            c0912t.X(-73084929);
            if (((Boolean) interfaceC0878b0.getValue()).booleanValue()) {
                c0912t.X(-73082382);
                Object objK2 = c0912t.K();
                if (objK2 == w7) {
                    objK2 = new r(interfaceC0878b0, 8);
                    c0912t.i0(objK2);
                }
                c0912t.p(false);
                i6.g.j(null, (InterfaceC1180a) objK2, c0912t, 48);
            }
            c0912t.p(false);
            AbstractC1113a.m(null, c0912t, 0);
            E.a(null, null, 0L, d.f15948b, c0912t, 3072, 7);
            h.b(I0.c.S(R.string.settings_performance_ui_nowplaying_show_volume_bar_desc, c0912t), c0912t, 0);
            AbstractC1113a.m(null, c0912t, 0);
            E.a(null, null, 0L, d.f15949c, c0912t, 3072, 7);
            h.b(I0.c.S(R.string.settings_performance_ui_nowplaying_background_effect_desc, c0912t), c0912t, 0);
            AbstractC1113a.l(null, c0912t, 0);
            c0912t.p(true);
        }
        return o.f8736a;
    }
}
