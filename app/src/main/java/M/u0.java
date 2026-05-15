package M;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f4710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f4711p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(InterfaceC0878b0 interfaceC0878b0, long j3, c5.d dVar) {
        super(2, dVar);
        this.f4710o = interfaceC0878b0;
        this.f4711p = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new u0(this.f4710o, this.f4711p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        u0 u0Var = (u0) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        u0Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        InterfaceC0878b0 interfaceC0878b0 = this.f4710o;
        android.support.v4.media.session.b.K(obj);
        if (((B.m) interfaceC0878b0.getValue()) != null) {
            interfaceC0878b0.setValue(null);
        }
        interfaceC0878b0.setValue(new B.m(this.f4711p));
        return Y4.o.f8736a;
    }
}
