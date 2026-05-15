package t;

import e5.AbstractC0870h;
import l0.C1159c;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C1159c f16014A;

    /* JADX INFO: renamed from: p */
    public C1159c f16015p;

    /* JADX INFO: renamed from: q */
    public M f16016q;

    /* JADX INFO: renamed from: r */
    public long[] f16017r;

    /* JADX INFO: renamed from: s */
    public int f16018s;

    /* JADX INFO: renamed from: t */
    public int f16019t;

    /* JADX INFO: renamed from: u */
    public int f16020u;

    /* JADX INFO: renamed from: v */
    public int f16021v;

    /* JADX INFO: renamed from: w */
    public long f16022w;

    /* JADX INFO: renamed from: x */
    public int f16023x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ c5.d f16024y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ M f16025z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m7, C1159c c1159c, c5.d dVar) {
        super(dVar);
        this.f16025z = m7;
        this.f16014A = c1159c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        L l = new L(this.f16025z, this.f16014A, dVar);
        l.f16024y = (c5.d) obj;
        return l;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((t5.i) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0052 -> B:48:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0054 -> B:40:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0070 -> B:45:0x0097). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            d5.a r2 = d5.EnumC0830a.f11264o
            int r3 = r0.f16023x
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2f
            if (r3 != r1) goto L27
            int r3 = r0.f16021v
            int r6 = r0.f16020u
            long r7 = r0.f16022w
            int r9 = r0.f16019t
            int r10 = r0.f16018s
            long[] r11 = r0.f16017r
            t.M r12 = r0.f16016q
            l0.c r13 = r0.f16015p
            c5.d r14 = r0.f16024y
            t5.i r14 = (t5.i) r14
            android.support.v4.media.session.b.K(r22)
            goto L97
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            android.support.v4.media.session.b.K(r22)
            c5.d r3 = r0.f16024y
            t5.i r3 = (t5.i) r3
            t.M r6 = r0.f16025z
            t.K r7 = r6.f16027p
            long[] r7 = r7.f16009a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            l0.c r9 = r0.f16014A
            r10 = r4
        L44:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La2
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r3
            r3 = r4
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L67:
            if (r3 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L97
            int r4 = r9 << 3
            int r4 = r4 + r3
            r13.f14153p = r4
            t.K r5 = r12.f16027p
            java.lang.Object[] r5 = r5.f16010b
            r4 = r5[r4]
            r0.f16024y = r14
            r0.f16015p = r13
            r0.f16016q = r12
            r0.f16017r = r11
            r0.f16018s = r10
            r0.f16019t = r9
            r0.f16022w = r7
            r0.f16020u = r6
            r0.f16021v = r3
            r0.f16023x = r1
            r14.c(r4, r0)
            d5.a r1 = d5.EnumC0830a.f11264o
            return r2
        L97:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L67
        L9a:
            if (r6 != r5) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r3 = r14
            r10 = r9
            r9 = r13
        La2:
            if (r10 == r8) goto La6
            int r10 = r10 + r1
            goto L44
        La6:
            Y4.o r1 = Y4.o.f8736a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.L.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
