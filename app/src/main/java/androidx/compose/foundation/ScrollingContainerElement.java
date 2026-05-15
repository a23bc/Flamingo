package androidx.compose.foundation;

import B.k;
import I.C0223o;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x.C1819F0;
import x.C1875s;
import z.EnumC2048l0;
import z.I0;
import z.S;

/* JADX INFO: loaded from: classes.dex */
final class ScrollingContainerElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0 f9143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2048l0 f9144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f9146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f9147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0223o f9148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9149g;
    public final C1875s h;

    public ScrollingContainerElement(k kVar, C0223o c0223o, C1875s c1875s, S s7, EnumC2048l0 enumC2048l0, I0 i02, boolean z6, boolean z7) {
        this.f9143a = i02;
        this.f9144b = enumC2048l0;
        this.f9145c = z6;
        this.f9146d = s7;
        this.f9147e = kVar;
        this.f9148f = c0223o;
        this.f9149g = z7;
        this.h = c1875s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return AbstractC1209k.a(this.f9143a, scrollingContainerElement.f9143a) && this.f9144b == scrollingContainerElement.f9144b && this.f9145c == scrollingContainerElement.f9145c && AbstractC1209k.a(this.f9146d, scrollingContainerElement.f9146d) && AbstractC1209k.a(this.f9147e, scrollingContainerElement.f9147e) && AbstractC1209k.a(this.f9148f, scrollingContainerElement.f9148f) && this.f9149g == scrollingContainerElement.f9149g && AbstractC1209k.a(this.h, scrollingContainerElement.h);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f9144b.hashCode() + (this.f9143a.hashCode() * 31)) * 31) + (this.f9145c ? 1231 : 1237)) * 31) + 1237) * 31;
        S s7 = this.f9146d;
        int iHashCode2 = (iHashCode + (s7 != null ? s7.hashCode() : 0)) * 31;
        k kVar = this.f9147e;
        int iHashCode3 = (iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C0223o c0223o = this.f9148f;
        int iHashCode4 = (((iHashCode3 + (c0223o != null ? c0223o.hashCode() : 0)) * 31) + (this.f9149g ? 1231 : 1237)) * 31;
        C1875s c1875s = this.h;
        return iHashCode4 + (c1875s != null ? c1875s.hashCode() : 0);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C1819F0 c1819f0 = new C1819F0();
        c1819f0.f19631E = this.f9143a;
        c1819f0.f19632F = this.f9144b;
        c1819f0.f19633G = this.f9145c;
        c1819f0.f19634H = this.f9146d;
        c1819f0.f19635I = this.f9147e;
        c1819f0.f19636J = this.f9148f;
        c1819f0.f19637K = this.f9149g;
        c1819f0.f19638L = this.h;
        return c1819f0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        EnumC2048l0 enumC2048l0 = this.f9144b;
        k kVar = this.f9147e;
        C0223o c0223o = this.f9148f;
        I0 i02 = this.f9143a;
        boolean z6 = this.f9149g;
        ((C1819F0) abstractC1397o).G0(kVar, c0223o, this.h, this.f9146d, enumC2048l0, i02, z6, this.f9145c);
    }
}
