package O0;

import Q0.InterfaceC0369z;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: renamed from: O0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0312i0 extends AbstractC1397o implements InterfaceC0369z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC1182c f5404C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f5405D;

    @Override // Q0.InterfaceC0369z
    public final /* synthetic */ void Q(C c7) {
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return true;
    }

    @Override // Q0.InterfaceC0369z
    public final void r(long j3) {
        if (n1.m.b(this.f5405D, j3)) {
            return;
        }
        this.f5404C.b(new n1.m(j3));
        this.f5405D = j3;
    }
}
