package w;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: w.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1659H extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ float f18524o;

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1659H c1659h = new C1659H(2, dVar);
        c1659h.f18524o = ((Number) obj).floatValue();
        return c1659h;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1659H) create(Float.valueOf(((Number) obj).floatValue()), (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return Boolean.valueOf(this.f18524o > 0.0f);
    }
}
