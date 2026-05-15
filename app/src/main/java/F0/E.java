package f0;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class E implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f11649a;

    public E(InterfaceC1182c interfaceC1182c) {
        this.f11649a = interfaceC1182c;
    }

    @Override // f0.c1
    public final Object a(InterfaceC0906p0 interfaceC0906p0) {
        return this.f11649a.b(interfaceC0906p0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && AbstractC1209k.a(this.f11649a, ((E) obj).f11649a);
    }

    public final int hashCode() {
        return this.f11649a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f11649a + ')';
    }
}
