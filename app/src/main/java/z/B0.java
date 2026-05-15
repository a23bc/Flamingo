package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H0 f20597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f20598q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(H0 h02, long j3, c5.d dVar) {
        super(2, dVar);
        this.f20597p = h02;
        this.f20598q = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new B0(this.f20597p, this.f20598q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20596o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            P0 p02 = this.f20597p.f20647S;
            this.f20596o = 1;
            if (p02.b(this.f20598q, false, this) == enumC0830a) {
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
