package androidx.compose.ui.semantics;

import Q0.AbstractC0344d0;
import Y0.c;
import Y0.j;
import Y0.k;
import d0.C0787f0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends AbstractC0344d0 implements k {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClearAndSetSemanticsElement)) {
            return false;
        }
        ((ClearAndSetSemanticsElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return C0787f0.f10995r.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new c(false, true, C0787f0.f10995r);
    }

    @Override // Y0.k
    public final j l() {
        j jVar = new j();
        jVar.f8475q = false;
        jVar.f8476r = true;
        return jVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((c) abstractC1397o).f8436E = C0787f0.f10995r;
    }
}
