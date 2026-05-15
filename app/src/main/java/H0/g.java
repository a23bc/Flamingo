package h0;

import Y4.o;
import e5.AbstractC0870h;
import t5.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f12549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long[] f12550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f12555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ c5.d f12557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f12558y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, c5.d dVar) {
        super(dVar);
        this.f12558y = hVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        g gVar = new g(this.f12558y, dVar);
        gVar.f12557x = (c5.d) obj;
        return gVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((i) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
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
            int r3 = r0.f12556w
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.f12554u
            int r6 = r0.f12553t
            long r7 = r0.f12555v
            int r9 = r0.f12552s
            int r10 = r0.f12551r
            long[] r11 = r0.f12550q
            java.lang.Object[] r12 = r0.f12549p
            c5.d r13 = r0.f12557x
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
            c5.d r3 = r0.f12557x
            t5.i r3 = (t5.i) r3
            h0.h r6 = r0.f12558y
            t.K r6 = r6.f12559o
            java.lang.Object[] r7 = r6.f16010b
            long[] r6 = r6.f16009a
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
            r0.f12557x = r13
            r0.f12549p = r12
            r0.f12550q = r11
            r0.f12551r = r10
            r0.f12552s = r9
            r0.f12555v = r7
            r0.f12553t = r6
            r0.f12554u = r3
            r0.f12556w = r1
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
        throw new UnsupportedOperationException("Method not decompiled: h0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
