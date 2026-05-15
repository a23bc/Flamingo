package z;

import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f20693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ long f20695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P0 f20696r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(P0 p02, c5.d dVar) {
        super(2, dVar);
        this.f20696r = p02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        N0 n02 = new N0(this.f20696r, dVar);
        n02.f20695q = ((n1.r) obj).f14529a;
        return n02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        long j3 = ((n1.r) obj).f14529a;
        N0 n02 = new N0(this.f20696r, (c5.d) obj2);
        n02.f20695q = j3;
        return n02.invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r14.f20694p
            r2 = 3
            r3 = 2
            r4 = 1
            z.P0 r5 = r14.f20696r
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            long r0 = r14.f20693o
            long r2 = r14.f20695q
            android.support.v4.media.session.b.K(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r3 = r14.f20693o
            long r6 = r14.f20695q
            android.support.v4.media.session.b.K(r15)
            goto L57
        L29:
            long r6 = r14.f20695q
            android.support.v4.media.session.b.K(r15)
            goto L41
        L2f:
            android.support.v4.media.session.b.K(r15)
            long r6 = r14.f20695q
            J0.d r15 = r5.f20716f
            r14.f20695q = r6
            r14.f20694p = r4
            java.lang.Object r15 = r15.c(r6, r14)
            if (r15 != r0) goto L41
            goto L6e
        L41:
            n1.r r15 = (n1.r) r15
            long r8 = r15.f14529a
            long r8 = n1.r.d(r6, r8)
            r14.f20695q = r6
            r14.f20693o = r8
            r14.f20694p = r3
            java.lang.Object r15 = r5.a(r8, r14)
            if (r15 != r0) goto L56
            goto L6e
        L56:
            r3 = r8
        L57:
            n1.r r15 = (n1.r) r15
            long r11 = r15.f14529a
            J0.d r8 = r5.f20716f
            long r9 = n1.r.d(r3, r11)
            r14.f20695q = r6
            r14.f20693o = r11
            r14.f20694p = r2
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r2 = r6
            r0 = r11
        L71:
            n1.r r15 = (n1.r) r15
            long r4 = r15.f14529a
            long r0 = n1.r.d(r0, r4)
            long r0 = n1.r.d(r2, r0)
            n1.r r15 = new n1.r
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: z.N0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
