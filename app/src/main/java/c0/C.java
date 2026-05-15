package c0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.C1670c;
import w.n0;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B0.a f10519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f10520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0 f10521r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(B0.a aVar, float f7, n0 n0Var, c5.d dVar) {
        super(2, dVar);
        this.f10519p = aVar;
        this.f10520q = f7;
        this.f10521r = n0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C(this.f10519p, this.f10520q, this.f10521r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10518o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1670c c1670c = (C1670c) this.f10519p.f607c;
            Float f7 = new Float(this.f10520q);
            this.f10518o = 1;
            if (C1670c.c(c1670c, f7, this.f10521r, null, null, this, 12) == enumC0830a) {
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
