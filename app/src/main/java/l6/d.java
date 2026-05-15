package l6;

import N5.l;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import y3.x;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ x f14259o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x xVar, c5.d dVar) {
        super(2, dVar);
        this.f14259o = xVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new d(this.f14259o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((InterfaceC1765B) obj, (c5.d) obj2);
        o oVar = o.f8736a;
        dVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        l.D(this.f14259o, "NormalMusic");
        return o.f8736a;
    }
}
