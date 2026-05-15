package androidx.compose.foundation.layout;

import D.C0070k;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class AspectRatioElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9180a;

    public AspectRatioElement(float f7) {
        this.f9180a = f7;
        if (f7 > 0.0f) {
            return;
        }
        E.a.a("aspectRatio " + f7 + " must be > 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null || this.f9180a != aspectRatioElement.f9180a) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f9180a) * 31) + 1237;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0070k c0070k = new C0070k();
        c0070k.f1343C = this.f9180a;
        return c0070k;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((C0070k) abstractC1397o).f1343C = this.f9180a;
    }
}
