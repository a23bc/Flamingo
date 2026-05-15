package t;

import u.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16133e;

    public z(int i7) {
        this.f16129a = Q.f16032a;
        this.f16130b = AbstractC1459n.f16089a;
        if (i7 >= 0) {
            d(Q.d(i7));
        } else {
            AbstractC1525a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        r21 = r12;
        r4 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        if (((((~r8) << 6) & r8) & r21) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r38.f16133e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        if (((r38.f16129a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        r25 = 255;
        r18 = true;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r3 = r38.f16131c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r23 = 128;
        r25 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        if (java.lang.Long.compare((((long) r38.f16132d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ca, code lost:
    
        r3 = r38.f16129a;
        r6 = r38.f16131c;
        r7 = r38.f16130b;
        r8 = (r6 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
    
        if (r9 >= r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
    
        r12 = r3[r9] & r21;
        r3[r9] = (-72340172838076674L) & ((~r12) + (r12 >>> 7));
        r9 = r9 + 1;
        r15 = r15;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        r29 = r14;
        r18 = r15;
        r8 = Z4.l.k0(r3);
        r9 = r8 - 1;
        r14 = 72057594037927935L;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r8] = r3[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0111, code lost:
    
        if (r8 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0113, code lost:
    
        r9 = r8 >> 3;
        r21 = (r8 & 7) << 3;
        r12 = (r3[r9] >> r21) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0123, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        r12 = r7[r8] * r29;
        r12 = r12 ^ (r12 << 16);
        r13 = r12 >>> 7;
        r22 = c(r13);
        r13 = r13 & r6;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        if ((((r22 - r13) & r6) / 8) != (((r8 - r13) & r6) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
    
        r34 = r14;
        r3[r9] = (((long) (r12 & 127)) << r21) | (r3[r9] & (~(255 << r21)));
        r3[r3.length - 1] = (r3[0] & r34) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0168, code lost:
    
        r14 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016b, code lost:
    
        r34 = r14;
        r4 = r22 >> 3;
        r13 = r3[r4];
        r15 = (r22 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017b, code lost:
    
        if (((r13 >> r15) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017d, code lost:
    
        r30 = r6;
        r32 = r7;
        r3[r4] = ((~(255 << r15)) & r13) | (((long) (r12 & 127)) << r15);
        r3[r9] = (r3[r9] & (~(255 << r21))) | (128 << r21);
        r32[r22] = r32[r8];
        r32[r8] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a1, code lost:
    
        r30 = r6;
        r32 = r7;
        r3[r4] = ((~(255 << r15)) & r13) | (((long) (r12 & 127)) << r15);
        r4 = r32[r22];
        r32[r22] = r32[r8];
        r32[r8] = r4;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01bd, code lost:
    
        r3[r3.length - 1] = (r3[0] & r34) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r6 = r30;
        r4 = r31;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d1, code lost:
    
        r38.f16133e = t.Q.a(r38.f16131c) - r38.f16132d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01de, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e3, code lost:
    
        r25 = 255;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ea, code lost:
    
        r3 = t.Q.b(r38.f16131c);
        r4 = r38.f16129a;
        r6 = r38.f16130b;
        r7 = r38.f16131c;
        d(r3);
        r3 = r38.f16129a;
        r8 = r38.f16130b;
        r9 = r38.f16131c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0201, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0210, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & r25) >= r23) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0212, code lost:
    
        r13 = r6[r12];
        r14 = r13 * r14;
        r14 = r14 ^ (r14 << 16);
        r15 = c(r14 >>> 7);
        r20 = r3;
        r19 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r21 = (r15 & 7) << 3;
        r3 = (r20[r14] & (~(r25 << r21))) | (r3 << r21);
        r20[r14] = r3;
        r20[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0249, code lost:
    
        r20 = r3;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024d, code lost:
    
        r12 = r12 + 1;
        r4 = r19;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0254, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0258, code lost:
    
        r38.f16132d++;
        r4 = r38.f16133e;
        r5 = r38.f16129a;
        r6 = r3 >> 3;
        r7 = r5[r6];
        r9 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0270, code lost:
    
        if (((r7 >> r9) & r25) != r23) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0272, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0275, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0277, code lost:
    
        r38.f16133e = r4 - r12;
        r4 = r38.f16131c;
        r7 = (r7 & (~(r25 << r9))) | (r10 << r9);
        r5[r6] = r7;
        r5[(((r3 - 7) & r4) + (r4 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r39) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z.a(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f16131c
            int r2 = r2 >>> 7
            r2 = r2 & r4
            r5 = 0
            r6 = r5
        L14:
            long[] r7 = r0.f16129a
            int r8 = r2 >> 3
            r9 = r2 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L40:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r15 = r0.f16130b
            r15 = r15[r11]
            if (r15 != r1) goto L55
            goto L65
        L55:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L40
        L5b:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L69
            r11 = -1
        L65:
            if (r11 < 0) goto L68
            return r12
        L68:
            return r5
        L69:
            int r6 = r6 + 8
            int r2 = r2 + r6
            r2 = r2 & r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z.b(int):boolean");
    }

    public final int c(int i7) {
        int i8 = this.f16131c;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f16129a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j3 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j7 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j7 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final void d(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, Q.c(i7)) : 0;
        this.f16131c = iMax;
        if (iMax == 0) {
            jArr = Q.f16032a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Z4.l.e0(jArr, -9187201950435737472L);
        }
        this.f16129a = jArr;
        int i8 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j3)) | j3;
        this.f16133e = Q.a(this.f16131c) - this.f16132d;
        this.f16130b = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f16131c
            int r2 = r2 >>> 7
            r2 = r2 & r4
            r5 = 0
            r6 = r5
        L14:
            long[] r7 = r0.f16129a
            int r8 = r2 >> 3
            r9 = r2 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L40:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r15 = r0.f16130b
            r15 = r15[r11]
            if (r15 != r1) goto L55
            goto L65
        L55:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L40
        L5b:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L6e
            r11 = -1
        L65:
            if (r11 < 0) goto L68
            r5 = r12
        L68:
            if (r5 == 0) goto L6d
            r0.f(r11)
        L6d:
            return r5
        L6e:
            int r6 = r6 + 8
            int r2 = r2 + r6
            r2 = r2 & r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z.e(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof t.z
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            t.z r1 = (t.z) r1
            int r3 = r1.f16132d
            int r5 = r0.f16132d
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f16130b
            long[] r5 = r0.f16129a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.b(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        this.f16132d--;
        long[] jArr = this.f16129a;
        int i8 = this.f16131c;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j3 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j3;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j3;
    }

    public final int hashCode() {
        int[] iArr = this.f16130b;
        long[] jArr = this.f16129a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j3) < 128) {
                        i8 += iArr[(i7 << 3) + i10];
                    }
                    j3 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i7 == length) {
                return i8;
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            int[] r2 = r0.f16130b
            long[] r3 = r0.f16129a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = r5
            r7 = r6
        L18:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5d
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L32:
            if (r12 >= r10) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L57
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r14 = -1
            if (r7 != r14) goto L4b
            java.lang.String r2 = "..."
            r1.append(r2)
            goto L67
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r14 = ", "
            r1.append(r14)
        L52:
            r1.append(r13)
            int r7 = r7 + 1
        L57:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L5b:
            if (r10 != r11) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L18
        L62:
            java.lang.String r2 = "]"
            r1.append(r2)
        L67:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            m5.AbstractC1209k.e(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z.toString():java.lang.String");
    }

    public /* synthetic */ z() {
        this(6);
    }
}
