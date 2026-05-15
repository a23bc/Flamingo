package z;

/* JADX INFO: renamed from: z.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2073y0 implements J0.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final P0 f21001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21002p;

    public C2073y0(P0 p02, boolean z6) {
        this.f21001o = p02;
        this.f21002p = z6;
    }

    @Override // J0.a
    public final long I(int i7, long j3, long j7) {
        if (!this.f21002p) {
            return 0L;
        }
        P0 p02 = this.f21001o;
        if (p02.f20711a.b()) {
            return 0L;
        }
        return p02.h(p02.d(p02.f20711a.e(p02.d(p02.g(j7)))));
    }

    @Override // J0.a
    public final /* synthetic */ long m(long j3, int i7) {
        return 0L;
    }

    @Override // J0.a
    public final Object m0(long j3, c5.d dVar) {
        return new n1.r(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // J0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(long r5, long r7, c5.d r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof z.C2071x0
            if (r5 == 0) goto L13
            r5 = r9
            z.x0 r5 = (z.C2071x0) r5
            int r6 = r5.f20993r
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.f20993r = r6
            goto L1a
        L13:
            z.x0 r5 = new z.x0
            e5.c r9 = (e5.AbstractC0865c) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.f20991p
            d5.a r9 = d5.EnumC0830a.f11264o
            int r0 = r5.f20993r
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r7 = r5.f20990o
            android.support.v4.media.session.b.K(r6)
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            android.support.v4.media.session.b.K(r6)
            boolean r6 = r4.f21002p
            r2 = 0
            if (r6 == 0) goto L56
            z.P0 r6 = r4.f21001o
            boolean r0 = r6.f20718i
            if (r0 == 0) goto L43
            goto L52
        L43:
            r5.f20990o = r7
            r5.f20993r = r1
            java.lang.Object r6 = r6.a(r7, r5)
            if (r6 != r9) goto L4e
            return r9
        L4e:
            n1.r r6 = (n1.r) r6
            long r2 = r6.f14529a
        L52:
            long r2 = n1.r.d(r7, r2)
        L56:
            n1.r r5 = new n1.r
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2073y0.x(long, long, c5.d):java.lang.Object");
    }
}
