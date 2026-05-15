package Q0;

import R0.C0415x;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y f5900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ s0 f5901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5902r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y6, s0 s0Var, long j3) {
        super(0);
        this.f5900p = y6;
        this.f5901q = s0Var;
        this.f5902r = j3;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        U uH0;
        Y y6 = this.f5900p;
        boolean zS = AbstractC0347f.s(y6.f5915t.f5856a);
        P p7 = y6.f5915t;
        O0.l0 placementScope = null;
        if (zS || p7.f5858c) {
            j0 j0Var = p7.a().f6028G;
            if (j0Var != null) {
                placementScope = j0Var.f5887z;
            }
        } else {
            j0 j0Var2 = p7.a().f6028G;
            if (j0Var2 != null && (uH0 = j0Var2.H0()) != null) {
                placementScope = uH0.f5887z;
            }
        }
        if (placementScope == null) {
            placementScope = ((C0415x) this.f5901q).getPlacementScope();
        }
        U uH02 = p7.a().H0();
        AbstractC1209k.c(uH02);
        O0.l0.i(placementScope, uH02, this.f5902r);
        return Y4.o.f8736a;
    }
}
