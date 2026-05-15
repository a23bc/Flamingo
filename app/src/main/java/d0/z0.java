package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import z.q1;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D0 f11178q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(D0 d02, c5.d dVar) {
        super(2, dVar);
        this.f11178q = d02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        z0 z0Var = new z0(this.f11178q, dVar);
        z0Var.f11177p = obj;
        return z0Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((K0.y) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11176o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            K0.y yVar = (K0.y) this.f11177p;
            D0 d02 = this.f11178q;
            y0 y0Var = new y0(d02, null);
            w0 w0Var = new w0(d02, 1);
            this.f11176o = 1;
            if (q1.e(yVar, y0Var, w0Var, this, 3) == enumC0830a) {
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
