package androidx.compose.ui.input.pointer;

import K0.C0233a;
import K0.p;
import K0.t;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends AbstractC0344d0 {
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
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        ((PointerHoverIconModifierElement) obj).getClass();
        C0233a c0233a = t.f3908b;
        return c0233a.equals(c0233a);
    }

    public final int hashCode() {
        return (1008 * 31) + 1237;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new p(t.f3908b, null);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        p pVar = (p) abstractC1397o;
        C0233a c0233a = t.f3908b;
        if (AbstractC1209k.a(pVar.f3879D, c0233a)) {
            return;
        }
        pVar.f3879D = c0233a;
        if (pVar.f3880E) {
            pVar.D0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + t.f3908b + ", overrideDescendants=false)";
    }
}
