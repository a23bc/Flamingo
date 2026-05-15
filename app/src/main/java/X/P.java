package X;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.InterfaceC1205g;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements InterfaceC0494p, InterfaceC1205g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f7981o;

    public P(InterfaceC1180a interfaceC1180a) {
        this.f7981o = interfaceC1180a;
    }

    @Override // m5.InterfaceC1205g
    public final Y4.c a() {
        return this.f7981o;
    }

    @Override // X.InterfaceC0494p
    public final /* synthetic */ long b() {
        return ((C1892b) this.f7981o.a()).f19867a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0494p) || !(obj instanceof InterfaceC1205g)) {
            return false;
        }
        return AbstractC1209k.a(this.f7981o, ((InterfaceC1205g) obj).a());
    }

    public final int hashCode() {
        return this.f7981o.hashCode();
    }
}
