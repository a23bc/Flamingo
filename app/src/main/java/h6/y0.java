package h6;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d5.EnumC0830a;
import f0.InterfaceC0878b0;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13278p;

    public /* synthetic */ y0(InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f13277o = i7;
        this.f13278p = interfaceC0878b0;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(K0.y yVar, c5.d dVar) {
        switch (this.f13277o) {
            case 0:
                Object objB0 = ((K0.N) yVar).B0(new x0(this.f13278p, null), dVar);
                if (objB0 != EnumC0830a.f11264o) {
                    break;
                }
                break;
            default:
                Object objB02 = ((K0.N) yVar).B0(new T0(this.f13278p, null), dVar);
                if (objB02 != EnumC0830a.f11264o) {
                    break;
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
