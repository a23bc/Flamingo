package p6;

import F.C0130c;
import Y4.o;
import f0.C0912t;
import m5.AbstractC1209k;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f15103o = new a();

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC1209k.f((C0130c) obj, "$this$item");
        if ((iIntValue & 17) == 16 && c0912t.z()) {
            c0912t.Q();
        } else {
            i6.h.b(I0.c.S(R.string.settings_library_overview_tip, c0912t), c0912t, 0);
        }
        return o.f8736a;
    }
}
