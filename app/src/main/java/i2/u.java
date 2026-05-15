package i2;

import androidx.glance.session.SessionWorker;
import b2.C0671m;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f13421o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ SessionWorker f13422p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0671m f13423q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SessionWorker sessionWorker, C0671m c0671m, c5.d dVar) {
        super(2, dVar);
        this.f13422p = sessionWorker;
        this.f13423q = c0671m;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new u(this.f13422p, this.f13423q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13421o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1076k interfaceC1076k = this.f13422p.f9674x;
            t tVar = new t(this.f13423q, null);
            this.f13421o = 1;
            if (((p) interfaceC1076k).a(tVar, this) == enumC0830a) {
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
