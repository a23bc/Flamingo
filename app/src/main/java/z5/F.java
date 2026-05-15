package z5;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f21259o;

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        F f7 = new F(2, dVar);
        f7.f21259o = obj;
        return f7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((EnumC2104B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return Boolean.valueOf(((EnumC2104B) this.f21259o) != EnumC2104B.f21248o);
    }
}
