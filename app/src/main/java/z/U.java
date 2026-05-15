package z;

import e5.AbstractC0870h;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c5.i f20744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC0870h f20745s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U(c5.i iVar, l5.e eVar, c5.d dVar) {
        super(dVar);
        this.f20744r = iVar;
        this.f20745s = (AbstractC0870h) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.h, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        U u7 = new U(this.f20744r, this.f20745s, dVar);
        u7.f20743q = obj;
        return u7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [K0.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [K0.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [e5.h, l5.e] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r8.f20742p
            c5.i r2 = r8.f20744r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r1 = r8.f20743q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r9)
            goto L28
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f20743q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
        L28:
            r9 = r1
            goto L3b
        L2a:
            r9 = move-exception
            goto L60
        L2c:
            java.lang.Object r1 = r8.f20743q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L4f
        L34:
            android.support.v4.media.session.b.K(r9)
            java.lang.Object r9 = r8.f20743q
            K0.L r9 = (K0.L) r9
        L3b:
            boolean r1 = w5.AbstractC1767D.r(r2)
            if (r1 == 0) goto L74
            e5.h r1 = r8.f20745s     // Catch: java.util.concurrent.CancellationException -> L5c
            r8.f20743q = r9     // Catch: java.util.concurrent.CancellationException -> L5c
            r8.f20742p = r5     // Catch: java.util.concurrent.CancellationException -> L5c
            java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5c
            if (r1 != r0) goto L4e
            goto L72
        L4e:
            r1 = r9
        L4f:
            r8.f20743q = r1     // Catch: java.util.concurrent.CancellationException -> L2a
            r8.f20742p = r4     // Catch: java.util.concurrent.CancellationException -> L2a
            K0.n r9 = K0.EnumC0246n.f3903q     // Catch: java.util.concurrent.CancellationException -> L2a
            java.lang.Object r9 = z.r1.b(r1, r9, r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            if (r9 != r0) goto L28
            goto L72
        L5c:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L60:
            boolean r6 = w5.AbstractC1767D.r(r2)
            if (r6 == 0) goto L73
            r8.f20743q = r1
            r8.f20742p = r3
            K0.n r9 = K0.EnumC0246n.f3903q
            java.lang.Object r9 = z.r1.b(r1, r9, r8)
            if (r9 != r0) goto L28
        L72:
            return r0
        L73:
            throw r9
        L74:
            Y4.o r9 = Y4.o.f8736a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
