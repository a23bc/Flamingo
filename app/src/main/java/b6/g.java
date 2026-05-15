package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0894j0;
import java.util.Objects;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f10420o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(YosMediaItem yosMediaItem, c5.d dVar) {
        super(2, dVar);
        this.f10420o = yosMediaItem;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new g(this.f10420o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        gVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        YosMediaItem yosMediaItem = this.f10420o;
        Objects.toString(yosMediaItem);
        System.out.getClass();
        C0894j0 c0894j0 = i.f10424d;
        c0894j0.setValue(yosMediaItem);
        c0894j0.getValue();
        System.out.getClass();
        return Y4.o.f8736a;
    }
}
