package A5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.C1220v;
import w5.InterfaceC1765B;
import z5.InterfaceC2110e;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2111f f570r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC2111f interfaceC2111f, c5.d dVar) {
        super(2, dVar);
        this.f569q = oVar;
        this.f570r = interfaceC2111f;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        n nVar = new n(this.f569q, this.f570r, dVar);
        nVar.f568p = obj;
        return nVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f567o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f568p;
            C1220v c1220v = new C1220v();
            o oVar = this.f569q;
            InterfaceC2110e interfaceC2110e = oVar.f552r;
            m mVar = new m(c1220v, interfaceC1765B, oVar, this.f570r, 0);
            this.f567o = 1;
            if (interfaceC2110e.b(mVar, this) == enumC0830a) {
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
