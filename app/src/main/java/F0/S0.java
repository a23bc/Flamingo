package f0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l5.e f11743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f11744r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(l5.e eVar, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f11743q = eVar;
        this.f11744r = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        S0 s02 = new S0(this.f11743q, this.f11744r, dVar);
        s02.f11742p = obj;
        return s02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((S0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11741o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0909r0 c0909r0 = new C0909r0(this.f11744r, ((InterfaceC1765B) this.f11742p).g());
            this.f11741o = 1;
            if (this.f11743q.invoke(c0909r0, this) == enumC0830a) {
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
