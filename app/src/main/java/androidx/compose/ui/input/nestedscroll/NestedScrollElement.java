package androidx.compose.ui.input.nestedscroll;

import E0.K;
import J0.d;
import J0.g;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J0.a f9306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9307b;

    public NestedScrollElement(J0.a aVar, d dVar) {
        this.f9306a = aVar;
        this.f9307b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return AbstractC1209k.a(nestedScrollElement.f9306a, this.f9306a) && AbstractC1209k.a(nestedScrollElement.f9307b, this.f9307b);
    }

    public final int hashCode() {
        int iHashCode = this.f9306a.hashCode() * 31;
        d dVar = this.f9307b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new g(this.f9306a, this.f9307b);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        g gVar = (g) abstractC1397o;
        gVar.f3608C = this.f9306a;
        d dVar = gVar.f3609D;
        if (dVar.f3595a == gVar) {
            dVar.f3595a = null;
        }
        d dVar2 = this.f9307b;
        if (dVar2 == null) {
            gVar.f3609D = new d();
        } else if (!dVar2.equals(dVar)) {
            gVar.f3609D = dVar2;
        }
        if (gVar.f15636B) {
            d dVar3 = gVar.f3609D;
            dVar3.f3595a = gVar;
            dVar3.f3596b = null;
            gVar.f3610E = null;
            dVar3.f3597c = new K(3, gVar);
            dVar3.f3598d = gVar.n0();
        }
    }
}
