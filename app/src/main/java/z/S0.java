package z;

import e5.AbstractC0870h;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f20731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K0.u f20734s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(K0.u uVar, c5.d dVar) {
        super(dVar);
        this.f20734s = uVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        S0 s02 = new S0(this.f20734s, dVar);
        s02.f20733r = obj;
        return s02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((S0) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r7.f20732q
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f20731p
            java.lang.Object r1 = r7.f20733r
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r8)
            goto L3f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            android.support.v4.media.session.b.K(r8)
            java.lang.Object r8 = r7.f20733r
            K0.L r8 = (K0.L) r8
            K0.u r1 = r7.f20734s
            R0.S0 r3 = r8.d()
            r3.getClass()
            r3 = 40
            long r5 = r1.f3911b
            long r3 = r3 + r5
            r1 = r8
        L31:
            r7.f20733r = r1
            r7.f20731p = r3
            r7.f20732q = r2
            r8 = 3
            java.lang.Object r8 = z.q1.c(r1, r7, r8)
            if (r8 != r0) goto L3f
            return r0
        L3f:
            K0.u r8 = (K0.u) r8
            long r5 = r8.f3911b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L31
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z.S0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
