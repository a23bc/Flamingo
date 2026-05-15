package t;

import u.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f16122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16125f;

    public w(int i7) {
        this.f16120a = Q.f16032a;
        int[] iArr = AbstractC1459n.f16089a;
        this.f16121b = iArr;
        this.f16122c = iArr;
        if (i7 >= 0) {
            e(Q.d(i7));
        } else {
            AbstractC1525a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f16124e = 0;
        long[] jArr = this.f16120a;
        if (jArr != Q.f16032a) {
            Z4.l.e0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16120a;
            int i7 = this.f16123d;
            int i8 = i7 >> 3;
            long j3 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j3)) | j3;
        }
        this.f16125f = Q.a(this.f16123d) - this.f16124e;
    }

    public final int b(int i7) {
        int i8 = this.f16123d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f16120a;
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

    public final int c(int i7) {
        int i8 = (-862048943) * i7;
        int i9 = i8 ^ (i8 << 16);
        int i10 = i9 & 127;
        int i11 = this.f16123d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f16120a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j3 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j7 = (((long) i10) * 72340172838076673L) ^ j3;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i12) & i11;
                if (this.f16121b[iNumberOfTrailingZeros] == i7) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int d(int i7) {
        int iC = c(i7);
        if (iC >= 0) {
            return this.f16122c[iC];
        }
        return -1;
    }

    public final void e(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, Q.c(i7)) : 0;
        this.f16123d = iMax;
        if (iMax == 0) {
            jArr = Q.f16032a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Z4.l.e0(jArr, -9187201950435737472L);
        }
        this.f16120a = jArr;
        int i8 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j3)) | j3;
        this.f16125f = Q.a(this.f16123d) - this.f16124e;
        this.f16121b = new int[iMax];
        this.f16122c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof t.w
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            t.w r1 = (t.w) r1
            int r3 = r1.f16124e
            int r5 = r0.f16124e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f16121b
            int[] r5 = r0.f16122c
            long[] r6 = r0.f16120a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L74
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.c(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f16122c
            r2 = r2[r15]
            if (r14 == r2) goto L60
        L5d:
            return r4
        L5e:
            r16 = r2
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r16
            goto L3d
        L66:
            r16 = r2
            if (r11 != r12) goto L76
            goto L6d
        L6b:
            r16 = r2
        L6d:
            if (r8 == r7) goto L76
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L74:
            r16 = r2
        L76:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: t.w.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r20 = r11;
        r3 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (((((~r7) << 6) & r7) & r20) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r37.f16125f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (((r37.f16120a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        r24 = 255;
        r31 = 1;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        r2 = r37.f16123d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r2 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        r22 = 128;
        r24 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
    
        if (java.lang.Long.compare((((long) r37.f16124e) * 32) ^ Long.MIN_VALUE, (((long) r2) * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
    
        r2 = r37.f16120a;
        r5 = r37.f16123d;
        r6 = r37.f16121b;
        r7 = r37.f16122c;
        r8 = (r5 + 7) >> 3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
    
        if (r11 >= r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        r17 = r13;
        r13 = r2[r11] & r20;
        r2[r11] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r11 = r11 + 1;
        r14 = r14;
        r13 = r17;
        r4 = r4;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
    
        r28 = r4;
        r17 = r13;
        r12 = r14;
        r3 = Z4.l.k0(r2);
        r4 = r3 - 1;
        r2[r4] = (r2[r4] & 72057594037927935L) | (-72057594037927936L);
        r2[r3] = r2[0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0116, code lost:
    
        if (r3 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0118, code lost:
    
        r4 = r3 >> 3;
        r8 = (r3 & 7) << 3;
        r13 = (r2[r4] >> r8) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0125, code lost:
    
        if (r13 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0127, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012c, code lost:
    
        if (r13 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012f, code lost:
    
        r11 = r6[r3] * r17;
        r11 = r11 ^ (r11 << 16);
        r13 = r11 >>> 7;
        r14 = b(r13);
        r13 = r13 & r5;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r3 - r13) & r5) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        r2[r4] = ((~(255 << r8)) & r2[r4]) | (((long) (r11 & 127)) << r8);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016a, code lost:
    
        r12 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
    
        r30 = r3;
        r3 = r14 >> 3;
        r12 = r2[r3];
        r4 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017f, code lost:
    
        if (((r12 >> r4) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0181, code lost:
    
        r2[r3] = ((~(255 << r4)) & r12) | (((long) (r11 & 127)) << r4);
        r2[r4] = (r2[r4] & (~(255 << r8))) | (128 << r8);
        r6[r14] = r6[r30];
        r6[r30] = 0;
        r7[r14] = r7[r30];
        r7[r30] = 0;
        r3 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ad, code lost:
    
        r2[r3] = ((~(255 << r4)) & r12) | (((long) (r11 & 127)) << r4);
        r3 = r6[r14];
        r6[r14] = r6[r30];
        r6[r30] = r3;
        r3 = r7[r14];
        r7[r14] = r7[r30];
        r7[r30] = r3;
        r3 = r30 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d1, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01df, code lost:
    
        r31 = r12;
        r37.f16125f = t.Q.a(r37.f16123d) - r37.f16124e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f0, code lost:
    
        r28 = r4;
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f7, code lost:
    
        r24 = 255;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fe, code lost:
    
        r2 = t.Q.b(r37.f16123d);
        r3 = r37.f16120a;
        r4 = r37.f16121b;
        r5 = r37.f16122c;
        r6 = r37.f16123d;
        e(r2);
        r2 = r37.f16120a;
        r7 = r37.f16121b;
        r8 = r37.f16122c;
        r11 = r37.f16123d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0218, code lost:
    
        if (r12 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0228, code lost:
    
        if (((r3[r12 >> 3] >> ((r12 & 7) << 3)) & r24) >= r22) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x022a, code lost:
    
        r13 = r4[r12];
        r14 = r13 * r13;
        r14 = r14 ^ (r14 << 16);
        r15 = b(r14 >>> 7);
        r19 = r2;
        r1 = r14 & 127;
        r14 = r15 >> 3;
        r20 = (r15 & 7) << 3;
        r1 = (r19[r14] & (~(r24 << r20))) | (r1 << r20);
        r19[r14] = r1;
        r19[(((r15 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r7[r15] = r13;
        r8[r15] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0264, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0266, code lost:
    
        r12 = r12 + 1;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026e, code lost:
    
        r2 = b(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0272, code lost:
    
        r37.f16124e++;
        r1 = r37.f16125f;
        r3 = r37.f16120a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x028a, code lost:
    
        if (((r5 >> r7) & r24) != r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x028d, code lost:
    
        r31 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x028f, code lost:
    
        r37.f16125f = r1 - r31;
        r1 = r37.f16123d;
        r5 = (r5 & (~(r24 << r7))) | (r9 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.w.f(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.f16121b;
        int[] iArr2 = this.f16122c;
        long[] jArr = this.f16120a;
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
                        int i11 = (i7 << 3) + i10;
                        i8 += iArr2[i11] ^ iArr[i11];
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f16124e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f16121b
            int[] r3 = r0.f16122c
            long[] r4 = r0.f16120a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f16124e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            m5.AbstractC1209k.e(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.w.toString():java.lang.String");
    }

    public /* synthetic */ w() {
        this(6);
    }
}
