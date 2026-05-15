package U5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0888g0;
import w.C1670c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ float f7108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f7109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f7111r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C1670c c1670c, C0888g0 c0888g0, InterfaceC1765B interfaceC1765B, c5.d dVar) {
        super(3, dVar);
        this.f7109p = c1670c;
        this.f7110q = c0888g0;
        this.f7111r = interfaceC1765B;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        G g6 = new G(this.f7109p, this.f7110q, this.f7111r, (c5.d) obj3);
        g6.f7108o = fFloatValue;
        Y4.o oVar = Y4.o.f8736a;
        g6.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        float f7 = this.f7108o;
        Float f8 = new Float(0.0f);
        C0888g0 c0888g0 = this.f7110q;
        Float f9 = new Float(c0888g0.h());
        C1670c c1670c = this.f7109p;
        c1670c.i(f8, f9);
        AbstractC1767D.t(this.f7111r, null, new F(f7, c1670c, c0888g0, null), 3);
        return Y4.o.f8736a;
    }
}
