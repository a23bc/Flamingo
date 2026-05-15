package Y0;

import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1180a f8445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1180a f8446b;

    public h(InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2) {
        this.f8445a = interfaceC1180a;
        this.f8446b = interfaceC1180a2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f8445a.a()).floatValue() + ", maxValue=" + ((Number) this.f8446b.a()).floatValue() + ", reverseScrolling=false)";
    }
}
