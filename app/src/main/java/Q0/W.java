package Q0;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y f5898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5899q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y6, long j3) {
        super(0);
        this.f5898p = y6;
        this.f5899q = j3;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        U uH0 = this.f5898p.f5915t.a().H0();
        AbstractC1209k.c(uH0);
        uH0.d(this.f5899q);
        return Y4.o.f8736a;
    }
}
