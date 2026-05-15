package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ long f11168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D0 f11169p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(D0 d02, c5.d dVar) {
        super(3, dVar);
        this.f11169p = d02;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j3 = ((C1892b) obj2).f19867a;
        y0 y0Var = new y0(this.f11169p, (c5.d) obj3);
        y0Var.f11168o = j3;
        Y4.o oVar = Y4.o.f8736a;
        y0Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        long j3 = this.f11168o;
        D0 d02 = this.f11169p;
        d02.l.j((d02.f10839g ? d02.f10838f.h() - C1892b.d(j3) : C1892b.d(j3)) - d02.f10842k.h());
        return Y4.o.f8736a;
    }
}
