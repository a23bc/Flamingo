package G;

import Q0.K;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import z.InterfaceC2058q0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f2608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2609p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, int i7, c5.d dVar) {
        super(2, dVar);
        this.f2608o = xVar;
        this.f2609p = i7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new w(this.f2608o, this.f2609p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) create((InterfaceC2058q0) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        wVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        x xVar = this.f2608o;
        F.v vVar = xVar.f2614d;
        int iH = vVar.f2151b.h();
        int i7 = this.f2609p;
        if (iH != i7 || vVar.f2152c.h() != 0) {
            androidx.compose.foundation.lazy.layout.b bVar = xVar.f2621m;
            bVar.e();
            bVar.f9217b = null;
            bVar.f9218c = -1;
        }
        vVar.a(i7, 0);
        vVar.f2154e = null;
        K k7 = xVar.f2619j;
        if (k7 != null) {
            k7.l();
        }
        return Y4.o.f8736a;
    }
}
