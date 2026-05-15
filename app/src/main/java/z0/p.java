package z0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f21080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f21081q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i7) {
        super(1);
        this.f21080p = i7;
        this.f21081q = qVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f21080p) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f21081q.f21091n.b(i6.h.o(dDoubleValue, r10.f21084e, r10.f21085f)));
            default:
                return Double.valueOf(i6.h.o(this.f21081q.f21089k.b(((Number) obj).doubleValue()), r10.f21084e, r10.f21085f));
        }
    }
}
