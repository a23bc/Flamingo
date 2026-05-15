package H;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f2863o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ f0 f2864p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f2865q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, int i7, c5.d dVar) {
        super(2, dVar);
        this.f2864p = f0Var;
        this.f2865q = i7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new e0(this.f2864p, this.f2865q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f2863o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            b0 b0Var = this.f2864p.f2867D;
            this.f2863o = 1;
            if (b0Var.d(this.f2865q, this) == enumC0830a) {
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
