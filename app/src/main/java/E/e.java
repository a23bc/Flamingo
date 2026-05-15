package e;

import d.AbstractC0773z;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0773z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f11312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z6, InterfaceC0878b0 interfaceC0878b0) {
        super(z6);
        this.f11312d = interfaceC0878b0;
    }

    @Override // d.AbstractC0773z
    public final void a() {
        ((InterfaceC1180a) this.f11312d.getValue()).a();
    }
}
