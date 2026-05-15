package androidx.compose.ui.layout;

import O0.C0312i0;
import Q0.AbstractC0344d0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class OnSizeChangedModifier extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9317a;

    public OnSizeChangedModifier(InterfaceC1182c interfaceC1182c) {
        this.f9317a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f9317a == ((OnSizeChangedModifier) obj).f9317a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9317a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0312i0 c0312i0 = new C0312i0();
        c0312i0.f5404C = this.f9317a;
        long j3 = Integer.MIN_VALUE;
        c0312i0.f5405D = (j3 & 4294967295L) | (j3 << 32);
        return c0312i0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C0312i0 c0312i0 = (C0312i0) abstractC1397o;
        c0312i0.f5404C = this.f9317a;
        long j3 = Integer.MIN_VALUE;
        c0312i0.f5405D = (j3 & 4294967295L) | (j3 << 32);
    }
}
