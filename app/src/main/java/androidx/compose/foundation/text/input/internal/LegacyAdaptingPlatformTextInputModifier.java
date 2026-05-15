package androidx.compose.foundation.text.input.internal;

import C.b;
import M.Z;
import Q0.AbstractC0344d0;
import V.e;
import V.q;
import X.K0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f9252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K0 f9253c;

    public LegacyAdaptingPlatformTextInputModifier(e eVar, Z z6, K0 k02) {
        this.f9251a = eVar;
        this.f9252b = z6;
        this.f9253c = k02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return AbstractC1209k.a(this.f9251a, legacyAdaptingPlatformTextInputModifier.f9251a) && AbstractC1209k.a(this.f9252b, legacyAdaptingPlatformTextInputModifier.f9252b) && AbstractC1209k.a(this.f9253c, legacyAdaptingPlatformTextInputModifier.f9253c);
    }

    public final int hashCode() {
        return this.f9253c.hashCode() + ((this.f9252b.hashCode() + (this.f9251a.hashCode() * 31)) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        K0 k02 = this.f9253c;
        return new q(this.f9251a, this.f9252b, k02);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        q qVar = (q) abstractC1397o;
        if (qVar.f15636B) {
            qVar.f7347C.g();
            qVar.f7347C.k(qVar);
        }
        e eVar = this.f9251a;
        qVar.f7347C = eVar;
        if (qVar.f15636B) {
            if (eVar.f7314a != null) {
                b.c("Expected textInputModifierNode to be null");
            }
            eVar.f7314a = qVar;
        }
        qVar.f7348D = this.f9252b;
        qVar.f7349E = this.f9253c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f9251a + ", legacyTextFieldState=" + this.f9252b + ", textFieldSelectionManager=" + this.f9253c + ')';
    }
}
