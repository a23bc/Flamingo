package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10910o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ n0 f10911p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(n0 n0Var, c5.d dVar) {
        super(2, dVar);
        this.f10911p = n0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new U(this.f10911p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10910o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        this.f10910o = 1;
        o0 o0Var = o0.f11053p;
        C0801p c0801p = this.f10911p.f11048a;
        Object objF = H.f(c0801p, o0Var, c0801p.f11064j.h(), this);
        if (objF != enumC0830a) {
            objF = oVar;
        }
        return objF == enumC0830a ? enumC0830a : oVar;
    }
}
