package h6;

import android.content.Context;
import f0.C0912t;
import l5.InterfaceC1180a;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f12784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12785q;

    public /* synthetic */ C0(Context context, InterfaceC1180a interfaceC1180a, int i7) {
        this.f12783o = i7;
        this.f12784p = context;
        this.f12785q = interfaceC1180a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12783o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else if (SettingsLibrary.INSTANCE.getNowPlayingShowVolumeBar()) {
                    M3.a.y(this.f12784p, this.f12785q, c0912t, 0);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else if (SettingsLibrary.INSTANCE.getNowPlayingShowVolumeBar()) {
                    M3.a.y(this.f12784p, this.f12785q, c0912t2, 0);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
