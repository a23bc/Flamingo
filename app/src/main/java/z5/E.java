package z5;

import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ InterfaceC2111f f21256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ int f21257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G f21258r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(G g6, c5.d dVar) {
        super(3, dVar);
        this.f21258r = g6;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        E e7 = new E(this.f21258r, (c5.d) obj3);
        e7.f21256p = (InterfaceC2111f) obj;
        e7.f21257q = iIntValue;
        return e7.invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1.f(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1.f(r9, r8) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[PHI: r1
  0x006a: PHI (r1v3 z5.f) = (r1v2 z5.f), (r1v6 z5.f) binds: [B:25:0x0067, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[PHI: r1
  0x007d: PHI (r1v4 z5.f) = (r1v3 z5.f), (r1v7 z5.f) binds: [B:28:0x007a, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r8.f21255o
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            z5.G r7 = r8.f21258r
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            z5.f r1 = r8.f21256p
            android.support.v4.media.session.b.K(r9)
            goto L7d
        L26:
            z5.f r1 = r8.f21256p
            android.support.v4.media.session.b.K(r9)
            goto L6a
        L2c:
            z5.f r1 = r8.f21256p
            android.support.v4.media.session.b.K(r9)
            goto L5a
        L32:
            android.support.v4.media.session.b.K(r9)
            goto L8b
        L36:
            android.support.v4.media.session.b.K(r9)
            z5.f r1 = r8.f21256p
            int r9 = r8.f21257q
            if (r9 <= 0) goto L4a
            z5.B r9 = z5.EnumC2104B.f21248o
            r8.f21255o = r6
            java.lang.Object r9 = r1.f(r9, r8)
            if (r9 != r0) goto L8b
            goto L8a
        L4a:
            r7.getClass()
            r8.f21256p = r1
            r8.f21255o = r5
            r5 = 0
            java.lang.Object r9 = w5.AbstractC1767D.i(r5, r8)
            if (r9 != r0) goto L5a
            goto L8a
        L5a:
            r7.getClass()
            z5.B r9 = z5.EnumC2104B.f21249p
            r8.f21256p = r1
            r8.f21255o = r4
            java.lang.Object r9 = r1.f(r9, r8)
            if (r9 != r0) goto L6a
            goto L8a
        L6a:
            r7.getClass()
            r8.f21256p = r1
            r8.f21255o = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = w5.AbstractC1767D.i(r3, r8)
            if (r9 != r0) goto L7d
            goto L8a
        L7d:
            z5.B r9 = z5.EnumC2104B.f21250q
            r3 = 0
            r8.f21256p = r3
            r8.f21255o = r2
            java.lang.Object r9 = r1.f(r9, r8)
            if (r9 != r0) goto L8b
        L8a:
            return r0
        L8b:
            Y4.o r9 = Y4.o.f8736a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
