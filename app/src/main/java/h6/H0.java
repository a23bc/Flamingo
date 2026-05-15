package h6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import java.util.List;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f12862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12863q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(YosMediaItem yosMediaItem, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f12862p = yosMediaItem;
        this.f12863q = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new H0(this.f12862p, this.f12863q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((H0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f12861o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            b6.i iVar = b6.i.f10421a;
            List list = (List) this.f12863q.getValue();
            if (list == null) {
                list = Z4.v.f8818o;
            }
            this.f12861o = 1;
            if (b6.i.f10421a.a(this.f12862p, list, 0L, false, 2, true, this) == enumC0830a) {
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
