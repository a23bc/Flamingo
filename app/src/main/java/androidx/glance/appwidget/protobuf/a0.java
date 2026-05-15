package androidx.glance.appwidget.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends N5.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9609g;

    public /* synthetic */ a0(int i7) {
        this.f9609g = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // N5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String t(byte[] r18, int r19, int r20) throws androidx.glance.appwidget.protobuf.C0574w {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.a0.t(byte[], int, int):java.lang.String");
    }

    @Override // N5.l
    public final int w(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char cCharAt;
        long j3;
        long j7;
        long j8;
        int i11;
        char cCharAt2;
        switch (this.f9609g) {
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
                                    throw new b0(i13, length);
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
                            throw new b0(i13 - 1, length);
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
                        Z.j(bArr, j9, (byte) cCharAt2);
                        i19++;
                        j9 = 1 + j9;
                    }
                }
                if (i19 != length2) {
                    while (i19 < length2) {
                        char cCharAt5 = str.charAt(i19);
                        if (cCharAt5 < 128 && j9 < j10) {
                            Z.j(bArr, j9, (byte) cCharAt5);
                            j8 = j10;
                            j7 = j3;
                            j9 += j3;
                        } else if (cCharAt5 >= 2048 || j9 > j10 - 2) {
                            j7 = j3;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j9 > j10 - 3) {
                                j8 = j10;
                                if (j9 > j8 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i11)))) {
                                        throw new b0(i19, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j9);
                                }
                                int i20 = i19 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        Z.j(bArr, j9, (byte) ((codePoint2 >>> 18) | 240));
                                        Z.j(bArr, j9 + j7, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j11 = j9 + 3;
                                        Z.j(bArr, j9 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j9 += 4;
                                        Z.j(bArr, j11, (byte) ((codePoint2 & 63) | 128));
                                        i19 = i20;
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                throw new b0(i19 - 1, length2);
                            }
                            Z.j(bArr, j9, (byte) ((cCharAt5 >>> '\f') | 480));
                            j8 = j10;
                            long j12 = j9 + 2;
                            Z.j(bArr, j9 + j7, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j9 += 3;
                            Z.j(bArr, j12, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j7 = j3;
                            long j13 = j9 + j7;
                            Z.j(bArr, j9, (byte) ((cCharAt5 >>> 6) | 960));
                            j9 += 2;
                            Z.j(bArr, j13, (byte) ((cCharAt5 & '?') | 128));
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
}
