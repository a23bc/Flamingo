package V4;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x.C1870p0;
import x.C1872q0;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f7458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ EnumC1862l0 f7459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f7460r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(G g6, EnumC1862l0 enumC1862l0, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f7458p = g6;
        this.f7459q = enumC1862l0;
        this.f7460r = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new E(this.f7458p, this.f7459q, this.f7460r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7457o;
        G g6 = this.f7458p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            g6.f7464b.setValue(Boolean.TRUE);
            this.f7457o = 1;
            ?? r7 = this.f7460r;
            C1872q0 c1872q0 = g6.f7466d;
            c1872q0.getClass();
            if (AbstractC1767D.h(new C1870p0(this.f7459q, c1872q0, r7, g6.f7465c, null), this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        g6.f7464b.setValue(Boolean.FALSE);
        return Y4.o.f8736a;
    }
}
