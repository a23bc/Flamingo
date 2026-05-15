package androidx.compose.foundation.lazy.layout;

import H.X;
import H.p0;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f9215a;

    public TraversablePrefetchStateModifierElement(X x6) {
        this.f9215a = x6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && AbstractC1209k.a(this.f9215a, ((TraversablePrefetchStateModifierElement) obj).f9215a);
    }

    public final int hashCode() {
        return this.f9215a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        p0 p0Var = new p0();
        p0Var.f2918C = this.f9215a;
        return p0Var;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((p0) abstractC1397o).f2918C = this.f9215a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f9215a + ')';
    }
}
