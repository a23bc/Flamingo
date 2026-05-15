package androidx.compose.ui.focus;

import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import w0.p;
import w0.r;

/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f9294a;

    public FocusRequesterElement(p pVar) {
        this.f9294a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && AbstractC1209k.a(this.f9294a, ((FocusRequesterElement) obj).f9294a);
    }

    public final int hashCode() {
        return this.f9294a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        r rVar = new r();
        rVar.f18811C = this.f9294a;
        return rVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        r rVar = (r) abstractC1397o;
        rVar.f18811C.f18810a.k(rVar);
        p pVar = this.f9294a;
        rVar.f18811C = pVar;
        pVar.f18810a.b(rVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f9294a + ')';
    }
}
