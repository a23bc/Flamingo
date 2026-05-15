package androidx.compose.ui.input.key;

import I0.e;
import Q0.AbstractC0344d0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1182c f9305b;

    public KeyInputElement(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2) {
        this.f9304a = interfaceC1182c;
        this.f9305b = interfaceC1182c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f9304a == keyInputElement.f9304a && this.f9305b == keyInputElement.f9305b;
    }

    public final int hashCode() {
        InterfaceC1182c interfaceC1182c = this.f9304a;
        int iHashCode = (interfaceC1182c != null ? interfaceC1182c.hashCode() : 0) * 31;
        InterfaceC1182c interfaceC1182c2 = this.f9305b;
        return iHashCode + (interfaceC1182c2 != null ? interfaceC1182c2.hashCode() : 0);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        e eVar = new e();
        eVar.f3442C = this.f9304a;
        eVar.f3443D = this.f9305b;
        return eVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        e eVar = (e) abstractC1397o;
        eVar.f3442C = this.f9304a;
        eVar.f3443D = this.f9305b;
    }
}
