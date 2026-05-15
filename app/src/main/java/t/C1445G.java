package t;

import java.util.Arrays;
import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1445G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15986a = Q.f16032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15987b = AbstractC1525a.f17128c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f15988c = AbstractC1464t.f16108b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15989d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15990e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15992g;
    public int h;

    public C1445G(int i7) {
        if (i7 >= 0) {
            f(Q.d(i7));
        } else {
            AbstractC1525a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i7 = this.f15992g;
        int iD = d(obj);
        this.f15987b[iD] = obj;
        long[] jArr = this.f15988c;
        int i8 = this.f15989d;
        jArr[iD] = (((long) i8) & 2147483647L) | 4611686016279904256L;
        if (i8 != Integer.MAX_VALUE) {
            jArr[i8] = ((2147483647L & ((long) iD)) << 31) | (jArr[i8] & (-4611686016279904257L));
        }
        this.f15989d = iD;
        if (this.f15990e == Integer.MAX_VALUE) {
            this.f15990e = iD;
        }
        return this.f15992g != i7;
    }

    public final void b() {
        this.f15992g = 0;
        long[] jArr = this.f15986a;
        if (jArr != Q.f16032a) {
            Z4.l.e0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f15986a;
            int i7 = this.f15991f;
            int i8 = i7 >> 3;
            long j3 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j3)) | j3;
        }
        Z4.l.d0(this.f15987b, 0, this.f15991f);
        Z4.l.e0(this.f15988c, 4611686018427387903L);
        this.f15989d = Integer.MAX_VALUE;
        this.f15990e = Integer.MAX_VALUE;
        this.h = Q.a(this.f15991f) - this.f15992g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f15991f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f15986a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f15987b
            r15 = r15[r11]
            boolean r15 = m5.AbstractC1209k.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1445G.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i7;
        long j3;
        long j7;
        long j8;
        char c7;
        long[] jArr;
        long[] jArr2;
        long j9;
        int i8 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f15991f;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.f15986a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j11 = i11;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                int i17 = i8;
                if (AbstractC1209k.a(this.f15987b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i8 = i17;
            }
            int i18 = i8;
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i10);
                long j14 = 255;
                if (this.h != 0 || ((this.f15986a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i7 = 0;
                    j3 = j11;
                    j7 = 255;
                    j8 = 128;
                } else {
                    int i19 = this.f15991f;
                    if (i19 > 8) {
                        c7 = 31;
                        j8 = 128;
                        if (Long.compare((((long) this.f15992g) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f15986a;
                            if (jArr4 == null) {
                                i7 = 0;
                                j3 = j11;
                                j7 = 255;
                            } else {
                                int i20 = this.f15991f;
                                Object[] objArr = this.f15987b;
                                long[] jArr5 = this.f15988c;
                                long[] jArr6 = new long[i20];
                                Arrays.fill(jArr6, 0, i20, 9223372034707292159L);
                                i7 = 0;
                                int i21 = (i20 + 7) >> 3;
                                int i22 = 0;
                                while (i22 < i21) {
                                    long j15 = j14;
                                    long j16 = jArr4[i22] & (-9187201950435737472L);
                                    int i23 = i22;
                                    jArr4[i23] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                                    i22 = i23 + 1;
                                    j14 = j15;
                                }
                                j7 = j14;
                                int length = jArr4.length;
                                int i24 = length - 1;
                                int i25 = length - 2;
                                jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i24] = jArr4[0];
                                int i26 = 0;
                                while (i26 != i20) {
                                    int i27 = i26 >> 3;
                                    int i28 = (i26 & 7) << 3;
                                    long j17 = (jArr4[i27] >> i28) & j7;
                                    if (j17 != 128 && j17 == 254) {
                                        Object obj2 = objArr[i26];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i18;
                                        int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i30 = i29 >>> 7;
                                        int iE2 = e(i30);
                                        int i31 = i30 & i20;
                                        if (((iE2 - i31) & i20) / 8 == ((i26 - i31) & i20) / 8) {
                                            int i32 = i20;
                                            Object[] objArr2 = objArr;
                                            jArr4[i27] = (jArr4[i27] & (~(j7 << i28))) | (((long) (i29 & 127)) << i28);
                                            if (jArr6[i26] == 9223372034707292159L) {
                                                long j18 = i26;
                                                jArr6[i26] = j18 | (j18 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i26++;
                                            i20 = i32;
                                            objArr = objArr2;
                                        } else {
                                            int i33 = i20;
                                            Object[] objArr3 = objArr;
                                            int i34 = iE2 >> 3;
                                            long j19 = jArr4[i34];
                                            int i35 = (iE2 & 7) << 3;
                                            if (((j19 >> i35) & j7) == 128) {
                                                jArr4[i34] = (j19 & (~(j7 << i35))) | (((long) (i29 & 127)) << i35);
                                                jArr4[i27] = (jArr4[i27] & (~(j7 << i28))) | (128 << i28);
                                                objArr3[iE2] = objArr3[i26];
                                                objArr3[i26] = null;
                                                jArr5[iE2] = jArr5[i26];
                                                jArr5[i26] = 4611686018427387903L;
                                                int i36 = (int) ((jArr6[i26] >> 32) & 4294967295L);
                                                int i37 = Integer.MAX_VALUE;
                                                if (i36 != Integer.MAX_VALUE) {
                                                    j9 = j11;
                                                    jArr6[i36] = ((long) iE2) | (jArr6[i36] & (-4294967296L));
                                                    jArr6[i26] = (jArr6[i26] & 4294967295L) | (-4294967296L);
                                                    i37 = Integer.MAX_VALUE;
                                                } else {
                                                    j9 = j11;
                                                    jArr6[i26] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr6[iE2] = (((long) i26) << 32) | ((long) i37);
                                            } else {
                                                j9 = j11;
                                                jArr4[i34] = (((long) (i29 & 127)) << i35) | (j19 & (~(j7 << i35)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i26];
                                                objArr3[i26] = obj3;
                                                long j20 = jArr5[iE2];
                                                jArr5[iE2] = jArr5[i26];
                                                jArr5[i26] = j20;
                                                int i38 = (int) ((jArr6[i26] >> 32) & 4294967295L);
                                                if (i38 != Integer.MAX_VALUE) {
                                                    long j21 = iE2;
                                                    jArr6[i38] = (jArr6[i38] & (-4294967296L)) | j21;
                                                    jArr6[i26] = (jArr6[i26] & 4294967295L) | (j21 << 32);
                                                } else {
                                                    long j22 = iE2;
                                                    jArr6[i26] = j22 | (j22 << 32);
                                                    i38 = i26;
                                                }
                                                jArr6[iE2] = (((long) i38) << 32) | ((long) i26);
                                                i26--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i26++;
                                            i20 = i33;
                                            objArr = objArr3;
                                            j11 = j9;
                                        }
                                    } else {
                                        i26++;
                                    }
                                }
                                j3 = j11;
                                this.h = Q.a(this.f15991f) - this.f15992g;
                                long[] jArr7 = this.f15988c;
                                int length2 = jArr7.length;
                                for (int i39 = 0; i39 < length2; i39++) {
                                    long j23 = jArr7[i39];
                                    int i40 = (int) ((j23 >> 31) & 2147483647L);
                                    int i41 = (int) (j23 & 2147483647L);
                                    jArr7[i39] = (((j23 & (-4611686018427387904L)) | ((long) (i40 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i40] & 4294967295L)))) << 31) | ((long) (i41 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i41] & 4294967295L)));
                                }
                                int i42 = this.f15989d;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f15989d = (int) (jArr6[i42] & 4294967295L);
                                }
                                int i43 = this.f15990e;
                                if (i43 != Integer.MAX_VALUE) {
                                    this.f15990e = (int) (jArr6[i43] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i10);
                    } else {
                        c7 = 31;
                        j8 = 128;
                    }
                    i7 = 0;
                    j3 = j11;
                    j7 = 255;
                    int iB = Q.b(this.f15991f);
                    long[] jArr8 = this.f15986a;
                    Object[] objArr4 = this.f15987b;
                    long[] jArr9 = this.f15988c;
                    int i44 = this.f15991f;
                    int[] iArr = new int[i44];
                    f(iB);
                    long[] jArr10 = this.f15986a;
                    Object[] objArr5 = this.f15987b;
                    long[] jArr11 = this.f15988c;
                    int i45 = this.f15991f;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr8[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j8) {
                            Object obj4 = objArr4[i46];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i18;
                            int i47 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i47 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j24 = i47 & 127;
                            int i48 = iE3 >> 3;
                            int i49 = (iE3 & 7) << 3;
                            long j25 = (jArr[i48] & (~(255 << i49))) | (j24 << i49);
                            jArr[i48] = j25;
                            jArr[(((iE3 - 7) & i45) + (i45 & 7)) >> 3] = j25;
                            objArr5[iE3] = obj4;
                            jArr11[iE3] = jArr9[i46];
                            iArr[i46] = iE3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i46++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f15988c;
                    int length3 = jArr12.length;
                    for (int i50 = 0; i50 < length3; i50++) {
                        long j26 = jArr12[i50];
                        int i51 = (int) ((j26 >> c7) & 2147483647L);
                        int i52 = (int) (j26 & 2147483647L);
                        jArr12[i50] = (((j26 & (-4611686018427387904L)) | ((long) (i51 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i51]))) << c7) | ((long) (i52 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i52]));
                    }
                    int i53 = this.f15989d;
                    if (i53 != Integer.MAX_VALUE) {
                        this.f15989d = iArr[i53];
                    }
                    int i54 = this.f15990e;
                    if (i54 != Integer.MAX_VALUE) {
                        this.f15990e = iArr[i54];
                    }
                    iE = e(i10);
                }
                this.f15992g++;
                int i55 = this.h;
                long[] jArr13 = this.f15986a;
                int i56 = iE >> 3;
                long j27 = jArr13[i56];
                int i57 = (iE & 7) << 3;
                if (((j27 >> i57) & j7) == j8) {
                    i7 = 1;
                }
                this.h = i55 - i7;
                int i58 = this.f15991f;
                long j28 = (j27 & (~(j7 << i57))) | (j3 << i57);
                jArr13[i56] = j28;
                jArr13[(((iE - 7) & i58) + (i58 & 7)) >> 3] = j28;
                return iE;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i8 = i18;
        }
    }

    public final int e(int i7) {
        int i8 = this.f15991f;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f15986a;
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
            boolean r3 = r1 instanceof t.C1445G
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            t.G r1 = (t.C1445G) r1
            int r3 = r1.f15992g
            int r5 = r0.f15992g
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f15987b
            long[] r5 = r0.f15986a
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
            boolean r13 = r1.c(r13)
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
        throw new UnsupportedOperationException("Method not decompiled: t.C1445G.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        long[] jArr;
        long[] jArr2;
        int iMax = i7 > 0 ? Math.max(7, Q.c(i7)) : 0;
        this.f15991f = iMax;
        if (iMax == 0) {
            jArr = Q.f16032a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Z4.l.e0(jArr, -9187201950435737472L);
        }
        this.f15986a = jArr;
        int i8 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j3)) | j3;
        this.h = Q.a(this.f15991f) - this.f15992g;
        this.f15987b = iMax == 0 ? AbstractC1525a.f17128c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC1464t.f16108b;
        } else {
            jArr2 = new long[iMax];
            Z4.l.e0(jArr2, 4611686018427387903L);
        }
        this.f15988c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f15991f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f15986a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f15987b
            r15 = r15[r11]
            boolean r15 = m5.AbstractC1209k.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1445G.g(java.lang.Object):boolean");
    }

    public final void h(int i7) {
        this.f15992g--;
        long[] jArr = this.f15986a;
        int i8 = this.f15991f;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j3 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j3;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j3;
        this.f15987b[i7] = null;
        long[] jArr2 = this.f15988c;
        long j7 = jArr2[i7];
        int i11 = (int) ((j7 >> 31) & 2147483647L);
        int i12 = (int) (j7 & 2147483647L);
        if (i11 != Integer.MAX_VALUE) {
            jArr2[i11] = (jArr2[i11] & (-2147483648L)) | (((long) i12) & 2147483647L);
        } else {
            this.f15989d = i12;
        }
        if (i12 != Integer.MAX_VALUE) {
            jArr2[i12] = ((((long) i11) & 2147483647L) << 31) | (jArr2[i12] & (-4611686016279904257L));
        } else {
            this.f15990e = i11;
        }
        jArr2[i7] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f15991f * 31) + this.f15992g;
        Object[] objArr = this.f15987b;
        long[] jArr = this.f15986a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j3 = jArr[i7];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i7 << 3) + i9];
                            if (!AbstractC1209k.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i8 != 8) {
                        return iHashCode;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            m5.AbstractC1209k.f(r1, r2)
            java.lang.Object[] r2 = r0.f15987b
            int r3 = r0.f15992g
            long[] r4 = r0.f15986a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = Z4.n.n0(r14, r15)
            if (r14 != 0) goto L4c
            r0.h(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.f15992g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1445G.i(java.util.Collection):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f15987b;
        long[] jArr = this.f15988c;
        int i7 = this.f15990e;
        int i8 = 0;
        while (true) {
            if (i7 == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i9 = (int) ((jArr[i7] >> 31) & 2147483647L);
            Object obj = objArr[i7];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i8++;
            i7 = i9;
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
