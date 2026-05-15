package j6;

import F.C0130c;
import d0.H0;
import f0.C0912t;
import j5.AbstractC1109c;
import m5.AbstractC1209k;
import r0.C1395m;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f13755p;

    public g(long j3, int i7) {
        this.f13754o = i7;
        this.f13755p = j3;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC1209k.f((C0130c) obj, "$this$item");
        if ((iIntValue & 17) == 16 && c0912t.z()) {
            c0912t.Q();
        } else {
            float f7 = 18;
            H0.b(I0.c.T(R.string.page_library_album_info_others, new Object[]{Integer.valueOf(this.f13754o), Long.valueOf(this.f13755p)}, c0912t), androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(i6.h.l(C1395m.f15634a, 0.4f), f7, 0.0f, 2), 0.0f, f7, 0.0f, 0.0f, 13), 0L, AbstractC1109c.u(15), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, 3120, 0, 131060);
        }
        return Y4.o.f8736a;
    }
}
