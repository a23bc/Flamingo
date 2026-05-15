package androidx.compose.foundation.layout;

import D.C0055a0;
import D.EnumC0057b0;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicHeightElement extends AbstractC0344d0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null) == null) {
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
        C0055a0 c0055a0 = new C0055a0(0);
        c0055a0.f1296D = EnumC0057b0.f1300p;
        c0055a0.f1297E = true;
        return c0055a0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C0055a0 c0055a0 = (C0055a0) abstractC1397o;
        c0055a0.f1296D = EnumC0057b0.f1300p;
        c0055a0.f1297E = true;
    }
}
