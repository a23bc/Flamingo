package z5;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f21319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2110e f21320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f21321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Float f21322s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(G g6, InterfaceC2110e interfaceC2110e, J j3, Float f7, c5.d dVar) {
        super(2, dVar);
        this.f21319p = g6;
        this.f21320q = interfaceC2110e;
        this.f21321r = j3;
        this.f21322s = f7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new q(this.f21319p, this.f21320q, this.f21321r, this.f21322s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r2.b(r3, r14) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r2.b(r3, r14) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (z5.z.d(r15, r1, r14) == r0) goto L28;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r14.f21318o
            z5.e r2 = r14.f21320q
            z5.J r3 = r14.f21321r
            r4 = 2
            r5 = 4
            r6 = 3
            r7 = 1
            if (r1 == 0) goto L27
            if (r1 == r7) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r6) goto L23
            if (r1 != r5) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1f:
            android.support.v4.media.session.b.K(r15)
            goto L50
        L23:
            android.support.v4.media.session.b.K(r15)
            goto L90
        L27:
            android.support.v4.media.session.b.K(r15)
            z5.D r15 = z5.C2105C.f21252a
            z5.G r1 = r14.f21319p
            if (r1 != r15) goto L39
            r14.f21318o = r7
            java.lang.Object r15 = r2.b(r3, r14)
            if (r15 != r0) goto L90
            goto L8f
        L39:
            z5.D r15 = z5.C2105C.f21253b
            r7 = 0
            if (r1 != r15) goto L59
            A5.B r15 = r3.h()
            z5.o r1 = new z5.o
            r1.<init>(r4, r7)
            r14.f21318o = r4
            java.lang.Object r15 = z5.z.h(r15, r1, r14)
            if (r15 != r0) goto L50
            goto L8f
        L50:
            r14.f21318o = r6
            java.lang.Object r15 = r2.b(r3, r14)
            if (r15 != r0) goto L90
            goto L8f
        L59:
            A5.B r10 = r3.h()
            z5.E r9 = new z5.E
            r9.<init>(r1, r7)
            int r15 = z5.AbstractC2116k.f21297a
            A5.o r8 = new A5.o
            c5.j r11 = c5.j.f10685o
            y5.a r13 = y5.a.f20528o
            r12 = -2
            r8.<init>(r9, r10, r11, r12, r13)
            z5.F r15 = new z5.F
            r15.<init>(r4, r7)
            z5.h r1 = new z5.h
            r1.<init>(r8, r15)
            z5.e r15 = z5.z.e(r1)
            z5.e r15 = z5.z.e(r15)
            z5.p r1 = new z5.p
            java.lang.Float r4 = r14.f21322s
            r1.<init>(r2, r3, r4, r7)
            r14.f21318o = r5
            java.lang.Object r15 = z5.z.d(r15, r1, r14)
            if (r15 != r0) goto L90
        L8f:
            return r0
        L90:
            Y4.o r15 = Y4.o.f8736a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
