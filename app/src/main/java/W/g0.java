package w;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f18679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j0 f18680r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, c5.d dVar) {
        super(2, dVar);
        this.f18680r = j0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        g0 g0Var = new g0(this.f18680r, dVar);
        g0Var.f18679q = obj;
        return g0Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        float fJ;
        InterfaceC1765B interfaceC1765B;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f18678p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B2 = (InterfaceC1765B) this.f18679q;
            fJ = AbstractC1671d.j(interfaceC1765B2.g());
            interfaceC1765B = interfaceC1765B2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fJ = this.f18677o;
            interfaceC1765B = (InterfaceC1765B) this.f18679q;
            android.support.v4.media.session.b.K(obj);
        }
        while (AbstractC1767D.s(interfaceC1765B)) {
            V4.o oVar = new V4.o(this.f18680r, fJ, 2);
            this.f18679q = interfaceC1765B;
            this.f18677o = fJ;
            this.f18678p = 1;
            if (C0879c.q(getContext()).s(oVar, this) == enumC0830a) {
                return enumC0830a;
            }
        }
        return Y4.o.f8736a;
    }
}
