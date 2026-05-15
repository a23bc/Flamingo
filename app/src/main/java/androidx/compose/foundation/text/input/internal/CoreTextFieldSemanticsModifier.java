package androidx.compose.foundation.text.input.internal;

import B2.m;
import M.Z;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import V.f;
import V.h;
import X.K0;
import b1.L;
import g1.C0957C;
import g1.C0969k;
import g1.C0980v;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import w0.p;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0957C f9244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0980v f9245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f9246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f9248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K0 f9249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0969k f9250g;
    public final p h;

    public CoreTextFieldSemanticsModifier(C0957C c0957c, C0980v c0980v, Z z6, boolean z7, m mVar, K0 k02, C0969k c0969k, p pVar) {
        this.f9244a = c0957c;
        this.f9245b = c0980v;
        this.f9246c = z6;
        this.f9247d = z7;
        this.f9248e = mVar;
        this.f9249f = k02;
        this.f9250g = c0969k;
        this.h = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return this.f9244a.equals(coreTextFieldSemanticsModifier.f9244a) && this.f9245b.equals(coreTextFieldSemanticsModifier.f9245b) && this.f9246c.equals(coreTextFieldSemanticsModifier.f9246c) && this.f9247d == coreTextFieldSemanticsModifier.f9247d && AbstractC1209k.a(this.f9248e, coreTextFieldSemanticsModifier.f9248e) && this.f9249f.equals(coreTextFieldSemanticsModifier.f9249f) && AbstractC1209k.a(this.f9250g, coreTextFieldSemanticsModifier.f9250g) && AbstractC1209k.a(this.h, coreTextFieldSemanticsModifier.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.f9250g.hashCode() + ((this.f9249f.hashCode() + ((this.f9248e.hashCode() + ((((((((this.f9246c.hashCode() + ((this.f9245b.hashCode() + (this.f9244a.hashCode() * 31)) * 31)) * 31) + 1237) * 31) + (this.f9247d ? 1231 : 1237)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        h hVar = new h();
        hVar.f7322E = this.f9244a;
        hVar.f7323F = this.f9245b;
        hVar.f7324G = this.f9246c;
        hVar.f7325H = this.f9247d;
        hVar.f7326I = this.f9248e;
        K0 k02 = this.f9249f;
        hVar.f7327J = k02;
        hVar.f7328K = this.f9250g;
        hVar.f7329L = this.h;
        k02.f7944f = new f(hVar, 4);
        return hVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        h hVar = (h) abstractC1397o;
        boolean z6 = hVar.f7325H;
        C0969k c0969k = hVar.f7328K;
        K0 k02 = hVar.f7327J;
        hVar.f7322E = this.f9244a;
        C0980v c0980v = this.f9245b;
        hVar.f7323F = c0980v;
        hVar.f7324G = this.f9246c;
        boolean z7 = this.f9247d;
        hVar.f7325H = z7;
        hVar.f7326I = this.f9248e;
        K0 k03 = this.f9249f;
        hVar.f7327J = k03;
        C0969k c0969k2 = this.f9250g;
        hVar.f7328K = c0969k2;
        hVar.f7329L = this.h;
        if (z7 != z6 || z7 != z6 || !AbstractC1209k.a(c0969k2, c0969k) || !L.c(c0980v.f12385b)) {
            AbstractC0347f.o(hVar);
        }
        if (k03.equals(k02)) {
            return;
        }
        k03.f7944f = new f(hVar, 0);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f9244a + ", value=" + this.f9245b + ", state=" + this.f9246c + ", readOnly=false, enabled=" + this.f9247d + ", isPassword=false, offsetMapping=" + this.f9248e + ", manager=" + this.f9249f + ", imeOptions=" + this.f9250g + ", focusRequester=" + this.h + ')';
    }
}
