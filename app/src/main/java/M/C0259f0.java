package M;

import e5.AbstractC0870h;

/* JADX INFO: renamed from: M.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0259f0 extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public K0.u f4552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f4555s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0259f0(j0 j0Var, c5.d dVar) {
        super(dVar);
        this.f4555s = j0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0259f0 c0259f0 = new C0259f0(this.f4555s, dVar);
        c0259f0.f4554r = obj;
        return c0259f0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0259f0) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:17:0x0051). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r12.f4553q
            r2 = 1
            r3 = 2
            M.j0 r4 = r12.f4555s
            if (r1 == 0) goto L28
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            K0.u r1 = r12.f4552p
            java.lang.Object r2 = r12.f4554r
            K0.L r2 = (K0.L) r2
            android.support.v4.media.session.b.K(r13)
            goto L51
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f4554r
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r13)
            goto L3b
        L28:
            android.support.v4.media.session.b.K(r13)
            java.lang.Object r13 = r12.f4554r
            r1 = r13
            K0.L r1 = (K0.L) r1
            r12.f4554r = r1
            r12.f4553q = r2
            java.lang.Object r13 = z.q1.c(r1, r12, r3)
            if (r13 != r0) goto L3b
            goto L50
        L3b:
            K0.u r13 = (K0.u) r13
            long r5 = r13.f3912c
            r4.d()
            r2 = r1
            r1 = r13
        L44:
            r12.f4554r = r2
            r12.f4552p = r1
            r12.f4553q = r3
            java.lang.Object r13 = A0.e.q(r2, r12)
            if (r13 != r0) goto L51
        L50:
            return r0
        L51:
            K0.m r13 = (K0.C0245m) r13
            java.lang.Object r13 = r13.f3896a
            int r5 = r13.size()
            r6 = 0
        L5a:
            if (r6 >= r5) goto L74
            java.lang.Object r7 = r13.get(r6)
            K0.u r7 = (K0.u) r7
            long r8 = r7.f3910a
            long r10 = r1.f3910a
            boolean r8 = K0.t.d(r8, r10)
            if (r8 == 0) goto L71
            boolean r7 = r7.f3913d
            if (r7 == 0) goto L71
            goto L44
        L71:
            int r6 = r6 + 1
            goto L5a
        L74:
            r4.b()
            Y4.o r13 = Y4.o.f8736a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: M.C0259f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
