package O1;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: O1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0333e extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5524o;

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C0333e c0333e = new C0333e(1, (c5.d) obj);
        Y4.o oVar = Y4.o.f8736a;
        c0333e.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f5524o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f5524o = 1;
            throw null;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.b.K(obj);
        return Y4.o.f8736a;
    }
}
