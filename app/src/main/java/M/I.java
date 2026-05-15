package M;

import Q0.AbstractC0347f;
import X.C0491n0;
import X.C0495p0;
import X.InterfaceC0488m;
import X.K0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d5.EnumC0830a;
import w5.AbstractC1767D;
import z.r1;

/* JADX INFO: loaded from: classes.dex */
public final class I implements PointerInputEventHandler {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4412o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f4413p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f4414q;

    public I(InterfaceC0488m interfaceC0488m, j0 j0Var) {
        this.f4412o = 1;
        this.f4414q = interfaceC0488m;
        this.f4413p = j0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(K0.y yVar, c5.d dVar) {
        switch (this.f4412o) {
            case 0:
                Object objH = AbstractC1767D.h(new H(yVar, (j0) this.f4413p, (K0) this.f4414q, null), dVar);
                if (objH != EnumC0830a.f11264o) {
                    break;
                }
                break;
            case 1:
                K0.N n7 = (K0.N) yVar;
                n7.getClass();
                Object objC = r1.c(yVar, new X.T((InterfaceC0488m) this.f4414q, new D4.i(AbstractC0347f.x(n7).f5816O), (j0) this.f4413p, null), dVar);
                if (objC != EnumC0830a.f11264o) {
                    break;
                }
                break;
            default:
                Object objC2 = r1.c(yVar, new C0491n0((C0495p0) this.f4413p, (X.M) this.f4414q, null), dVar);
                if (objC2 != EnumC0830a.f11264o) {
                    break;
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ I(Object obj, int i7, Object obj2) {
        this.f4412o = i7;
        this.f4413p = obj;
        this.f4414q = obj2;
    }
}
