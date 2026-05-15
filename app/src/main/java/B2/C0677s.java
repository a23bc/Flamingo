package b2;

import a2.C0512b;
import android.content.Context;
import android.widget.RemoteViews;
import h2.AbstractC0997a;
import java.util.Objects;
import l2.C1167g;
import m5.AbstractC1210l;
import m5.C1220v;
import y0.AbstractC1959I;

/* JADX INFO: renamed from: b2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0677s extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1220v f10286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1220v f10287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1220v f10288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RemoteViews f10289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0664i0 f10290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1220v f10291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1220v f10292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1220v f10293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1220v f10294x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677s(C1220v c1220v, C1220v c1220v2, C1220v c1220v3, Context context, RemoteViews remoteViews, C0664i0 c0664i0, C1220v c1220v4, C1220v c1220v5, C1220v c1220v6, L0 l02, C1220v c1220v7, C1220v c1220v8, C1220v c1220v9) {
        super(2);
        this.f10286p = c1220v;
        this.f10287q = c1220v2;
        this.f10288r = c1220v3;
        this.f10289s = remoteViews;
        this.f10290t = c0664i0;
        this.f10291u = c1220v4;
        this.f10292v = c1220v6;
        this.f10293w = c1220v8;
        this.f10294x = c1220v9;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        g2.p pVar;
        Z1.n nVar = (Z1.n) obj2;
        if (nVar instanceof C0512b) {
            this.f10286p.f14439o = nVar;
        } else if (nVar instanceof g2.s) {
            this.f10287q.f14439o = nVar;
        } else if (nVar instanceof g2.n) {
            this.f10288r.f14439o = nVar;
        } else if (nVar instanceof Z1.c) {
            Z1.c cVar = (Z1.c) nVar;
            C0664i0 c0664i0 = this.f10290t;
            if (cVar instanceof Z1.c) {
                C1167g c1167g = cVar.f8754a;
                this.f10289s.setInt(c0664i0.f10197a, "setBackgroundColor", AbstractC1959I.x(c1167g.f14166a));
            }
        } else if (nVar instanceof g2.p) {
            C1220v c1220v = this.f10291u;
            g2.p pVar2 = (g2.p) c1220v.f14439o;
            if (pVar2 != null) {
                g2.p pVar3 = (g2.p) nVar;
                pVar = new g2.p(pVar2.f12449a.a(pVar3.f12449a), pVar2.f12450b.a(pVar3.f12450b), pVar2.f12451c.a(pVar3.f12451c), pVar2.f12452d.a(pVar3.f12452d), pVar2.f12453e.a(pVar3.f12453e), pVar2.f12454f.a(pVar3.f12454f));
            } else {
                pVar = (g2.p) nVar;
            }
            c1220v.f14439o = pVar;
        } else if (nVar instanceof C0684z) {
            this.f10292v.f14439o = ((C0684z) nVar).f10355a;
        } else if (!(nVar instanceof C0647a)) {
            if (nVar instanceof AbstractC0634D) {
                this.f10293w.f14439o = nVar;
            } else if (nVar instanceof AbstractC0997a) {
                this.f10294x.f14439o = nVar;
            } else {
                Objects.toString(nVar);
            }
        }
        return Y4.o.f8736a;
    }
}
