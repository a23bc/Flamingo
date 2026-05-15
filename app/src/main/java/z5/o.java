package z5;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f21312o;

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        o oVar = new o(2, dVar);
        oVar.f21312o = ((Number) obj).intValue();
        return oVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create(Integer.valueOf(((Number) obj).intValue()), (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return Boolean.valueOf(this.f21312o > 0);
    }
}
