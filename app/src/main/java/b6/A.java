package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ YosPlaybackService f10405p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(YosPlaybackService yosPlaybackService, c5.d dVar) {
        super(2, dVar);
        this.f10405p = yosPlaybackService;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        A a4 = new A(this.f10405p, dVar);
        a4.f10404o = obj;
        return a4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        A a4 = (A) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        a4.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f10404o;
        YosPlaybackService yosPlaybackService = this.f10405p;
        AbstractC1767D.t(interfaceC1765B, null, new y(yosPlaybackService, null), 3);
        AbstractC1767D.t(interfaceC1765B, null, new z(yosPlaybackService, null), 3);
        return Y4.o.f8736a;
    }
}
