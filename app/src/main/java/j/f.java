package J;

import F.n;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f3580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n f3581q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, n nVar, c5.d dVar) {
        super(2, dVar);
        this.f3580p = hVar;
        this.f3581q = nVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new f(this.f3580p, this.f3581q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f3579o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f3579o = 1;
            if (I0.c.k(this.f3580p, this.f3581q, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return o.f8736a;
    }
}
