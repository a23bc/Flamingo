package X;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.C1670c;
import w5.InterfaceC1765B;
import x0.C1892b;

/* JADX INFO: renamed from: X.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475f0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f8064o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1670c f8065p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ long f8066q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0475f0(C1670c c1670c, long j3, c5.d dVar) {
        super(2, dVar);
        this.f8065p = c1670c;
        this.f8066q = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0475f0(this.f8065p, this.f8066q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0475f0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f8064o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1892b c1892b = new C1892b(this.f8066q);
            w.S s7 = AbstractC0481i0.f8085d;
            this.f8064o = 1;
            if (C1670c.c(this.f8065p, c1892b, s7, null, null, this, 12) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
