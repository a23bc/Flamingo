package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1857j extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f19751o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ B.k f19752p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ B.m f19753q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857j(B.k kVar, B.m mVar, c5.d dVar) {
        super(2, dVar);
        this.f19752p = kVar;
        this.f19753q = mVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1857j(this.f19752p, this.f19753q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1857j) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19751o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f19751o = 1;
            if (this.f19752p.a(this.f19753q, this) == enumC0830a) {
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
