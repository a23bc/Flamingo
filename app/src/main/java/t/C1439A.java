package t;

import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1439A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15958a = Q.f16032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f15959b = r.f16102a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f15960c = AbstractC1459n.f16089a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15963f;

    public C1439A(int i7) {
        if (i7 >= 0) {
            d(Q.d(i7));
        } else {
            AbstractC1525a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i7) {
        int i8 = this.f15961d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f15958a;
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

    public final int b(long j3) {
        int i7 = ((int) ((j3 >>> 32) ^ j3)) * (-862048943);
        int i8 = i7 ^ (i7 << 16);
        int i9 = i8 & 127;
        int i10 = this.f15961d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f15958a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (((long) i9) * 72340172838076673L) ^ j7;
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                if (this.f15959b[iNumberOfTrailingZeros] == j3) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final int c(long j3) {
        int iB = b(j3);
        if (iB >= 0) {
            return this.f15960c[iB];
        }
        AbstractC1525a.e("Cannot find value for key " + j3);
        throw null;
    }

    public final void d(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, Q.c(i7)) : 0;
        this.f15961d = iMax;
        if (iMax == 0) {
            jArr = Q.f16032a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Z4.l.e0(jArr, -9187201950435737472L);
        }
        this.f15958a = jArr;
        int i8 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j3)) | j3;
        this.f15963f = Q.a(this.f15961d) - this.f15962e;
        this.f15959b = new long[iMax];
        this.f15960c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        r1 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        if (r40.f15963f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (((r40.f15958a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        r31 = r9;
        r37 = 1;
        r36 = 0;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        r1 = r40.f15961d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        r8 = 8;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
    
        if (java.lang.Long.compare((((long) r40.f15962e) * 32) ^ Long.MIN_VALUE, (((long) r1) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
    
        r1 = r40.f15958a;
        r2 = r40.f15961d;
        r3 = r40.f15959b;
        r5 = r40.f15960c;
        r6 = (r2 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d9, code lost:
    
        if (r7 >= r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
    
        r10 = r8;
        r8 = r1[r7] & r11;
        r1[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r8 = r10;
        r9 = r9;
        r11 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fa, code lost:
    
        r12 = r8;
        r31 = r9;
        r6 = Z4.l.k0(r1);
        r7 = r6 - 1;
        r10 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0116, code lost:
    
        if (r6 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0118, code lost:
    
        r7 = r6 >> 3;
        r19 = (r6 & 7) << 3;
        r8 = (r1[r7] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0126, code lost:
    
        if (r8 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0128, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012d, code lost:
    
        if (r8 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0130, code lost:
    
        r8 = r3[r6];
        r8 = ((int) (r8 ^ (r8 >>> r13))) * r20;
        r8 = r8 ^ (r8 << 16);
        r9 = r8 >>> 7;
        r29 = a(r9);
        r9 = r9 & r2;
        r33 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014f, code lost:
    
        if ((((r29 - r9) & r2) / 8) != (((r6 - r9) & r2) / r12)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0151, code lost:
    
        r1[r7] = (((long) (r8 & 127)) << r19) | (r1[r7] & (~(255 << r19)));
        r1[r1.length - r14] = (r1[r15] & r33) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r13 = r13;
        r10 = r33;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0176, code lost:
    
        r35 = r12;
        r30 = r13;
        r9 = r29 >> 3;
        r10 = r1[r9];
        r12 = (r29 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0188, code lost:
    
        if (((r10 >> r12) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018a, code lost:
    
        r36 = r15;
        r37 = r14;
        r1[r9] = (r10 & (~(255 << r12))) | (((long) (r8 & 127)) << r12);
        r1[r7] = (r1[r7] & (~(255 << r19))) | (128 << r19);
        r3[r29] = r3[r6];
        r3[r6] = 0;
        r5[r29] = r5[r6];
        r5[r6] = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b5, code lost:
    
        r37 = r14;
        r36 = r15;
        r1[r9] = (((long) (r8 & 127)) << r12) | (r10 & (~(255 << r12)));
        r7 = r3[r29];
        r3[r29] = r3[r6];
        r3[r6] = r7;
        r7 = r5[r29];
        r5[r29] = r5[r6];
        r5[r6] = r7;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d6, code lost:
    
        r1[r1.length - 1] = (r1[r36] & r33) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r13 = r30;
        r10 = r33;
        r12 = r35;
        r15 = r36;
        r14 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ef, code lost:
    
        r37 = r14;
        r36 = r15;
        r40.f15963f = t.Q.a(r40.f15961d) - r40.f15962e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0200, code lost:
    
        r31 = r9;
        r37 = 1;
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0209, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020e, code lost:
    
        r1 = t.Q.b(r40.f15961d);
        r2 = r40.f15958a;
        r3 = r40.f15959b;
        r5 = r40.f15960c;
        r6 = r40.f15961d;
        d(r1);
        r1 = r40.f15958a;
        r7 = r40.f15959b;
        r8 = r40.f15960c;
        r9 = r40.f15961d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0229, code lost:
    
        if (r10 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0238, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r23) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023a, code lost:
    
        r11 = r3[r10];
        r13 = ((int) ((r11 >>> r13) ^ r11)) * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r17 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r18 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r18))) | (r1 << r18);
        r17[r13] = r1;
        r17[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0278, code lost:
    
        r17 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x027b, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0281, code lost:
    
        r1 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0285, code lost:
    
        r40.f15962e++;
        r2 = r40.f15963f;
        r3 = r40.f15958a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x029d, code lost:
    
        if (((r5 >> r7) & 255) != r23) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x029f, code lost:
    
        r36 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a1, code lost:
    
        r40.f15963f = r2 - r36;
        r2 = r40.f15961d;
        r5 = (r5 & (~(255 << r7))) | (r31 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r41, int r43) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1439A.e(long, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
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
            boolean r3 = r1 instanceof t.C1439A
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            t.A r1 = (t.C1439A) r1
            int r3 = r1.f15962e
            int r5 = r0.f15962e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f15959b
            int[] r5 = r0.f15960c
            long[] r6 = r0.f15958a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7a
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
            if (r11 == 0) goto L6f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L69
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5f
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            int r2 = r1.b(r2)
            if (r2 < 0) goto L5e
            int[] r3 = r1.f15960c
            r2 = r3[r2]
            if (r14 == r2) goto L62
        L5e:
            return r4
        L5f:
            r15 = r2
            r16 = r3
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L3d
        L69:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L7b
            goto L72
        L6f:
            r15 = r2
            r16 = r3
        L72:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L7a:
            r15 = r2
        L7b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1439A.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.f15959b;
        int[] iArr = this.f15960c;
        long[] jArr2 = this.f15958a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long j3 = jArr2[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j3) < 128) {
                        int i11 = (i7 << 3) + i10;
                        long j7 = jArr[i11];
                        i8 += iArr[i11] ^ ((int) (j7 ^ (j7 >>> 32)));
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

    public final String toString() {
        int i7;
        int i8;
        if (this.f15962e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f15959b;
        int[] iArr = this.f15960c;
        long[] jArr2 = this.f15958a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j3 = jArr2[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j3) < 128) {
                            int i13 = (i9 << 3) + i12;
                            i8 = i9;
                            long j7 = jArr[i13];
                            int i14 = iArr[i13];
                            sb.append(j7);
                            sb.append("=");
                            sb.append(i14);
                            i10++;
                            if (i10 < this.f15962e) {
                                sb.append(", ");
                            }
                        } else {
                            i8 = i9;
                        }
                        j3 >>= 8;
                        i12++;
                        i9 = i8;
                    }
                    int i15 = i9;
                    if (i11 != 8) {
                        break;
                    }
                    i7 = i15;
                } else {
                    i7 = i9;
                }
                if (i7 == length) {
                    break;
                }
                i9 = i7 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
