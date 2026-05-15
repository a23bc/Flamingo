package R0;

import android.view.Choreographer;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC0871i implements l5.e {
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new W(2, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return Choreographer.getInstance();
    }
}
