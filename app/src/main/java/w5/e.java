package W5;

import N5.l;
import Y4.o;
import Z1.r;
import a.AbstractC0509a;
import android.content.Context;
import android.graphics.Bitmap;
import b2.C0684z;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import g2.n;
import g2.s;
import j5.AbstractC1109c;
import k2.C1140b;
import k2.C1144f;
import l2.C1162b;
import l2.C1167g;
import m5.AbstractC1209k;
import n1.p;
import y0.C1987t;
import yos.music.player.R;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f7840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f7841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f7842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f7843r;

    public e(float f7, Context context, long j3, YosMediaItem yosMediaItem) {
        this.f7840o = f7;
        this.f7841p = context;
        this.f7842q = j3;
        this.f7843r = yosMediaItem;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        r dVar;
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f((g2.i) obj, "$this$Column");
        c0912t.X(866437630);
        Object objK = c0912t.K();
        if (objK == C0903o.f11850a) {
            objK = a6.b.f8885c;
            c0912t.i0(objK);
        }
        InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
        c0912t.p(false);
        if (interfaceC0878b0.getValue() == null) {
            dVar = new Z1.a(R.drawable.placeholder_music_default_artwork);
        } else {
            Object value = interfaceC0878b0.getValue();
            AbstractC1209k.c(value);
            dVar = new Z1.d((Bitmap) value);
        }
        float f7 = this.f7840o;
        AbstractC0509a.g(dVar, new s(new C1162b(f7)).c(new n(new C1162b(f7))).c(new C0684z(new C1162b(6))), 0, c0912t, 48, 16);
        String string = this.f7841p.getString(R.string.appwidget_nowplaying);
        AbstractC1209k.e(string, "getString(...)");
        long j3 = this.f7842q;
        C1144f c1144f = new C1144f(new C1167g(C1987t.b(j3, 0.6f)), new p(AbstractC1109c.u(10)), new C1140b(), 120);
        float f8 = 4;
        float f9 = (13 & 1) != 0 ? 0 : 0.0f;
        if ((13 & 2) != 0) {
            f8 = 0;
        }
        AbstractC1109c.g(string, new g2.p(android.support.v4.media.session.b.L(f9), android.support.v4.media.session.b.L(f8), android.support.v4.media.session.b.L(0), android.support.v4.media.session.b.L(0)), c1144f, 1, c0912t, 3072, 0);
        l.f(this.f7843r, j3, c0912t, 0);
        return o.f8736a;
    }
}
