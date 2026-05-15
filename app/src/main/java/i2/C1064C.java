package i2;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: i2.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1064C extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f13313o;

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1064C c1064c = new C1064C(2, dVar);
        c1064c.f13313o = ((Boolean) obj).booleanValue();
        return c1064c;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C1064C) create(bool, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return Boolean.valueOf(this.f13313o);
    }
}
