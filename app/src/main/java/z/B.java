package z;

import K0.C0245m;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f20595a = ((float) 0.125d) / 18;

    /* JADX WARN: Path cross not found for [B:32:0x00c9, B:38:0x00e5], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008c -> B:23:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(K0.L r17, K0.u r18, K0.EnumC0246n r19, e5.AbstractC0863a r20) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.B.a(K0.L, K0.u, K0.n, e5.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (x0.C1892b.b(K0.t.f(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(K0.L r17, long r18, e5.AbstractC0865c r20) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.B.b(K0.L, long, e5.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [m5.v] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(K0.L r9, long r10, e5.AbstractC0865c r12) {
        /*
            boolean r0 = r12 instanceof z.C2070x
            if (r0 == 0) goto L13
            r0 = r12
            z.x r0 = (z.C2070x) r0
            int r1 = r0.f20989s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20989s = r1
            goto L18
        L13:
            z.x r0 = new z.x
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f20988r
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20989s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            m5.r r9 = r0.f20987q
            m5.v r10 = r0.f20986p
            K0.u r11 = r0.f20985o
            android.support.v4.media.session.b.K(r12)     // Catch: K0.o -> La6
            goto L99
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            android.support.v4.media.session.b.K(r12)
            K0.N r12 = r9.f3846t
            K0.m r12 = r12.f3854H
            boolean r12 = e(r12, r10)
            if (r12 == 0) goto L44
            goto La5
        L44:
            K0.N r12 = r9.f3846t
            K0.m r12 = r12.f3854H
            java.lang.Object r12 = r12.f3896a
            int r2 = r12.size()
            r5 = 0
        L4f:
            if (r5 >= r2) goto L64
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            K0.u r7 = (K0.u) r7
            long r7 = r7.f3910a
            boolean r7 = K0.t.d(r7, r10)
            if (r7 == 0) goto L61
            goto L65
        L61:
            int r5 = r5 + 1
            goto L4f
        L64:
            r6 = r4
        L65:
            r11 = r6
            K0.u r11 = (K0.u) r11
            if (r11 != 0) goto L6b
            goto La5
        L6b:
            m5.v r10 = new m5.v
            r10.<init>()
            m5.v r12 = new m5.v
            r12.<init>()
            r12.f14439o = r11
            R0.S0 r2 = r9.d()
            long r5 = r2.c()
            m5.r r2 = new m5.r     // Catch: K0.o -> La6
            r2.<init>()     // Catch: K0.o -> La6
            z.y r7 = new z.y     // Catch: K0.o -> La6
            r7.<init>(r2, r12, r10, r4)     // Catch: K0.o -> La6
            r0.f20985o = r11     // Catch: K0.o -> La6
            r0.f20986p = r10     // Catch: K0.o -> La6
            r0.f20987q = r2     // Catch: K0.o -> La6
            r0.f20989s = r3     // Catch: K0.o -> La6
            java.lang.Object r9 = r9.g(r5, r7, r0)     // Catch: K0.o -> La6
            if (r9 != r1) goto L98
            return r1
        L98:
            r9 = r2
        L99:
            boolean r9 = r9.f14435o     // Catch: K0.o -> La6
            if (r9 == 0) goto La5
            java.lang.Object r9 = r10.f14439o     // Catch: K0.o -> La6
            K0.u r9 = (K0.u) r9     // Catch: K0.o -> La6
            if (r9 != 0) goto La4
            return r11
        La4:
            return r9
        La5:
            return r4
        La6:
            java.lang.Object r9 = r10.f14439o
            K0.u r9 = (K0.u) r9
            if (r9 != 0) goto Lad
            goto Lae
        Lad:
            r11 = r9
        Lae:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z.B.c(K0.L, long, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(K0.L r4, long r5, l5.InterfaceC1182c r7, e5.AbstractC0865c r8) {
        /*
            boolean r0 = r8 instanceof z.A
            if (r0 == 0) goto L13
            r0 = r8
            z.A r0 = (z.A) r0
            int r1 = r0.f20590r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20590r = r1
            goto L18
        L13:
            z.A r0 = new z.A
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20589q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20590r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            l5.c r4 = r0.f20588p
            K0.L r5 = r0.f20587o
            android.support.v4.media.session.b.K(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            android.support.v4.media.session.b.K(r8)
        L38:
            r0.f20587o = r4
            r0.f20588p = r7
            r0.f20590r = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            K0.u r8 = (K0.u) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = K0.t.c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.b(r8)
            long r5 = r8.f3910a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: z.B.d(K0.L, long, l5.c, e5.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean e(C0245m c0245m, long j3) {
        Object obj;
        ?? r62 = c0245m.f3896a;
        int size = r62.size();
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i7);
            if (K0.t.d(((K0.u) obj).f3910a, j3)) {
                break;
            }
            i7++;
        }
        K0.u uVar = (K0.u) obj;
        if (uVar != null && uVar.f3913d) {
            z6 = true;
        }
        return true ^ z6;
    }

    public static final float f(R0.S0 s02, int i7) {
        return i7 == 2 ? s02.d() * f20595a : s02.d();
    }
}
