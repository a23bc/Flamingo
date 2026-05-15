package M;

import X.K0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0.y f4405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f4406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K0 f4407r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(K0.y yVar, j0 j0Var, K0 k02, c5.d dVar) {
        super(2, dVar);
        this.f4405p = yVar;
        this.f4406q = j0Var;
        this.f4407r = k02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        H h = new H(this.f4405p, this.f4406q, this.f4407r, dVar);
        h.f4404o = obj;
        return h;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        H h = (H) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        h.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f4404o;
        EnumC1766C enumC1766C = EnumC1766C.f19467o;
        K0.y yVar = this.f4405p;
        AbstractC1767D.t(interfaceC1765B, null, new F(yVar, this.f4406q, null), 1);
        AbstractC1767D.t(interfaceC1765B, null, new G(yVar, this.f4407r, null), 1);
        return Y4.o.f8736a;
    }
}
