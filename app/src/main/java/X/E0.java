package X;

import R0.C0386i;
import R0.C0391k0;
import R0.InterfaceC0393l0;
import b1.AbstractC0607C;
import b1.C0619d;
import b1.C0622g;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import g1.C0980v;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f7895p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(K0 k02, c5.d dVar) {
        super(2, dVar);
        this.f7895p = k02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new E0(this.f7895p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7894o;
        Y4.o oVar = Y4.o.f8736a;
        K0 k02 = this.f7895p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            if (b1.L.c(k02.m().f12385b)) {
                return oVar;
            }
            InterfaceC0393l0 interfaceC0393l0 = k02.f7945g;
            if (interfaceC0393l0 != null) {
                C0391k0 c0391k0A = C.d.a(N5.d.H(k02.m()));
                this.f7894o = 1;
                ((C0386i) interfaceC0393l0).a(c0391k0A);
                if (oVar == enumC0830a) {
                    return enumC0830a;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        C0622g c0622gJ = N5.d.J(k02.m(), k02.m().f12384a.f9970p.length());
        C0622g c0622gI = N5.d.I(k02.m(), k02.m().f12384a.f9970p.length());
        C0619d c0619d = new C0619d(c0622gJ);
        c0619d.a(c0622gI);
        C0622g c0622gC = c0619d.c();
        int iF = b1.L.f(k02.m().f12385b);
        C0980v c0980vE = K0.e(c0622gC, AbstractC0607C.b(iF, iF));
        k02.f7941c.b(c0980vE);
        k02.f7958v = new b1.L(c0980vE.f12385b);
        k02.p(M.N.f4425o);
        k02.f7939a.f4396e = true;
        return oVar;
    }
}
