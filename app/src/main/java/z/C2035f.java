package z;

import M.C0265j;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: z.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2035f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t1 f20819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2039h f20820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2029c f20821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1786g0 f20822t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2035f(t1 t1Var, C2039h c2039h, InterfaceC2029c interfaceC2029c, InterfaceC1786g0 interfaceC1786g0, c5.d dVar) {
        super(2, dVar);
        this.f20819q = t1Var;
        this.f20820r = c2039h;
        this.f20821s = interfaceC2029c;
        this.f20822t = interfaceC1786g0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C2035f c2035f = new C2035f(this.f20819q, this.f20820r, this.f20821s, this.f20822t, dVar);
        c2035f.f20818p = obj;
        return c2035f;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2035f) create((M0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20817o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            M0 m02 = (M0) this.f20818p;
            C2039h c2039h = this.f20820r;
            InterfaceC2029c interfaceC2029c = this.f20821s;
            float fB0 = C2039h.B0(c2039h, interfaceC2029c);
            t1 t1Var = this.f20819q;
            t1Var.f20962e = fB0;
            C0265j c0265j = new C0265j(c2039h, t1Var, this.f20822t, m02);
            F.n nVar = new F.n(c2039h, t1Var, interfaceC2029c, 14);
            this.f20817o = 1;
            if (t1Var.a(c0265j, nVar, this) == enumC0830a) {
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
