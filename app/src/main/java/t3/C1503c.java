package t3;

import N2.H;
import N2.J;
import java.util.Arrays;
import t2.C1486o;
import t2.C1487p;
import t2.M;

/* JADX INFO: renamed from: t3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1503c implements f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f16822w = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16823a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H f16829g;
    public H h;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16833m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16837q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16839s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public H f16841u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f16842v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f16824b = new J(7, new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f16825c = new w2.m(Arrays.copyOf(f16822w, 10));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16830i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16831j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16832k = 256;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16834n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16835o = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f16838r = -9223372036854775807L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16840t = -9223372036854775807L;

    public C1503c(int i7, String str, boolean z6) {
        this.f16823a = z6;
        this.f16826d = str;
        this.f16827e = i7;
    }

    @Override // t3.f
    public final void a() {
        this.f16840t = -9223372036854775807L;
        this.f16833m = false;
        this.f16830i = 0;
        this.f16831j = 0;
        this.f16832k = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x022c, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [w2.m] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [N2.J] */
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
    @Override // t3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w2.m r24) throws t2.N {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C1503c.b(w2.m):void");
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.f16840t = j3;
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.f16828f = c1500d.f16801e;
        c1500d.b();
        H hE = oVar.E(c1500d.f16800d, 1);
        this.f16829g = hE;
        this.f16841u = hE;
        if (!this.f16823a) {
            this.h = new N2.l();
            return;
        }
        c1500d.a();
        c1500d.b();
        H hE2 = oVar.E(c1500d.f16800d, 5);
        this.h = hE2;
        C1486o c1486o = new C1486o();
        c1500d.b();
        c1486o.f16617a = c1500d.f16801e;
        c1486o.l = M.j("application/id3");
        hE2.e(new C1487p(c1486o));
    }

    @Override // t3.f
    public final void c(boolean z6) {
    }
}
