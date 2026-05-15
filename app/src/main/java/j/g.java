package J;

import F.n;
import K0.C0236d;
import Q0.j0;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f3582o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ h f3583p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ j0 f3584q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0236d f3585r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ n f3586s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, j0 j0Var, C0236d c0236d, n nVar, c5.d dVar) {
        super(2, dVar);
        this.f3583p = hVar;
        this.f3584q = j0Var;
        this.f3585r = c0236d;
        this.f3586s = nVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0236d c0236d = this.f3585r;
        n nVar = this.f3586s;
        g gVar = new g(this.f3583p, this.f3584q, c0236d, nVar, dVar);
        gVar.f3582o = obj;
        return gVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f3582o;
        j0 j0Var = this.f3584q;
        C0236d c0236d = this.f3585r;
        h hVar = this.f3583p;
        AbstractC1767D.t(interfaceC1765B, null, new e(hVar, j0Var, c0236d, null), 3);
        return AbstractC1767D.t(interfaceC1765B, null, new f(hVar, this.f3586s, null), 3);
    }
}
