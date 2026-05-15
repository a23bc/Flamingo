package l6;

import B5.n;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0894j0;
import java.util.List;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;
import y3.x;
import yos.music.player.data.libraries.FavPlayListLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f14257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f14258q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, x xVar, c5.d dVar) {
        super(2, dVar);
        this.f14257p = str;
        this.f14258q = xVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new c(this.f14257p, this.f14258q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f14256o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            List<YosMediaItem> favPlayList = FavPlayListLibrary.INSTANCE.getFavPlayList();
            C0894j0 c0894j0 = a6.a.f8880a;
            a6.a.a(this.f14257p, favPlayList);
            D5.e eVar = M.f19497a;
            x5.d dVar = n.f912a;
            b bVar = new b(this.f14258q, null);
            this.f14256o = 1;
            if (AbstractC1767D.C(dVar, bVar, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return o.f8736a;
    }
}
