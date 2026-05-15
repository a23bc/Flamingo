package i2;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: i2.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1065D extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f13314o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1074i f13315p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1065D(C1074i c1074i, c5.d dVar) {
        super(2, dVar);
        this.f13315p = c1074i;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1065D(this.f13315p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1065D) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13314o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f13314o = 1;
            C1074i c1074i = this.f13315p;
            c1074i.getClass();
            if (AbstractC1767D.D(5000L, new C1073h(c1074i, null), this) == enumC0830a) {
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
