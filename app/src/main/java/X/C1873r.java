package x;

import e5.AbstractC0870h;

/* JADX INFO: renamed from: x.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1873r extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f19826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1875s f19827r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1873r(C1875s c1875s, c5.d dVar) {
        super(dVar);
        this.f19827r = c1875s;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1873r c1873r = new C1873r(this.f19827r, dVar);
        c1873r.f19826q = obj;
        return c1873r;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1873r) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:17:0x004e). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r11.f19825p
            r2 = 2
            r3 = 1
            x.s r4 = r11.f19827r
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r11.f19826q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r12)
            goto L4e
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            java.lang.Object r1 = r11.f19826q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r12)
            goto L39
        L26:
            android.support.v4.media.session.b.K(r12)
            java.lang.Object r12 = r11.f19826q
            r1 = r12
            K0.L r1 = (K0.L) r1
            r11.f19826q = r1
            r11.f19825p = r3
            java.lang.Object r12 = z.q1.c(r1, r11, r2)
            if (r12 != r0) goto L39
            goto L4d
        L39:
            K0.u r12 = (K0.u) r12
            long r5 = r12.f3910a
            r4.h = r5
            long r5 = r12.f3912c
            r4.f19830b = r5
        L43:
            r11.f19826q = r1
            r11.f19825p = r2
            java.lang.Object r12 = A0.e.q(r1, r11)
            if (r12 != r0) goto L4e
        L4d:
            return r0
        L4e:
            K0.m r12 = (K0.C0245m) r12
            java.lang.Object r12 = r12.f3896a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r12.size()
            r3.<init>(r5)
            int r5 = r12.size()
            r6 = 0
            r7 = r6
        L61:
            if (r7 >= r5) goto L74
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            K0.u r9 = (K0.u) r9
            boolean r9 = r9.f3913d
            if (r9 == 0) goto L71
            r3.add(r8)
        L71:
            int r7 = r7 + 1
            goto L61
        L74:
            int r12 = r3.size()
        L78:
            if (r6 >= r12) goto L8f
            java.lang.Object r5 = r3.get(r6)
            r7 = r5
            K0.u r7 = (K0.u) r7
            long r7 = r7.f3910a
            long r9 = r4.h
            boolean r7 = K0.t.d(r7, r9)
            if (r7 == 0) goto L8c
            goto L90
        L8c:
            int r6 = r6 + 1
            goto L78
        L8f:
            r5 = 0
        L90:
            K0.u r5 = (K0.u) r5
            if (r5 != 0) goto L9b
            java.lang.Object r12 = Z4.n.r0(r3)
            r5 = r12
            K0.u r5 = (K0.u) r5
        L9b:
            if (r5 == 0) goto La5
            long r6 = r5.f3910a
            r4.h = r6
            long r5 = r5.f3912c
            r4.f19830b = r5
        La5:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L43
            r0 = -1
            r4.h = r0
            Y4.o r12 = Y4.o.f8736a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1873r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
