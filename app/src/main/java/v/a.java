package V;

import A2.W;
import R0.b1;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.Y;
import o0.C1247d;
import w5.InterfaceC1765B;
import z5.y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e f7300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f7301q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, o oVar, c5.d dVar) {
        super(2, dVar);
        this.f7300p = eVar;
        this.f7301q = oVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new a(this.f7300p, this.f7301q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7299o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1247d c1247d = new C1247d(17);
            this.f7299o = 1;
            if (C0879c.q(getContext()).s(new Y(c1247d, 0), this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.K(obj);
                throw new W();
            }
            android.support.v4.media.session.b.K(obj);
        }
        z5.r rVarI = this.f7300p.i();
        if (rVarI == null) {
            return Y4.o.f8736a;
        }
        b1 b1Var = new b1(1, this.f7301q);
        this.f7299o = 2;
        y.k((y) rVarI, b1Var, this);
        return enumC0830a;
    }
}
