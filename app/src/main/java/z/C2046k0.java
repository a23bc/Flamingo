package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import x.EnumC1862l0;

/* JADX INFO: renamed from: z.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2046k0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f20879o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ P0 f20880p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2034e0 f20881q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2046k0(P0 p02, C2034e0 c2034e0, c5.d dVar) {
        super(2, dVar);
        this.f20880p = p02;
        this.f20881q = c2034e0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C2046k0(this.f20880p, this.f20881q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2046k0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20879o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            EnumC1862l0 enumC1862l0 = EnumC1862l0.f19773p;
            this.f20879o = 1;
            if (this.f20880p.f(enumC1862l0, this.f20881q, this) == enumC0830a) {
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
