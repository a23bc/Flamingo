package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2054o0 f20872o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(C2054o0 c2054o0, c5.d dVar) {
        super(2, dVar);
        this.f20872o = c2054o0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new j1(this.f20872o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        j1 j1Var = (j1) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        j1Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        this.f20872o.c();
        return Y4.o.f8736a;
    }
}
