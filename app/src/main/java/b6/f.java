package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w3.C1760y;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10419o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i7, c5.d dVar) {
        super(2, dVar);
        this.f10419o = i7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new f(this.f10419o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        C1760y c1760y = i.f10423c;
        if (c1760y != null) {
            c1760y.s(this.f10419o);
        }
        C1760y c1760y2 = i.f10423c;
        if (c1760y2 == null) {
            return null;
        }
        I0.c.t(c1760y2);
        return Y4.o.f8736a;
    }
}
