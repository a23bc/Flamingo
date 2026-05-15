package S5;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import u5.AbstractC1539a;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public class j implements Serializable, Comparable {

    /* JADX INFO: renamed from: r */
    public static final j f6786r = new j(new byte[0]);

    /* JADX INFO: renamed from: o */
    public final byte[] f6787o;

    /* JADX INFO: renamed from: p */
    public transient int f6788p;

    /* JADX INFO: renamed from: q */
    public transient String f6789q;

    public j(byte[] bArr) {
        AbstractC1209k.f(bArr, "data");
        this.f6787o = bArr;
    }

    public static int f(j jVar, j jVar2) {
        jVar.getClass();
        AbstractC1209k.f(jVar2, "other");
        return jVar.e(0, jVar2.f6787o);
    }

    public static int j(j jVar, j jVar2) {
        jVar.getClass();
        AbstractC1209k.f(jVar2, "other");
        return jVar.i(jVar2.f6787o);
    }

    public static /* synthetic */ j n(j jVar, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = -1234567890;
        }
        return jVar.m(i7, i8);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(j jVar) {
        AbstractC1209k.f(jVar, "other");
        int iC = c();
        int iC2 = jVar.c();
        int iMin = Math.min(iC, iC2);
        for (int i7 = 0; i7 < iMin; i7++) {
            int iH = h(i7) & 255;
            int iH2 = jVar.h(i7) & 255;
            if (iH != iH2) {
                return iH < iH2 ? -1 : 1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        return iC < iC2 ? -1 : 1;
    }

    public j b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f6787o, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC1209k.c(bArrDigest);
        return new j(bArrDigest);
    }

    public int c() {
        return this.f6787o.length;
    }

    public String d() {
        byte[] bArr = this.f6787o;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = T5.b.f6986a;
            cArr[i7] = cArr2[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i8] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public int e(int i7, byte[] bArr) {
        AbstractC1209k.f(bArr, "other");
        byte[] bArr2 = this.f6787o;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i7, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC1267a.l(iMax, 0, bArr.length, bArr2, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int iC = jVar.c();
            byte[] bArr = this.f6787o;
            if (iC == bArr.length && jVar.k(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] g() {
        return this.f6787o;
    }

    public byte h(int i7) {
        return this.f6787o[i7];
    }

    public int hashCode() {
        int i7 = this.f6788p;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = Arrays.hashCode(this.f6787o);
        this.f6788p = iHashCode;
        return iHashCode;
    }

    public int i(byte[] bArr) {
        AbstractC1209k.f(bArr, "other");
        int iC = c();
        byte[] bArr2 = this.f6787o;
        for (int iMin = Math.min(iC, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC1267a.l(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean k(int i7, int i8, int i9, byte[] bArr) {
        AbstractC1209k.f(bArr, "other");
        if (i7 < 0) {
            return false;
        }
        byte[] bArr2 = this.f6787o;
        return i7 <= bArr2.length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && AbstractC1267a.l(i7, i8, i9, bArr2, bArr);
    }

    public boolean l(int i7, j jVar, int i8) {
        AbstractC1209k.f(jVar, "other");
        return jVar.k(0, i7, i8, this.f6787o);
    }

    public j m(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = c();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f6787o;
        if (i8 > bArr.length) {
            throw new IllegalArgumentException(Z1.l.r(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i8 - i7 >= 0) {
            return (i7 == 0 && i8 == bArr.length) ? this : new j(Z4.l.b0(bArr, i7, i8));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public j o() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f6787o;
            if (i7 >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i7];
            if (b7 >= 65 && b7 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC1209k.e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i7] = (byte) (b7 + 32);
                for (int i8 = i7 + 1; i8 < bArrCopyOf.length; i8++) {
                    byte b8 = bArrCopyOf[i8];
                    if (b8 >= 65 && b8 <= 90) {
                        bArrCopyOf[i8] = (byte) (b8 + 32);
                    }
                }
                return new j(bArrCopyOf);
            }
            i7++;
        }
    }

    public final String p() {
        String str = this.f6789q;
        if (str != null) {
            return str;
        }
        byte[] bArrG = g();
        AbstractC1209k.f(bArrG, "<this>");
        String str2 = new String(bArrG, AbstractC1539a.f17313a);
        this.f6789q = str2;
        return str2;
    }

    public void q(C0427g c0427g, int i7) {
        AbstractC1209k.f(c0427g, "buffer");
        c0427g.A(i7, this.f6787o);
    }

    public String toString() {
        byte b7;
        int i7;
        byte[] bArr = this.f6787o;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            if (i8 >= length) {
                break;
            }
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                int i11 = i10 + 1;
                if (i10 == 64) {
                    break;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (127 <= b8 && b8 < 160))) || b8 == 65533) {
                    break;
                }
                i9 += b8 < 65536 ? 1 : 2;
                i8++;
                while (true) {
                    i10 = i11;
                    if (i8 < length && (b7 = bArr[i8]) >= 0) {
                        i8++;
                        i11 = i10 + 1;
                        if (i10 == 64) {
                            break loop0;
                        }
                        if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (127 <= b7 && b7 < 160))) || b7 == 65533) {
                            break loop0;
                        }
                        i9 += b7 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b8 >> 5) == -2) {
                int i12 = i8 + 1;
                if (length > i12) {
                    byte b9 = bArr[i12];
                    if ((b9 & 192) == 128) {
                        int i13 = (b9 ^ 3968) ^ (b8 << 6);
                        if (i13 >= 128) {
                            i7 = i10 + 1;
                            if (i10 == 64) {
                                break;
                            }
                            if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                break;
                            }
                            i9 += i13 < 65536 ? 1 : 2;
                            i8 += 2;
                            i10 = i7;
                        } else if (i10 != 64) {
                            break;
                        }
                    } else if (i10 != 64) {
                        break;
                    }
                } else if (i10 != 64) {
                    break;
                }
            } else if ((b8 >> 4) == -2) {
                int i14 = i8 + 2;
                if (length > i14) {
                    byte b10 = bArr[i8 + 1];
                    if ((b10 & 192) == 128) {
                        byte b11 = bArr[i14];
                        if ((b11 & 192) == 128) {
                            int i15 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b8 << 12);
                            if (i15 < 2048) {
                                if (i10 != 64) {
                                    break;
                                }
                            } else if (55296 > i15 || i15 >= 57344) {
                                i7 = i10 + 1;
                                if (i10 == 64) {
                                    break;
                                }
                                if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                    break;
                                }
                                i9 += i15 < 65536 ? 1 : 2;
                                i8 += 3;
                                i10 = i7;
                            } else if (i10 != 64) {
                                break;
                            }
                        } else if (i10 != 64) {
                            break;
                        }
                    } else if (i10 != 64) {
                        break;
                    }
                } else if (i10 != 64) {
                    break;
                }
            } else if ((b8 >> 3) == -2) {
                int i16 = i8 + 3;
                if (length > i16) {
                    byte b12 = bArr[i8 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i8 + 2];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i16];
                            if ((b14 & 192) == 128) {
                                int i17 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
                                if (i17 > 1114111) {
                                    if (i10 != 64) {
                                        break;
                                    }
                                } else if (55296 > i17 || i17 >= 57344) {
                                    if (i17 >= 65536) {
                                        i7 = i10 + 1;
                                        if (i10 == 64) {
                                            break;
                                        }
                                        if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                            break;
                                        }
                                        i9 += i17 < 65536 ? 1 : 2;
                                        i8 += 4;
                                        i10 = i7;
                                    } else if (i10 != 64) {
                                        break;
                                    }
                                } else if (i10 != 64) {
                                    break;
                                }
                            } else if (i10 != 64) {
                                break;
                            }
                        } else if (i10 != 64) {
                            break;
                        }
                    } else if (i10 != 64) {
                        break;
                    }
                } else if (i10 != 64) {
                    break;
                }
            } else if (i10 != 64) {
                break;
            }
        }
        i9 = -1;
        if (i9 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + d() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(Z1.l.r(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new j(Z4.l.b0(bArr, 0, 64))).d());
            sb.append("…]");
            return sb.toString();
        }
        String strP = p();
        String strSubstring = strP.substring(0, i9);
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strI = AbstractC1552n.I(AbstractC1552n.I(AbstractC1552n.I(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i9 >= strP.length()) {
            return "[text=" + strI + ']';
        }
        return "[size=" + bArr.length + " text=" + strI + "…]";
    }
}
