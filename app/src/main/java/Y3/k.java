package y3;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1216r;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1216r f20429p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1216r f20430q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ x f20431r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ boolean f20432s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Z4.k f20433t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C1216r c1216r, C1216r c1216r2, x xVar, boolean z6, Z4.k kVar) {
        super(1);
        this.f20429p = c1216r;
        this.f20430q = c1216r2;
        this.f20431r = xVar;
        this.f20432s = z6;
        this.f20433t = kVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C2019h c2019h = (C2019h) obj;
        AbstractC1209k.f(c2019h, "entry");
        this.f20429p.f14435o = true;
        this.f20430q.f14435o = true;
        this.f20431r.l(c2019h, this.f20432s, this.f20433t);
        return Y4.o.f8736a;
    }
}
