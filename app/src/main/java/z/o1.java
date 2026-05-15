package z;

import K0.EnumC0246n;
import e5.AbstractC0870h;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ EnumC0246n f20937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1220v f20938s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(EnumC0246n enumC0246n, C1220v c1220v, c5.d dVar) {
        super(dVar);
        this.f20937r = enumC0246n;
        this.f20938s = c1220v;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        o1 o1Var = new o1(this.f20937r, this.f20938s, dVar);
        o1Var.f20936q = obj;
        return o1Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o1) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r8.f3898c != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r4.f14439o = z.X.f20754a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r8 = r12.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r9 >= r8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r10 = (K0.u) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r10.b() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        r17 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (K0.t.e(r10, r2.f3846t.f3859M, r2.c()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r9 = r9 + 1;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r4.f14439o = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        r7 = K0.EnumC0246n.f3903q;
        r16.f20936q = r2;
        r16.f20935p = 2;
        r7 = r2.a(r7, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r7 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        r4.f14439o = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        return Y4.o.f8736a;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[PHI: r2 r8
  0x0043: PHI (r2v3 K0.L) = (r2v6 K0.L), (r2v9 K0.L) binds: [B:12:0x0040, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r8v0 java.lang.Object) = (r8v7 java.lang.Object), (r8v9 java.lang.Object) binds: [B:12:0x0040, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009b -> B:34:0x009e). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
