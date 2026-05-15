package androidx.compose.foundation;

import B.k;
import Q0.AbstractC0344d0;
import Q0.InterfaceC0357m;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x.C1850f0;
import x.InterfaceC1852g0;

/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1852g0 f9139b;

    public IndicationModifierElement(k kVar, InterfaceC1852g0 interfaceC1852g0) {
        this.f9138a = kVar;
        this.f9139b = interfaceC1852g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return AbstractC1209k.a(this.f9138a, indicationModifierElement.f9138a) && AbstractC1209k.a(this.f9139b, indicationModifierElement.f9139b);
    }

    public final int hashCode() {
        return this.f9139b.hashCode() + (this.f9138a.hashCode() * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        InterfaceC0357m interfaceC0357mB = this.f9139b.b(this.f9138a);
        C1850f0 c1850f0 = new C1850f0();
        c1850f0.f19734E = interfaceC0357mB;
        c1850f0.B0(interfaceC0357mB);
        return c1850f0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1850f0 c1850f0 = (C1850f0) abstractC1397o;
        InterfaceC0357m interfaceC0357mB = this.f9139b.b(this.f9138a);
        c1850f0.C0(c1850f0.f19734E);
        c1850f0.f19734E = interfaceC0357mB;
        c1850f0.B0(interfaceC0357mB);
    }
}
