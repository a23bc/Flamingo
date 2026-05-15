package androidx.compose.animation;

import Q0.AbstractC0344d0;
import r0.AbstractC1397o;
import r0.C1385c;
import r0.C1390h;
import v.s0;
import w.S;

/* JADX INFO: loaded from: classes.dex */
final class SizeAnimationModifierElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f9109a;

    public SizeAnimationModifierElement(S s7) {
        this.f9109a = s7;
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
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        if (!this.f9109a.equals(((SizeAnimationModifierElement) obj).f9109a)) {
            return false;
        }
        C1390h c1390h = C1385c.f15612o;
        return c1390h.equals(c1390h);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31) + (this.f9109a.hashCode() * 31)) * 31;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new s0(this.f9109a);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((s0) abstractC1397o).f18165D = this.f9109a;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f9109a + ", alignment=" + C1385c.f15612o + ", finishedListener=null)";
    }
}
