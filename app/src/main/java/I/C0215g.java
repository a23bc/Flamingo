package I;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import z.r1;

/* JADX INFO: renamed from: I.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0215g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0.y f3355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0211c f3356q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215g(K0.y yVar, C0211c c0211c, c5.d dVar) {
        super(2, dVar);
        this.f3355p = yVar;
        this.f3356q = c0211c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0215g(this.f3355p, this.f3356q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0215g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f3354o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0214f c0214f = new C0214f(this.f3356q, null);
            this.f3354o = 1;
            if (r1.c(this.f3355p, c0214f, this) == enumC0830a) {
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
