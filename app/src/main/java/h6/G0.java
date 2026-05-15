package h6;

import f0.C0912t;
import j5.AbstractC1109c;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import y0.C1987t;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.data.libraries.YosMediaItemExtraKt;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12858p;

    public /* synthetic */ G0(InterfaceC1180a interfaceC1180a, int i7) {
        this.f12857o = i7;
        this.f12858p = interfaceC1180a;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        String title;
        String artistsName;
        switch (this.f12857o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1398p) obj, "it");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    YosMediaItem yosMediaItem = (YosMediaItem) this.f12858p.a();
                    if (yosMediaItem == null || (title = yosMediaItem.getTitle()) == null) {
                        title = "Unknown Work";
                    }
                    d0.H0.b(title, null, 0L, AbstractC1109c.t(16.5d), f1.k.f12003u, null, 0L, null, AbstractC1109c.t(16.5d), 0, false, 0, 0, null, c0912t, 199680, 6, 130006);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1398p) obj, "it");
                if ((iIntValue2 & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    YosMediaItem yosMediaItem2 = (YosMediaItem) this.f12858p.a();
                    if (yosMediaItem2 == null || (artistsName = YosMediaItemExtraKt.getArtistsName(yosMediaItem2)) == null) {
                        artistsName = "Unknown Artist";
                    }
                    d0.H0.b(artistsName, AbstractC1109c.v(c0912t2, C1395m.f15634a), C1987t.b(C1987t.f20259f, 0.35f), AbstractC1109c.t(14.5d), null, null, 0L, null, AbstractC1109c.t(14.5d), 0, false, 0, 0, null, c0912t2, 3456, 6, 130032);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
