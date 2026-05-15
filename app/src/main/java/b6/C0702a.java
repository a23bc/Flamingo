package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.AbstractC1209k;
import w5.AbstractC1767D;
import w5.C1792j0;
import w5.InterfaceC1765B;
import w5.M;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: renamed from: b6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0702a extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f10406o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702a(YosMediaItem yosMediaItem, c5.d dVar) {
        super(2, dVar);
        this.f10406o = yosMediaItem;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0702a(this.f10406o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0702a c0702a = (C0702a) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c0702a.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        C1792j0 c1792j0 = i.f10426f;
        if (c1792j0 != null) {
            c1792j0.c(null);
        }
        i.f10426f = AbstractC1767D.b();
        D5.d dVar = M.f19498b;
        C1792j0 c1792j02 = i.f10426f;
        AbstractC1209k.c(c1792j02);
        dVar.getClass();
        B5.d dVarA = AbstractC1767D.a(I0.c.L(dVar, c1792j02));
        x5.d dVar2 = B5.n.f912a;
        AbstractC1767D.t(dVarA, dVar2, new g(this.f10406o, null), 2);
        AbstractC1767D.t(dVarA, dVar2, new h(2, null), 2);
        return Y4.o.f8736a;
    }
}
