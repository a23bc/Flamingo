package androidx.compose.animation;

import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import v.C1589G;
import v.C1591I;
import v.C1597O;
import v.C1598P;
import v.C1599Q;
import w.c0;
import w.j0;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a */
    public final j0 f9102a;

    /* JADX INFO: renamed from: b */
    public final c0 f9103b;

    /* JADX INFO: renamed from: c */
    public final c0 f9104c;

    /* JADX INFO: renamed from: d */
    public final C1598P f9105d;

    /* JADX INFO: renamed from: e */
    public final C1599Q f9106e;

    /* JADX INFO: renamed from: f */
    public final C1589G f9107f;

    public EnterExitTransitionElement(j0 j0Var, c0 c0Var, c0 c0Var2, C1598P c1598p, C1599Q c1599q, C1589G c1589g) {
        this.f9102a = j0Var;
        this.f9103b = c0Var;
        this.f9104c = c0Var2;
        this.f9105d = c1598p;
        this.f9106e = c1599q;
        this.f9107f = c1589g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        if (!AbstractC1209k.a(this.f9102a, enterExitTransitionElement.f9102a) || !AbstractC1209k.a(this.f9103b, enterExitTransitionElement.f9103b) || !AbstractC1209k.a(this.f9104c, enterExitTransitionElement.f9104c) || !this.f9105d.equals(enterExitTransitionElement.f9105d) || !AbstractC1209k.a(this.f9106e, enterExitTransitionElement.f9106e)) {
            return false;
        }
        Object obj2 = C1591I.f17975q;
        return obj2.equals(obj2) && AbstractC1209k.a(this.f9107f, enterExitTransitionElement.f9107f);
    }

    public final int hashCode() {
        int iHashCode = this.f9102a.hashCode() * 31;
        c0 c0Var = this.f9103b;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        c0 c0Var2 = this.f9104c;
        return this.f9107f.hashCode() + ((C1591I.f17975q.hashCode() + ((this.f9106e.f18007a.hashCode() + ((this.f9105d.f18004a.hashCode() + ((iHashCode2 + (c0Var2 != null ? c0Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C1598P c1598p = this.f9105d;
        C1599Q c1599q = this.f9106e;
        return new C1597O(this.f9102a, this.f9103b, this.f9104c, c1598p, c1599q, this.f9107f);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1597O c1597o = (C1597O) abstractC1397o;
        c1597o.f17994D = this.f9102a;
        c1597o.f17995E = this.f9103b;
        c1597o.f17996F = this.f9104c;
        c1597o.f17997G = this.f9105d;
        c1597o.f17998H = this.f9106e;
        c1597o.f17999I = this.f9107f;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f9102a + ", sizeAnimation=" + this.f9103b + ", offsetAnimation=" + this.f9104c + ", slideAnimation=null, enter=" + this.f9105d + ", exit=" + this.f9106e + ", isEnabled=" + C1591I.f17975q + ", graphicsLayerBlock=" + this.f9107f + ')';
    }
}
