package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0871i implements l5.e {
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new h(2, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        hVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        a6.b.f8883a.j(-1);
        return Y4.o.f8736a;
    }
}
