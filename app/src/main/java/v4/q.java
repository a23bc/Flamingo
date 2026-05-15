package V4;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.C1217s;
import w.AbstractC1671d;
import w.C1670c;
import w.n0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f7550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f7551q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f7552r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(float f7, float f8, c5.d dVar) {
        super(2, dVar);
        this.f7551q = f7;
        this.f7552r = f8;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        q qVar = new q(this.f7551q, this.f7552r, dVar);
        qVar.f7550p = obj;
        return qVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((F) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7549o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            F f7 = (F) this.f7550p;
            C1217s c1217s = new C1217s();
            float f8 = this.f7551q;
            c1217s.f14436o = f8;
            float f9 = this.f7552r;
            n0 n0Var = f9 > f8 ? x.f7592d : x.f7593e;
            C1670c c1670cA = AbstractC1671d.a(f8);
            Float f10 = new Float(f9);
            Float f11 = new Float(0.0f);
            K0.A a4 = new K0.A(f7, 11, c1217s);
            this.f7549o = 1;
            if (c1670cA.b(f10, n0Var, f11, a4, this) == enumC0830a) {
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
