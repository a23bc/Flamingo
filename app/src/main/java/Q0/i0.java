package Q0;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f6013q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, int i7) {
        super(0);
        this.f6012p = i7;
        this.f6013q = j0Var;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f6012p) {
            case 0:
                j0 j0Var = this.f6013q;
                InterfaceC1985r interfaceC1985r = j0Var.f6042U;
                AbstractC1209k.c(interfaceC1985r);
                j0Var.D0(interfaceC1985r, j0Var.f6041T);
                break;
            default:
                j0 j0Var2 = this.f6013q.f6028G;
                if (j0Var2 != null) {
                    j0Var2.Q0();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
