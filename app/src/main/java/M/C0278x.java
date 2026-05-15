package M;

import X.K0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.InterfaceC0878b0;
import g1.C0969k;
import g1.C0981w;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: M.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0278x extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f4728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f4729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0981w f4730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K0 f4731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0969k f4732t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0278x(Z z6, InterfaceC0878b0 interfaceC0878b0, C0981w c0981w, K0 k02, C0969k c0969k, c5.d dVar) {
        super(2, dVar);
        this.f4728p = z6;
        this.f4729q = interfaceC0878b0;
        this.f4730r = c0981w;
        this.f4731s = k02;
        this.f4732t = c0969k;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0278x(this.f4728p, this.f4729q, this.f4730r, this.f4731s, this.f4732t, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0278x) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f4727o;
        Z z6 = this.f4728p;
        try {
            if (i7 == 0) {
                android.support.v4.media.session.b.K(obj);
                z3.t tVarZ = C0879c.z(new F.m(this.f4729q, 3));
                A5.m mVar = new A5.m(z6, this.f4730r, this.f4731s, this.f4732t, 1);
                this.f4727o = 1;
                if (tVarZ.b(mVar, this) == enumC0830a) {
                    return enumC0830a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.K(obj);
            }
            V.m(z6);
            return Y4.o.f8736a;
        } catch (Throwable th) {
            V.m(z6);
            throw th;
        }
    }
}
