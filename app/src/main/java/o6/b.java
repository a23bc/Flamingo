package o6;

import Y4.m;
import Y4.o;
import cn.lyric.getter.api.API;
import f0.C0903o;
import f0.C0912t;
import i6.g;
import java.util.NoSuchElementException;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.e;
import p5.AbstractC1298a;
import p5.d;
import r5.C1423d;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f14722p;

    public /* synthetic */ b(m mVar, int i7) {
        this.f14721o = i7;
        this.f14722p = mVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14721o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    String strS = I0.c.S(R.string.settings_extend_statusbarlyric_basic_switch, c0912t);
                    c0912t.X(382113394);
                    final m mVar = this.f14722p;
                    boolean zH = c0912t.h(mVar);
                    Object objK = c0912t.K();
                    if (zH || objK == C0903o.f11850a) {
                        final int i7 = 0;
                        objK = new InterfaceC1180a() { // from class: o6.a
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                o oVar = o.f8736a;
                                m mVar2 = mVar;
                                switch (i7) {
                                    case 0:
                                        SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
                                        settingsLibrary.setLyricGetterAPIEnabled(true ^ settingsLibrary.getLyricGetterAPIEnabled());
                                        ((API) mVar2.getValue()).clearLyric();
                                        return oVar;
                                    case 1:
                                        API api = (API) mVar2.getValue();
                                        StringBuilder sb = new StringBuilder("[");
                                        C1423d c1423d = new C1423d(99999, 9999999, 1);
                                        AbstractC1298a abstractC1298a = d.f15102o;
                                        try {
                                            sb.append(g.z(c1423d));
                                            sb.append("] Flamingo Lyric Debug");
                                            API.sendLyric$default(api, sb.toString(), null, 2, null);
                                            return oVar;
                                        } catch (IllegalArgumentException e7) {
                                            throw new NoSuchElementException(e7.getMessage());
                                        }
                                    default:
                                        ((API) mVar2.getValue()).clearLyric();
                                        return oVar;
                                }
                            }
                        };
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    g.n(false, strS, (InterfaceC1180a) objK, new n6.c(4), c0912t, 24576);
                    AbstractC1113a.j(null, c0912t, 0);
                    g.e(false, I0.c.S(R.string.settings_extend_statusbarlyric_basic_status, c0912t), I0.c.S(SettingsLibrary.INSTANCE.getLyricGetterAPIHooked() ? R.string.settings_extend_statusbarlyric_basic_status_enabled : R.string.settings_extend_statusbarlyric_basic_status_disabled, c0912t), c0912t, 3072);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    String strS2 = I0.c.S(R.string.settings_extend_statusbarlyric_debug_send_lyric, c0912t2);
                    c0912t2.X(382175291);
                    final m mVar2 = this.f14722p;
                    boolean zH2 = c0912t2.h(mVar2);
                    Object objK2 = c0912t2.K();
                    if (zH2 || objK2 == C0903o.f11850a) {
                        final int i8 = 1;
                        objK2 = new InterfaceC1180a() { // from class: o6.a
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                o oVar = o.f8736a;
                                m mVar22 = mVar2;
                                switch (i8) {
                                    case 0:
                                        SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
                                        settingsLibrary.setLyricGetterAPIEnabled(true ^ settingsLibrary.getLyricGetterAPIEnabled());
                                        ((API) mVar22.getValue()).clearLyric();
                                        return oVar;
                                    case 1:
                                        API api = (API) mVar22.getValue();
                                        StringBuilder sb = new StringBuilder("[");
                                        C1423d c1423d = new C1423d(99999, 9999999, 1);
                                        AbstractC1298a abstractC1298a = d.f15102o;
                                        try {
                                            sb.append(g.z(c1423d));
                                            sb.append("] Flamingo Lyric Debug");
                                            API.sendLyric$default(api, sb.toString(), null, 2, null);
                                            return oVar;
                                        } catch (IllegalArgumentException e7) {
                                            throw new NoSuchElementException(e7.getMessage());
                                        }
                                    default:
                                        ((API) mVar22.getValue()).clearLyric();
                                        return oVar;
                                }
                            }
                        };
                        c0912t2.i0(objK2);
                    }
                    c0912t2.p(false);
                    g.f(false, strS2, null, true, (InterfaceC1180a) objK2, c0912t2, 3072, 5);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    String strS3 = I0.c.S(R.string.settings_extend_statusbarlyric_debug_clear_lyric, c0912t3);
                    c0912t3.X(382200359);
                    final m mVar3 = this.f14722p;
                    boolean zH3 = c0912t3.h(mVar3);
                    Object objK3 = c0912t3.K();
                    if (zH3 || objK3 == C0903o.f11850a) {
                        final int i9 = 2;
                        objK3 = new InterfaceC1180a() { // from class: o6.a
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                o oVar = o.f8736a;
                                m mVar22 = mVar3;
                                switch (i9) {
                                    case 0:
                                        SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
                                        settingsLibrary.setLyricGetterAPIEnabled(true ^ settingsLibrary.getLyricGetterAPIEnabled());
                                        ((API) mVar22.getValue()).clearLyric();
                                        return oVar;
                                    case 1:
                                        API api = (API) mVar22.getValue();
                                        StringBuilder sb = new StringBuilder("[");
                                        C1423d c1423d = new C1423d(99999, 9999999, 1);
                                        AbstractC1298a abstractC1298a = d.f15102o;
                                        try {
                                            sb.append(g.z(c1423d));
                                            sb.append("] Flamingo Lyric Debug");
                                            API.sendLyric$default(api, sb.toString(), null, 2, null);
                                            return oVar;
                                        } catch (IllegalArgumentException e7) {
                                            throw new NoSuchElementException(e7.getMessage());
                                        }
                                    default:
                                        ((API) mVar22.getValue()).clearLyric();
                                        return oVar;
                                }
                            }
                        };
                        c0912t3.i0(objK3);
                    }
                    c0912t3.p(false);
                    g.f(false, strS3, null, true, (InterfaceC1180a) objK3, c0912t3, 3072, 5);
                }
                break;
        }
        return o.f8736a;
    }
}
