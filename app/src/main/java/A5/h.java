package A5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f549o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f550p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ i f551q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, c5.d dVar) {
        super(2, dVar);
        this.f551q = iVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        h hVar = new h(this.f551q, dVar);
        hVar.f550p = obj;
        return hVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC2111f) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f549o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC2111f interfaceC2111f = (InterfaceC2111f) this.f550p;
            this.f549o = 1;
            if (this.f551q.f(interfaceC2111f, this) == enumC0830a) {
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
