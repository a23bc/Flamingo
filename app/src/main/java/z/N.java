package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f20689o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f20690p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ P f20691q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ long f20692r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p7, long j3, c5.d dVar) {
        super(2, dVar);
        this.f20691q = p7;
        this.f20692r = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        N n7 = new N(this.f20691q, this.f20692r, dVar);
        n7.f20690p = obj;
        return n7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20689o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f20690p;
            l5.f fVar = this.f20691q.f20708Q;
            C1892b c1892b = new C1892b(this.f20692r);
            this.f20689o = 1;
            if (fVar.d(interfaceC1765B, c1892b, this) == enumC0830a) {
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
