package f0;

import Q0.C0366w;
import java.util.ArrayList;
import java.util.HashMap;
import m5.AbstractC1209k;
import t.C1444F;
import u.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a */
    public final I0 f11694a;

    /* JADX INFO: renamed from: b */
    public int[] f11695b;

    /* JADX INFO: renamed from: c */
    public Object[] f11696c;

    /* JADX INFO: renamed from: d */
    public ArrayList f11697d;

    /* JADX INFO: renamed from: e */
    public HashMap f11698e;

    /* JADX INFO: renamed from: f */
    public t.y f11699f;

    /* JADX INFO: renamed from: g */
    public int f11700g;
    public int h;

    /* JADX INFO: renamed from: i */
    public int f11701i;

    /* JADX INFO: renamed from: j */
    public int f11702j;

    /* JADX INFO: renamed from: k */
    public int f11703k;
    public int l;

    /* JADX INFO: renamed from: m */
    public int f11704m;

    /* JADX INFO: renamed from: n */
    public int f11705n;

    /* JADX INFO: renamed from: o */
    public int f11706o;

    /* JADX INFO: renamed from: p */
    public final C0366w f11707p;

    /* JADX INFO: renamed from: q */
    public final C0366w f11708q;

    /* JADX INFO: renamed from: r */
    public final C0366w f11709r;

    /* JADX INFO: renamed from: s */
    public t.y f11710s;

    /* JADX INFO: renamed from: t */
    public int f11711t;

    /* JADX INFO: renamed from: u */
    public int f11712u;

    /* JADX INFO: renamed from: v */
    public int f11713v;

    /* JADX INFO: renamed from: w */
    public boolean f11714w;

    /* JADX INFO: renamed from: x */
    public t.x f11715x;

    public L0(I0 i02) {
        this.f11694a = i02;
        int[] iArr = i02.f11679o;
        this.f11695b = iArr;
        Object[] objArr = i02.f11681q;
        this.f11696c = objArr;
        this.f11697d = i02.f11687w;
        this.f11698e = i02.f11688x;
        this.f11699f = i02.f11689y;
        int i7 = i02.f11680p;
        this.f11700g = i7;
        this.h = (iArr.length / 5) - i7;
        int i8 = i02.f11682r;
        this.f11703k = i8;
        this.l = objArr.length - i8;
        this.f11704m = i7;
        this.f11707p = new C0366w();
        this.f11708q = new C0366w();
        this.f11709r = new C0366w();
        this.f11712u = i7;
        this.f11713v = -1;
    }

    public static int i(int i7, int i8, int i9, int i10) {
        return i7 > i8 ? -(((i10 - i9) - i7) + 1) : i7;
    }

    public static void y(L0 l02) {
        int i7 = l02.f11713v;
        int iR = l02.r(i7);
        int[] iArr = l02.f11695b;
        int i8 = (iR * 5) + 1;
        int i9 = iArr[i8];
        if ((i9 & 134217728) != 0) {
            return;
        }
        int i10 = (i9 & (-134217729)) | 134217728;
        iArr[i8] = i10;
        if ((67108864 & i10) != 0) {
            return;
        }
        l02.S(l02.D(iArr, i7));
    }

    public final void A(int i7) {
        C0877b c0877b;
        int i8;
        C0877b c0877b2;
        int i9;
        int i10;
        int i11 = this.h;
        int i12 = this.f11700g;
        if (i12 != i7) {
            if (!this.f11697d.isEmpty()) {
                int iO = o() - this.h;
                if (i12 < i7) {
                    for (int iB = K0.b(this.f11697d, i12, iO); iB < this.f11697d.size() && (i9 = (c0877b2 = (C0877b) this.f11697d.get(iB)).f11789a) < 0 && (i10 = i9 + iO) < i7; iB++) {
                        c0877b2.f11789a = i10;
                    }
                } else {
                    for (int iB2 = K0.b(this.f11697d, i7, iO); iB2 < this.f11697d.size() && (i8 = (c0877b = (C0877b) this.f11697d.get(iB2)).f11789a) >= 0; iB2++) {
                        c0877b.f11789a = -(iO - i8);
                    }
                }
            }
            if (i11 > 0) {
                int[] iArr = this.f11695b;
                int i13 = i7 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i7 < i12) {
                    Z4.l.V(i14 + i13, i13, i15, iArr, iArr);
                } else {
                    Z4.l.V(i15, i15 + i14, i13 + i14, iArr, iArr);
                }
            }
            if (i7 < i12) {
                i12 = i7 + i11;
            }
            int iO2 = o();
            if (i12 >= iO2) {
                AbstractC0914u.c("Check failed");
            }
            while (i12 < iO2) {
                int i16 = (i12 * 5) + 2;
                int i17 = this.f11695b[i16];
                int iP = i17 > -2 ? i17 : (p() + i17) - (-2);
                if (iP >= i7) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i17) {
                    this.f11695b[i16] = iP;
                }
                i12++;
                if (i12 == i7) {
                    i12 += i11;
                }
            }
        }
        this.f11700g = i7;
    }

    public final void B(int i7, int i8) {
        int i9 = this.l;
        int i10 = this.f11703k;
        int i11 = this.f11704m;
        if (i10 != i7) {
            Object[] objArr = this.f11696c;
            if (i7 < i10) {
                System.arraycopy(objArr, i7, objArr, i7 + i9, i10 - i7);
            } else {
                int i12 = i10 + i9;
                System.arraycopy(objArr, i12, objArr, i10, (i7 + i9) - i12);
            }
        }
        int iMin = Math.min(i8 + 1, p());
        if (i11 != iMin) {
            int length = this.f11696c.length - i9;
            if (iMin < i11) {
                int iR = r(iMin);
                int iR2 = r(i11);
                int i13 = this.f11700g;
                while (iR < iR2) {
                    int i14 = (iR * 5) + 4;
                    int i15 = this.f11695b[i14];
                    if (!(i15 >= 0)) {
                        AbstractC0914u.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f11695b[i14] = -((length - i15) + 1);
                    iR++;
                    if (iR == i13) {
                        iR += this.h;
                    }
                }
            } else {
                int iR3 = r(i11);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i16 = (iR3 * 5) + 4;
                    int i17 = this.f11695b[i16];
                    if (!(i17 < 0)) {
                        AbstractC0914u.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f11695b[i16] = i17 + length + 1;
                    iR3++;
                    if (iR3 == this.f11700g) {
                        iR3 += this.h;
                    }
                }
            }
            this.f11704m = iMin;
        }
        this.f11703k = i7;
    }

    public final Object C(int i7) {
        int iR = r(i7);
        int[] iArr = this.f11695b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f11696c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int D(int[] iArr, int i7) {
        int i8 = iArr[(r(i7) * 5) + 2];
        return i8 > -2 ? i8 : (p() + i8) - (-2);
    }

    public final Object E(Object obj) {
        if (this.f11705n > 0) {
            w(1, this.f11713v);
        }
        Object[] objArr = this.f11696c;
        int i7 = this.f11701i;
        this.f11701i = i7 + 1;
        Object obj2 = objArr[h(i7)];
        if (this.f11701i > this.f11702j) {
            AbstractC0914u.c("Writing to an invalid slot");
        }
        this.f11696c[h(this.f11701i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i7;
        t.x xVar = this.f11715x;
        if (xVar != null) {
            while (xVar.f16127b != 0) {
                int iA = C0879c.A(xVar);
                int iR = r(iA);
                int iT = iA + 1;
                int iT2 = t(iA) + iA;
                while (true) {
                    if (iT >= iT2) {
                        i7 = 0;
                        break;
                    } else {
                        if ((this.f11695b[(r(iT) * 5) + 1] & 201326592) != 0) {
                            i7 = 1;
                            break;
                        }
                        iT += t(iT);
                    }
                }
                int[] iArr = this.f11695b;
                int i8 = (iR * 5) + 1;
                int i9 = iArr[i8];
                if (((67108864 & i9) == 0 ? 0 : 1) != i7) {
                    iArr[i8] = (i7 << 26) | ((-67108865) & i9);
                    int iD = D(iArr, iA);
                    if (iD >= 0) {
                        C0879c.h(xVar, iD);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (!(this.f11705n == 0)) {
            AbstractC0914u.c("Cannot remove group while inserting");
        }
        int i7 = this.f11711t;
        int i8 = this.f11701i;
        int iG = g(this.f11695b, r(i7));
        int iK = K();
        N(this.f11713v);
        t.x xVar = this.f11715x;
        if (xVar != null) {
            while (true) {
                int i9 = xVar.f16127b;
                if (i9 == 0) {
                    break;
                }
                if (i9 == 0) {
                    AbstractC1525a.e("IntList is empty.");
                    throw null;
                }
                if (xVar.f16126a[0] < i7) {
                    break;
                }
                C0879c.A(xVar);
            }
        }
        boolean zH = H(i7, this.f11711t - i7);
        I(iG, this.f11701i - iG, i7 - 1);
        this.f11711t = i7;
        this.f11701i = i8;
        this.f11706o -= iK;
        return zH;
    }

    public final boolean H(int i7, int i8) {
        if (i8 > 0) {
            ArrayList arrayList = this.f11697d;
            A(i7);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f11698e;
                int i9 = i7 + i8;
                int iB = K0.b(this.f11697d, i9, o() - this.h);
                if (iB >= this.f11697d.size()) {
                    iB--;
                }
                int i10 = iB + 1;
                int i11 = 0;
                while (iB >= 0) {
                    C0877b c0877b = (C0877b) this.f11697d.get(iB);
                    int iC = c(c0877b);
                    if (iC < i7) {
                        break;
                    }
                    if (iC < i9) {
                        c0877b.f11789a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i11 == 0) {
                            i11 = iB + 1;
                        }
                        i10 = iB;
                    }
                    iB--;
                }
                z = i10 < i11;
                if (z) {
                    this.f11697d.subList(i10, i11).clear();
                }
            }
            this.f11700g = i7;
            this.h += i8;
            int i12 = this.f11704m;
            if (i12 > i7) {
                this.f11704m = Math.max(i7, i12 - i8);
            }
            int i13 = this.f11712u;
            if (i13 >= this.f11700g) {
                this.f11712u = i13 - i8;
            }
            int i14 = this.f11713v;
            if (i14 >= 0 && (this.f11695b[(r(i14) * 5) + 1] & 67108864) != 0) {
                S(i14);
            }
        }
        return z;
    }

    public final void I(int i7, int i8, int i9) {
        if (i8 > 0) {
            int i10 = this.l;
            int i11 = i7 + i8;
            B(i11, i9);
            this.f11703k = i7;
            this.l = i10 + i8;
            Z4.l.d0(this.f11696c, i7, i11);
            int i12 = this.f11702j;
            if (i12 >= i7) {
                this.f11702j = i12 - i8;
            }
        }
    }

    public final Object J(int i7, int i8, Object obj) {
        int iM = M(this.f11695b, r(i7));
        int iG = g(this.f11695b, r(i7 + 1));
        int i9 = iM + i8;
        if (i9 < iM || i9 >= iG) {
            AbstractC0914u.c("Write to an invalid slot index " + i8 + " for group " + i7);
        }
        int iH = h(i9);
        Object[] objArr = this.f11696c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int K() {
        int iR = r(this.f11711t);
        int iA = K0.a(this.f11695b, iR) + this.f11711t;
        this.f11711t = iA;
        this.f11701i = g(this.f11695b, r(iA));
        int i7 = this.f11695b[(iR * 5) + 1];
        if ((1073741824 & i7) != 0) {
            return 1;
        }
        return i7 & 67108863;
    }

    public final void L() {
        int i7 = this.f11712u;
        this.f11711t = i7;
        this.f11701i = g(this.f11695b, r(i7));
    }

    public final int M(int[] iArr, int i7) {
        if (i7 >= o()) {
            return this.f11696c.length - this.l;
        }
        int iC = K0.c(iArr, i7);
        return iC < 0 ? (this.f11696c.length - this.l) + iC + 1 : iC;
    }

    public final O N(int i7) {
        C0877b c0877bQ;
        HashMap map = this.f11698e;
        if (map == null || (c0877bQ = Q(i7)) == null) {
            return null;
        }
        return (O) map.get(c0877bQ);
    }

    public final void O() {
        if (this.f11705n != 0) {
            AbstractC0914u.c("Key must be supplied when inserting");
        }
        W w7 = C0903o.f11850a;
        P(0, w7, w7, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i7, Object obj, Object obj2, boolean z6) {
        int i8;
        int i9 = this.f11713v;
        byte b7 = this.f11705n > 0;
        this.f11709r.c(this.f11706o);
        W w7 = C0903o.f11850a;
        if (b7 == true) {
            int i10 = this.f11711t;
            int iG = g(this.f11695b, r(i10));
            v(1);
            this.f11701i = iG;
            this.f11702j = iG;
            int iR = r(i10);
            int i11 = obj != w7 ? 1 : 0;
            int i12 = (z6 || obj2 == w7) ? 0 : 1;
            int i13 = i(iG, this.f11703k, this.l, this.f11696c.length);
            if (i13 >= 0 && this.f11704m < i10) {
                i13 = -(((this.f11696c.length - this.l) - i13) + 1);
            }
            int[] iArr = this.f11695b;
            int i14 = this.f11713v;
            int i15 = iR * 5;
            iArr[i15] = i7;
            iArr[i15 + 1] = ((z6 ? 1 : 0) << 30) | (i11 << 29) | (i12 << 28);
            iArr[i15 + 2] = i14;
            iArr[i15 + 3] = 0;
            iArr[i15 + 4] = i13;
            int i16 = (z6 ? 1 : 0) + i11 + i12;
            if (i16 > 0) {
                w(i16, i10);
                Object[] objArr = this.f11696c;
                int i17 = this.f11701i;
                if (z6) {
                    objArr[i17] = obj2;
                    i17++;
                }
                if (i11 != 0) {
                    objArr[i17] = obj;
                    i17++;
                }
                if (i12 != 0) {
                    objArr[i17] = obj2;
                    i17++;
                }
                this.f11701i = i17;
            }
            this.f11706o = 0;
            i8 = i10 + 1;
            this.f11713v = i10;
            this.f11711t = i8;
            if (i9 >= 0) {
                N(i9);
            }
        } else {
            this.f11707p.c(i9);
            this.f11708q.c((o() - this.h) - this.f11712u);
            int i18 = this.f11711t;
            int iR2 = r(i18);
            if (!AbstractC1209k.a(obj2, w7)) {
                if (z6) {
                    T(this.f11711t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.f11701i = M(this.f11695b, iR2);
            this.f11702j = g(this.f11695b, r(this.f11711t + 1));
            int[] iArr2 = this.f11695b;
            int i19 = iR2 * 5;
            this.f11706o = iArr2[i19 + 1] & 67108863;
            this.f11713v = i18;
            this.f11711t = i18 + 1;
            i8 = i18 + iArr2[i19 + 3];
        }
        this.f11712u = i8;
    }

    public final C0877b Q(int i7) {
        ArrayList arrayList;
        int iE;
        if (i7 < 0 || i7 >= p() || (iE = K0.e((arrayList = this.f11697d), i7, p())) < 0) {
            return null;
        }
        return (C0877b) arrayList.get(iE);
    }

    public final void R(Object obj) {
        int iR = r(this.f11711t);
        int i7 = (iR * 5) + 1;
        if ((this.f11695b[i7] & 268435456) == 0) {
            AbstractC0914u.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f11696c;
        int[] iArr = this.f11695b;
        objArr[h(Integer.bitCount(iArr[i7] >> 29) + g(iArr, iR))] = obj;
    }

    public final void S(int i7) {
        if (i7 >= 0) {
            t.x xVar = this.f11715x;
            if (xVar == null) {
                xVar = new t.x();
                this.f11715x = xVar;
            }
            C0879c.h(xVar, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.r(r5)
            int[] r1 = r4.f11695b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            f0.AbstractC0914u.c(r5)
        L2e:
            java.lang.Object[] r5 = r4.f11696c
            int[] r1 = r4.f11695b
            int r0 = r4.g(r1, r0)
            int r0 = r4.h(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.L0.T(int, java.lang.Object):void");
    }

    public final void a(int i7) {
        boolean z6 = false;
        if (!(i7 >= 0)) {
            AbstractC0914u.c("Cannot seek backwards");
        }
        if (!(this.f11705n <= 0)) {
            AbstractC0908q0.b("Cannot call seek() while inserting");
        }
        if (i7 == 0) {
            return;
        }
        int i8 = this.f11711t + i7;
        if (i8 >= this.f11713v && i8 <= this.f11712u) {
            z6 = true;
        }
        if (!z6) {
            AbstractC0914u.c("Cannot seek outside the current group (" + this.f11713v + '-' + this.f11712u + ')');
        }
        this.f11711t = i8;
        int iG = g(this.f11695b, r(i8));
        this.f11701i = iG;
        this.f11702j = iG;
    }

    public final C0877b b(int i7) {
        ArrayList arrayList = this.f11697d;
        int iE = K0.e(arrayList, i7, p());
        if (iE >= 0) {
            return (C0877b) arrayList.get(iE);
        }
        if (i7 > this.f11700g) {
            i7 = -(p() - i7);
        }
        C0877b c0877b = new C0877b(i7);
        arrayList.add(-(iE + 1), c0877b);
        return c0877b;
    }

    public final int c(C0877b c0877b) {
        int i7 = c0877b.f11789a;
        return i7 < 0 ? p() + i7 : i7;
    }

    public final void d() {
        int i7 = this.f11705n;
        this.f11705n = i7 + 1;
        if (i7 == 0) {
            this.f11708q.c((o() - this.h) - this.f11712u);
        }
    }

    public final void e(boolean z6) {
        this.f11714w = true;
        if (z6 && this.f11707p.f6086b == 0) {
            A(p());
            B(this.f11696c.length - this.l, this.f11700g);
            int i7 = this.f11703k;
            Z4.l.d0(this.f11696c, i7, this.l + i7);
            F();
        }
        int[] iArr = this.f11695b;
        int i8 = this.f11700g;
        Object[] objArr = this.f11696c;
        int i9 = this.f11703k;
        ArrayList arrayList = this.f11697d;
        HashMap map = this.f11698e;
        t.y yVar = this.f11699f;
        I0 i02 = this.f11694a;
        i02.getClass();
        if (!i02.f11685u) {
            AbstractC0908q0.a("Unexpected writer close()");
        }
        i02.f11685u = false;
        i02.f11679o = iArr;
        i02.f11680p = i8;
        i02.f11681q = objArr;
        i02.f11682r = i9;
        i02.f11687w = arrayList;
        i02.f11688x = map;
        i02.f11689y = yVar;
    }

    public final int f(int i7) {
        return g(this.f11695b, r(i7));
    }

    public final int g(int[] iArr, int i7) {
        if (i7 >= o()) {
            return this.f11696c.length - this.l;
        }
        int i8 = iArr[(i7 * 5) + 4];
        return i8 < 0 ? (this.f11696c.length - this.l) + i8 + 1 : i8;
    }

    public final int h(int i7) {
        return (this.l * (i7 < this.f11703k ? 0 : 1)) + i7;
    }

    public final void j() {
        C1444F c1444f;
        boolean z6 = this.f11705n > 0;
        int i7 = this.f11711t;
        int i8 = this.f11712u;
        int i9 = this.f11713v;
        int iR = r(i9);
        int i10 = this.f11706o;
        int i11 = i7 - i9;
        int i12 = iR * 5;
        int i13 = i12 + 1;
        boolean z7 = (this.f11695b[i13] & 1073741824) != 0;
        C0366w c0366w = this.f11709r;
        if (z6) {
            t.y yVar = this.f11710s;
            if (yVar != null && (c1444f = (C1444F) yVar.b(i9)) != null) {
                Object[] objArr = c1444f.f15983a;
                int i14 = c1444f.f15984b;
                for (int i15 = 0; i15 < i14; i15++) {
                    E(objArr[i15]);
                }
            }
            int[] iArr = this.f11695b;
            iArr[i12 + 3] = i11;
            K0.d(iR, i10, iArr);
            int iB = c0366w.b();
            if (z7) {
                i10 = 1;
            }
            this.f11706o = iB + i10;
            int iD = D(this.f11695b, i9);
            this.f11713v = iD;
            int iP = iD < 0 ? p() : r(iD + 1);
            int iG = iP >= 0 ? g(this.f11695b, iP) : 0;
            this.f11701i = iG;
            this.f11702j = iG;
            return;
        }
        if (i7 != i8) {
            AbstractC0914u.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f11695b;
        int i16 = i12 + 3;
        int i17 = iArr2[i16];
        int i18 = iArr2[i13] & 67108863;
        iArr2[i16] = i11;
        K0.d(iR, i10, iArr2);
        int iB2 = this.f11707p.b();
        this.f11712u = (o() - this.h) - this.f11708q.b();
        this.f11713v = iB2;
        int iD2 = D(this.f11695b, i9);
        int iB3 = c0366w.b();
        this.f11706o = iB3;
        if (iD2 == iB2) {
            this.f11706o = iB3 + (z7 ? 0 : i10 - i18);
            return;
        }
        int i19 = i11 - i17;
        int i20 = z7 ? 0 : i10 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iD2 != 0 && iD2 != iB2 && (i20 != 0 || i19 != 0)) {
                int iR2 = r(iD2);
                if (i19 != 0) {
                    int[] iArr3 = this.f11695b;
                    int i21 = (iR2 * 5) + 3;
                    iArr3[i21] = iArr3[i21] + i19;
                }
                if (i20 != 0) {
                    int[] iArr4 = this.f11695b;
                    K0.d(iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i20, iArr4);
                }
                int[] iArr5 = this.f11695b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                iD2 = D(iArr5, iD2);
            }
        }
        this.f11706o += i20;
    }

    public final void k() {
        if (this.f11705n <= 0) {
            AbstractC0908q0.b("Unbalanced begin/end insert");
        }
        int i7 = this.f11705n - 1;
        this.f11705n = i7;
        if (i7 == 0) {
            if (this.f11709r.f6086b != this.f11707p.f6086b) {
                AbstractC0914u.c("startGroup/endGroup mismatch while inserting");
            }
            this.f11712u = (o() - this.h) - this.f11708q.b();
        }
    }

    public final void l(int i7) {
        boolean z6 = false;
        if (!(this.f11705n <= 0)) {
            AbstractC0914u.c("Cannot call ensureStarted() while inserting");
        }
        int i8 = this.f11713v;
        if (i8 != i7) {
            if (i7 >= i8 && i7 < this.f11712u) {
                z6 = true;
            }
            if (!z6) {
                AbstractC0914u.c("Started group at " + i7 + " must be a subgroup of the group at " + i8);
            }
            int i9 = this.f11711t;
            int i10 = this.f11701i;
            int i11 = this.f11702j;
            this.f11711t = i7;
            O();
            this.f11711t = i9;
            this.f11701i = i10;
            this.f11702j = i11;
        }
    }

    public final void m(int i7, int i8, int i9) {
        if (i7 >= this.f11700g) {
            i7 = -((p() - i7) + 2);
        }
        while (i9 < i8) {
            this.f11695b[(r(i9) * 5) + 2] = i7;
            int i10 = this.f11695b[(r(i9) * 5) + 3] + i9;
            m(i9, i10, i9 + 1);
            i9 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x00eb, code lost:
    
        u.AbstractC1525a.d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00f0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r20, l5.e r21) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.L0.n(int, l5.e):void");
    }

    public final int o() {
        return this.f11695b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i7) {
        int iR = r(i7);
        int[] iArr = this.f11695b;
        int i8 = (iR * 5) + 1;
        if ((iArr[i8] & 268435456) == 0) {
            return C0903o.f11850a;
        }
        return this.f11696c[Integer.bitCount(iArr[i8] >> 29) + g(iArr, iR)];
    }

    public final int r(int i7) {
        return (this.h * (i7 < this.f11700g ? 0 : 1)) + i7;
    }

    public final Object s(int i7) {
        int iR = r(i7);
        int[] iArr = this.f11695b;
        int i8 = iR * 5;
        int i9 = iArr[i8 + 1];
        if ((536870912 & i9) == 0) {
            return null;
        }
        return this.f11696c[Integer.bitCount(i9 >> 30) + iArr[i8 + 4]];
    }

    public final int t(int i7) {
        return K0.a(this.f11695b, r(i7));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f11711t + " end=" + this.f11712u + " size = " + p() + " gap=" + this.f11700g + '-' + (this.f11700g + this.h) + ')';
    }

    public final boolean u(int i7, int i8) {
        int iO;
        int iT;
        if (i8 == this.f11713v) {
            iO = this.f11712u;
        } else {
            C0366w c0366w = this.f11707p;
            if (i8 > c0366w.a(0)) {
                iT = t(i8);
            } else {
                int[] iArr = c0366w.f6085a;
                int iMin = Math.min(iArr.length, c0366w.f6086b);
                int i9 = 0;
                while (true) {
                    if (i9 >= iMin) {
                        i9 = -1;
                        break;
                    }
                    if (iArr[i9] == i8) {
                        break;
                    }
                    i9++;
                }
                if (i9 < 0) {
                    iT = t(i8);
                } else {
                    iO = (o() - this.h) - this.f11708q.f6085a[i9];
                }
            }
            iO = iT + i8;
        }
        return i7 > i8 && i7 < iO;
    }

    public final void v(int i7) {
        if (i7 > 0) {
            int i8 = this.f11711t;
            A(i8);
            int i9 = this.f11700g;
            int i10 = this.h;
            int[] iArr = this.f11695b;
            int length = iArr.length / 5;
            int i11 = length - i10;
            if (i10 < i7) {
                int iMax = Math.max(Math.max(length * 2, i11 + i7), 32);
                int[] iArr2 = new int[iMax * 5];
                int i12 = iMax - i11;
                Z4.l.V(0, 0, i9 * 5, iArr, iArr2);
                Z4.l.V((i9 + i12) * 5, (i10 + i9) * 5, length * 5, iArr, iArr2);
                this.f11695b = iArr2;
                i10 = i12;
            }
            int i13 = this.f11712u;
            if (i13 >= i9) {
                this.f11712u = i13 + i7;
            }
            int i14 = i9 + i7;
            this.f11700g = i14;
            this.h = i10 - i7;
            int i15 = i(i11 > 0 ? f(i8 + i7) : 0, this.f11704m >= i9 ? this.f11703k : 0, this.l, this.f11696c.length);
            for (int i16 = i9; i16 < i14; i16++) {
                this.f11695b[(i16 * 5) + 4] = i15;
            }
            int i17 = this.f11704m;
            if (i17 >= i9) {
                this.f11704m = i17 + i7;
            }
        }
    }

    public final void w(int i7, int i8) {
        if (i7 > 0) {
            B(this.f11701i, i8);
            int i9 = this.f11703k;
            int i10 = this.l;
            if (i10 < i7) {
                Object[] objArr = this.f11696c;
                int length = objArr.length;
                int i11 = length - i10;
                int iMax = Math.max(Math.max(length * 2, i11 + i7), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i12 = 0; i12 < iMax; i12++) {
                    objArr2[i12] = null;
                }
                int i13 = iMax - i11;
                int i14 = i10 + i9;
                System.arraycopy(objArr, 0, objArr2, 0, i9);
                System.arraycopy(objArr, i14, objArr2, i9 + i13, length - i14);
                this.f11696c = objArr2;
                i10 = i13;
            }
            int i15 = this.f11702j;
            if (i15 >= i9) {
                this.f11702j = i15 + i7;
            }
            this.f11703k = i9 + i7;
            this.l = i10 - i7;
        }
    }

    public final boolean x(int i7) {
        return (this.f11695b[(r(i7) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(I0 i02, int i7) {
        if (this.f11705n <= 0) {
            AbstractC0914u.c("Check failed");
        }
        if (i7 == 0 && this.f11711t == 0 && this.f11694a.f11680p == 0) {
            int[] iArr = i02.f11679o;
            int i8 = iArr[(i7 * 5) + 3];
            int i9 = i02.f11680p;
            if (i8 == i9) {
                int[] iArr2 = this.f11695b;
                Object[] objArr = this.f11696c;
                ArrayList arrayList = this.f11697d;
                HashMap map = this.f11698e;
                t.y yVar = this.f11699f;
                Object[] objArr2 = i02.f11681q;
                int i10 = i02.f11682r;
                HashMap map2 = i02.f11688x;
                t.y yVar2 = i02.f11689y;
                this.f11695b = iArr;
                this.f11696c = objArr2;
                this.f11697d = i02.f11687w;
                this.f11700g = i9;
                this.h = (iArr.length / 5) - i9;
                this.f11703k = i10;
                this.l = objArr2.length - i10;
                this.f11704m = i9;
                this.f11698e = map2;
                this.f11699f = yVar2;
                i02.f11679o = iArr2;
                i02.f11680p = 0;
                i02.f11681q = objArr;
                i02.f11682r = 0;
                i02.f11687w = arrayList;
                i02.f11688x = map;
                i02.f11689y = yVar;
                return;
            }
        }
        L0 l0G = i02.g();
        try {
            C0879c.s(l0G, i7, this, true, true, false);
            l0G.e(true);
        } catch (Throwable th) {
            l0G.e(false);
            throw th;
        }
    }
}
