package d;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: d.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0736B extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0743I f10722q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0736B(C0743I c0743i, int i7) {
        super(0);
        this.f10721p = i7;
        this.f10722q = c0743i;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f10721p) {
            case 0:
                this.f10722q.c();
                break;
            case 1:
                this.f10722q.b();
                break;
            default:
                this.f10722q.c();
                break;
        }
        return Y4.o.f8736a;
    }
}
