package h6;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: renamed from: h6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1008b implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f12997p;

    public /* synthetic */ C1008b(YosMediaItem yosMediaItem, int i7) {
        this.f12996o = i7;
        this.f12997p = yosMediaItem;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f12996o) {
            case 0:
                return this.f12997p;
            case 1:
                YosMediaItem yosMediaItem = this.f12997p;
                AbstractC1209k.f(yosMediaItem, "$music");
                return yosMediaItem.getThumb();
            default:
                YosMediaItem yosMediaItem2 = this.f12997p;
                AbstractC1209k.f(yosMediaItem2, "$music");
                return yosMediaItem2.getThumb();
        }
    }
}
