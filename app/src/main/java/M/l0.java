package M;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ V.k f4625p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(V.k kVar, c5.d dVar) {
        super(2, dVar);
        this.f4625p = kVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new l0(this.f4625p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f4624o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        this.f4624o = 1;
        V.k kVar = this.f4625p;
        kVar.getClass();
        Object objH = AbstractC1767D.h(new V.j(kVar, null), this);
        if (objH != enumC0830a) {
            objH = oVar;
        }
        return objH == enumC0830a ? enumC0830a : oVar;
    }
}
