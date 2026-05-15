package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f20747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2054o0 f20748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K0.u f20749r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U0(l5.f fVar, C2054o0 c2054o0, K0.u uVar, c5.d dVar) {
        super(2, dVar);
        this.f20747p = (AbstractC0871i) fVar;
        this.f20748q = c2054o0;
        this.f20749r = uVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new U0(this.f20747p, this.f20748q, this.f20749r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20746o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1892b c1892b = new C1892b(this.f20749r.f3912c);
            this.f20746o = 1;
            if (this.f20747p.d(this.f20748q, c1892b, this) == enumC0830a) {
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
