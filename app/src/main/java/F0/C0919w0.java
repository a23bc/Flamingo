package f0;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: f0.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0919w0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f11943o;

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0919w0 c0919w0 = new C0919w0(2, dVar);
        c0919w0.f11943o = obj;
        return c0919w0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0919w0) create((EnumC0917v0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return Boolean.valueOf(((EnumC0917v0) this.f11943o) == EnumC0917v0.f11936o);
    }
}
