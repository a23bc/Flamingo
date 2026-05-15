package v;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.C1670c;
import w.C1677j;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f18149o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ p0 f18150p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ long f18151q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ s0 f18152r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p0 p0Var, long j3, s0 s0Var, c5.d dVar) {
        super(2, dVar);
        this.f18150p = p0Var;
        this.f18151q = j3;
        this.f18152r = s0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new q0(this.f18150p, this.f18151q, this.f18152r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f18149o;
        p0 p0Var = this.f18150p;
        s0 s0Var = this.f18152r;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1670c c1670c = p0Var.f18139a;
            n1.m mVar = new n1.m(this.f18151q);
            w.S s7 = s0Var.f18165D;
            this.f18149o = 1;
            obj = C1670c.c(c1670c, mVar, s7, null, null, this, 12);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        if (((C1677j) obj).f18687b == 2) {
            s0Var.getClass();
        }
        return Y4.o.f8736a;
    }
}
