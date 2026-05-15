package t;

import O0.C0;
import e5.AbstractC0870h;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f16041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long[] f16042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16045t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16046u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f16047v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ c5.d f16049x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0 f16050y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C0 c02, c5.d dVar) {
        super(dVar);
        this.f16050y = c02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        V v3 = new V(this.f16050y, dVar);
        v3.f16049x = (c5.d) obj;
        return v3;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((t5.i) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:22:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x008c). Please report as a decompilation issue!!! */
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
            int r3 = r0.f16048w
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.f16046u
            int r6 = r0.f16045t
            long r7 = r0.f16047v
            int r9 = r0.f16044s
            int r10 = r0.f16043r
            long[] r11 = r0.f16042q
            java.lang.Object[] r12 = r0.f16041p
            c5.d r13 = r0.f16049x
            t5.i r13 = (t5.i) r13
            android.support.v4.media.session.b.K(r21)
            goto L8c
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            android.support.v4.media.session.b.K(r21)
            c5.d r3 = r0.f16049x
            t5.i r3 = (t5.i) r3
            O0.C0 r6 = r0.f16050y
            java.lang.Object r6 = r6.f5286p
            t.J r6 = (t.J) r6
            java.lang.Object[] r7 = r6.f16005c
            long[] r6 = r6.f16003a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L99
            r9 = r4
        L43:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L95
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
        L64:
            if (r3 >= r6) goto L8f
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8c
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.f16049x = r13
            r0.f16041p = r12
            r0.f16042q = r11
            r0.f16043r = r10
            r0.f16044s = r9
            r0.f16047v = r7
            r0.f16045t = r6
            r0.f16046u = r3
            r0.f16048w = r1
            r13.c(r4, r0)
            d5.a r1 = d5.EnumC0830a.f11264o
            return r2
        L8c:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L64
        L8f:
            if (r6 != r5) goto L99
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L95:
            if (r9 == r8) goto L99
            int r9 = r9 + r1
            goto L43
        L99:
            Y4.o r1 = Y4.o.f8736a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.V.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
