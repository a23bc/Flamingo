package Y0;

import Q0.A0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1397o implements A0 {

    /* JADX INFO: renamed from: C */
    public boolean f8434C;

    /* JADX INFO: renamed from: D */
    public final boolean f8435D;

    /* JADX INFO: renamed from: E */
    public InterfaceC1182c f8436E;

    public c(boolean z6, boolean z7, InterfaceC1182c interfaceC1182c) {
        this.f8434C = z6;
        this.f8435D = z7;
        this.f8436E = interfaceC1182c;
    }

    @Override // Q0.A0
    public final void T(j jVar) {
        this.f8436E.b(jVar);
    }

    @Override // Q0.A0
    public final boolean a0() {
        return this.f8435D;
    }

    @Override // Q0.A0
    public final boolean d0() {
        return this.f8434C;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }
}
