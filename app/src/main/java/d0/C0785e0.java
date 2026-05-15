package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: d0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0785e0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10986o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ n0 f10987p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ float f10988q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0785e0(n0 n0Var, float f7, c5.d dVar) {
        super(2, dVar);
        this.f10987p = n0Var;
        this.f10988q = f7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0785e0(this.f10987p, this.f10988q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0785e0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10986o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        this.f10986o = 1;
        C0801p c0801p = this.f10987p.f11048a;
        Object value = c0801p.f11061f.getValue();
        float f7 = c0801p.f();
        float f8 = this.f10988q;
        Object objC = c0801p.c(f7, f8, value);
        if (!((Boolean) c0801p.f11058c.b(objC)).booleanValue() ? (objF = H.f(c0801p, value, f8, this)) != enumC0830a : (objF = H.f(c0801p, objC, f8, this)) != enumC0830a) {
            objF = oVar;
        }
        if (objF != enumC0830a) {
            objF = oVar;
        }
        return objF == enumC0830a ? enumC0830a : oVar;
    }
}
