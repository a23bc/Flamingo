package androidx.compose.foundation.selection;

import B.k;
import K.b;
import K0.A;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Y0.g;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class ToggleableElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f9232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f9234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A f9235e;

    public ToggleableElement(boolean z6, k kVar, boolean z7, g gVar, A a4) {
        this.f9231a = z6;
        this.f9232b = kVar;
        this.f9233c = z7;
        this.f9234d = gVar;
        this.f9235e = a4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f9231a == toggleableElement.f9231a && AbstractC1209k.a(this.f9232b, toggleableElement.f9232b) && this.f9233c == toggleableElement.f9233c && this.f9234d.equals(toggleableElement.f9234d) && this.f9235e == toggleableElement.f9235e;
    }

    public final int hashCode() {
        int i7 = (this.f9231a ? 1231 : 1237) * 31;
        k kVar = this.f9232b;
        return this.f9235e.hashCode() + ((((((((i7 + (kVar != null ? kVar.hashCode() : 0)) * 961) + 1237) * 31) + (this.f9233c ? 1231 : 1237)) * 31) + this.f9234d.f8444a) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new b(this.f9231a, this.f9232b, this.f9233c, this.f9234d, this.f9235e);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        b bVar = (b) abstractC1397o;
        boolean z6 = bVar.Z;
        boolean z7 = this.f9231a;
        if (z6 != z7) {
            bVar.Z = z7;
            AbstractC0347f.o(bVar);
        }
        bVar.a0 = this.f9235e;
        bVar.N0(this.f9232b, null, false, this.f9233c, null, this.f9234d, bVar.b0);
    }
}
