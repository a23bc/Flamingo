package androidx.compose.foundation.lazy.layout;

import H.C0170l;
import H.C0173o;
import H.InterfaceC0174p;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0174p f9207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0170l f9208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC2048l0 f9209c;

    public LazyLayoutBeyondBoundsModifierElement(InterfaceC0174p interfaceC0174p, C0170l c0170l, EnumC2048l0 enumC2048l0) {
        this.f9207a = interfaceC0174p;
        this.f9208b = c0170l;
        this.f9209c = enumC2048l0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return AbstractC1209k.a(this.f9207a, lazyLayoutBeyondBoundsModifierElement.f9207a) && AbstractC1209k.a(this.f9208b, lazyLayoutBeyondBoundsModifierElement.f9208b) && this.f9209c == lazyLayoutBeyondBoundsModifierElement.f9209c;
    }

    public final int hashCode() {
        return this.f9209c.hashCode() + ((((this.f9208b.hashCode() + (this.f9207a.hashCode() * 31)) * 31) + 1237) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0173o c0173o = new C0173o();
        c0173o.f2914C = this.f9207a;
        c0173o.f2915D = this.f9208b;
        c0173o.f2916E = this.f9209c;
        return c0173o;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C0173o c0173o = (C0173o) abstractC1397o;
        c0173o.f2914C = this.f9207a;
        c0173o.f2915D = this.f9208b;
        c0173o.f2916E = this.f9209c;
    }
}
