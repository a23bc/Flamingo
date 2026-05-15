package I;

import e5.AbstractC0870h;

/* JADX INFO: renamed from: I.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0214f extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public K0.u f3349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public K0.u f3350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0211c f3353t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214f(C0211c c0211c, c5.d dVar) {
        super(dVar);
        this.f3353t = c0211c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0214f c0214f = new C0214f(this.f3353t, dVar);
        c0214f.f3352s = obj;
        return c0214f;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0214f) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r12 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r12 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:18:0x0068). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r11.f3351r
            r2 = 1
            I.c r3 = r11.f3353t
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L23
            if (r1 != r4) goto L1b
            K0.u r1 = r11.f3350q
            K0.u r2 = r11.f3349p
            java.lang.Object r6 = r11.f3352s
            K0.L r6 = (K0.L) r6
            android.support.v4.media.session.b.K(r12)
            goto L68
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            java.lang.Object r1 = r11.f3352s
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r12)
            goto L40
        L2b:
            android.support.v4.media.session.b.K(r12)
            java.lang.Object r12 = r11.f3352s
            r1 = r12
            K0.L r1 = (K0.L) r1
            K0.n r12 = K0.EnumC0246n.f3901o
            r11.f3352s = r1
            r11.f3351r = r2
            java.lang.Object r12 = z.q1.b(r1, r5, r12, r11)
            if (r12 != r0) goto L40
            goto L67
        L40:
            K0.u r12 = (K0.u) r12
            r3.getClass()
            x0.b r2 = new x0.b
            r6 = 0
            r2.<init>(r6)
            f0.j0 r6 = r3.f3293c
            r6.setValue(r2)
            r2 = 0
            r6 = r1
            r1 = r2
            r2 = r12
        L55:
            if (r1 != 0) goto L8d
            K0.n r12 = K0.EnumC0246n.f3901o
            r11.f3352s = r6
            r11.f3349p = r2
            r11.f3350q = r1
            r11.f3351r = r4
            java.lang.Object r12 = r6.a(r12, r11)
            if (r12 != r0) goto L68
        L67:
            return r0
        L68:
            K0.m r12 = (K0.C0245m) r12
            java.lang.Object r7 = r12.f3896a
            int r8 = r7.size()
            r9 = r5
        L71:
            if (r9 >= r8) goto L83
            java.lang.Object r10 = r7.get(r9)
            K0.u r10 = (K0.u) r10
            boolean r10 = K0.t.b(r10)
            if (r10 != 0) goto L80
            goto L55
        L80:
            int r9 = r9 + 1
            goto L71
        L83:
            java.lang.Object r12 = r12.f3896a
            java.lang.Object r12 = r12.get(r5)
            r1 = r12
            K0.u r1 = (K0.u) r1
            goto L55
        L8d:
            long r4 = r2.f3912c
            long r0 = r1.f3912c
            long r0 = x0.C1892b.g(r0, r4)
            r3.getClass()
            x0.b r12 = new x0.b
            r12.<init>(r0)
            f0.j0 r0 = r3.f3293c
            r0.setValue(r12)
            Y4.o r12 = Y4.o.f8736a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0214f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
