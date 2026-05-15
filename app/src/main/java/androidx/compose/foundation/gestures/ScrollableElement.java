package androidx.compose.foundation.gestures;

import M.z0;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import z.EnumC2048l0;
import z.H0;

/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a */
    public final z0 f9172a;

    /* JADX INFO: renamed from: b */
    public final EnumC2048l0 f9173b;

    /* JADX INFO: renamed from: c */
    public final boolean f9174c;

    /* JADX INFO: renamed from: d */
    public final boolean f9175d;

    public ScrollableElement(z0 z0Var, EnumC2048l0 enumC2048l0, boolean z6, boolean z7) {
        this.f9172a = z0Var;
        this.f9173b = enumC2048l0;
        this.f9174c = z6;
        this.f9175d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return AbstractC1209k.a(this.f9172a, scrollableElement.f9172a) && this.f9173b == scrollableElement.f9173b && this.f9174c == scrollableElement.f9174c && this.f9175d == scrollableElement.f9175d;
    }

    public final int hashCode() {
        return (((((this.f9173b.hashCode() + (this.f9172a.hashCode() * 31)) * 961) + (this.f9174c ? 1231 : 1237)) * 31) + (this.f9175d ? 1231 : 1237)) * 29791;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new H0(null, null, null, null, this.f9173b, this.f9172a, this.f9174c, this.f9175d);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((H0) abstractC1397o).N0(null, null, null, null, this.f9173b, this.f9172a, this.f9174c, this.f9175d);
    }
}
