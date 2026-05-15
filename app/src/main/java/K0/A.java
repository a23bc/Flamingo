package K0;

import R0.Y;
import R0.Z;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f3817p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f3818q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f3819r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Object obj, int i7, Object obj2) {
        super(1);
        this.f3817p = i7;
        this.f3818q = obj;
        this.f3819r = obj2;
    }

    private final Object e(Object obj) {
        Y y6 = (Y) this.f3818q;
        Z z6 = (Z) this.f3819r;
        synchronized (y6.f6391s) {
            y6.f6393u.remove(z6);
        }
        return Y4.o.f8736a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:356:0x03d4, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // l5.InterfaceC1182c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.A.b(java.lang.Object):java.lang.Object");
    }
}
