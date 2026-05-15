package d0;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f10901q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(InterfaceC1180a interfaceC1180a, int i7) {
        super(1);
        this.f10900p = i7;
        this.f10901q = interfaceC1180a;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f10900p) {
            case 0:
                this.f10901q.a();
                break;
            default:
                long j3 = ((C1892b) obj).f19867a;
                this.f10901q.a();
                break;
        }
        return Y4.o.f8736a;
    }
}
