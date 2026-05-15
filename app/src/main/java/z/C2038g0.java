package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: z.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2038g0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f20839o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ A3.b f20840p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2038g0(A3.b bVar, c5.d dVar) {
        super(2, dVar);
        this.f20840p = bVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C2038g0(this.f20840p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2038g0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20839o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        y5.c cVar = (y5.c) this.f20840p.f482f;
        this.f20839o = 1;
        Object objH = AbstractC1767D.h(new C2030c0(cVar, null), this);
        return objH == enumC0830a ? enumC0830a : objH;
    }
}
