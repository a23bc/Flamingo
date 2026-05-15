package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f20601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f20602p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(long j3, c5.d dVar) {
        super(2, dVar);
        this.f20602p = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0 c02 = new C0(this.f20602p, dVar);
        c02.f20601o = obj;
        return c02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0 c02 = (C0) create((M0) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c02.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        P0 p02 = ((M0) this.f20601o).f20688a;
        p02.c(p02.f20720k, this.f20602p, 1);
        return Y4.o.f8736a;
    }
}
