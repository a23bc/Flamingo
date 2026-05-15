package androidx.compose.ui.input.rotary;

import Q0.AbstractC0344d0;
import R0.C0402q;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends AbstractC0344d0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return C0402q.f6498s.hashCode() * 31;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        M0.a aVar = new M0.a();
        aVar.f4755C = C0402q.f6498s;
        return aVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((M0.a) abstractC1397o).f4755C = C0402q.f6498s;
    }
}
