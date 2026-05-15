package M;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0.y f4390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f4391q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(K0.y yVar, j0 j0Var, c5.d dVar) {
        super(2, dVar);
        this.f4390p = yVar;
        this.f4391q = j0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new F(this.f4390p, this.f4391q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f4389o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f4389o = 1;
            if (V.l(this.f4390p, this.f4391q, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
