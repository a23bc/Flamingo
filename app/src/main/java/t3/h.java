package t3;

import A2.S;
import N2.H;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f16869q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H f16871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1497A f16872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w2.m f16873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f16874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f16875f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f16876g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16879k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16883p;

    public h(C1497A c1497a) {
        this.f16872c = c1497a;
        g gVar = new g();
        gVar.f16868d = new byte[128];
        this.f16876g = gVar;
        if (c1497a != null) {
            this.f16874e = new S(178);
            this.f16873d = new w2.m();
        } else {
            this.f16874e = null;
            this.f16873d = null;
        }
        this.l = -9223372036854775807L;
        this.f16881n = -9223372036854775807L;
    }

    @Override // t3.f
    public final void a() {
        x2.g.a(this.f16875f);
        g gVar = this.f16876g;
        gVar.f16865a = false;
        gVar.f16866b = 0;
        gVar.f16867c = 0;
        S s7 = this.f16874e;
        if (s7 != null) {
            s7.d();
        }
        this.h = 0L;
        this.f16877i = false;
        this.l = -9223372036854775807L;
        this.f16881n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
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
    @Override // t3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w2.m r29) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.h.b(w2.m):void");
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
    @Override // t3.f
    public final void c(boolean z6) {
        AbstractC1697a.j(this.f16871b);
        if (z6) {
            boolean z7 = this.f16882o;
            this.f16871b.f(this.f16881n, z7 ? 1 : 0, (int) (this.h - this.f16880m), 0, null);
        }
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.l = j3;
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.f16870a = c1500d.f16801e;
        c1500d.b();
        this.f16871b = oVar.E(c1500d.f16800d, 2);
        C1497A c1497a = this.f16872c;
        if (c1497a != null) {
            c1497a.b(oVar, c1500d);
        }
    }
}
