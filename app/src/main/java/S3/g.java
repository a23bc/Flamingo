package s3;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f15900c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15898a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15899b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15901d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15902e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15903f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15904g = 0;
    public float h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15905i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15906j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15907k = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v2.C1634a a() {
        /*
            r13 = this;
            float r0 = r13.h
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 5
            r7 = 4
            if (r2 == 0) goto L11
            goto L1c
        L11:
            int r0 = r13.f15901d
            if (r0 == r7) goto L1b
            if (r0 == r6) goto L19
            r0 = r4
            goto L1c
        L19:
            r0 = r5
            goto L1c
        L1b:
            r0 = r3
        L1c:
            int r2 = r13.f15905i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r2 == r8) goto L26
            goto L35
        L26:
            int r2 = r13.f15901d
            if (r2 == r11) goto L34
            if (r2 == r9) goto L32
            if (r2 == r7) goto L34
            if (r2 == r6) goto L32
            r2 = r11
            goto L35
        L32:
            r2 = r10
            goto L35
        L34:
            r2 = 0
        L35:
            v2.a r8 = new v2.a
            r8.<init>()
            int r12 = r13.f15901d
            if (r12 == r11) goto L53
            if (r12 == r10) goto L50
            if (r12 == r9) goto L4d
            if (r12 == r7) goto L53
            if (r12 == r6) goto L4d
            java.lang.String r6 = "Unknown textAlignment: "
            n1.c.x(r12, r6)
            r6 = 0
            goto L55
        L4d:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L55
        L50:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L55
        L53:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
        L55:
            r8.f18224c = r6
            float r6 = r13.f15902e
            int r7 = r13.f15903f
            int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r9 == 0) goto L6b
            if (r7 != 0) goto L6b
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L69
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 <= 0) goto L6b
        L69:
            r1 = r5
            goto L72
        L6b:
            if (r9 == 0) goto L6f
            r1 = r6
            goto L72
        L6f:
            if (r7 != 0) goto L72
            goto L69
        L72:
            r8.f18226e = r1
            r8.f18227f = r7
            int r1 = r13.f15904g
            r8.f18228g = r1
            r8.h = r0
            r8.f18229i = r2
            float r1 = r13.f15906j
            if (r2 == 0) goto L9d
            if (r2 == r11) goto L91
            if (r2 != r10) goto L87
            goto L9f
        L87:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            throw r0
        L91:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 > 0) goto L99
            float r0 = r0 * r3
            goto L9f
        L99:
            float r5 = r5 - r0
            float r0 = r5 * r3
            goto L9f
        L9d:
            float r0 = r5 - r0
        L9f:
            float r0 = java.lang.Math.min(r1, r0)
            r8.l = r0
            int r0 = r13.f15907k
            r8.f18235p = r0
            java.lang.CharSequence r0 = r13.f15900c
            if (r0 == 0) goto Laf
            r8.f18222a = r0
        Laf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.g.a():v2.a");
    }
}
