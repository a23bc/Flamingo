package h6;

import d0.AbstractC0774A;
import f0.C0912t;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.C1395m;
import v.C1614k;
import y0.C1987t;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements l5.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f12894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f12895p;

    public M0(float f7, boolean z6) {
        this.f12894o = f7;
        this.f12895p = z6;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        C0912t c0912t = (C0912t) obj3;
        ((Number) obj4).intValue();
        AbstractC1209k.f((C1614k) obj, "$this$AnimatedContent");
        C1395m c1395m = C1395m.f15634a;
        boolean z6 = this.f12895p;
        float f7 = this.f12894o;
        if (iIntValue == 1) {
            c0912t.X(-1537159548);
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_repeatone, c0912t), null, androidx.compose.foundation.layout.c.g(c1395m, f7), ((C1987t) v.o0.a(z6 ? C1987t.f20255b : C1987t.f20259f, null, c0912t, 0, 14).getValue()).f20264a, c0912t, 48, 0);
            c0912t.p(false);
        } else {
            c0912t.X(-1537146015);
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_repeat, c0912t), null, androidx.compose.foundation.layout.c.g(c1395m, f7), ((C1987t) v.o0.a(z6 ? C1987t.f20255b : C1987t.f20259f, null, c0912t, 0, 14).getValue()).f20264a, c0912t, 48, 0);
            c0912t.p(false);
        }
        return Y4.o.f8736a;
    }
}
