package h6;

import f0.C0894j0;
import java.util.List;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: h6.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1027k0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0894j0 f13087p;

    public /* synthetic */ C1027k0(C0894j0 c0894j0, int i7) {
        this.f13086o = i7;
        this.f13087p = c0894j0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f13086o) {
            case 0:
                C0894j0 c0894j0 = this.f13087p;
                AbstractC1209k.f(c0894j0, "$lrcEntries");
                return (List) c0894j0.getValue();
            default:
                C0894j0 c0894j02 = this.f13087p;
                AbstractC1209k.f(c0894j02, "$lrcEntries");
                return (List) c0894j02.getValue();
        }
    }
}
