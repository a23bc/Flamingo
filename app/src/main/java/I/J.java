package I;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import z.InterfaceC2058q0;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0211c f3282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3283q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0211c c0211c, int i7, c5.d dVar) {
        super(2, dVar);
        this.f3282p = c0211c;
        this.f3283q = i7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new J(this.f3282p, this.f3283q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC2058q0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f3281o;
        Y4.o oVar = Y4.o.f8736a;
        C0211c c0211c = this.f3282p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f3281o = 1;
            Object objK = c0211c.f3311w.k(this);
            if (objK != enumC0830a) {
                objK = oVar;
            }
            if (objK == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        double d4 = 0.0f;
        if (-0.5d > d4 || d4 > 0.5d) {
            C.b.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        c0211c.u(0.0f, c0211c.j(this.f3283q), true);
        return oVar;
    }
}
