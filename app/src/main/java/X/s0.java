package X;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f8161p;

    public /* synthetic */ s0(InterfaceC1180a interfaceC1180a, int i7) {
        this.f8160o = i7;
        this.f8161p = interfaceC1180a;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f8160o) {
            case 0:
                return (C1892b) this.f8161p.a();
            case 1:
                return (C1892b) this.f8161p.a();
            case 2:
                ((Long) obj).getClass();
                u6.E0.f17384b.j(((Number) this.f8161p.a()).longValue());
                return Y4.o.f8736a;
            case 3:
                AbstractC1209k.f((G.s) obj, "$this$item");
                return new G.b(N5.d.b(((Number) this.f8161p.a()).intValue()));
            case 4:
                AbstractC1209k.f((G.s) obj, "$this$item");
                return new G.b(N5.d.b(((Number) this.f8161p.a()).intValue()));
            default:
                InterfaceC1180a interfaceC1180a = this.f8161p;
                AbstractC1209k.f(interfaceC1180a, "$onSearch");
                AbstractC1209k.f((M.W) obj, "$this$KeyboardActions");
                interfaceC1180a.a();
                return Y4.o.f8736a;
        }
    }
}
