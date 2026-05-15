package m6;

import Y4.o;
import f0.C0912t;
import h6.C1048w;
import k.AbstractC1113a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f14441o = new a();

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            i6.g.n(false, I0.c.S(R.string.settings_play_search_result_not_as_playlist, c0912t), new C1048w(17), new C1048w(18), c0912t, 27648);
            AbstractC1113a.j(null, c0912t, 0);
            i6.g.n(false, I0.c.S(R.string.settings_play_history, c0912t), new C1048w(0), new C1048w(19), c0912t, 27648);
        }
        return o.f8736a;
    }
}
