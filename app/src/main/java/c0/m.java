package c0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f10572o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ p f10573p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, c5.d dVar) {
        super(2, dVar);
        this.f10573p = pVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        m mVar = new m(this.f10573p, dVar);
        mVar.f10572o = obj;
        return mVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f10572o;
        p pVar = this.f10573p;
        AbstractC1767D.t(interfaceC1765B, null, new j(pVar, null), 3);
        AbstractC1767D.t(interfaceC1765B, null, new k(pVar, null), 3);
        return AbstractC1767D.t(interfaceC1765B, null, new l(pVar, null), 3);
    }
}
