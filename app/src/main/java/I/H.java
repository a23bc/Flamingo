package I;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import x.EnumC1862l0;
import z.C2056p0;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f3273o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0211c f3274p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0211c c0211c, c5.d dVar) {
        super(2, dVar);
        this.f3274p = c0211c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new H(this.f3274p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f3273o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        this.f3273o = 1;
        EnumC1862l0 enumC1862l0 = EnumC1862l0.f19772o;
        C2056p0 c2056p0 = new C2056p0(2, null);
        C0211c c0211c = this.f3274p;
        c0211c.getClass();
        Object objS = K.s(c0211c, enumC1862l0, c2056p0, this);
        if (objS != enumC0830a) {
            objS = oVar;
        }
        return objS == enumC0830a ? enumC0830a : oVar;
    }
}
