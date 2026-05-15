package androidx.compose.ui.input.pointer;

import K0.C0233a;
import K0.F;
import M.V;
import Q0.AbstractC0344d0;
import Q0.C0359o;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0359o f9308a;

    public StylusHoverIconModifierElement(C0359o c0359o) {
        this.f9308a = c0359o;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        stylusHoverIconModifierElement.getClass();
        C0233a c0233a = V.f4487b;
        return c0233a.equals(c0233a) && AbstractC1209k.a(this.f9308a, stylusHoverIconModifierElement.f9308a);
    }

    public final int hashCode() {
        int i7 = ((1022 * 31) + 1237) * 31;
        C0359o c0359o = this.f9308a;
        return i7 + (c0359o == null ? 0 : c0359o.hashCode());
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new F(V.f4487b, this.f9308a);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        F f7 = (F) abstractC1397o;
        C0233a c0233a = V.f4487b;
        if (!AbstractC1209k.a(f7.f3879D, c0233a)) {
            f7.f3879D = c0233a;
            if (f7.f3880E) {
                f7.D0();
            }
        }
        f7.f3878C = this.f9308a;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + V.f4487b + ", overrideDescendants=false, touchBoundsExpansion=" + this.f9308a + ')';
    }
}
