package androidx.compose.foundation.layout;

import D.C0065f0;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9185b;

    public LayoutWeightElement(float f7, boolean z6) {
        this.f9184a = f7;
        this.f9185b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f9184a == layoutWeightElement.f9184a && this.f9185b == layoutWeightElement.f9185b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f9184a) * 31) + (this.f9185b ? 1231 : 1237);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0065f0 c0065f0 = new C0065f0();
        c0065f0.f1317C = this.f9184a;
        c0065f0.f1318D = this.f9185b;
        return c0065f0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C0065f0 c0065f0 = (C0065f0) abstractC1397o;
        c0065f0.f1317C = this.f9184a;
        c0065f0.f1318D = this.f9185b;
    }
}
