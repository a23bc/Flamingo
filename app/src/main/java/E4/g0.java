package E4;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends K {

    /* JADX INFO: renamed from: u */
    public static final g0 f1938u = new g0(0, null, new Object[0]);

    /* JADX INFO: renamed from: r */
    public final transient Object f1939r;

    /* JADX INFO: renamed from: s */
    public final transient Object[] f1940s;

    /* JADX INFO: renamed from: t */
    public final transient int f1941t;

    public g0(int i7, Object obj, Object[] objArr) {
        this.f1939r = obj;
        this.f1940s = objArr;
        this.f1941t = i7;
    }

    public static Object g(Object[] objArr, int i7, int i8, int i9) {
        boolean z6;
        boolean z7 = false;
        J j3 = null;
        if (i7 == 1) {
            Objects.requireNonNull(objArr[i9]);
            Objects.requireNonNull(objArr[i9 ^ 1]);
            return null;
        }
        int i10 = i8 - 1;
        if (i8 <= 128) {
            byte[] bArr = new byte[i8];
            Arrays.fill(bArr, (byte) -1);
            int i11 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                int i13 = (i12 * 2) + i9;
                int i14 = (i11 * 2) + i9;
                Object obj = objArr[i13];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj2);
                int iR = AbstractC0119q.r(obj.hashCode());
                while (true) {
                    int i15 = iR & i10;
                    int i16 = bArr[i15] & 255;
                    if (i16 == 255) {
                        bArr[i15] = (byte) i14;
                        if (i11 < i12) {
                            objArr[i14] = obj;
                            objArr[i14 ^ 1] = obj2;
                        }
                        i11++;
                    } else {
                        if (obj.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            Object obj3 = objArr[i17];
                            Objects.requireNonNull(obj3);
                            j3 = new J(obj, obj2, obj3);
                            objArr[i17] = obj2;
                            break;
                        }
                        iR = i15 + 1;
                    }
                }
            }
            return i11 == i7 ? bArr : new Object[]{bArr, Integer.valueOf(i11), j3};
        }
        if (i8 <= 32768) {
            short[] sArr = new short[i8];
            Arrays.fill(sArr, (short) -1);
            int i18 = 0;
            for (int i19 = 0; i19 < i7; i19++) {
                int i20 = (i19 * 2) + i9;
                int i21 = (i18 * 2) + i9;
                Object obj4 = objArr[i20];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i20 ^ 1];
                Objects.requireNonNull(obj5);
                int iR2 = AbstractC0119q.r(obj4.hashCode());
                while (true) {
                    int i22 = iR2 & i10;
                    int i23 = sArr[i22] & 65535;
                    if (i23 == 65535) {
                        sArr[i22] = (short) i21;
                        if (i18 < i19) {
                            objArr[i21] = obj4;
                            objArr[i21 ^ 1] = obj5;
                        }
                        i18++;
                    } else {
                        if (obj4.equals(objArr[i23])) {
                            int i24 = i23 ^ 1;
                            Object obj6 = objArr[i24];
                            Objects.requireNonNull(obj6);
                            j3 = new J(obj4, obj5, obj6);
                            objArr[i24] = obj5;
                            break;
                        }
                        iR2 = i22 + 1;
                    }
                }
            }
            return i18 == i7 ? sArr : new Object[]{sArr, Integer.valueOf(i18), j3};
        }
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        int i25 = 0;
        int i26 = 0;
        while (i25 < i7) {
            int i27 = (i25 * 2) + i9;
            int i28 = (i26 * 2) + i9;
            Object obj7 = objArr[i27];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i27 ^ 1];
            Objects.requireNonNull(obj8);
            int iR3 = AbstractC0119q.r(obj7.hashCode());
            while (true) {
                int i29 = iR3 & i10;
                int i30 = iArr[i29];
                if (i30 == -1) {
                    iArr[i29] = i28;
                    if (i26 < i25) {
                        objArr[i28] = obj7;
                        objArr[i28 ^ 1] = obj8;
                    }
                    i26++;
                    z6 = z7;
                } else {
                    z6 = z7;
                    if (obj7.equals(objArr[i30])) {
                        int i31 = i30 ^ 1;
                        Object obj9 = objArr[i31];
                        Objects.requireNonNull(obj9);
                        J j7 = new J(obj7, obj8, obj9);
                        objArr[i31] = obj8;
                        j3 = j7;
                        break;
                    }
                    iR3 = i29 + 1;
                    z7 = z6;
                }
            }
            i25++;
            z7 = z6;
        }
        boolean z8 = z7;
        if (i26 == i7) {
            return iArr;
        }
        Integer numValueOf = Integer.valueOf(i26);
        Object[] objArr2 = new Object[3];
        objArr2[z8 ? 1 : 0] = iArr;
        objArr2[1] = numValueOf;
        objArr2[2] = j3;
        return objArr2;
    }

    public static Object h(Object obj, Object[] objArr, int i7, int i8, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i7 == 1) {
            Object obj3 = objArr[i8];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i8 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iR = AbstractC0119q.r(obj2.hashCode());
            while (true) {
                int i9 = iR & length;
                int i10 = bArr[i9] & 255;
                if (i10 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                iR = i9 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iR2 = AbstractC0119q.r(obj2.hashCode());
            while (true) {
                int i11 = iR2 & length2;
                int i12 = sArr[i11] & 65535;
                if (i12 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                iR2 = i11 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iR3 = AbstractC0119q.r(obj2.hashCode());
            while (true) {
                int i13 = iR3 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iR3 = i13 + 1;
            }
        }
    }

    @Override // E4.K
    public final d0 c() {
        return new d0(this, this.f1940s, 0, this.f1941t);
    }

    @Override // E4.K
    public final e0 d() {
        return new e0(this, new f0(this.f1940s, 0, this.f1941t));
    }

    @Override // E4.K
    public final D e() {
        return new f0(this.f1940s, 1, this.f1941t);
    }

    @Override // E4.K, java.util.Map
    public final Object get(Object obj) {
        Object objH = h(this.f1939r, this.f1940s, this.f1941t, 0, obj);
        if (objH == null) {
            return null;
        }
        return objH;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1941t;
    }
}
