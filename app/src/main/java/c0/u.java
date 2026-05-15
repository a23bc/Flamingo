package c0;

import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f10602q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(InterfaceC0878b0 interfaceC0878b0, int i7) {
        super(0);
        this.f10601p = i7;
        this.f10602q = interfaceC0878b0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f10601p) {
            case 0:
                return (h) this.f10602q.getValue();
            default:
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f10602q.getValue();
                if (interfaceC1180a != null) {
                    interfaceC1180a.a();
                }
                return Y4.o.f8736a;
        }
    }
}
