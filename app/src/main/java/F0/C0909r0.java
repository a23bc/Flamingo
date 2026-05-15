package f0;

import w5.InterfaceC1765B;

/* JADX INFO: renamed from: f0.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0909r0 implements InterfaceC0878b0, InterfaceC1765B {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f11867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c5.i f11868p;

    public C0909r0(InterfaceC0878b0 interfaceC0878b0, c5.i iVar) {
        this.f11867o = interfaceC0878b0;
        this.f11868p = iVar;
    }

    @Override // w5.InterfaceC1765B
    public final c5.i g() {
        return this.f11868p;
    }

    @Override // f0.Z0
    public final Object getValue() {
        return this.f11867o.getValue();
    }

    @Override // f0.InterfaceC0878b0
    public final void setValue(Object obj) {
        this.f11867o.setValue(obj);
    }
}
