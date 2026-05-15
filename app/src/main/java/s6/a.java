package s6;

import Z4.o;
import d0.AbstractC0774A;
import d0.AbstractC0805u;
import d0.C0803s;
import f0.C0912t;
import k.AbstractC1113a;
import o0.C1247d;
import o5.AbstractC1267a;
import r0.C1395m;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f15940p = new a(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f15941q = new a(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f15942r = new a(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f15943s = new a(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15944o;

    public /* synthetic */ a(int i7) {
        this.f15944o = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15944o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_tips_roundcorner, c0912t), null, androidx.compose.foundation.layout.c.g(C1395m.f15634a, 62), ((C0803s) c0912t.j(AbstractC0805u.f11147a)).f11095a, c0912t, 432, 0);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    i6.g.l(false, I0.c.S(R.string.settings_performance_ui_theme, c0912t2), o.e0("Auto", "Dark", "Light"), new C1247d(9), SettingsLibrary.INSTANCE.getCustomTheme(), c0912t2, 224256);
                    AbstractC1113a.j(null, c0912t2, 0);
                    i6.g.n(false, I0.c.S(R.string.settings_performance_ui_blur_effect_title, c0912t2), new n6.c(20), new n6.c(21), c0912t2, 27648);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    i6.g.n(false, I0.c.S(R.string.settings_performance_ui_nowplaying_show_volume_bar, c0912t3), new n6.c(22), new n6.c(23), c0912t3, 27648);
                }
                break;
            default:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    i6.g.n(false, I0.c.S(R.string.settings_performance_ui_nowplaying_background_effect, c0912t4), new n6.c(24), new n6.c(25), c0912t4, 27648);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
