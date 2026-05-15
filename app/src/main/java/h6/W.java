package h6;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12967p;

    public /* synthetic */ W(InterfaceC1182c interfaceC1182c, int i7) {
        this.f12966o = i7;
        this.f12967p = interfaceC1182c;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f12966o) {
            case 0:
                InterfaceC1182c interfaceC1182c = this.f12967p;
                AbstractC1209k.f(interfaceC1182c, "$nowPageOnChanged");
                interfaceC1182c.b("Album");
                break;
            case 1:
                InterfaceC1182c interfaceC1182c2 = this.f12967p;
                AbstractC1209k.f(interfaceC1182c2, "$nowPageOnChanged");
                interfaceC1182c2.b("Album");
                break;
            case 2:
                InterfaceC1182c interfaceC1182c3 = this.f12967p;
                AbstractC1209k.f(interfaceC1182c3, "$expandedOnChanged");
                interfaceC1182c3.b(Boolean.FALSE);
                break;
            default:
                InterfaceC1182c interfaceC1182c4 = this.f12967p;
                AbstractC1209k.f(interfaceC1182c4, "$expandedOnChanged");
                interfaceC1182c4.b(Boolean.FALSE);
                break;
        }
        return Y4.o.f8736a;
    }
}
