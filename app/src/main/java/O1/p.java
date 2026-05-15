package O1;

import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f5543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ F f5544q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(F f7, c5.d dVar) {
        super(2, dVar);
        this.f5544q = f7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        p pVar = new p(this.f5544q, dVar);
        pVar.f5543p = obj;
        return pVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((n) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079 A[RETURN] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r6.f5542o
            Y4.o r2 = Y4.o.f8736a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            android.support.v4.media.session.b.K(r7)
            return r2
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            android.support.v4.media.session.b.K(r7)
            return r2
        L1e:
            android.support.v4.media.session.b.K(r7)
            java.lang.Object r7 = r6.f5543p
            O1.n r7 = (O1.n) r7
            boolean r1 = r7 instanceof O1.l
            O1.F r5 = r6.f5544q
            if (r1 == 0) goto L6a
            O1.l r7 = (O1.l) r7
            r6.f5542o = r4
            z5.J r1 = r5.f5512g
            java.lang.Object r1 = r1.getValue()
            O1.G r1 = (O1.G) r1
            boolean r3 = r1 instanceof O1.C0330b
            if (r3 == 0) goto L3c
            goto L5e
        L3c:
            boolean r3 = r1 instanceof O1.i
            if (r3 == 0) goto L4b
            O1.G r7 = r7.f5536a
            if (r1 != r7) goto L5e
            java.lang.Object r7 = r5.g(r6)
            if (r7 != r0) goto L5e
            goto L5f
        L4b:
            O1.H r7 = O1.H.f5514a
            boolean r7 = m5.AbstractC1209k.a(r1, r7)
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r5.g(r6)
            if (r7 != r0) goto L5e
            goto L5f
        L5a:
            boolean r7 = r1 instanceof O1.C0336h
            if (r7 != 0) goto L62
        L5e:
            r7 = r2
        L5f:
            if (r7 != r0) goto L79
            goto L78
        L62:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            r7.<init>(r0)
            throw r7
        L6a:
            boolean r1 = r7 instanceof O1.m
            if (r1 == 0) goto L79
            O1.m r7 = (O1.m) r7
            r6.f5542o = r3
            java.lang.Object r7 = O1.F.c(r5, r7, r6)
            if (r7 != r0) goto L79
        L78:
            return r0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
