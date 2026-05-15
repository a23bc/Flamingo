package x;

import Q0.AbstractC0347f;
import R0.AbstractC0403q0;
import R0.S0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1180a;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1816E extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f19616o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1820G f19617p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816E(C1820G c1820g, c5.d dVar) {
        super(2, dVar);
        this.f19617p = c1820g;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1816E(this.f19617p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1816E) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19616o;
        C1820G c1820g = this.f19617p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            long jC = ((S0) AbstractC0347f.i(c1820g, AbstractC0403q0.f6518s)).c();
            this.f19616o = 1;
            if (AbstractC1767D.i(jC, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        InterfaceC1180a interfaceC1180a = c1820g.Z;
        if (interfaceC1180a != null) {
            interfaceC1180a.a();
        }
        return Y4.o.f8736a;
    }
}
