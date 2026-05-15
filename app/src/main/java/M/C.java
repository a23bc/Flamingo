package M;

import b1.C0613I;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import g1.C0980v;
import w5.InterfaceC1765B;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ J.b f4372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0980v f4373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z f4374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E0 f4375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B2.m f4376t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(J.b bVar, C0980v c0980v, Z z6, E0 e02, B2.m mVar, c5.d dVar) {
        super(2, dVar);
        this.f4372p = bVar;
        this.f4373q = c0980v;
        this.f4374r = z6;
        this.f4375s = e02;
        this.f4376t = mVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C(this.f4372p, this.f4373q, this.f4374r, this.f4375s, this.f4376t, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f4371o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        i0 i0Var = this.f4374r.f4497a;
        C0613I c0613i = this.f4375s.f4386a;
        this.f4371o = 1;
        int iE = b1.L.e(this.f4373q.f12385b);
        this.f4376t.a(iE);
        Object objA = this.f4372p.a(iE < c0613i.f9929a.f9920a.f9970p.length() ? c0613i.b(iE) : iE != 0 ? c0613i.b(iE - 1) : new C1893c(0.0f, 0.0f, 1.0f, (int) (o0.a(i0Var.f4590b, i0Var.f4595g, i0Var.h, o0.f4646a, 1) & 4294967295L)), this);
        if (objA != enumC0830a) {
            objA = oVar;
        }
        return objA == enumC0830a ? enumC0830a : oVar;
    }
}
