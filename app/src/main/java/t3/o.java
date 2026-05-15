package t3;

import N2.H;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f16951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16957g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16960k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16961m;

    public o(H h) {
        this.f16951a = h;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i7) {
        long j3 = this.l;
        if (j3 == -9223372036854775807L) {
            return;
        }
        boolean z6 = this.f16961m;
        this.f16951a.f(j3, z6 ? 1 : 0, (int) (this.f16952b - this.f16960k), i7, null);
    }
}
