package i2;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.C1793k;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: i2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1073h extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1074i f13377p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073h(C1074i c1074i, c5.d dVar) {
        super(2, dVar);
        this.f13377p = c1074i;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1073h(this.f13377p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1073h) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13376o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f13377p.e();
            C1074i c1074i = this.f13377p;
            this.f13376o = 1;
            C1793k c1793k = new C1793k(1, I0.c.D(this));
            c1793k.r();
            synchronized (c1074i.f13380q) {
                c1074i.f13381r = 20;
                c1074i.f13383t = c1793k;
            }
            c1793k.t(new B0.b(23, c1074i));
            if (c1793k.q() == enumC0830a) {
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
