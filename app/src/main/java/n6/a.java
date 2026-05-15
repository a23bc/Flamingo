package n6;

import Y4.o;
import f0.C0912t;
import h6.C1048w;
import i6.g;
import l5.e;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f14553p = new a(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f14554q = new a(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14555o;

    public /* synthetic */ a(int i7) {
        this.f14555o = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14555o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    g.n(false, I0.c.S(R.string.settings_audio_exoplayer_behaviors_audio_attributes, c0912t), new C1048w(25), new C1048w(26), c0912t, 27648);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    g.n(false, I0.c.S(R.string.settings_audio_exoplayer_decode_audio_float_output, c0912t2), new C1048w(27), new C1048w(28), c0912t2, 27648);
                }
                break;
        }
        return o.f8736a;
    }
}
