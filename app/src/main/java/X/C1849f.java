package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1849f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B.m f19732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B.k f19733q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1849f(B.k kVar, B.m mVar, c5.d dVar) {
        super(2, dVar);
        this.f19732p = mVar;
        this.f19733q = kVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1849f(this.f19733q, this.f19732p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1849f) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19731o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            B.l lVar = new B.l(this.f19732p);
            this.f19731o = 1;
            if (this.f19733q.a(lVar, this) == enumC0830a) {
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
