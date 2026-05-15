package z5;

import e5.AbstractC0871i;

/* JADX INFO: renamed from: z5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2115j extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ InterfaceC2111f f21294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f21295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f21296r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2115j(l5.e eVar, c5.d dVar) {
        super(3, dVar);
        this.f21296r = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.e] */
    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C2115j c2115j = new C2115j(this.f21296r, (c5.d) obj3);
        c2115j.f21294p = (InterfaceC2111f) obj;
        c2115j.f21295q = obj2;
        return c2115j.invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.f(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r4.f21293o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            z5.f r1 = r4.f21294p
            android.support.v4.media.session.b.K(r5)
            goto L32
        L1e:
            android.support.v4.media.session.b.K(r5)
            z5.f r1 = r4.f21294p
            java.lang.Object r5 = r4.f21295q
            r4.f21294p = r1
            r4.f21293o = r3
            e5.i r3 = r4.f21296r
            java.lang.Object r5 = r3.invoke(r5, r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.f21294p = r3
            r4.f21293o = r2
            java.lang.Object r5 = r1.f(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            Y4.o r5 = Y4.o.f8736a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.C2115j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
