package dev.chrisbanes.haze;

import Q0.AbstractC0344d0;
import T4.d;
import T4.l;
import T4.m;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class HazeChildNodeElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f11299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f11300b;

    public HazeChildNodeElement(l lVar, m mVar) {
        AbstractC1209k.f(lVar, "state");
        this.f11299a = lVar;
        this.f11300b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HazeChildNodeElement)) {
            return false;
        }
        HazeChildNodeElement hazeChildNodeElement = (HazeChildNodeElement) obj;
        return AbstractC1209k.a(this.f11299a, hazeChildNodeElement.f11299a) && this.f11300b.equals(hazeChildNodeElement.f11300b);
    }

    public final int hashCode() {
        return (this.f11300b.hashCode() + (this.f11299a.hashCode() * 31)) * 31;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new d(this.f11299a, this.f11300b);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        d dVar = (d) abstractC1397o;
        AbstractC1209k.f(dVar, "node");
        l lVar = this.f11299a;
        AbstractC1209k.f(lVar, "<set-?>");
        dVar.f6952F = lVar;
        dVar.f6953G = this.f11300b;
        T4.a aVarC0 = dVar.C0();
        m mVar = dVar.f6953G;
        aVarC0.getClass();
        AbstractC1209k.f(mVar, "<set-?>");
        aVarC0.f6944c.setValue(mVar);
        dVar.C0().f6945d.setValue(null);
        dVar.F();
    }

    public final String toString() {
        return "HazeChildNodeElement(state=" + this.f11299a + ", style=" + this.f11300b + ", mask=null)";
    }
}
