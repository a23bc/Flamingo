package androidx.compose.foundation;

import B.k;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x.C1829P;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9136a;

    public FocusableElement(k kVar) {
        this.f9136a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return AbstractC1209k.a(this.f9136a, ((FocusableElement) obj).f9136a);
        }
        return false;
    }

    public final int hashCode() {
        k kVar = this.f9136a;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new C1829P(this.f9136a, 1, null);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((C1829P) abstractC1397o).G0(this.f9136a);
    }
}
