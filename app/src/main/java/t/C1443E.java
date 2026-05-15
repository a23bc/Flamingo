package t;

import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1443E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f15979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15982f;

    public C1443E(int i7) {
        this.f15977a = Q.f16032a;
        this.f15978b = AbstractC1525a.f17128c;
        this.f15979c = AbstractC1459n.f16089a;
        if (i7 >= 0) {
            f(Q.d(i7));
        } else {
            AbstractC1525a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f15981e = 0;
        long[] jArr = this.f15977a;
        if (jArr != Q.f16032a) {
            Z4.l.e0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f15977a;
            int i7 = this.f15980d;
            int i8 = i7 >> 3;
            long j3 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j3)) | j3;
        }
        Z4.l.d0(this.f15978b, 0, this.f15980d);
        this.f15982f = Q.a(this.f15980d) - this.f15981e;
    }

    public final int b(int i7) {
        int i8 = this.f15980d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f15977a;
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

    public final int c(Object obj) {
        long j3;
        long j7;
        long j8;
        long[] jArr;
        long[] jArr2;
        int i7;
        Object[] objArr;
        int i8 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f15980d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.f15977a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j10 = i11;
            int i17 = i11;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
                int i18 = i8;
                if (AbstractC1209k.a(this.f15978b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i8 = i18;
            }
            int i19 = i8;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iB = b(i10);
                long j13 = 255;
                if (this.f15982f != 0 || ((this.f15977a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j7 = j10;
                    j8 = 128;
                } else {
                    int i20 = this.f15980d;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (Long.compare((((long) this.f15981e) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f15977a;
                            int i22 = this.f15980d;
                            Object[] objArr2 = this.f15978b;
                            int[] iArr = this.f15979c;
                            j8 = 128;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            while (i24 < i23) {
                                long j14 = j13;
                                long j15 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i24++;
                                i21 = i21;
                                j10 = j10;
                                j13 = j14;
                            }
                            j3 = j13;
                            j7 = j10;
                            int i25 = i21;
                            int iK0 = Z4.l.k0(jArr4);
                            int i26 = iK0 - 1;
                            long j16 = 72057594037927935L;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iK0] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j17 = (jArr4[i28] >> i29) & j3;
                                if (j17 != 128 && j17 == 254) {
                                    Object obj2 = objArr2[i27];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i31 = i30 >>> 7;
                                    int iB2 = b(i31);
                                    int i32 = i31 & i22;
                                    long j18 = j16;
                                    if (((iB2 - i32) & i22) / 8 == ((i27 - i32) & i22) / i25) {
                                        jArr4[i28] = (((long) (i30 & 127)) << i29) | (jArr4[i28] & (~(j3 << i29)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i27++;
                                        j16 = j18;
                                        i25 = i25;
                                    } else {
                                        int i33 = i25;
                                        int i34 = iB2 >> 3;
                                        long j19 = jArr4[i34];
                                        int i35 = (iB2 & 7) << 3;
                                        if (((j19 >> i35) & j3) == 128) {
                                            i7 = i22;
                                            objArr = objArr2;
                                            jArr4[i34] = ((~(j3 << i35)) & j19) | (((long) (i30 & 127)) << i35);
                                            jArr4[i28] = (jArr4[i28] & (~(j3 << i29))) | (128 << i29);
                                            objArr[iB2] = objArr[i27];
                                            objArr[i27] = null;
                                            iArr[iB2] = iArr[i27];
                                            iArr[i27] = 0;
                                        } else {
                                            i7 = i22;
                                            objArr = objArr2;
                                            jArr4[i34] = (((long) (i30 & 127)) << i35) | ((~(j3 << i35)) & j19);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i27];
                                            objArr[i27] = obj3;
                                            int i36 = iArr[iB2];
                                            iArr[iB2] = iArr[i27];
                                            iArr[i27] = i36;
                                            i27--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i27++;
                                        i22 = i7;
                                        j16 = j18;
                                        i25 = i33;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.f15982f = Q.a(this.f15980d) - this.f15981e;
                        }
                        iB = b(i10);
                    }
                    j3 = 255;
                    j7 = j10;
                    j8 = 128;
                    int iB3 = Q.b(this.f15980d);
                    long[] jArr5 = this.f15977a;
                    Object[] objArr3 = this.f15978b;
                    int[] iArr2 = this.f15979c;
                    int i37 = this.f15980d;
                    f(iB3);
                    long[] jArr6 = this.f15977a;
                    Object[] objArr4 = this.f15978b;
                    int[] iArr3 = this.f15979c;
                    int i38 = this.f15980d;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i19;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i40 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j20 = i40 & 127;
                            int i41 = iB4 >> 3;
                            int i42 = (iB4 & 7) << 3;
                            long j21 = (jArr[i41] & (~(255 << i42))) | (j20 << i42);
                            jArr[i41] = j21;
                            jArr[(((iB4 - 7) & i38) + (i38 & 7)) >> 3] = j21;
                            objArr4[iB4] = obj4;
                            iArr3[iB4] = iArr2[i39];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i39++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iB = b(i10);
                }
                this.f15981e++;
                int i43 = this.f15982f;
                long[] jArr7 = this.f15977a;
                int i44 = iB >> 3;
                long j22 = jArr7[i44];
                int i45 = (iB & 7) << 3;
                this.f15982f = i43 - (((j22 >> i45) & j3) == j8 ? 1 : 0);
                int i46 = this.f15980d;
                long j23 = (j22 & (~(j3 << i45))) | (j7 << i45);
                jArr7[i44] = j23;
                jArr7[(((iB - 7) & i46) + (i46 & 7)) >> 3] = j23;
                return ~iB;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i8 = i19;
        }
    }

    public final int d(Object obj) {
        int i7 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f15980d;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.f15977a;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j3 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j7 = (((long) i9) * 72340172838076673L) ^ j3;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i12) & i10;
                if (AbstractC1209k.a(this.f15978b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i11 = i12 + i7;
        }
    }

    public final int e(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f15979c[iD];
        }
        AbstractC1525a.e("There is no key " + obj + " in the map");
        throw null;
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
            boolean r3 = r1 instanceof t.C1443E
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            t.E r1 = (t.C1443E) r1
            int r3 = r1.f15981e
            int r5 = r0.f15981e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f15978b
            int[] r5 = r0.f15979c
            long[] r6 = r0.f15977a
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
            int r15 = r1.d(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f15979c
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
        throw new UnsupportedOperationException("Method not decompiled: t.C1443E.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, Q.c(i7)) : 0;
        this.f15980d = iMax;
        if (iMax == 0) {
            jArr = Q.f16032a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Z4.l.e0(jArr, -9187201950435737472L);
        }
        this.f15977a = jArr;
        int i8 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j3)) | j3;
        this.f15982f = Q.a(this.f15980d) - this.f15981e;
        this.f15978b = new Object[iMax];
        this.f15979c = new int[iMax];
    }

    public final void g(int i7) {
        this.f15981e--;
        long[] jArr = this.f15977a;
        int i8 = this.f15980d;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j3 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j3;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j3;
        this.f15978b[i7] = null;
    }

    public final void h(int i7, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f15978b[iC] = obj;
        this.f15979c[iC] = i7;
    }

    public final int hashCode() {
        Object[] objArr = this.f15978b;
        int[] iArr = this.f15979c;
        long[] jArr = this.f15977a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int iHashCode = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        int i10 = (i7 << 3) + i9;
                        Object obj = objArr[i10];
                        iHashCode += iArr[i10] ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f15981e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f15978b
            int[] r3 = r0.f15979c
            long[] r4 = r0.f15977a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
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
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f15981e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            m5.AbstractC1209k.e(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1443E.toString():java.lang.String");
    }

    public /* synthetic */ C1443E() {
        this(6);
    }
}
