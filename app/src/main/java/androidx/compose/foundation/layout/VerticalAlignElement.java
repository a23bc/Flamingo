package androidx.compose.foundation.layout;

import D.w0;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;
import r0.C1385c;
import r0.C1389g;

/* JADX INFO: loaded from: classes.dex */
public final class VerticalAlignElement extends AbstractC0344d0 {
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
        if ((obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null) == null) {
            return false;
        }
        C1389g c1389g = C1385c.f15622y;
        return c1389g.equals(c1389g);
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        w0 w0Var = new w0();
        w0Var.f1410C = C1385c.f15622y;
        return w0Var;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((w0) abstractC1397o).f1410C = C1385c.f15622y;
    }
}
