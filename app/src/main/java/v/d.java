package V;

import A2.W;
import M.k0;
import R0.U;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f7310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k0 f7311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f7312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f7313s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k0 k0Var, e eVar, q qVar, c5.d dVar) {
        super(2, dVar);
        this.f7311q = k0Var;
        this.f7312r = eVar;
        this.f7313s = qVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        d dVar2 = new d(this.f7311q, this.f7312r, this.f7313s, dVar);
        dVar2.f7310p = obj;
        return dVar2;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((d) create((U) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7309o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            c cVar = new c((U) this.f7310p, this.f7311q, this.f7312r, this.f7313s, null);
            this.f7309o = 1;
            if (AbstractC1767D.h(cVar, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        throw new W();
    }
}
