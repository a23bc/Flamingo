package r1;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import m5.C1219u;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1219u f15735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f15736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n1.l f15737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f15738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f15739t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C1219u c1219u, z zVar, n1.l lVar, long j3, long j7) {
        super(0);
        this.f15735p = c1219u;
        this.f15736q = zVar;
        this.f15737r = lVar;
        this.f15738s = j3;
        this.f15739t = j7;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        z zVar = this.f15736q;
        this.f15735p.f14438o = zVar.getPositionProvider().c(this.f15737r, this.f15738s, zVar.getParentLayoutDirection(), this.f15739t);
        return Y4.o.f8736a;
    }
}
