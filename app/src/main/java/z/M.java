package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f20684o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f20685p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ H f20686q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ P f20687r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(H h, P p7, c5.d dVar) {
        super(2, dVar);
        this.f20686q = h;
        this.f20687r = p7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        M m7 = new M(this.f20686q, this.f20687r, dVar);
        m7.f20685p = obj;
        return m7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((V4.F) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20684o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            D.h0 h0Var = new D.h0((V4.F) this.f20685p, 29, this.f20687r);
            this.f20684o = 1;
            if (this.f20686q.invoke(h0Var, this) == enumC0830a) {
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
