package androidx.compose.foundation;

import B.k;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x.C1838Z;

/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9137a;

    public HoverableElement(k kVar) {
        this.f9137a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && AbstractC1209k.a(((HoverableElement) obj).f9137a, this.f9137a);
    }

    public final int hashCode() {
        return this.f9137a.hashCode() * 31;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C1838Z c1838z = new C1838Z();
        c1838z.f19702C = this.f9137a;
        return c1838z;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1838Z c1838z = (C1838Z) abstractC1397o;
        k kVar = c1838z.f19702C;
        k kVar2 = this.f9137a;
        if (AbstractC1209k.a(kVar, kVar2)) {
            return;
        }
        c1838z.D0();
        c1838z.f19702C = kVar2;
    }
}
