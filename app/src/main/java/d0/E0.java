package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractC0871i implements l5.e {
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new E0(2, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        E0 e02 = (E0) create((K0.y) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        e02.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return Y4.o.f8736a;
    }
}
