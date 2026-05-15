package androidx.compose.foundation.layout;

import D.C0071l;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;
import r0.C1385c;
import r0.C1390h;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends AbstractC0344d0 {
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
        if ((obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null) == null) {
            return false;
        }
        C1390h c1390h = C1385c.f15613p;
        return c1390h.equals(c1390h);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(0.0f) * 31)) * 31) + 1237;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0071l c0071l = new C0071l();
        c0071l.f1348C = C1385c.f15613p;
        return c0071l;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((C0071l) abstractC1397o).f1348C = C1385c.f15613p;
    }
}
