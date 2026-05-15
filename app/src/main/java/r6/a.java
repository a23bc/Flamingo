package r6;

import Z4.o;
import f0.C0912t;
import i6.g;
import k.AbstractC1113a;
import l5.e;
import o0.C1247d;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f15789p = new a(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f15790q = new a(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f15791r = new a(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f15792s = new a(3);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f15793t = new a(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15794o;

    public /* synthetic */ a(int i7) {
        this.f15794o = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15794o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    g.l(false, I0.c.S(R.string.settings_performance_lyric_style_font_weight, c0912t), o.e0("Thin", "ExtraLight", "Light", "Regular", "Medium", "SemiBold", "Bold", "ExtraBold", "Black"), new C1247d(6), SettingsLibrary.INSTANCE.getLyricFontWeight(), c0912t, 224256);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    g.n(false, I0.c.S(R.string.settings_performance_lyric_line_balance, c0912t2), new n6.c(10), new n6.c(11), c0912t2, 27648);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    g.n(false, I0.c.S(R.string.settings_performance_lyric_prefer_embedded, c0912t3), new n6.c(12), new n6.c(13), c0912t3, 27648);
                    AbstractC1113a.j(null, c0912t3, 0);
                    g.n(false, I0.c.S(R.string.settings_performance_lyric_blur_effect, c0912t3), new n6.c(14), new n6.c(15), c0912t3, 27648);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    g.n(false, I0.c.S(R.string.settings_performance_ui_notification_basic_enable_icon_title, c0912t4), new n6.c(16), new n6.c(17), c0912t4, 27648);
                }
                break;
            default:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    g.n(false, I0.c.S(R.string.settings_performance_ui_notification_others_smaller_icon_title, c0912t5), new n6.c(18), new n6.c(19), c0912t5, 27648);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
