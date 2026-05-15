package f0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import z5.InterfaceC2110e;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2110e f11761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0909r0 f11762q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(InterfaceC2110e interfaceC2110e, C0909r0 c0909r0, c5.d dVar) {
        super(2, dVar);
        this.f11761p = interfaceC2110e;
        this.f11762q = c0909r0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new V0(this.f11761p, this.f11762q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11760o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            U0 u02 = new U0(this.f11762q, 1);
            this.f11760o = 1;
            if (this.f11761p.b(u02, this) == enumC0830a) {
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
