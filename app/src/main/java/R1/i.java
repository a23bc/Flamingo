package r1;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f15692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f15693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1405D f15694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n1.n f15696t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, InterfaceC1180a interfaceC1180a, C1405D c1405d, String str, n1.n nVar) {
        super(0);
        this.f15692p = zVar;
        this.f15693q = interfaceC1180a;
        this.f15694r = c1405d;
        this.f15695s = str;
        this.f15696t = nVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        this.f15692p.k(this.f15693q, this.f15694r, this.f15695s, this.f15696t);
        return Y4.o.f8736a;
    }
}
