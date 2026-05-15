package c0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f10576o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ p f10577p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, c5.d dVar) {
        super(2, dVar);
        this.f10577p = pVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        o oVar = new o(this.f10577p, dVar);
        oVar.f10576o = obj;
        return oVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return AbstractC1767D.t((InterfaceC1765B) this.f10576o, null, new n(this.f10577p, null), 3);
    }
}
