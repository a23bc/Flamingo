package w;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1220v f18577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f18578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1675h f18579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1680m f18580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f18581t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C1220v c1220v, float f7, InterfaceC1675h interfaceC1675h, C1680m c1680m, InterfaceC1182c interfaceC1182c) {
        super(1);
        this.f18577p = c1220v;
        this.f18578q = f7;
        this.f18579r = interfaceC1675h;
        this.f18580s = c1680m;
        this.f18581t = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f18577p.f14439o;
        AbstractC1209k.c(obj2);
        AbstractC1671d.i((C1678k) obj2, jLongValue, this.f18578q, this.f18579r, this.f18580s, this.f18581t);
        return Y4.o.f8736a;
    }
}
