package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9514c;

    public static int m(long j3, byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            M m7 = r0.f9520a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i8 == 1) {
            return r0.c(i7, o0.f(j3, bArr));
        }
        if (i8 == 2) {
            return r0.d(i7, o0.f(j3, bArr), o0.f(j3 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    @Override // androidx.datastore.preferences.protobuf.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(byte[] r19, int r20, int r21) throws androidx.datastore.preferences.protobuf.C0550x {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.e(byte[], int, int):java.lang.String");
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public final int f(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char cCharAt;
        long j3;
        long j7;
        long j8;
        int i11;
        char cCharAt2;
        switch (this.f9514c) {
            case 0:
                int length = str.length();
                int i12 = i8 + i7;
                int i13 = 0;
                while (i13 < length && (i10 = i13 + i7) < i12 && (cCharAt = str.charAt(i13)) < 128) {
                    bArr[i10] = (byte) cCharAt;
                    i13++;
                }
                if (i13 == length) {
                    return i7 + length;
                }
                int i14 = i7 + i13;
                while (i13 < length) {
                    char cCharAt3 = str.charAt(i13);
                    if (cCharAt3 < 128 && i14 < i12) {
                        bArr[i14] = (byte) cCharAt3;
                        i14++;
                    } else if (cCharAt3 < 2048 && i14 <= i12 - 2) {
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) ((cCharAt3 >>> 6) | 960);
                        i14 += 2;
                        bArr[i15] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i14 > i12 - 3) {
                            if (i14 > i12 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i9 = i13 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i9)))) {
                                    throw new q0(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i14);
                            }
                            int i16 = i13 + 1;
                            if (i16 != str.length()) {
                                char cCharAt4 = str.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i17 = i14 + 3;
                                    bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i14 += 4;
                                    bArr[i17] = (byte) ((codePoint & 63) | 128);
                                    i13 = i16;
                                } else {
                                    i13 = i16;
                                }
                            }
                            throw new q0(i13 - 1, length);
                        }
                        bArr[i14] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i18 = i14 + 2;
                        bArr[i14 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i14 += 3;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i13++;
                }
                return i14;
            default:
                long j9 = i7;
                long j10 = ((long) i8) + j9;
                int length2 = str.length();
                if (length2 > i8 || bArr.length - i8 < i7) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i7 + i8));
                }
                int i19 = 0;
                while (true) {
                    j3 = 1;
                    if (i19 < length2 && (cCharAt2 = str.charAt(i19)) < 128) {
                        o0.j(bArr, j9, (byte) cCharAt2);
                        i19++;
                        j9 = 1 + j9;
                    }
                }
                if (i19 != length2) {
                    while (i19 < length2) {
                        char cCharAt5 = str.charAt(i19);
                        if (cCharAt5 < 128 && j9 < j10) {
                            o0.j(bArr, j9, (byte) cCharAt5);
                            j8 = j10;
                            j7 = j3;
                            j9 += j3;
                        } else if (cCharAt5 >= 2048 || j9 > j10 - 2) {
                            j7 = j3;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j9 > j10 - 3) {
                                j8 = j10;
                                if (j9 > j8 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i11)))) {
                                        throw new q0(i19, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j9);
                                }
                                int i20 = i19 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        o0.j(bArr, j9, (byte) ((codePoint2 >>> 18) | 240));
                                        o0.j(bArr, j9 + j7, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j11 = j9 + 3;
                                        o0.j(bArr, j9 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j9 += 4;
                                        o0.j(bArr, j11, (byte) ((codePoint2 & 63) | 128));
                                        i19 = i20;
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                throw new q0(i19 - 1, length2);
                            }
                            o0.j(bArr, j9, (byte) ((cCharAt5 >>> '\f') | 480));
                            j8 = j10;
                            long j12 = j9 + 2;
                            o0.j(bArr, j9 + j7, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j9 += 3;
                            o0.j(bArr, j12, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j7 = j3;
                            long j13 = j9 + j7;
                            o0.j(bArr, j9, (byte) ((cCharAt5 >>> 6) | 960));
                            j9 += 2;
                            o0.j(bArr, j13, (byte) ((cCharAt5 & '?') | 128));
                            j8 = j10;
                        }
                        i19++;
                        j3 = j7;
                        j10 = j8;
                    }
                }
                return (int) j9;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public final int i(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12 = i7;
        int i13 = 2;
        switch (this.f9514c) {
            case 0:
                while (i12 < i8 && bArr[i12] >= 0) {
                    i12++;
                }
                if (i12 < i8) {
                    while (i12 < i8) {
                        int i14 = i12 + 1;
                        byte b7 = bArr[i12];
                        if (b7 < 0) {
                            if (b7 < -32) {
                                if (i14 >= i8) {
                                    return b7;
                                }
                                if (b7 >= -62) {
                                    i12 += 2;
                                    if (bArr[i14] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b7 < -16) {
                                if (i14 >= i8 - 1) {
                                    return r0.a(bArr, i14, i8);
                                }
                                int i15 = i12 + 2;
                                byte b8 = bArr[i14];
                                if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                                    i12 += 3;
                                    if (bArr[i15] > -65) {
                                    }
                                }
                            } else {
                                if (i14 >= i8 - 2) {
                                    return r0.a(bArr, i14, i8);
                                }
                                int i16 = i12 + 2;
                                byte b9 = bArr[i14];
                                if (b9 <= -65 && (((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                                    int i17 = i12 + 3;
                                    if (bArr[i16] <= -65) {
                                        i12 += 4;
                                        if (bArr[i17] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i12 = i14;
                    }
                }
                return 0;
            default:
                if (((bArr.length - i8) | i12 | i8) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i8)));
                }
                long j3 = i12;
                int i18 = (int) (((long) i8) - j3);
                if (i18 < 16) {
                    i9 = -1;
                    i10 = 0;
                } else {
                    i9 = -1;
                    long j7 = j3;
                    i10 = 0;
                    while (true) {
                        if (i10 < i18) {
                            long j8 = j7 + 1;
                            if (o0.f(j7, bArr) >= 0) {
                                i10++;
                                j7 = j8;
                            }
                        } else {
                            i10 = i18;
                        }
                    }
                }
                int i19 = i18 - i10;
                long j9 = j3 + ((long) i10);
                while (true) {
                    byte bF = 0;
                    while (true) {
                        if (i19 > 0) {
                            long j10 = j9 + 1;
                            bF = o0.f(j9, bArr);
                            if (bF >= 0) {
                                i19--;
                                j9 = j10;
                            } else {
                                j9 = j10;
                            }
                        }
                    }
                    if (i19 == 0) {
                        return 0;
                    }
                    int i20 = i19 - 1;
                    if (bF < -32) {
                        if (i20 == 0) {
                            return bF;
                        }
                        i19 -= 2;
                        if (bF >= -62) {
                            long j11 = j9 + 1;
                            if (o0.f(j9, bArr) <= -65) {
                                j9 = j11;
                                i11 = i13;
                            }
                        }
                    } else if (bF < -16) {
                        if (i20 < i13) {
                            return m(j9, bArr, bF, i20);
                        }
                        i19 -= 3;
                        long j12 = j9 + 1;
                        byte bF2 = o0.f(j9, bArr);
                        if (bF2 <= -65 && ((bF != -32 || bF2 >= -96) && (bF != -19 || bF2 < -96))) {
                            j9 += 2;
                            if (o0.f(j12, bArr) > -65) {
                            }
                            i11 = i13;
                        }
                    } else {
                        if (i20 < 3) {
                            return m(j9, bArr, bF, i20);
                        }
                        i19 -= 4;
                        long j13 = j9 + 1;
                        byte bF3 = o0.f(j9, bArr);
                        if (bF3 <= -65 && (((bF3 + 112) + (bF << 28)) >> 30) == 0) {
                            i11 = i13;
                            long j14 = j9 + 2;
                            if (o0.f(j13, bArr) <= -65) {
                                j9 += 3;
                                if (o0.f(j14, bArr) > -65) {
                                }
                            }
                        }
                    }
                    i13 = i11;
                }
                return i9;
        }
    }
}
