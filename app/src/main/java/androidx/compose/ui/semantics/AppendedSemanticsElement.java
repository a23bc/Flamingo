package androidx.compose.ui.semantics;

import Q0.AbstractC0344d0;
import Y0.c;
import Y0.j;
import Y0.k;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends AbstractC0344d0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1182c f9330b;

    public AppendedSemanticsElement(InterfaceC1182c interfaceC1182c, boolean z6) {
        this.f9329a = z6;
        this.f9330b = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f9329a == appendedSemanticsElement.f9329a && this.f9330b == appendedSemanticsElement.f9330b;
    }

    public final int hashCode() {
        return this.f9330b.hashCode() + ((this.f9329a ? 1231 : 1237) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new c(this.f9329a, false, this.f9330b);
    }

    @Override // Y0.k
    public final j l() {
        j jVar = new j();
        jVar.f8475q = this.f9329a;
        this.f9330b.b(jVar);
        return jVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        c cVar = (c) abstractC1397o;
        cVar.f8434C = this.f9329a;
        cVar.f8436E = this.f9330b;
    }
}
