package Q0;

import D.AbstractC0060d;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r0.InterfaceC1396n;

/* JADX INFO: renamed from: Q0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0339b extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0341c f5934q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0339b(C0341c c0341c, int i7) {
        super(0);
        this.f5933p = i7;
        this.f5934q = c0341c;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f5933p) {
            case 0:
                this.f5934q.D0();
                break;
            default:
                C0341c c0341c = this.f5934q;
                InterfaceC1396n interfaceC1396n = c0341c.f5937C;
                AbstractC1209k.d(interfaceC1396n, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                D.Y y6 = (D.Y) interfaceC1396n;
                y6.getClass();
                D.x0 x0Var = (D.x0) c0341c.y(AbstractC0060d.f1306c);
                D.x0 x0Var2 = y6.f1285a;
                y6.f1286b.setValue(new D.E(x0Var2, x0Var));
                y6.f1287c.setValue(new D.u0(x0Var, x0Var2));
                break;
        }
        return Y4.o.f8736a;
    }
}
