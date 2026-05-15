package i2;

import e5.AbstractC0871i;
import m5.C1219u;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: i2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1072g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1219u f13372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1219u f13373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1074i f13374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f13375s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072g(C1219u c1219u, C1219u c1219u2, C1074i c1074i, long j3, c5.d dVar) {
        super(2, dVar);
        this.f13372p = c1219u;
        this.f13373q = c1219u2;
        this.f13374r = c1074i;
        this.f13375s = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1072g(this.f13372p, this.f13373q, this.f13374r, this.f13375s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1072g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r1 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (w5.AbstractC1767D.i((r7 - r5) / 1000000, r9) == r0) goto L38;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r9.f13371o
            i2.i r2 = r9.f13374r
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r4) goto L13
            android.support.v4.media.session.b.K(r10)
            goto L93
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            android.support.v4.media.session.b.K(r10)
            goto L74
        L1f:
            android.support.v4.media.session.b.K(r10)
            m5.u r10 = r9.f13372p
            long r5 = r10.f14438o
            m5.u r10 = r9.f13373q
            long r7 = r10.f14438o
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L85
            r9.f13371o = r3
            c5.i r10 = r9.getContext()
            w5.AbstractC1767D.j(r10)
            c5.d r1 = I0.c.D(r9)
            boolean r4 = r1 instanceof B5.g
            r5 = 0
            if (r4 == 0) goto L43
            r5 = r1
            B5.g r5 = (B5.g) r5
        L43:
            Y4.o r1 = Y4.o.f8736a
            if (r5 != 0) goto L49
            r10 = r1
            goto L6c
        L49:
            w5.x r4 = r5.f889r
            boolean r6 = r4.C()
            if (r6 == 0) goto L59
            r5.f891t = r1
            r5.f19496q = r3
            r4.B(r10, r5)
            goto L6b
        L59:
            w5.J0 r6 = new w5.J0
            w5.y r7 = w5.J0.f19494p
            r6.<init>(r7)
            c5.i r10 = r10.h(r6)
            r5.f891t = r1
            r5.f19496q = r3
            r4.B(r10, r5)
        L6b:
            r10 = r0
        L6c:
            d5.a r3 = d5.EnumC0830a.f11264o
            if (r10 != r3) goto L71
            r1 = r10
        L71:
            if (r1 != r0) goto L74
            goto L92
        L74:
            long r0 = r9.f13375s
            f0.g r10 = r2.f13379p
            r10.e(r0)
            java.lang.Object r10 = r2.f13380q
            monitor-enter(r10)
            r2.f13382s = r0     // Catch: java.lang.Throwable -> L82
            monitor-exit(r10)
            goto L9d
        L82:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L85:
            long r7 = r7 - r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r5
            r9.f13371o = r4
            java.lang.Object r10 = w5.AbstractC1767D.i(r7, r9)
            if (r10 != r0) goto L93
        L92:
            return r0
        L93:
            r2.getClass()
            long r0 = java.lang.System.nanoTime()
            i2.C1074i.a(r2, r0)
        L9d:
            Y4.o r10 = Y4.o.f8736a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C1072g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
