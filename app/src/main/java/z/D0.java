package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H0 f20613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f20614q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(H0 h02, long j3, c5.d dVar) {
        super(2, dVar);
        this.f20613p = h02;
        this.f20614q = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new D0(this.f20613p, this.f20614q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20612o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            P0 p02 = this.f20613p.f20647S;
            EnumC1862l0 enumC1862l0 = EnumC1862l0.f19773p;
            C0 c02 = new C0(this.f20614q, null);
            this.f20612o = 1;
            if (p02.f(enumC1862l0, c02, this) == enumC0830a) {
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
