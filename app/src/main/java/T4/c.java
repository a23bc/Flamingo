package T4;

import Q0.AbstractC0347f;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f6948o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, c5.d dVar2) {
        super(2, dVar2);
        this.f6948o = dVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new c(this.f6948o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((InterfaceC1765B) obj, (c5.d) obj2);
        o oVar = o.f8736a;
        cVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        AbstractC0347f.m(this.f6948o);
        return o.f8736a;
    }
}
