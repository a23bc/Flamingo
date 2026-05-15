package androidx.compose.foundation.layout;

import D.D;
import D.F;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f9181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9182b;

    public FillElement(D d4, float f7) {
        this.f9181a = d4;
        this.f9182b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f9181a == fillElement.f9181a && this.f9182b == fillElement.f9182b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9182b) + (this.f9181a.hashCode() * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        F f7 = new F();
        f7.f1226C = this.f9181a;
        f7.f1227D = this.f9182b;
        return f7;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        F f7 = (F) abstractC1397o;
        f7.f1226C = this.f9181a;
        f7.f1227D = this.f9182b;
    }
}
