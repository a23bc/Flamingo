package j6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.List;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f13748p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, c5.d dVar) {
        super(2, dVar);
        this.f13748p = list;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new d(this.f13748p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13747o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            b6.i iVar = b6.i.f10421a;
            List list = this.f13748p;
            YosMediaItem yosMediaItem = (YosMediaItem) Z4.n.q0(list);
            this.f13747o = 1;
            if (b6.i.f10421a.a(yosMediaItem, list, 0L, false, 2, true, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
