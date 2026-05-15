package i6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import java.util.List;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.SettingsLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f13582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f13583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13584r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(YosMediaItem yosMediaItem, List list, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f13582p = yosMediaItem;
        this.f13583q = list;
        this.f13584r = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new w(this.f13582p, this.f13583q, this.f13584r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13581o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            b6.i iVar = b6.i.f10421a;
            List listF = SettingsLibrary.INSTANCE.getSearchResultNotAsPlayList() ? z.f(this.f13583q) : (List) this.f13584r.getValue();
            this.f13581o = 1;
            if (b6.i.f10421a.a(this.f13582p, listF, 0L, false, 2, true, this) == enumC0830a) {
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
