package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d5.EnumC0830a;

/* JADX INFO: loaded from: classes.dex */
public final class N implements PointerInputEventHandler {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ M.j0 f7972p;

    public /* synthetic */ N(M.j0 j0Var, int i7) {
        this.f7971o = i7;
        this.f7972p = j0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(K0.y yVar, c5.d dVar) {
        switch (this.f7971o) {
            case 0:
                Object objL = M.V.l(yVar, this.f7972p, dVar);
                if (objL != EnumC0830a.f11264o) {
                    break;
                }
                break;
            default:
                Object objL2 = M.V.l(yVar, this.f7972p, dVar);
                if (objL2 != EnumC0830a.f11264o) {
                    break;
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
