package dev.chrisbanes.haze;

import Q0.AbstractC0344d0;
import T4.h;
import T4.l;
import T4.m;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class HazeNodeElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f11301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f11302b;

    public HazeNodeElement(l lVar, m mVar) {
        AbstractC1209k.f(lVar, "state");
        this.f11301a = lVar;
        this.f11302b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HazeNodeElement)) {
            return false;
        }
        HazeNodeElement hazeNodeElement = (HazeNodeElement) obj;
        return AbstractC1209k.a(this.f11301a, hazeNodeElement.f11301a) && AbstractC1209k.a(this.f11302b, hazeNodeElement.f11302b);
    }

    public final int hashCode() {
        return this.f11302b.hashCode() + (this.f11301a.hashCode() * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        l lVar = this.f11301a;
        AbstractC1209k.f(lVar, "state");
        m mVar = this.f11302b;
        h hVar = new h();
        hVar.f6972C = lVar;
        hVar.f6973D = mVar;
        return hVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        h hVar = (h) abstractC1397o;
        AbstractC1209k.f(hVar, "node");
        l lVar = this.f11301a;
        AbstractC1209k.f(lVar, "<set-?>");
        hVar.f6972C = lVar;
        hVar.f6973D = this.f11302b;
        T4.a aVar = (T4.a) lVar.f6977a.getValue();
        m mVar = hVar.f6973D;
        aVar.getClass();
        AbstractC1209k.f(mVar, "<set-?>");
        aVar.f6944c.setValue(mVar);
    }

    public final String toString() {
        return "HazeNodeElement(state=" + this.f11301a + ", style=" + this.f11302b + ")";
    }
}
