package t;

import u.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC1457l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16128f;

    public y(int i7) {
        this.f16083a = Q.f16032a;
        this.f16084b = AbstractC1459n.f16089a;
        this.f16085c = AbstractC1525a.f17128c;
        if (i7 >= 0) {
            f(Q.d(i7));
        } else {
            AbstractC1525a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f16087e = 0;
        long[] jArr = this.f16083a;
        if (jArr != Q.f16032a) {
            Z4.l.e0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16083a;
            int i7 = this.f16086d;
            int i8 = i7 >> 3;
            long j3 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j3)) | j3;
        }
        Z4.l.d0(this.f16085c, 0, this.f16086d);
        this.f16128f = Q.a(this.f16086d) - this.f16087e;
    }

    public final int d(int i7) {
        long j3;
        int i8;
        long j7;
        long[] jArr;
        long[] jArr2;
        long j8;
        int i9;
        int i10;
        int i11 = -862048943;
        int i12 = i7 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f16086d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f16083a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            int i22 = i18;
            long j9 = (((-i20) >> 63) & (jArr3[i19 + 1] << (64 - i20))) | (jArr3[i19] >>> i20);
            long j10 = i15;
            int i23 = i11;
            int i24 = i15;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = -9187201950435737472L;
            long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i16;
                long j14 = j12;
                if (this.f16084b[iNumberOfTrailingZeros] == i7) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                j12 = j14;
            }
            long j15 = j12;
            if ((((~j9) << 6) & j9 & j15) != 0) {
                int iE = e(i14);
                long j16 = 255;
                if (this.f16128f != 0 || ((this.f16083a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    i8 = 1;
                    j7 = 128;
                } else {
                    int i25 = this.f16086d;
                    if (i25 > 8) {
                        j7 = 128;
                        if (Long.compare((((long) this.f16087e) * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f16083a;
                            int i26 = this.f16086d;
                            int[] iArr = this.f16084b;
                            Object[] objArr = this.f16085c;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            while (i28 < i27) {
                                long j17 = j16;
                                long j18 = jArr4[i28] & j15;
                                jArr4[i28] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i28++;
                                i21 = i21;
                                i23 = i23;
                                j16 = j17;
                            }
                            j3 = j16;
                            int i29 = i23;
                            int i30 = i21;
                            int iK0 = Z4.l.k0(jArr4);
                            int i31 = iK0 - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i31] = (jArr4[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iK0] = jArr4[0];
                            int i32 = 0;
                            while (i32 != i26) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j20 = (jArr4[i33] >> i34) & j3;
                                if (j20 != 128 && j20 == 254) {
                                    int i35 = iArr[i32] * i29;
                                    int i36 = i35 ^ (i35 << 16);
                                    int i37 = i36 >>> 7;
                                    int iE2 = e(i37);
                                    int i38 = i37 & i26;
                                    int i39 = i30;
                                    if (((iE2 - i38) & i26) / 8 == ((i32 - i38) & i26) / 8) {
                                        j8 = j19;
                                        jArr4[i33] = (((long) (i36 & 127)) << i34) | (jArr4[i33] & (~(j3 << i34)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j8) | Long.MIN_VALUE;
                                        i32++;
                                    } else {
                                        j8 = j19;
                                        int i40 = iE2 >> 3;
                                        long j21 = jArr4[i40];
                                        int i41 = (iE2 & 7) << 3;
                                        if (((j21 >> i41) & j3) == 128) {
                                            i9 = i26;
                                            int i42 = i32;
                                            jArr4[i40] = ((~(j3 << i41)) & j21) | (((long) (i36 & 127)) << i41);
                                            jArr4[i33] = (jArr4[i33] & (~(j3 << i34))) | (128 << i34);
                                            iArr[iE2] = iArr[i42];
                                            iArr[i42] = 0;
                                            objArr[iE2] = objArr[i42];
                                            objArr[i42] = null;
                                            i10 = i42;
                                        } else {
                                            i9 = i26;
                                            int i43 = i32;
                                            jArr4[i40] = ((~(j3 << i41)) & j21) | (((long) (i36 & 127)) << i41);
                                            int i44 = iArr[iE2];
                                            iArr[iE2] = iArr[i43];
                                            iArr[i43] = i44;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i43];
                                            objArr[i43] = obj;
                                            i10 = i43 - 1;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j8) | Long.MIN_VALUE;
                                        i32 = i10 + 1;
                                        i26 = i9;
                                    }
                                    i30 = i39;
                                    j19 = j8;
                                } else {
                                    i32++;
                                }
                            }
                            i8 = i30;
                            this.f16128f = Q.a(this.f16086d) - this.f16087e;
                        }
                        iE = e(i14);
                    } else {
                        j7 = 128;
                    }
                    j3 = 255;
                    i8 = 1;
                    int iB = Q.b(this.f16086d);
                    long[] jArr5 = this.f16083a;
                    int[] iArr2 = this.f16084b;
                    Object[] objArr2 = this.f16085c;
                    int i45 = this.f16086d;
                    f(iB);
                    long[] jArr6 = this.f16083a;
                    int[] iArr3 = this.f16084b;
                    Object[] objArr3 = this.f16085c;
                    int i46 = this.f16086d;
                    int i47 = 0;
                    while (i47 < i45) {
                        if (((jArr5[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < j7) {
                            int i48 = iArr2[i47];
                            int i49 = i48 * i23;
                            int i50 = i49 ^ (i49 << 16);
                            int iE3 = e(i50 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j22 = i50 & 127;
                            int i51 = iE3 >> 3;
                            int i52 = (iE3 & 7) << 3;
                            long j23 = (jArr[i51] & (~(255 << i52))) | (j22 << i52);
                            jArr[i51] = j23;
                            jArr[(((iE3 - 7) & i46) + (i46 & 7)) >> 3] = j23;
                            iArr3[iE3] = i48;
                            objArr3[iE3] = objArr2[i47];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i47++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i14);
                }
                this.f16087e++;
                int i53 = this.f16128f;
                long[] jArr7 = this.f16083a;
                int i54 = iE >> 3;
                long j24 = jArr7[i54];
                int i55 = (iE & 7) << 3;
                this.f16128f = i53 - (((j24 >> i55) & j3) == j7 ? i8 : 0);
                int i56 = this.f16086d;
                long j25 = (j24 & (~(j3 << i55))) | (j10 << i55);
                jArr7[i54] = j25;
                jArr7[(((iE - 7) & i56) + (i56 & 7)) >> 3] = j25;
                return iE;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i15 = i24;
            i11 = i23;
        }
    }

    public final int e(int i7) {
        int i8 = this.f16086d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f16083a;
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

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, Q.c(i7)) : 0;
        this.f16086d = iMax;
        if (iMax == 0) {
            jArr = Q.f16032a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Z4.l.e0(jArr, -9187201950435737472L);
        }
        this.f16083a = jArr;
        int i8 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j3)) | j3;
        this.f16128f = Q.a(this.f16086d) - this.f16087e;
        this.f16084b = new int[iMax];
        this.f16085c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r14
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f16086d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        Lf:
            long[] r4 = r13.f16083a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3b:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L56
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f16084b
            r11 = r11[r10]
            if (r11 != r14) goto L50
            goto L60
        L50:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3b
        L56:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L92
            r10 = -1
        L60:
            r14 = 0
            if (r10 < 0) goto L91
            int r0 = r13.f16087e
            int r0 = r0 + (-1)
            r13.f16087e = r0
            long[] r0 = r13.f16083a
            int r1 = r13.f16086d
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r4 = r4 | r6
            r0[r2] = r4
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r4
            java.lang.Object[] r0 = r13.f16085c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L91:
            return r14
        L92:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: t.y.g(int):java.lang.Object");
    }

    public final void h(int i7, Object obj) {
        int iD = d(i7);
        this.f16084b[iD] = i7;
        this.f16085c[iD] = obj;
    }

    public /* synthetic */ y() {
        this(6);
    }
}
