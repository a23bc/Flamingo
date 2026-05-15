package b6;

import android.os.Handler;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ B2.e f10500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I4.t f10501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y4.m f10502q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(B2.e eVar, I4.t tVar, Y4.m mVar, c5.d dVar) {
        super(2, dVar);
        this.f10500o = eVar;
        this.f10501p = tVar;
        this.f10502q = mVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new w(this.f10500o, this.f10501p, this.f10502q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        wVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        int i7 = YosPlaybackService.f20580B;
        Y4.m mVar = this.f10502q;
        ((Handler) mVar.getValue()).post(this.f10500o);
        ((Handler) mVar.getValue()).post(this.f10501p);
        return Y4.o.f8736a;
    }
}
