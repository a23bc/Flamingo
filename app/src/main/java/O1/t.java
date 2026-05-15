package O1;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.C1216r;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f5553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ F f5554q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(F f7, c5.d dVar) {
        super(2, dVar);
        this.f5554q = f7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        t tVar = new t(this.f5554q, dVar);
        tVar.f5553p = obj;
        return tVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC2111f) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f5552o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC2111f interfaceC2111f = (InterfaceC2111f) this.f5553p;
        F f7 = this.f5554q;
        G g6 = (G) f7.f5512g.getValue();
        if (!(g6 instanceof C0330b)) {
            f7.f5513i.g0(new l(g6));
        }
        q qVar = new q(g6, null);
        this.f5552o = 1;
        f7.f5512g.b(new A5.D(new C1216r(), new s(interfaceC2111f, 0), qVar), this);
        return enumC0830a;
    }
}
