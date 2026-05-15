package androidx.compose.ui.layout;

import O0.RunnableC0326x;
import O0.s0;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Q0.K;
import android.annotation.SuppressLint;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ModifierNodeInspectableProperties"})
final class RulerProviderModifierElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0326x f9318a;

    public RulerProviderModifierElement(RunnableC0326x runnableC0326x) {
        this.f9318a = runnableC0326x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f9318a : null) == this.f9318a;
    }

    public final int hashCode() {
        return this.f9318a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new s0(this.f9318a);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        s0 s0Var = (s0) abstractC1397o;
        RunnableC0326x runnableC0326x = s0Var.f5442C;
        RunnableC0326x runnableC0326x2 = this.f9318a;
        if (runnableC0326x != runnableC0326x2) {
            s0Var.f5442C = runnableC0326x2;
            K.V(AbstractC0347f.x(s0Var), false, 7);
        }
    }
}
