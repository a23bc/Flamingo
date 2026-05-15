package R0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z5.H f6426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ F0 f6427q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(z5.H h, F0 f02, c5.d dVar) {
        super(2, dVar);
        this.f6426p = h;
        this.f6427q = f02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new c1(this.f6426p, this.f6427q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((c1) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f6425o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            b1 b1Var = new b1(0, this.f6427q);
            this.f6425o = 1;
            if (this.f6426p.b(b1Var, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        throw new A2.W();
    }
}
