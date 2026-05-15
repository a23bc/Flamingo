package androidx.compose.foundation.lazy.layout;

import H.C0168j;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;
import w.S;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutAnimateItemElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f9206a;

    public LazyLayoutAnimateItemElement(S s7) {
        this.f9206a = s7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        lazyLayoutAnimateItemElement.getClass();
        return this.f9206a.equals(lazyLayoutAnimateItemElement.f9206a);
    }

    public final int hashCode() {
        return this.f9206a.hashCode() * 31;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0168j c0168j = new C0168j();
        c0168j.f2889C = this.f9206a;
        return c0168j;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C0168j c0168j = (C0168j) abstractC1397o;
        c0168j.getClass();
        c0168j.f2889C = this.f9206a;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=null, placementSpec=" + this.f9206a + ", fadeOutSpec=null)";
    }
}
