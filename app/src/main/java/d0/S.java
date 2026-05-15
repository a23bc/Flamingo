package d0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f10906p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ n0 f10907q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(n0 n0Var, int i7) {
        super(1);
        this.f10906p = i7;
        this.f10907q = n0Var;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f10906p) {
            case 0:
                return new n1.k(i6.h.a(0, (int) this.f10907q.f11048a.f()));
            default:
                ((Number) obj).floatValue();
                n1.d dVar = this.f10907q.f11049b;
                if (dVar != null) {
                    return Float.valueOf(dVar.v(56));
                }
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
        }
    }
}
