package t3;

import A2.S;
import N2.H;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1497A f16938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16940c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16944g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H f16946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f16947k;
    public boolean l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16949n;
    public final boolean[] h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f16941d = new S(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f16942e = new S(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S f16943f = new S(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16948m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w2.m f16950o = new w2.m();

    public n(C1497A c1497a, boolean z6, boolean z7) {
        this.f16938a = c1497a;
        this.f16939b = z6;
        this.f16940c = z7;
    }

    @Override // t3.f
    public final void a() {
        this.f16944g = 0L;
        this.f16949n = false;
        this.f16948m = -9223372036854775807L;
        x2.g.a(this.h);
        this.f16941d.d();
        this.f16942e.d();
        this.f16943f.d();
        m mVar = this.f16947k;
        if (mVar != null) {
            mVar.f16930k = false;
            mVar.f16933o = false;
            l lVar = mVar.f16932n;
            lVar.f16908b = false;
            lVar.f16907a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
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
    public final void b(w2.m r33) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.n.b(w2.m):void");
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
        AbstractC1697a.j(this.f16946j);
        int i7 = w2.t.f18881a;
        if (z6) {
            m mVar = this.f16947k;
            long j3 = this.f16944g;
            mVar.a();
            mVar.f16929j = j3;
            long j7 = mVar.f16935q;
            if (j7 != -9223372036854775807L) {
                boolean z7 = mVar.f16936r;
                mVar.f16921a.f(j7, z7 ? 1 : 0, (int) (j3 - mVar.f16934p), 0, null);
            }
            mVar.f16933o = false;
        }
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.f16948m = j3;
        this.f16949n |= (i7 & 2) != 0;
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.f16945i = c1500d.f16801e;
        c1500d.b();
        H hE = oVar.E(c1500d.f16800d, 2);
        this.f16946j = hE;
        this.f16947k = new m(hE, this.f16939b, this.f16940c);
        this.f16938a.b(oVar, c1500d);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.n.f(byte[], int, int):void");
    }
}
