package androidx.compose.foundation.layout;

import D.l0;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import z4.C2088g;

/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2088g f9191a;

    public PaddingValuesElement(C2088g c2088g) {
        this.f9191a = c2088g;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC1209k.a(this.f9191a, paddingValuesElement.f9191a);
    }

    public final int hashCode() {
        return this.f9191a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        l0 l0Var = new l0();
        l0Var.f1349C = this.f9191a;
        return l0Var;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((l0) abstractC1397o).f1349C = this.f9191a;
    }
}
