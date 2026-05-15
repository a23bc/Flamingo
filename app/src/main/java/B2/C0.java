package b2;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f10036p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(long j3) {
        super(0);
        this.f10036p = j3;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        return new n1.i(this.f10036p);
    }
}
