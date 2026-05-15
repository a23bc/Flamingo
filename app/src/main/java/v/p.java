package V;

import A2.W;
import R0.L0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f7345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f7346q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, d dVar, c5.d dVar2) {
        super(2, dVar2);
        this.f7345p = qVar;
        this.f7346q = dVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new p(this.f7345p, this.f7346q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((p) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7344o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            throw new W();
        }
        android.support.v4.media.session.b.K(obj);
        this.f7344o = 1;
        L0.a(this.f7345p, this.f7346q, this);
        return enumC0830a;
    }
}
