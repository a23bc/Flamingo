package H;

import e5.AbstractC0871i;
import w.InterfaceC1652A;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: H.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0178u extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1652A f2925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0183z f2927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w.S f2928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f2929s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178u(C0183z c0183z, w.S s7, long j3, c5.d dVar) {
        super(2, dVar);
        this.f2927q = c0183z;
        this.f2928r = s7;
        this.f2929s = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0178u(this.f2927q, this.f2928r, this.f2929s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0178u) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (w.C1670c.c(r0, r6, r4, null, r4, r12, 4) != r8) goto L30;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws android.app.PendingIntent.CanceledException {
        /*
            r12 = this;
            r7 = 0
            d5.a r8 = d5.EnumC0830a.f11264o
            int r0 = r12.f2926p
            H.z r9 = r12.f2927q
            long r1 = r12.f2929s
            r3 = 2
            r4 = 1
            w.c r6 = r9.f2950m
            if (r0 == 0) goto L26
            if (r0 == r4) goto L20
            if (r0 != r3) goto L18
            android.support.v4.media.session.b.K(r13)     // Catch: java.util.concurrent.CancellationException -> L86
            goto L7f
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            w.A r0 = r12.f2925o
            android.support.v4.media.session.b.K(r13)     // Catch: java.util.concurrent.CancellationException -> L86
            goto L4f
        L26:
            android.support.v4.media.session.b.K(r13)
            boolean r0 = r6.f()     // Catch: java.util.concurrent.CancellationException -> L86
            w.S r10 = r12.f2928r
            if (r0 == 0) goto L38
            boolean r0 = r10 instanceof w.S     // Catch: java.util.concurrent.CancellationException -> L86
            if (r0 == 0) goto L36
            goto L38
        L36:
            w.S r10 = H.A.f2771a     // Catch: java.util.concurrent.CancellationException -> L86
        L38:
            r0 = r10
            boolean r10 = r6.f()     // Catch: java.util.concurrent.CancellationException -> L86
            if (r10 != 0) goto L54
            n1.k r10 = new n1.k     // Catch: java.util.concurrent.CancellationException -> L86
            r10.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L86
            r12.f2925o = r0     // Catch: java.util.concurrent.CancellationException -> L86
            r12.f2926p = r4     // Catch: java.util.concurrent.CancellationException -> L86
            java.lang.Object r4 = r6.g(r12, r10)     // Catch: java.util.concurrent.CancellationException -> L86
            if (r4 != r8) goto L4f
            goto L7e
        L4f:
            E3.e r4 = r9.f2942c     // Catch: java.util.concurrent.CancellationException -> L86
            r4.a()     // Catch: java.util.concurrent.CancellationException -> L86
        L54:
            java.lang.Object r4 = r6.e()     // Catch: java.util.concurrent.CancellationException -> L86
            n1.k r4 = (n1.k) r4     // Catch: java.util.concurrent.CancellationException -> L86
            long r10 = r4.f14514a     // Catch: java.util.concurrent.CancellationException -> L86
            long r1 = n1.k.c(r10, r1)     // Catch: java.util.concurrent.CancellationException -> L86
            r4 = r0
            w.c r0 = r9.f2950m     // Catch: java.util.concurrent.CancellationException -> L86
            n1.k r6 = new n1.k     // Catch: java.util.concurrent.CancellationException -> L86
            r6.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L86
            r10 = r4
            H.t r4 = new H.t     // Catch: java.util.concurrent.CancellationException -> L86
            r4.<init>(r7, r1, r9)     // Catch: java.util.concurrent.CancellationException -> L86
            r1 = 0
            r12.f2925o = r1     // Catch: java.util.concurrent.CancellationException -> L86
            r12.f2926p = r3     // Catch: java.util.concurrent.CancellationException -> L86
            r3 = 0
            r1 = r6
            r6 = 4
            r5 = r12
            r2 = r10
            java.lang.Object r0 = w.C1670c.c(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.CancellationException -> L86
            if (r0 != r8) goto L7f
        L7e:
            return r8
        L7f:
            int r0 = H.C0183z.f2939r     // Catch: java.util.concurrent.CancellationException -> L86
            r9.d(r7)     // Catch: java.util.concurrent.CancellationException -> L86
            r9.f2944e = r7     // Catch: java.util.concurrent.CancellationException -> L86
        L86:
            Y4.o r0 = Y4.o.f8736a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0178u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
