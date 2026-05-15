package androidx.compose.foundation.layout;

import D.C0061d0;
import D.EnumC0057b0;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends AbstractC0344d0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) == null) {
            return false;
        }
        EnumC0057b0 enumC0057b0 = EnumC0057b0.f1299o;
        return true;
    }

    public final int hashCode() {
        return (EnumC0057b0.f1300p.hashCode() * 31) + 1231;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0061d0 c0061d0 = new C0061d0(0);
        c0061d0.f1311D = EnumC0057b0.f1300p;
        c0061d0.f1312E = true;
        return c0061d0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C0061d0 c0061d0 = (C0061d0) abstractC1397o;
        c0061d0.f1311D = EnumC0057b0.f1300p;
        c0061d0.f1312E = true;
    }
}
