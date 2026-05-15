package X;

import e5.AbstractC0870h;

/* JADX INFO: renamed from: X.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0491n0 extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0495p0 f8113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ M f8114s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0491n0(C0495p0 c0495p0, M m7, c5.d dVar) {
        super(dVar);
        this.f8113r = c0495p0;
        this.f8114s = m7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0491n0 c0491n0 = new C0491n0(this.f8113r, this.f8114s, dVar);
        c0491n0.f8112q = obj;
        return c0491n0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0491n0) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r5.f8111p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r6)
            goto L47
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            java.lang.Object r1 = r5.f8112q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r6)
            goto L37
        L20:
            android.support.v4.media.session.b.K(r6)
            java.lang.Object r6 = r5.f8112q
            r1 = r6
            K0.L r1 = (K0.L) r1
            r5.f8112q = r1
            r5.f8111p = r3
            z.K r6 = z.q1.f20945a
            K0.n r6 = K0.EnumC0246n.f3902p
            java.lang.Object r6 = z.q1.d(r1, r6, r5)
            if (r6 != r0) goto L37
            goto L46
        L37:
            K0.u r6 = (K0.u) r6
            K0.n r3 = K0.EnumC0246n.f3901o
            r4 = 0
            r5.f8112q = r4
            r5.f8111p = r2
            java.lang.Object r6 = z.B.a(r1, r6, r3, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5d
            X.p0 r6 = r5.f8113r
            M.M r6 = r6.f()
            if (r6 == 0) goto L58
            goto L5d
        L58:
            X.M r6 = r5.f8114s
            r6.a()
        L5d:
            Y4.o r6 = Y4.o.f8736a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0491n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
