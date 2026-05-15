package h6;

import f0.C0912t;
import j5.AbstractC1109c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import y0.C1987t;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.data.libraries.YosMediaItemExtraKt;

/* JADX INFO: renamed from: h6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1006a implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f12991o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ YosMediaItem f12992p;

    public /* synthetic */ C1006a(YosMediaItem yosMediaItem, int i7) {
        this.f12991o = i7;
        this.f12992p = yosMediaItem;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        String title;
        String artistsName;
        String title2;
        String artistsName2;
        switch (this.f12991o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1398p) obj, "it");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    YosMediaItem yosMediaItem = this.f12992p;
                    if (yosMediaItem == null || (title = yosMediaItem.getTitle()) == null) {
                        title = "Unknown Work";
                    }
                    d0.H0.b(title, null, 0L, AbstractC1109c.u(17), f1.k.f12003u, null, 0L, null, AbstractC1109c.u(17), 0, false, 0, 0, null, c0912t, 199680, 6, 130006);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1398p) obj, "it");
                if ((iIntValue2 & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    YosMediaItem yosMediaItem2 = this.f12992p;
                    if (yosMediaItem2 == null || (artistsName = YosMediaItemExtraKt.getArtistsName(yosMediaItem2)) == null) {
                        artistsName = "Unknown Artist";
                    }
                    d0.H0.b(artistsName, AbstractC1109c.v(c0912t2, C1395m.f15634a), C1987t.b(C1987t.f20259f, 0.35f), AbstractC1109c.u(17), null, null, 0L, null, AbstractC1109c.u(17), 0, false, 0, 0, null, c0912t2, 3456, 6, 130032);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1398p) obj, "it");
                if ((iIntValue3 & 17) == 16 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    YosMediaItem yosMediaItem3 = this.f12992p;
                    if (yosMediaItem3 == null || (title2 = yosMediaItem3.getTitle()) == null) {
                        title2 = "Unknown Work";
                    }
                    d0.H0.b(title2, null, 0L, AbstractC1109c.u(19), f1.k.f12003u, null, 0L, null, AbstractC1109c.u(19), 0, false, 0, 0, null, c0912t3, 199680, 6, 130006);
                }
                break;
            default:
                C0912t c0912t4 = (C0912t) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1398p) obj, "it");
                if ((iIntValue4 & 17) == 16 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    YosMediaItem yosMediaItem4 = this.f12992p;
                    if (yosMediaItem4 == null || (artistsName2 = YosMediaItemExtraKt.getArtistsName(yosMediaItem4)) == null) {
                        artistsName2 = "Unknown Artist";
                    }
                    d0.H0.b(artistsName2, AbstractC1109c.v(c0912t4, C1395m.f15634a), C1987t.b(C1987t.f20259f, 0.35f), AbstractC1109c.u(19), null, null, 0L, null, AbstractC1109c.u(19), 0, false, 0, 0, null, c0912t4, 3456, 6, 130032);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
