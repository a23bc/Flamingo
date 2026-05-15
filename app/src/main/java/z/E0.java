package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f20618o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ H0 f20619p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ long f20620q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(H0 h02, long j3, c5.d dVar) {
        super(2, dVar);
        this.f20619p = h02;
        this.f20620q = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new E0(this.f20619p, this.f20620q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20618o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            H0 h02 = this.f20619p;
            this.f20618o = 1;
            if (h02.f20647S.b(this.f20620q, true, this) == enumC0830a) {
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
