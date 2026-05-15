package t;

import e5.AbstractC0870h;

/* JADX INFO: renamed from: t.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1452g extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p */
    public C1453h f16068p;

    /* JADX INFO: renamed from: q */
    public long[] f16069q;

    /* JADX INFO: renamed from: r */
    public int f16070r;

    /* JADX INFO: renamed from: s */
    public int f16071s;

    /* JADX INFO: renamed from: t */
    public int f16072t;

    /* JADX INFO: renamed from: u */
    public int f16073u;

    /* JADX INFO: renamed from: v */
    public long f16074v;

    /* JADX INFO: renamed from: w */
    public int f16075w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ c5.d f16076x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1453h f16077y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1452g(C1453h c1453h, c5.d dVar) {
        super(dVar);
        this.f16077y = c1453h;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1452g c1452g = new C1452g(this.f16077y, dVar);
        c1452g.f16076x = (c5.d) obj;
        return c1452g;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1452g) create((t5.i) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x004e -> B:48:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0050 -> B:40:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x006b -> B:45:0x0097). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            d5.a r2 = d5.EnumC0830a.f11264o
            int r3 = r0.f16075w
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2d
            if (r3 != r1) goto L25
            int r3 = r0.f16073u
            int r6 = r0.f16072t
            long r7 = r0.f16074v
            int r9 = r0.f16071s
            int r10 = r0.f16070r
            long[] r11 = r0.f16069q
            t.h r12 = r0.f16068p
            c5.d r13 = r0.f16076x
            t5.i r13 = (t5.i) r13
            android.support.v4.media.session.b.K(r21)
            goto L97
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            android.support.v4.media.session.b.K(r21)
            c5.d r3 = r0.f16076x
            t5.i r3 = (t5.i) r3
            t.h r6 = r0.f16077y
            t.J r7 = r6.f16079p
            long[] r7 = r7.f16003a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La4
            r9 = r4
        L40:
            r10 = r7[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r12
            r12 = r6
            r6 = r13
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r7
            r10 = r8
            r7 = r18
        L62:
            if (r3 >= r6) goto L9a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L97
            int r4 = r9 << 3
            int r4 = r4 + r3
            k0.a r5 = new k0.a
            t.J r14 = r12.f16079p
            java.lang.Object[] r15 = r14.f16004b
            r15 = r15[r4]
            java.lang.Object[] r14 = r14.f16005c
            r4 = r14[r4]
            r5.<init>(r15, r1, r4)
            r0.f16076x = r13
            r0.f16068p = r12
            r0.f16069q = r11
            r0.f16070r = r10
            r0.f16071s = r9
            r0.f16074v = r7
            r0.f16072t = r6
            r0.f16073u = r3
            r0.f16075w = r1
            r13.c(r5, r0)
            d5.a r1 = d5.EnumC0830a.f11264o
            return r2
        L97:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L62
        L9a:
            if (r6 != r5) goto La4
            r8 = r10
            r7 = r11
            r6 = r12
            r3 = r13
        La0:
            if (r9 == r8) goto La4
            int r9 = r9 + r1
            goto L40
        La4:
            Y4.o r1 = Y4.o.f8736a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1452g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
