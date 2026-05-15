package w;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1680m f18569q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(C1680m c1680m, int i7) {
        super(0);
        this.f18568p = i7;
        this.f18569q = c1680m;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f18568p) {
            case 0:
                this.f18569q.f18714t = false;
                break;
            default:
                this.f18569q.f18714t = false;
                break;
        }
        return Y4.o.f8736a;
    }
}
