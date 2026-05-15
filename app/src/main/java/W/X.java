package w;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1220v f18570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f18571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1675h f18572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f18573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1680m f18574t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f18575u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f18576v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C1220v c1220v, Object obj, InterfaceC1675h interfaceC1675h, r rVar, C1680m c1680m, float f7, InterfaceC1182c interfaceC1182c) {
        super(1);
        this.f18570p = c1220v;
        this.f18571q = obj;
        this.f18572r = interfaceC1675h;
        this.f18573s = rVar;
        this.f18574t = c1680m;
        this.f18575u = f7;
        this.f18576v = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC1675h interfaceC1675h = this.f18572r;
        o0 o0VarD = interfaceC1675h.d();
        Object objE = interfaceC1675h.e();
        W w7 = new W(this.f18574t, 0);
        C1678k c1678k = new C1678k(this.f18571q, o0VarD, this.f18573s, jLongValue, objE, jLongValue, w7);
        AbstractC1671d.i(c1678k, jLongValue, this.f18575u, this.f18572r, this.f18574t, this.f18576v);
        this.f18570p.f14439o = c1678k;
        return Y4.o.f8736a;
    }
}
