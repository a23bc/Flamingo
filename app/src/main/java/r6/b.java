package r6;

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
import f0.C0912t;
import f0.InterfaceC0906p0;
import i6.h;
import k.AbstractC1113a;
import l5.f;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.InterfaceC1398p;
import v6.E;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f15795p = new b(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f15796q = new b(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15797o;

    public /* synthetic */ b(int i7) {
        this.f15797o = i7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f15797o) {
            case 0:
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
                    h.b(I0.c.S(R.string.settings_performance_lyric_style, c0912t), c0912t, 0);
                    E.a(null, null, 0L, c.f15798a, c0912t, 3072, 7);
                    h.b(I0.c.S(R.string.settings_performance_lyric_style_font_weight_desc, c0912t), c0912t, 0);
                    AbstractC1113a.m(null, c0912t, 0);
                    E.a(null, null, 0L, c.f15799b, c0912t, 3072, 7);
                    h.b(I0.c.S(R.string.settings_performance_lyric_line_balance_desc, c0912t), c0912t, 0);
                    AbstractC1113a.l(null, c0912t, 0);
                    h.b(I0.c.S(R.string.settings_performance_lyric_others, c0912t), c0912t, 0);
                    E.a(null, null, 0L, c.f15800c, c0912t, 3072, 7);
                    h.b(I0.c.S(R.string.settings_performance_lyric_blur_effect_desc, c0912t), c0912t, 0);
                    AbstractC1113a.l(null, c0912t, 0);
                    c0912t.p(true);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue2 & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                    long j7 = c0912t2.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, fillElement2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, c0084zA2, C0354j.f6019f);
                    C0879c.y(c0912t2, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t2, i8, c0351h2);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC2, C0354j.f6017d);
                    E.a(null, null, 0L, d.f15802a, c0912t2, 3072, 7);
                    h.b(I0.c.S(R.string.settings_performance_ui_notification_basic_enable_icon_desc, c0912t2), c0912t2, 0);
                    AbstractC1113a.l(null, c0912t2, 0);
                    h.b(I0.c.S(R.string.settings_performance_notification_others, c0912t2), c0912t2, 0);
                    E.a(null, null, 0L, d.f15803b, c0912t2, 3072, 7);
                    h.b(I0.c.S(R.string.settings_performance_ui_notification_others_smaller_icon_desc, c0912t2), c0912t2, 0);
                    AbstractC1113a.l(null, c0912t2, 0);
                    c0912t2.p(true);
                }
                break;
        }
        return o.f8736a;
    }
}
