package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w3.C1760y;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0871i implements l5.e {
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new e(2, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        C1760y c1760y = i.f10423c;
        if (c1760y == null) {
            return null;
        }
        I0.c.t(c1760y);
        return Y4.o.f8736a;
    }
}
