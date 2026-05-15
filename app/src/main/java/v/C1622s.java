package v;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.C0909r0;
import f0.InterfaceC0878b0;

/* JADX INFO: renamed from: v.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1622s extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f18162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w.j0 f18163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f18164r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1622s(w.j0 j0Var, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f18163q = j0Var;
        this.f18164r = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1622s c1622s = new C1622s(this.f18163q, this.f18164r, dVar);
        c1622s.f18162p = obj;
        return c1622s;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1622s) create((C0909r0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f18161o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0909r0 c0909r0 = (C0909r0) this.f18162p;
            w.j0 j0Var = this.f18163q;
            z3.t tVarZ = C0879c.z(new C1621r(j0Var, 0));
            A5.D d4 = new A5.D(c0909r0, j0Var, this.f18164r, 2);
            this.f18161o = 1;
            if (tVarZ.b(d4, this) == enumC0830a) {
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
