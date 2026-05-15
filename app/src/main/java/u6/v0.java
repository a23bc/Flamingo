package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import l5.InterfaceC1180a;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f17898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17899q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(InterfaceC1180a interfaceC1180a, c5.d dVar) {
        super(2, dVar);
        this.f17899q = interfaceC1180a;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        v0 v0Var = new v0(this.f17899q, dVar);
        v0Var.f17898p = obj;
        return v0Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1765B interfaceC1765B;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17897o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            interfaceC1765B = (InterfaceC1765B) this.f17898p;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1765B = (InterfaceC1765B) this.f17898p;
            android.support.v4.media.session.b.K(obj);
        }
        while (AbstractC1767D.s(interfaceC1765B)) {
            X.s0 s0Var = new X.s0(this.f17899q, 2);
            this.f17898p = interfaceC1765B;
            this.f17897o = 1;
            if (C0879c.q(getContext()).s(new f0.Y(s0Var, 0), this) == enumC0830a) {
                return enumC0830a;
            }
        }
        return Y4.o.f8736a;
    }
}
