package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1853h extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f19740o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ B.m f19741p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ B.k f19742q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1853h(B.k kVar, B.m mVar, c5.d dVar) {
        super(2, dVar);
        this.f19741p = mVar;
        this.f19742q = kVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1853h(this.f19742q, this.f19741p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1853h) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19740o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            B.n nVar = new B.n(this.f19741p);
            this.f19740o = 1;
            if (this.f19742q.a(nVar, this) == enumC0830a) {
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
