package H;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: H.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0179v extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f2930o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0183z f2931p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0179v(C0183z c0183z, c5.d dVar) {
        super(2, dVar);
        this.f2931p = c0183z;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0179v(this.f2931p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0179v) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f2930o;
        C0183z c0183z = this.f2931p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1670c c1670c = c0183z.f2950m;
            n1.k kVar = new n1.k(0L);
            this.f2930o = 1;
            if (c1670c.g(this, kVar) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        int i8 = C0183z.f2939r;
        c0183z.e(0L);
        c0183z.d(false);
        return Y4.o.f8736a;
    }
}
