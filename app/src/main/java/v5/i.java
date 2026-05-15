package V5;

import D.AbstractC0060d;
import F.C0130c;
import Y4.o;
import a.AbstractC0509a;
import android.content.Context;
import f0.C0894j0;
import f0.C0912t;
import g2.n;
import g2.r;
import g2.s;
import h6.C1048w;
import j5.AbstractC1109c;
import k2.C1144f;
import l2.C1162b;
import l2.C1167g;
import m5.AbstractC1209k;
import n1.p;
import r0.C1395m;
import y0.AbstractC1959I;
import y0.C1987t;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class i implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7619o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Context f7620p;

    public /* synthetic */ i(Context context, int i7) {
        this.f7619o = i7;
        this.f7620p = context;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f7619o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                ((Number) obj3).intValue();
                AbstractC1209k.f((r) obj, "$this$Row");
                C0894j0 c0894j0 = a6.d.f8892b;
                float f7 = (float) 10.7d;
                AbstractC0509a.g(new Z1.a(((Boolean) c0894j0.getValue()).booleanValue() ? R.drawable.ic_nowplaying_pause : R.drawable.ic_nowplaying_play), new s(new C1162b(f7)).c(new n(new C1162b(f7))), 0, c0912t, 48, 24);
                String string = this.f7620p.getString(((Boolean) c0894j0.getValue()).booleanValue() ? R.string.appwidget_pause : R.string.appwidget_play);
                AbstractC1209k.e(string, "getString(...)");
                C1144f c1144f = new C1144f(new C1167g(C1987t.f20259f), new p(AbstractC1109c.u(12)), null, 124);
                float f8 = 5;
                if ((14 & 1) != 0) {
                    f8 = 0;
                }
                AbstractC1109c.g(string, new g2.p(android.support.v4.media.session.b.L(f8), android.support.v4.media.session.b.L((14 & 2) != 0 ? 0 : 0.0f), android.support.v4.media.session.b.L(0), android.support.v4.media.session.b.L(0)), c1144f, 0, c0912t, 0, 8);
                break;
            default:
                C0130c c0130c = (C0130c) obj;
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f(c0130c, "$this$item");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0912t2.f(c0130c) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    String string2 = this.f7620p.getString(R.string.page_library_playlists_add_title);
                    AbstractC1209k.e(string2, "getString(...)");
                    i6.h.f(c0130c, l6.a.f14252o, string2, new C1048w(0), c0912t2, (iIntValue & 14) | 3120);
                    AbstractC0060d.d(c0912t2, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(i6.h.l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 102, 0.0f, 0.0f, 0.0f, 14), 0.15f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t2), AbstractC1959I.f20180a));
                }
                break;
        }
        return o.f8736a;
    }
}
