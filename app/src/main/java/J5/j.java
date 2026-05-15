package J5;

import R0.A;
import R0.AbstractC0370a;
import Y4.o;
import d0.U;
import d0.n0;
import d0.o0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f3784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3786s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
        super(0);
        this.f3783p = i7;
        this.f3784q = obj;
        this.f3785r = obj2;
        this.f3786s = obj3;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f3783p) {
            case 0:
                N5.d dVar = ((F5.e) this.f3784q).f2339b;
                AbstractC1209k.c(dVar);
                return dVar.v(((F5.a) this.f3786s).h.f2397d, ((F5.l) this.f3785r).a());
            case 1:
                AbstractC0370a abstractC0370a = (AbstractC0370a) this.f3784q;
                abstractC0370a.removeOnAttachStateChangeListener((A) this.f3785r);
                B2.g gVar = (B2.g) this.f3786s;
                AbstractC1209k.f(gVar, "listener");
                N5.l.C(abstractC0370a).f4102a.remove(gVar);
                return o.f8736a;
            case 2:
                if (((Boolean) ((n0) this.f3784q).f11048a.f11058c.b(o0.f11053p)).booleanValue()) {
                    AbstractC1767D.t((InterfaceC1765B) this.f3785r, null, new U((n0) this.f3786s, null), 3);
                }
                return Boolean.TRUE;
            default:
                return new n0((n1.d) this.f3784q, (o0) this.f3785r, (InterfaceC1182c) this.f3786s);
        }
    }
}
