package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0894j0;
import w3.C1760y;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.MusicLibrary;
import yos.music.player.data.libraries.PlayStatus;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ YosPlaybackService f10503o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(YosPlaybackService yosPlaybackService, c5.d dVar) {
        super(2, dVar);
        this.f10503o = yosPlaybackService;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new x(this.f10503o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        xVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        int i7 = YosPlaybackService.f20580B;
        System.out.getClass();
        C0894j0 c0894j0 = i.f10424d;
        if (c0894j0.getValue() != null && i.f10423c != null) {
            System.out.getClass();
            MusicLibrary musicLibrary = MusicLibrary.INSTANCE;
            YosMediaItem yosMediaItem = (YosMediaItem) c0894j0.getValue();
            C1760y c1760y = i.f10423c;
            long jF0 = c1760y != null ? c1760y.F0() : 0L;
            C1760y c1760y2 = i.f10423c;
            boolean zR0 = c1760y2 != null ? c1760y2.r0() : false;
            C1760y c1760y3 = i.f10423c;
            musicLibrary.updatePlayStatus(new PlayStatus(yosMediaItem, jF0, zR0, c1760y3 != null ? c1760y3.i() : 2));
        }
        return Y4.o.f8736a;
    }
}
