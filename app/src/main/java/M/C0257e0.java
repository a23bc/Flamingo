package M;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: M.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0257e0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0.y f4547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f4548q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0257e0(K0.y yVar, j0 j0Var, c5.d dVar) {
        super(2, dVar);
        this.f4547p = yVar;
        this.f4548q = j0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0257e0 c0257e0 = new C0257e0(this.f4547p, this.f4548q, dVar);
        c0257e0.f4546o = obj;
        return c0257e0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0257e0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f4546o;
        EnumC1766C enumC1766C = EnumC1766C.f19467o;
        K0.y yVar = this.f4547p;
        j0 j0Var = this.f4548q;
        AbstractC1767D.t(interfaceC1765B, null, new C0253c0(yVar, j0Var, null), 1);
        return AbstractC1767D.t(interfaceC1765B, null, new C0255d0(yVar, j0Var, null), 1);
    }
}
