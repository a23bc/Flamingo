package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f17835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17836q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(G g6, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f17835p = g6;
        this.f17836q = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new r0(this.f17835p, this.f17836q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17834o;
        InterfaceC0878b0 interfaceC0878b0 = this.f17836q;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            if (((Boolean) this.f17835p.f17398d.getValue()).booleanValue()) {
                interfaceC0878b0.setValue(Boolean.FALSE);
                return Y4.o.f8736a;
            }
            this.f17834o = 1;
            if (AbstractC1767D.i(1600L, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        interfaceC0878b0.setValue(Boolean.TRUE);
        return Y4.o.f8736a;
    }
}
