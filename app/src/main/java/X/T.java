package X;

import e5.AbstractC0870h;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f7996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0488m f7997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D4.i f7998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ M.j0 f7999t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(InterfaceC0488m interfaceC0488m, D4.i iVar, M.j0 j0Var, c5.d dVar) {
        super(dVar);
        this.f7997r = interfaceC0488m;
        this.f7998s = iVar;
        this.f7999t = j0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        T t7 = new T(this.f7997r, this.f7998s, this.f7999t, dVar);
        t7.f7996q = obj;
        return t7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (X.AbstractC0498r0.j(r1, r9.f7997r, r9.f7998s, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (X.AbstractC0498r0.k(r1, r9.f7999t, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r9.f7995p
            r2 = 1
            r3 = 3
            r4 = 2
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1c
            if (r1 == r4) goto L18
            if (r1 != r3) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            android.support.v4.media.session.b.K(r10)
            goto L81
        L1c:
            java.lang.Object r1 = r9.f7996q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r10)
            goto L37
        L24:
            android.support.v4.media.session.b.K(r10)
            java.lang.Object r10 = r9.f7996q
            r1 = r10
            K0.L r1 = (K0.L) r1
            r9.f7996q = r1
            r9.f7995p = r2
            java.lang.Object r10 = X.AbstractC0498r0.i(r1, r9)
            if (r10 != r0) goto L37
            goto L80
        L37:
            K0.m r10 = (K0.C0245m) r10
            boolean r2 = X.AbstractC0498r0.v(r10)
            r5 = 0
            if (r2 == 0) goto L6e
            int r2 = r10.f3899d
            r2 = r2 & 33
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r10.f3896a
            int r6 = r2.size()
            r7 = 0
        L4d:
            if (r7 >= r6) goto L5f
            java.lang.Object r8 = r2.get(r7)
            K0.u r8 = (K0.u) r8
            boolean r8 = r8.b()
            if (r8 == 0) goto L5c
            goto L6e
        L5c:
            int r7 = r7 + 1
            goto L4d
        L5f:
            r9.f7996q = r5
            r9.f7995p = r4
            D4.i r2 = r9.f7998s
            X.m r3 = r9.f7997r
            java.lang.Object r10 = X.AbstractC0498r0.j(r1, r3, r2, r10, r9)
            if (r10 != r0) goto L81
            goto L80
        L6e:
            boolean r2 = X.AbstractC0498r0.v(r10)
            if (r2 != 0) goto L81
            r9.f7996q = r5
            r9.f7995p = r3
            M.j0 r2 = r9.f7999t
            java.lang.Object r10 = X.AbstractC0498r0.k(r1, r2, r10, r9)
            if (r10 != r0) goto L81
        L80:
            return r0
        L81:
            Y4.o r10 = Y4.o.f8736a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
