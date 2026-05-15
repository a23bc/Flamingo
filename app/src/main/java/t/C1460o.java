package t;

import e5.AbstractC0870h;

/* JADX INFO: renamed from: t.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1460o extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p */
    public Object[] f16090p;

    /* JADX INFO: renamed from: q */
    public long[] f16091q;

    /* JADX INFO: renamed from: r */
    public int f16092r;

    /* JADX INFO: renamed from: s */
    public int f16093s;

    /* JADX INFO: renamed from: t */
    public int f16094t;

    /* JADX INFO: renamed from: u */
    public int f16095u;

    /* JADX INFO: renamed from: v */
    public long f16096v;

    /* JADX INFO: renamed from: w */
    public int f16097w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ c5.d f16098x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1453h f16099y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460o(C1453h c1453h, c5.d dVar) {
        super(dVar);
        this.f16099y = c1453h;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1460o c1460o = new C1460o(this.f16099y, dVar);
        c1460o.f16098x = (c5.d) obj;
        return c1460o;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1460o) create((t5.i) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x004f -> B:48:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0051 -> B:40:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x006b -> B:45:0x008a). Please report as a decompilation issue!!! */
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
            int r3 = r0.f16097w
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.f16095u
            int r6 = r0.f16094t
            long r7 = r0.f16096v
            int r9 = r0.f16093s
            int r10 = r0.f16092r
            long[] r11 = r0.f16091q
            java.lang.Object[] r12 = r0.f16090p
            c5.d r13 = r0.f16098x
            t5.i r13 = (t5.i) r13
            android.support.v4.media.session.b.K(r21)
            goto L8a
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            android.support.v4.media.session.b.K(r21)
            c5.d r3 = r0.f16098x
            t5.i r3 = (t5.i) r3
            t.h r6 = r0.f16099y
            t.J r6 = r6.f16079p
            java.lang.Object[] r7 = r6.f16004b
            long[] r6 = r6.f16003a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L97
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L93
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r3 >= r6) goto L8d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8a
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.f16098x = r13
            r0.f16090p = r12
            r0.f16091q = r11
            r0.f16092r = r10
            r0.f16093s = r9
            r0.f16096v = r7
            r0.f16094t = r6
            r0.f16095u = r3
            r0.f16097w = r1
            r13.c(r4, r0)
            d5.a r1 = d5.EnumC0830a.f11264o
            return r2
        L8a:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L62
        L8d:
            if (r6 != r5) goto L97
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L93:
            if (r9 == r8) goto L97
            int r9 = r9 + r1
            goto L41
        L97:
            Y4.o r1 = Y4.o.f8736a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1460o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
