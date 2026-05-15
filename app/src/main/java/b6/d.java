package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w3.C1760y;
import w5.InterfaceC1765B;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f10417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10418p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z6, int i7, c5.d dVar) {
        super(2, dVar);
        this.f10417o = z6;
        this.f10418p = i7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new d(this.f10417o, this.f10418p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        i iVar = i.f10421a;
        C1760y c1760y = i.f10423c;
        if (c1760y != null) {
            c1760y.E(this.f10417o);
        }
        C1760y c1760y2 = i.f10423c;
        if (c1760y2 != null) {
            c1760y2.f(this.f10418p);
        }
        C1760y c1760y3 = i.f10423c;
        if (c1760y3 == null) {
            return null;
        }
        new YosPlaybackService().l(c1760y3);
        return Y4.o.f8736a;
    }
}
