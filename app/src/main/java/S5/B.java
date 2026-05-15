package S5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import m5.AbstractC1209k;
import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class B extends j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient byte[][] f6759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int[] f6760t;

    public B(byte[][] bArr, int[] iArr) {
        super(j.f6786r.f6787o);
        this.f6759s = bArr;
        this.f6760t = iArr;
    }

    @Override // S5.j
    public final j b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f6759s;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int[] iArr = this.f6760t;
            int i9 = iArr[length + i7];
            int i10 = iArr[i7];
            messageDigest.update(bArr[i7], i9, i10 - i8);
            i7++;
            i8 = i10;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC1209k.c(bArrDigest);
        return new j(bArrDigest);
    }

    @Override // S5.j
    public final int c() {
        return this.f6760t[this.f6759s.length - 1];
    }

    @Override // S5.j
    public final String d() {
        return s().d();
    }

    @Override // S5.j
    public final int e(int i7, byte[] bArr) {
        AbstractC1209k.f(bArr, "other");
        return s().e(i7, bArr);
    }

    @Override // S5.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.c() == c() && l(0, jVar, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // S5.j
    public final byte[] g() {
        return r();
    }

    @Override // S5.j
    public final byte h(int i7) {
        byte[][] bArr = this.f6759s;
        int length = bArr.length - 1;
        int[] iArr = this.f6760t;
        AbstractC1267a.o(iArr[length], i7, 1L);
        int iG = T5.b.g(this, i7);
        return bArr[iG][(i7 - (iG == 0 ? 0 : iArr[iG - 1])) + iArr[bArr.length + iG]];
    }

    @Override // S5.j
    public final int hashCode() {
        int i7 = this.f6788p;
        if (i7 != 0) {
            return i7;
        }
        byte[][] bArr = this.f6759s;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int[] iArr = this.f6760t;
            int i11 = iArr[length + i8];
            int i12 = iArr[i8];
            byte[] bArr2 = bArr[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr2[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        this.f6788p = i9;
        return i9;
    }

    @Override // S5.j
    public final int i(byte[] bArr) {
        AbstractC1209k.f(bArr, "other");
        return s().i(bArr);
    }

    @Override // S5.j
    public final boolean k(int i7, int i8, int i9, byte[] bArr) {
        AbstractC1209k.f(bArr, "other");
        if (i7 < 0 || i7 > c() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int iG = T5.b.g(this, i7);
        while (i7 < i10) {
            int[] iArr = this.f6760t;
            int i11 = iG == 0 ? 0 : iArr[iG - 1];
            int i12 = iArr[iG] - i11;
            byte[][] bArr2 = this.f6759s;
            int i13 = iArr[bArr2.length + iG];
            int iMin = Math.min(i10, i12 + i11) - i7;
            if (!AbstractC1267a.l((i7 - i11) + i13, i8, iMin, bArr2[iG], bArr)) {
                return false;
            }
            i8 += iMin;
            i7 += iMin;
            iG++;
        }
        return true;
    }

    @Override // S5.j
    public final boolean l(int i7, j jVar, int i8) {
        AbstractC1209k.f(jVar, "other");
        if (i7 >= 0 && i7 <= c() - i8) {
            int i9 = i8 + i7;
            int iG = T5.b.g(this, i7);
            int i10 = 0;
            while (i7 < i9) {
                int[] iArr = this.f6760t;
                int i11 = iG == 0 ? 0 : iArr[iG - 1];
                int i12 = iArr[iG] - i11;
                byte[][] bArr = this.f6759s;
                int i13 = iArr[bArr.length + iG];
                int iMin = Math.min(i9, i12 + i11) - i7;
                if (jVar.k(i10, (i7 - i11) + i13, iMin, bArr[iG])) {
                    i10 += iMin;
                    i7 += iMin;
                    iG++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // S5.j
    public final j m(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = c();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(Z1.l.o(i7, "beginIndex=", " < 0").toString());
        }
        if (i8 > c()) {
            StringBuilder sbV = n1.c.v(i8, "endIndex=", " > length(");
            sbV.append(c());
            sbV.append(')');
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        int i9 = i8 - i7;
        if (i9 < 0) {
            throw new IllegalArgumentException(Z1.l.p("endIndex=", i8, i7, " < beginIndex=").toString());
        }
        if (i7 == 0 && i8 == c()) {
            return this;
        }
        if (i7 == i8) {
            return j.f6786r;
        }
        int iG = T5.b.g(this, i7);
        int iG2 = T5.b.g(this, i8 - 1);
        byte[][] bArr = this.f6759s;
        byte[][] bArr2 = (byte[][]) Z4.l.c0(bArr, iG, iG2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f6760t;
        if (iG <= iG2) {
            int i10 = iG;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(iArr2[i10] - i7, i9);
                int i12 = i11 + 1;
                iArr[i11 + bArr2.length] = iArr2[bArr.length + i10];
                if (i10 == iG2) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = iG != 0 ? iArr2[iG - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i7 - i13) + iArr[length];
        return new B(bArr2, iArr);
    }

    @Override // S5.j
    public final j o() {
        return s().o();
    }

    @Override // S5.j
    public final void q(C0427g c0427g, int i7) {
        AbstractC1209k.f(c0427g, "buffer");
        int iG = T5.b.g(this, 0);
        int i8 = 0;
        while (i8 < i7) {
            int[] iArr = this.f6760t;
            int i9 = iG == 0 ? 0 : iArr[iG - 1];
            int i10 = iArr[iG] - i9;
            byte[][] bArr = this.f6759s;
            int i11 = iArr[bArr.length + iG];
            int iMin = Math.min(i7, i10 + i9) - i8;
            int i12 = (i8 - i9) + i11;
            z zVar = new z(bArr[iG], i12, i12 + iMin, true);
            z zVar2 = c0427g.f6784o;
            if (zVar2 == null) {
                zVar.f6831g = zVar;
                zVar.f6830f = zVar;
                c0427g.f6784o = zVar;
            } else {
                z zVar3 = zVar2.f6831g;
                AbstractC1209k.c(zVar3);
                zVar3.b(zVar);
            }
            i8 += iMin;
            iG++;
        }
        c0427g.f6785p += (long) i7;
    }

    public final byte[] r() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f6759s;
        int length = bArr2.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f6760t;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            int i12 = i11 - i8;
            Z4.l.U(i9, i10, i10 + i12, bArr2[i7], bArr);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    public final j s() {
        return new j(r());
    }

    @Override // S5.j
    public final String toString() {
        return s().toString();
    }
}
