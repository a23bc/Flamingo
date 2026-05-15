package f0;

import Q0.C0366w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0 f11667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f11670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11673g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0366w f11675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11676k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11678n;

    public H0(I0 i02) {
        this.f11667a = i02;
        this.f11668b = i02.f11679o;
        int i7 = i02.f11680p;
        this.f11669c = i7;
        this.f11670d = i02.f11681q;
        this.f11671e = i02.f11682r;
        this.h = i7;
        this.f11674i = -1;
        this.f11675j = new C0366w();
    }

    public final C0877b a(int i7) {
        ArrayList arrayList = this.f11667a.f11687w;
        int iE = K0.e(arrayList, i7, this.f11669c);
        if (iE >= 0) {
            return (C0877b) arrayList.get(iE);
        }
        C0877b c0877b = new C0877b(i7);
        arrayList.add(-(iE + 1), c0877b);
        return c0877b;
    }

    public final Object b(int[] iArr, int i7) {
        int i8 = i7 * 5;
        int i9 = iArr[i8 + 1];
        if ((268435456 & i9) != 0) {
            return this.f11670d[i8 >= iArr.length ? iArr.length : iArr[i8 + 4] + Integer.bitCount(i9 >> 29)];
        }
        return C0903o.f11850a;
    }

    public final void c() {
        this.f11672f = true;
        I0 i02 = this.f11667a;
        i02.getClass();
        if (this.f11667a != i02 || i02.f11683s <= 0) {
            AbstractC0914u.c("Unexpected reader close()");
        }
        i02.f11683s--;
        this.f11670d = new Object[0];
    }

    public final boolean d(int i7) {
        return (this.f11668b[(i7 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f11676k == 0) {
            if (!(this.f11673g == this.h)) {
                AbstractC0914u.c("endGroup() not called at the end of a group");
            }
            int i7 = (this.f11674i * 5) + 2;
            int[] iArr = this.f11668b;
            int i8 = iArr[i7];
            this.f11674i = i8;
            int i9 = this.f11669c;
            this.h = i8 < 0 ? i9 : K0.a(iArr, i8) + i8;
            int iB = this.f11675j.b();
            if (iB < 0) {
                this.l = 0;
                this.f11677m = 0;
            } else {
                this.l = iB;
                this.f11677m = i8 >= i9 - 1 ? this.f11671e : iArr[((i8 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i7 = this.f11673g;
        if (i7 < this.h) {
            return b(this.f11668b, i7);
        }
        return 0;
    }

    public final int g() {
        int i7 = this.f11673g;
        if (i7 >= this.h) {
            return 0;
        }
        return this.f11668b[i7 * 5];
    }

    public final Object h(int i7, int i8) {
        int[] iArr = this.f11668b;
        int iC = K0.c(iArr, i7);
        int i9 = i7 + 1;
        int i10 = iC + i8;
        return i10 < (i9 < this.f11669c ? iArr[(i9 * 5) + 4] : this.f11671e) ? this.f11670d[i10] : C0903o.f11850a;
    }

    public final int i(int i7) {
        return this.f11668b[i7 * 5];
    }

    public final boolean j(int i7) {
        return (this.f11668b[(i7 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i7) {
        return (this.f11668b[(i7 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i7) {
        return (this.f11668b[(i7 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i7;
        if (this.f11676k > 0 || (i7 = this.l) >= this.f11677m) {
            this.f11678n = false;
            return C0903o.f11850a;
        }
        this.f11678n = true;
        Object[] objArr = this.f11670d;
        this.l = i7 + 1;
        return objArr[i7];
    }

    public final Object n(int i7) {
        int i8 = i7 * 5;
        int[] iArr = this.f11668b;
        int i9 = iArr[i8 + 1] & 1073741824;
        if (i9 != 0) {
            return i9 != 0 ? this.f11670d[iArr[i8 + 4]] : C0903o.f11850a;
        }
        return null;
    }

    public final int o(int i7) {
        return this.f11668b[(i7 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i7) {
        int i8 = i7 * 5;
        int i9 = iArr[i8 + 1];
        if ((536870912 & i9) == 0) {
            return null;
        }
        return this.f11670d[Integer.bitCount(i9 >> 30) + iArr[i8 + 4]];
    }

    public final int q(int i7) {
        return this.f11668b[(i7 * 5) + 2];
    }

    public final void r(int i7) {
        if (!(this.f11676k == 0)) {
            AbstractC0914u.c("Cannot reposition while in an empty region");
        }
        this.f11673g = i7;
        int[] iArr = this.f11668b;
        int i8 = this.f11669c;
        int i9 = i7 < i8 ? iArr[(i7 * 5) + 2] : -1;
        if (i9 != this.f11674i) {
            this.f11674i = i9;
            if (i9 < 0) {
                this.h = i8;
            } else {
                this.h = K0.a(iArr, i9) + i9;
            }
            this.l = 0;
            this.f11677m = 0;
        }
    }

    public final int s() {
        if (!(this.f11676k == 0)) {
            AbstractC0914u.c("Cannot skip while in an empty region");
        }
        int i7 = this.f11673g;
        int[] iArr = this.f11668b;
        int i8 = (iArr[(i7 * 5) + 1] & 1073741824) == 0 ? iArr[(i7 * 5) + 1] & 67108863 : 1;
        this.f11673g = K0.a(iArr, i7) + i7;
        return i8;
    }

    public final void t() {
        if (!(this.f11676k == 0)) {
            AbstractC0914u.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f11673g = this.h;
        this.l = 0;
        this.f11677m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f11673g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.f11674i);
        sb.append(", end=");
        return Z1.l.r(sb, this.h, ')');
    }

    public final void u() {
        if (this.f11676k <= 0) {
            int i7 = this.f11674i;
            int i8 = this.f11673g;
            int[] iArr = this.f11668b;
            if (!(iArr[(i8 * 5) + 2] == i7)) {
                AbstractC0908q0.a("Invalid slot table detected");
            }
            int i9 = this.l;
            int i10 = this.f11677m;
            C0366w c0366w = this.f11675j;
            if (i9 == 0 && i10 == 0) {
                c0366w.c(-1);
            } else {
                c0366w.c(i9);
            }
            this.f11674i = i8;
            this.h = K0.a(iArr, i8) + i8;
            int i11 = i8 + 1;
            this.f11673g = i11;
            this.l = K0.c(iArr, i8);
            this.f11677m = i8 >= this.f11669c - 1 ? this.f11671e : iArr[(i11 * 5) + 4];
        }
    }
}
