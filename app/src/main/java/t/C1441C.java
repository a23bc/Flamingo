package t;

import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1441C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f15967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f15968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15971f;

    public C1441C(int i7) {
        this.f15966a = Q.f16032a;
        this.f15967b = r.f16102a;
        this.f15968c = AbstractC1525a.f17128c;
        if (i7 >= 0) {
            f(Q.d(i7));
        } else {
            AbstractC1525a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f15970e = 0;
        long[] jArr = this.f15966a;
        if (jArr != Q.f16032a) {
            Z4.l.e0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f15966a;
            int i7 = this.f15969d;
            int i8 = i7 >> 3;
            long j3 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j3)) | j3;
        }
        Z4.l.d0(this.f15968c, 0, this.f15969d);
        this.f15971f = Q.a(this.f15969d) - this.f15970e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 32
            long r1 = r18 >>> r1
            long r1 = r18 ^ r1
            int r1 = (int) r1
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f15969d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L19:
            long[] r6 = r0.f15966a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L45:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f15967b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L5c
            goto L6c
        L5c:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L45
        L62:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L70
            r10 = -1
        L6c:
            if (r10 < 0) goto L6f
            return r11
        L6f:
            return r4
        L70:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1441C.b(long):boolean");
    }

    public final int c(long j3) {
        long j7;
        int i7;
        int i8;
        long j8;
        long[] jArr;
        long[] jArr2;
        int i9;
        int i10;
        char c7 = ' ';
        int i11 = -862048943;
        int i12 = ((int) (j3 ^ (j3 >>> 32))) * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f15969d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f15966a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            int i22 = i18;
            int i23 = 0;
            long j9 = (((-i20) >> 63) & (jArr3[i19 + 1] << (64 - i20))) | (jArr3[i19] >>> i20);
            long j10 = i15;
            char c8 = c7;
            int i24 = i15;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = -9187201950435737472L;
            long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i16;
                int i25 = i11;
                if (this.f15967b[iNumberOfTrailingZeros] == j3) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i11 = i25;
            }
            int i26 = i11;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iD = d(i14);
                if (this.f15971f != 0 || ((this.f15966a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j7 = j10;
                    i7 = 1;
                    i8 = 0;
                    j8 = 128;
                } else {
                    int i27 = this.f15969d;
                    if (i27 > 8) {
                        int i28 = 8;
                        j8 = 128;
                        if (Long.compare((((long) this.f15970e) * 32) ^ Long.MIN_VALUE, (((long) i27) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f15966a;
                            int i29 = this.f15969d;
                            long[] jArr5 = this.f15967b;
                            Object[] objArr = this.f15968c;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = 0;
                            while (i31 < i30) {
                                int i32 = i28;
                                long j14 = jArr4[i31] & j12;
                                jArr4[i31] = (-72340172838076674L) & ((~j14) + (j14 >>> 7));
                                i31++;
                                i28 = i32;
                                j10 = j10;
                                j12 = -9187201950435737472L;
                            }
                            int i33 = i28;
                            j7 = j10;
                            int iK0 = Z4.l.k0(jArr4);
                            int i34 = iK0 - 1;
                            long j15 = 72057594037927935L;
                            jArr4[i34] = (jArr4[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iK0] = jArr4[0];
                            int i35 = 0;
                            while (i35 != i29) {
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                long j16 = (jArr4[i36] >> i37) & 255;
                                if (j16 != 128 && j16 == 254) {
                                    long j17 = jArr5[i35];
                                    int i38 = ((int) (j17 ^ (j17 >>> c8))) * i26;
                                    int i39 = i38 ^ (i38 << 16);
                                    int i40 = i39 >>> 7;
                                    int iD2 = d(i40);
                                    int i41 = i40 & i29;
                                    long j18 = j15;
                                    if (((iD2 - i41) & i29) / 8 == ((i35 - i41) & i29) / i33) {
                                        jArr4[i36] = (((long) (i39 & 127)) << i37) | (jArr4[i36] & (~(255 << i37)));
                                        jArr4[jArr4.length - i21] = (jArr4[i23] & j18) | Long.MIN_VALUE;
                                        i35++;
                                        c8 = c8;
                                        i33 = i33;
                                        j15 = j18;
                                    } else {
                                        int i42 = i33;
                                        char c9 = c8;
                                        int i43 = iD2 >> 3;
                                        long j19 = jArr4[i43];
                                        int i44 = (iD2 & 7) << 3;
                                        if (((j19 >> i44) & 255) == 128) {
                                            i10 = i23;
                                            i9 = i21;
                                            jArr4[i43] = (j19 & (~(255 << i44))) | (((long) (i39 & 127)) << i44);
                                            jArr4[i36] = (jArr4[i36] & (~(255 << i37))) | (128 << i37);
                                            jArr5[iD2] = jArr5[i35];
                                            jArr5[i35] = 0;
                                            objArr[iD2] = objArr[i35];
                                            objArr[i35] = null;
                                        } else {
                                            i9 = i21;
                                            i10 = i23;
                                            jArr4[i43] = (((long) (i39 & 127)) << i44) | (j19 & (~(255 << i44)));
                                            long j20 = jArr5[iD2];
                                            jArr5[iD2] = jArr5[i35];
                                            jArr5[i35] = j20;
                                            Object obj = objArr[iD2];
                                            objArr[iD2] = objArr[i35];
                                            objArr[i35] = obj;
                                            i35--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i10] & j18) | Long.MIN_VALUE;
                                        i35++;
                                        i21 = i9;
                                        c8 = c9;
                                        i33 = i42;
                                        j15 = j18;
                                        i23 = i10;
                                    }
                                } else {
                                    i35++;
                                }
                            }
                            i7 = i21;
                            i8 = i23;
                            this.f15971f = Q.a(this.f15969d) - this.f15970e;
                        }
                        iD = d(i14);
                    } else {
                        j8 = 128;
                    }
                    j7 = j10;
                    i7 = 1;
                    i8 = 0;
                    int iB = Q.b(this.f15969d);
                    long[] jArr6 = this.f15966a;
                    long[] jArr7 = this.f15967b;
                    Object[] objArr2 = this.f15968c;
                    int i45 = this.f15969d;
                    f(iB);
                    long[] jArr8 = this.f15966a;
                    long[] jArr9 = this.f15967b;
                    Object[] objArr3 = this.f15968c;
                    int i46 = this.f15969d;
                    int i47 = 0;
                    while (i47 < i45) {
                        if (((jArr6[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < j8) {
                            long j21 = jArr7[i47];
                            int i48 = ((int) ((j21 >>> c8) ^ j21)) * i26;
                            int i49 = i48 ^ (i48 << 16);
                            int iD3 = d(i49 >>> 7);
                            jArr = jArr8;
                            jArr2 = jArr6;
                            long j22 = i49 & 127;
                            int i50 = iD3 >> 3;
                            int i51 = (iD3 & 7) << 3;
                            long j23 = (jArr[i50] & (~(255 << i51))) | (j22 << i51);
                            jArr[i50] = j23;
                            jArr[(((iD3 - 7) & i46) + (i46 & 7)) >> 3] = j23;
                            jArr9[iD3] = j21;
                            objArr3[iD3] = objArr2[i47];
                        } else {
                            jArr = jArr8;
                            jArr2 = jArr6;
                        }
                        i47++;
                        jArr6 = jArr2;
                        jArr8 = jArr;
                    }
                    iD = d(i14);
                }
                this.f15970e++;
                int i52 = this.f15971f;
                long[] jArr10 = this.f15966a;
                int i53 = iD >> 3;
                long j24 = jArr10[i53];
                int i54 = (iD & 7) << 3;
                if (((j24 >> i54) & 255) == j8) {
                    i8 = i7;
                }
                this.f15971f = i52 - i8;
                int i55 = this.f15969d;
                long j25 = (j24 & (~(255 << i54))) | (j7 << i54);
                jArr10[i53] = j25;
                jArr10[(((iD - 7) & i55) + (i55 & 7)) >> 3] = j25;
                return iD;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i15 = i24;
            i11 = i26;
            c7 = c8;
        }
    }

    public final int d(int i7) {
        int i8 = this.f15969d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f15966a;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r15) {
        /*
            r14 = this;
            r0 = 32
            long r0 = r15 >>> r0
            long r0 = r0 ^ r15
            int r0 = (int) r0
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f15969d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L15:
            long[] r4 = r14.f15966a
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
        L41:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5e
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f15967b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L58
            goto L68
        L58:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L41
        L5e:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L71
            r10 = -1
        L68:
            if (r10 < 0) goto L6f
            java.lang.Object[] r0 = r14.f15968c
            r0 = r0[r10]
            return r0
        L6f:
            r0 = 0
            return r0
        L71:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1441C.e(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
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
            boolean r3 = r1 instanceof t.C1441C
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            t.C r1 = (t.C1441C) r1
            int r3 = r1.f15970e
            int r5 = r0.f15970e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f15967b
            java.lang.Object[] r5 = r0.f15968c
            long[] r6 = r0.f15966a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L87
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
            if (r11 == 0) goto L7c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L76
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L61
            java.lang.Object r14 = r1.e(r2)
            if (r14 != 0) goto L60
            boolean r2 = r1.b(r2)
            if (r2 != 0) goto L6f
        L60:
            return r4
        L61:
            java.lang.Object r2 = r1.e(r2)
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L6f
            return r4
        L6c:
            r15 = r2
            r16 = r3
        L6f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L3d
        L76:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L88
            goto L7f
        L7c:
            r15 = r2
            r16 = r3
        L7f:
            if (r8 == r7) goto L88
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L87:
            r15 = r2
        L88:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1441C.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, Q.c(i7)) : 0;
        this.f15969d = iMax;
        if (iMax == 0) {
            jArr = Q.f16032a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Z4.l.e0(jArr, -9187201950435737472L);
        }
        this.f15966a = jArr;
        int i8 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j3)) | j3;
        this.f15971f = Q.a(this.f15969d) - this.f15970e;
        this.f15967b = new long[iMax];
        this.f15968c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r15) {
        /*
            r14 = this;
            r0 = 32
            long r0 = r15 >>> r0
            long r0 = r0 ^ r15
            int r0 = (int) r0
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f15969d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L15:
            long[] r4 = r14.f15966a
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
        L41:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5e
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f15967b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L58
            goto L68
        L58:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L41
        L5e:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L9a
            r10 = -1
        L68:
            r0 = 0
            if (r10 < 0) goto L99
            int r1 = r14.f15970e
            int r1 = r1 + (-1)
            r14.f15970e = r1
            long[] r1 = r14.f15966a
            int r2 = r14.f15969d
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r5 = r5 | r7
            r1[r3] = r5
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r5
            java.lang.Object[] r1 = r14.f15968c
            r2 = r1[r10]
            r1[r10] = r0
            return r2
        L99:
            return r0
        L9a:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1441C.g(long):java.lang.Object");
    }

    public final void h(long j3, Object obj) {
        int iC = c(j3);
        this.f15967b[iC] = j3;
        this.f15968c[iC] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f15967b;
        Object[] objArr = this.f15968c;
        long[] jArr2 = this.f15966a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int iHashCode = 0;
        while (true) {
            long j3 = jArr2[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        int i10 = (i7 << 3) + i9;
                        long j7 = jArr[i10];
                        Object obj = objArr[i10];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ ((int) (j7 ^ (j7 >>> 32)));
                    }
                    j3 >>= 8;
                }
                if (i8 != 8) {
                    return iHashCode;
                }
            }
            if (i7 == length) {
                return iHashCode;
            }
            i7++;
        }
    }

    public final String toString() {
        int i7;
        int i8;
        if (this.f15970e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f15967b;
        Object[] objArr = this.f15968c;
        long[] jArr2 = this.f15966a;
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
                            Object obj = objArr[i13];
                            sb.append(j7);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i10++;
                            if (i10 < this.f15970e) {
                                sb.append(", ");
                            }
                        } else {
                            i8 = i9;
                        }
                        j3 >>= 8;
                        i12++;
                        i9 = i8;
                    }
                    int i14 = i9;
                    if (i11 != 8) {
                        break;
                    }
                    i7 = i14;
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

    public /* synthetic */ C1441C() {
        this(6);
    }
}
