package f4;

import E0.K;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import w5.InterfaceC1765B;
import z5.AbstractC2116k;
import z5.C2115j;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f12196o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ p f12197p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, c5.d dVar) {
        super(2, dVar);
        this.f12197p = pVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new l(this.f12197p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f12196o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            p pVar = this.f12197p;
            z3.t tVarZ = C0879c.z(new K(24, pVar));
            j jVar = new j(pVar, null);
            int i8 = AbstractC2116k.f21297a;
            A5.o oVar = new A5.o(new C2115j(jVar, null), tVarZ, c5.j.f10685o, -2, y5.a.f20528o);
            k kVar = new k(pVar);
            this.f12196o = 1;
            if (oVar.b(kVar, this) == enumC0830a) {
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
