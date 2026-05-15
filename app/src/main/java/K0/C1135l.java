package k0;

import f0.AbstractC0908q0;
import f0.W;
import java.util.Arrays;
import m0.C1189a;
import m0.C1190b;
import m5.AbstractC1209k;
import r5.C1421b;

/* JADX INFO: renamed from: k0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1135l {

    /* JADX INFO: renamed from: e */
    public static final C1135l f13992e = new C1135l(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f13993a;

    /* JADX INFO: renamed from: b */
    public int f13994b;

    /* JADX INFO: renamed from: c */
    public final C1190b f13995c;

    /* JADX INFO: renamed from: d */
    public Object[] f13996d;

    public C1135l(int i7, int i8, Object[] objArr, C1190b c1190b) {
        this.f13993a = i7;
        this.f13994b = i8;
        this.f13995c = c1190b;
        this.f13996d = objArr;
    }

    public static C1135l j(int i7, Object obj, Object obj2, int i8, Object obj3, Object obj4, int i9, C1190b c1190b) {
        if (i9 > 30) {
            return new C1135l(0, 0, new Object[]{obj, obj2, obj3, obj4}, c1190b);
        }
        int iX = j0.k.x(i7, i9);
        int iX2 = j0.k.x(i8, i9);
        if (iX != iX2) {
            return new C1135l((1 << iX) | (1 << iX2), 0, iX < iX2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c1190b);
        }
        return new C1135l(0, 1 << iX, new Object[]{j(i7, obj, obj2, i8, obj3, obj4, i9 + 5, c1190b)}, c1190b);
    }

    public final Object[] a(int i7, int i8, int i9, Object obj, Object obj2, int i10, C1190b c1190b) {
        Object obj3 = this.f13996d[i7];
        C1135l c1135lJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i7), i9, obj, obj2, i10 + 5, c1190b);
        int iT = t(i8);
        int i11 = iT + 1;
        Object[] objArr = this.f13996d;
        Object[] objArr2 = new Object[objArr.length - 1];
        Z4.l.a0(0, i7, 6, objArr, objArr2);
        Z4.l.W(i7, i7 + 2, i11, objArr, objArr2);
        objArr2[iT - 1] = c1135lJ;
        Z4.l.W(iT, i11, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f13994b == 0) {
            return this.f13996d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f13993a);
        int length = this.f13996d.length;
        for (int i7 = iBitCount * 2; i7 < length; i7++) {
            iBitCount += s(i7).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        C1421b c1421bK = i6.h.K(i6.h.M(0, this.f13996d.length), 2);
        int i7 = c1421bK.f15781o;
        int i8 = c1421bK.f15782p;
        int i9 = c1421bK.f15783q;
        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
            while (!AbstractC1209k.a(obj, this.f13996d[i7])) {
                if (i7 != i8) {
                    i7 += i9;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i7, int i8, Object obj) {
        int iX = 1 << j0.k.x(i7, i8);
        if (h(iX)) {
            return AbstractC1209k.a(obj, this.f13996d[f(iX)]);
        }
        if (!i(iX)) {
            return false;
        }
        C1135l c1135lS = s(t(iX));
        return i8 == 30 ? c1135lS.c(obj) : c1135lS.d(i7, i8 + 5, obj);
    }

    public final boolean e(C1135l c1135l) {
        if (this == c1135l) {
            return true;
        }
        if (this.f13994b != c1135l.f13994b || this.f13993a != c1135l.f13993a) {
            return false;
        }
        int length = this.f13996d.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (this.f13996d[i7] != c1135l.f13996d[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i7) {
        return Integer.bitCount((i7 - 1) & this.f13993a) * 2;
    }

    public final Object g(int i7, int i8, Object obj) {
        int iX = 1 << j0.k.x(i7, i8);
        if (h(iX)) {
            int iF = f(iX);
            if (AbstractC1209k.a(obj, this.f13996d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iX)) {
            return null;
        }
        C1135l c1135lS = s(t(iX));
        if (i8 != 30) {
            return c1135lS.g(i7, i8 + 5, obj);
        }
        C1421b c1421bK = i6.h.K(i6.h.M(0, c1135lS.f13996d.length), 2);
        int i9 = c1421bK.f15781o;
        int i10 = c1421bK.f15782p;
        int i11 = c1421bK.f15783q;
        if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
            return null;
        }
        while (!AbstractC1209k.a(obj, c1135lS.f13996d[i9])) {
            if (i9 == i10) {
                return null;
            }
            i9 += i11;
        }
        return c1135lS.x(i9);
    }

    public final boolean h(int i7) {
        return (i7 & this.f13993a) != 0;
    }

    public final boolean i(int i7) {
        return (i7 & this.f13994b) != 0;
    }

    public final C1135l k(int i7, C1128e c1128e) {
        c1128e.c(c1128e.f13982t - 1);
        c1128e.f13980r = x(i7);
        Object[] objArr = this.f13996d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f13995c != c1128e.f13978p) {
            return new C1135l(0, 0, j0.k.l(i7, objArr), c1128e.f13978p);
        }
        this.f13996d = j0.k.l(i7, objArr);
        return this;
    }

    public final C1135l l(int i7, Object obj, Object obj2, int i8, C1128e c1128e) {
        C1128e c1128e2;
        C1135l c1135lL;
        int iX = 1 << j0.k.x(i7, i8);
        boolean zH = h(iX);
        C1190b c1190b = this.f13995c;
        if (zH) {
            int iF = f(iX);
            if (!AbstractC1209k.a(obj, this.f13996d[iF])) {
                c1128e.c(c1128e.f13982t + 1);
                C1190b c1190b2 = c1128e.f13978p;
                if (c1190b != c1190b2) {
                    return new C1135l(this.f13993a ^ iX, this.f13994b | iX, a(iF, iX, i7, obj, obj2, i8, c1190b2), c1190b2);
                }
                this.f13996d = a(iF, iX, i7, obj, obj2, i8, c1190b2);
                this.f13993a ^= iX;
                this.f13994b |= iX;
                return this;
            }
            c1128e.f13980r = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (c1190b == c1128e.f13978p) {
                this.f13996d[iF + 1] = obj2;
                return this;
            }
            c1128e.f13981s++;
            Object[] objArr = this.f13996d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new C1135l(this.f13993a, this.f13994b, objArrCopyOf, c1128e.f13978p);
        }
        if (!i(iX)) {
            c1128e.c(c1128e.f13982t + 1);
            C1190b c1190b3 = c1128e.f13978p;
            int iF2 = f(iX);
            if (c1190b != c1190b3) {
                return new C1135l(this.f13993a | iX, this.f13994b, j0.k.k(this.f13996d, iF2, obj, obj2), c1190b3);
            }
            this.f13996d = j0.k.k(this.f13996d, iF2, obj, obj2);
            this.f13993a |= iX;
            return this;
        }
        int iT = t(iX);
        C1135l c1135lS = s(iT);
        if (i8 == 30) {
            C1421b c1421bK = i6.h.K(i6.h.M(0, c1135lS.f13996d.length), 2);
            int i9 = c1421bK.f15781o;
            int i10 = c1421bK.f15782p;
            int i11 = c1421bK.f15783q;
            if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
                c1128e.c(c1128e.f13982t + 1);
                c1135lL = new C1135l(0, 0, j0.k.k(c1135lS.f13996d, 0, obj, obj2), c1128e.f13978p);
                c1128e2 = c1128e;
            } else {
                while (!AbstractC1209k.a(obj, c1135lS.f13996d[i9])) {
                    if (i9 == i10) {
                        c1128e.c(c1128e.f13982t + 1);
                        c1135lL = new C1135l(0, 0, j0.k.k(c1135lS.f13996d, 0, obj, obj2), c1128e.f13978p);
                        break;
                    }
                    i9 += i11;
                }
                c1128e.f13980r = c1135lS.x(i9);
                if (c1135lS.f13995c == c1128e.f13978p) {
                    c1135lS.f13996d[i9 + 1] = obj2;
                    c1135lL = c1135lS;
                } else {
                    c1128e.f13981s++;
                    Object[] objArr2 = c1135lS.f13996d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    AbstractC1209k.e(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i9 + 1] = obj2;
                    c1135lL = new C1135l(0, 0, objArrCopyOf2, c1128e.f13978p);
                }
                c1128e2 = c1128e;
            }
        } else {
            c1128e2 = c1128e;
            c1135lL = c1135lS.l(i7, obj, obj2, i8 + 5, c1128e2);
        }
        return c1135lS == c1135lL ? this : r(iT, c1135lL, c1128e2.f13978p);
    }

    public final C1135l m(C1135l c1135l, int i7, C1189a c1189a, C1128e c1128e) {
        Object[] objArr;
        C1135l c1135lJ;
        if (this == c1135l) {
            c1189a.f14324a += b();
            return this;
        }
        int i8 = 0;
        if (i7 > 30) {
            C1190b c1190b = c1128e.f13978p;
            int i9 = c1135l.f13994b;
            Object[] objArr2 = this.f13996d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c1135l.f13996d.length);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            int length = this.f13996d.length;
            C1421b c1421bK = i6.h.K(i6.h.M(0, c1135l.f13996d.length), 2);
            int i10 = c1421bK.f15781o;
            int i11 = c1421bK.f15782p;
            int i12 = c1421bK.f15783q;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    if (c(c1135l.f13996d[i10])) {
                        c1189a.f14324a++;
                    } else {
                        Object[] objArr3 = c1135l.f13996d;
                        objArrCopyOf[length] = objArr3[i10];
                        objArrCopyOf[length + 1] = objArr3[i10 + 1];
                        length += 2;
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                }
            }
            if (length != this.f13996d.length) {
                if (length == c1135l.f13996d.length) {
                    return c1135l;
                }
                if (length == objArrCopyOf.length) {
                    return new C1135l(0, 0, objArrCopyOf, c1190b);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                AbstractC1209k.e(objArrCopyOf2, "copyOf(...)");
                return new C1135l(0, 0, objArrCopyOf2, c1190b);
            }
        } else {
            int i13 = this.f13994b | c1135l.f13994b;
            int i14 = this.f13993a;
            int i15 = c1135l.f13993a;
            int i16 = (i14 ^ i15) & (~i13);
            int i17 = i14 & i15;
            int i18 = i16;
            while (i17 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i17);
                if (AbstractC1209k.a(this.f13996d[f(iLowestOneBit)], c1135l.f13996d[c1135l.f(iLowestOneBit)])) {
                    i18 |= iLowestOneBit;
                } else {
                    i13 |= iLowestOneBit;
                }
                i17 ^= iLowestOneBit;
            }
            if ((i13 & i18) != 0) {
                AbstractC0908q0.b("Check failed.");
            }
            C1135l c1135l2 = (AbstractC1209k.a(this.f13995c, c1128e.f13978p) && this.f13993a == i18 && this.f13994b == i13) ? this : new C1135l(i18, i13, new Object[Integer.bitCount(i13) + (Integer.bitCount(i18) * 2)], null);
            int i19 = i13;
            int i20 = 0;
            while (i19 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i19);
                Object[] objArr4 = c1135l2.f13996d;
                int length2 = (objArr4.length - 1) - i20;
                if (i(iLowestOneBit2)) {
                    c1135lJ = s(t(iLowestOneBit2));
                    if (c1135l.i(iLowestOneBit2)) {
                        c1135lJ = c1135lJ.m(c1135l.s(c1135l.t(iLowestOneBit2)), i7 + 5, c1189a, c1128e);
                        objArr = objArr4;
                    } else if (c1135l.h(iLowestOneBit2)) {
                        int iF = c1135l.f(iLowestOneBit2);
                        Object obj = c1135l.f13996d[iF];
                        Object objX = c1135l.x(iF);
                        int i21 = c1128e.f13982t;
                        objArr = objArr4;
                        c1135lJ = c1135lJ.l(obj != null ? obj.hashCode() : i8, obj, objX, i7 + 5, c1128e);
                        if (c1128e.f13982t == i21) {
                            c1189a.f14324a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c1135l.i(iLowestOneBit2)) {
                        C1135l c1135lS = c1135l.s(c1135l.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f13996d[iF2];
                            int i22 = i7 + 5;
                            if (c1135lS.d(obj2 != null ? obj2.hashCode() : 0, i22, obj2)) {
                                c1189a.f14324a++;
                                c1135lJ = c1135lS;
                            } else {
                                c1135lJ = c1135lS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i22, c1128e);
                            }
                        } else {
                            c1135lJ = c1135lS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f13996d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = c1135l.f(iLowestOneBit2);
                        Object obj4 = c1135l.f13996d[iF4];
                        c1135lJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, c1135l.x(iF4), i7 + 5, c1128e.f13978p);
                    }
                }
                objArr[length2] = c1135lJ;
                i20++;
                i19 ^= iLowestOneBit2;
                i8 = 0;
            }
            int i23 = 0;
            while (i18 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i18);
                int i24 = i23 * 2;
                if (c1135l.h(iLowestOneBit3)) {
                    int iF5 = c1135l.f(iLowestOneBit3);
                    Object[] objArr5 = c1135l2.f13996d;
                    objArr5[i24] = c1135l.f13996d[iF5];
                    objArr5[i24 + 1] = c1135l.x(iF5);
                    if (h(iLowestOneBit3)) {
                        c1189a.f14324a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = c1135l2.f13996d;
                    objArr6[i24] = this.f13996d[iF6];
                    objArr6[i24 + 1] = x(iF6);
                }
                i23++;
                i18 ^= iLowestOneBit3;
            }
            if (!e(c1135l2)) {
                return c1135l.e(c1135l2) ? c1135l : c1135l2;
            }
        }
        return this;
    }

    public final C1135l n(int i7, Object obj, int i8, C1128e c1128e) {
        C1135l c1135lN;
        int iX = 1 << j0.k.x(i7, i8);
        if (h(iX)) {
            int iF = f(iX);
            if (AbstractC1209k.a(obj, this.f13996d[iF])) {
                return p(iF, iX, c1128e);
            }
        } else if (i(iX)) {
            int iT = t(iX);
            C1135l c1135lS = s(iT);
            if (i8 == 30) {
                C1421b c1421bK = i6.h.K(i6.h.M(0, c1135lS.f13996d.length), 2);
                int i9 = c1421bK.f15781o;
                int i10 = c1421bK.f15782p;
                int i11 = c1421bK.f15783q;
                if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
                    c1135lN = c1135lS;
                    break;
                }
                while (!AbstractC1209k.a(obj, c1135lS.f13996d[i9])) {
                    if (i9 == i10) {
                        c1135lN = c1135lS;
                        break;
                    }
                    i9 += i11;
                }
                c1135lN = c1135lS.k(i9, c1128e);
            } else {
                c1135lN = c1135lS.n(i7, obj, i8 + 5, c1128e);
            }
            return q(c1135lS, c1135lN, iT, iX, c1128e.f13978p);
        }
        return this;
    }

    public final C1135l o(int i7, Object obj, Object obj2, int i8, C1128e c1128e) {
        C1135l c1135l;
        C1135l c1135lO;
        int iX = 1 << j0.k.x(i7, i8);
        if (h(iX)) {
            int iF = f(iX);
            if (AbstractC1209k.a(obj, this.f13996d[iF]) && AbstractC1209k.a(obj2, x(iF))) {
                return p(iF, iX, c1128e);
            }
        } else if (i(iX)) {
            int iT = t(iX);
            C1135l c1135lS = s(iT);
            if (i8 == 30) {
                C1421b c1421bK = i6.h.K(i6.h.M(0, c1135lS.f13996d.length), 2);
                int i9 = c1421bK.f15781o;
                int i10 = c1421bK.f15782p;
                int i11 = c1421bK.f15783q;
                if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
                    c1135lO = c1135lS;
                    c1135l = c1135lS;
                } else {
                    while (true) {
                        if (!AbstractC1209k.a(obj, c1135lS.f13996d[i9]) || !AbstractC1209k.a(obj2, c1135lS.x(i9))) {
                            if (i9 == i10) {
                                break;
                            }
                            i9 += i11;
                        } else {
                            c1135lO = c1135lS.k(i9, c1128e);
                            break;
                        }
                    }
                    c1135lO = c1135lS;
                    c1135l = c1135lS;
                }
            } else {
                c1135l = c1135lS;
                c1135lO = c1135l.o(i7, obj, obj2, i8 + 5, c1128e);
            }
            return q(c1135l, c1135lO, iT, iX, c1128e.f13978p);
        }
        return this;
    }

    public final C1135l p(int i7, int i8, C1128e c1128e) {
        c1128e.c(c1128e.f13982t - 1);
        c1128e.f13980r = x(i7);
        Object[] objArr = this.f13996d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f13995c != c1128e.f13978p) {
            return new C1135l(i8 ^ this.f13993a, this.f13994b, j0.k.l(i7, objArr), c1128e.f13978p);
        }
        this.f13996d = j0.k.l(i7, objArr);
        this.f13993a ^= i8;
        return this;
    }

    public final C1135l q(C1135l c1135l, C1135l c1135l2, int i7, int i8, C1190b c1190b) {
        C1190b c1190b2 = this.f13995c;
        if (c1135l2 != null) {
            return (c1190b2 == c1190b || c1135l != c1135l2) ? r(i7, c1135l2, c1190b) : this;
        }
        Object[] objArr = this.f13996d;
        if (objArr.length == 1) {
            return null;
        }
        if (c1190b2 != c1190b) {
            return new C1135l(this.f13993a, i8 ^ this.f13994b, j0.k.m(i7, objArr), c1190b);
        }
        this.f13996d = j0.k.m(i7, objArr);
        this.f13994b ^= i8;
        return this;
    }

    public final C1135l r(int i7, C1135l c1135l, C1190b c1190b) {
        Object[] objArr = this.f13996d;
        if (objArr.length == 1 && c1135l.f13996d.length == 2 && c1135l.f13994b == 0) {
            c1135l.f13993a = this.f13994b;
            return c1135l;
        }
        if (this.f13995c == c1190b) {
            objArr[i7] = c1135l;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i7] = c1135l;
        return new C1135l(this.f13993a, this.f13994b, objArrCopyOf, c1190b);
    }

    public final C1135l s(int i7) {
        Object obj = this.f13996d[i7];
        AbstractC1209k.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C1135l) obj;
    }

    public final int t(int i7) {
        return (this.f13996d.length - 1) - Integer.bitCount((i7 - 1) & this.f13994b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d1, code lost:
    
        if (r14 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00da, code lost:
    
        if (r14 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00dd, code lost:
    
        r14.f960p = w(r12, r4, (k0.C1135l) r14.f960p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e7, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final C1.k u(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1135l.u(int, java.lang.Object, java.lang.Object, int):C1.k");
    }

    public final C1135l v(int i7, W w7, int i8) {
        C1135l c1135lV;
        int iX = 1 << j0.k.x(i7, i8);
        if (h(iX)) {
            int iF = f(iX);
            if (AbstractC1209k.a(w7, this.f13996d[iF])) {
                Object[] objArr = this.f13996d;
                if (objArr.length != 2) {
                    return new C1135l(this.f13993a ^ iX, this.f13994b, j0.k.l(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iX)) {
            int iT = t(iX);
            C1135l c1135lS = s(iT);
            if (i8 == 30) {
                C1421b c1421bK = i6.h.K(i6.h.M(0, c1135lS.f13996d.length), 2);
                int i9 = c1421bK.f15781o;
                int i10 = c1421bK.f15782p;
                int i11 = c1421bK.f15783q;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!AbstractC1209k.a(w7, c1135lS.f13996d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    Object[] objArr2 = c1135lS.f13996d;
                    c1135lV = objArr2.length == 2 ? null : new C1135l(0, 0, j0.k.l(i9, objArr2), null);
                }
                c1135lV = c1135lS;
                break;
            }
            c1135lV = c1135lS.v(i7, w7, i8 + 5);
            if (c1135lV == null) {
                Object[] objArr3 = this.f13996d;
                if (objArr3.length != 1) {
                    return new C1135l(this.f13993a, iX ^ this.f13994b, j0.k.m(iT, objArr3), null);
                }
                return null;
            }
            if (c1135lS != c1135lV) {
                return w(iT, iX, c1135lV);
            }
        }
        return this;
    }

    public final C1135l w(int i7, int i8, C1135l c1135l) {
        Object[] objArr = c1135l.f13996d;
        if (objArr.length != 2 || c1135l.f13994b != 0) {
            Object[] objArr2 = this.f13996d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i7] = c1135l;
            return new C1135l(this.f13993a, this.f13994b, objArrCopyOf, null);
        }
        if (this.f13996d.length == 1) {
            c1135l.f13993a = this.f13994b;
            return c1135l;
        }
        int iF = f(i8);
        Object[] objArr3 = this.f13996d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC1209k.e(objArrCopyOf2, "copyOf(...)");
        Z4.l.W(i7 + 2, i7 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        Z4.l.W(iF + 2, iF, i7, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new C1135l(this.f13993a ^ i8, i8 ^ this.f13994b, objArrCopyOf2, null);
    }

    public final Object x(int i7) {
        return this.f13996d[i7 + 1];
    }
}
