package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l5.f f20777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2054o0 f20778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K0.u f20779r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(l5.f fVar, C2054o0 c2054o0, K0.u uVar, c5.d dVar) {
        super(2, dVar);
        this.f20777p = fVar;
        this.f20778q = c2054o0;
        this.f20779r = uVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new a1(this.f20777p, this.f20778q, this.f20779r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20776o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1892b c1892b = new C1892b(this.f20779r.f3912c);
            this.f20776o = 1;
            if (this.f20777p.d(this.f20778q, c1892b, this) == enumC0830a) {
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
