package A2;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends t2.h0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f443n = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H2.Y f445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f446g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t2.h0[] f449k;
    public final Object[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f450m;

    /* JADX WARN: Illegal instructions before constructor call */
    public t0(ArrayList arrayList, H2.Y y6) {
        t2.h0[] h0VarArr = new t2.h0[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            h0VarArr[i8] = ((f0) it.next()).c();
            i8++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i7] = ((f0) it2.next()).b();
            i7++;
        }
        this(h0VarArr, objArr, y6);
    }

    @Override // t2.h0
    public final int a(boolean z6) {
        if (this.f444e != 0) {
            int iQ = 0;
            if (z6) {
                int[] iArr = this.f445f.f3114b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                t2.h0[] h0VarArr = this.f449k;
                if (!h0VarArr[iQ].p()) {
                    return h0VarArr[iQ].a(z6) + this.f448j[iQ];
                }
                iQ = q(iQ, z6);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // t2.h0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f450m.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f449k[iIntValue].b(obj3)) != -1) {
                return this.f447i[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // t2.h0
    public final int c(boolean z6) {
        int iR;
        int i7 = this.f444e;
        if (i7 != 0) {
            if (z6) {
                int[] iArr = this.f445f.f3114b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i7 - 1;
            }
            do {
                t2.h0[] h0VarArr = this.f449k;
                if (!h0VarArr[iR].p()) {
                    return h0VarArr[iR].c(z6) + this.f448j[iR];
                }
                iR = r(iR, z6);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // t2.h0
    public final int e(int i7, int i8, boolean z6) {
        int[] iArr = this.f448j;
        int iC = w2.t.c(iArr, i7 + 1, false, false);
        int i9 = iArr[iC];
        t2.h0[] h0VarArr = this.f449k;
        int iE = h0VarArr[iC].e(i7 - i9, i8 != 2 ? i8 : 0, z6);
        if (iE != -1) {
            return i9 + iE;
        }
        int iQ = q(iC, z6);
        while (iQ != -1 && h0VarArr[iQ].p()) {
            iQ = q(iQ, z6);
        }
        if (iQ != -1) {
            return h0VarArr[iQ].a(z6) + iArr[iQ];
        }
        if (i8 == 2) {
            return a(z6);
        }
        return -1;
    }

    @Override // t2.h0
    public final t2.e0 f(int i7, t2.e0 e0Var, boolean z6) {
        int[] iArr = this.f447i;
        int iC = w2.t.c(iArr, i7 + 1, false, false);
        int i8 = this.f448j[iC];
        this.f449k[iC].f(i7 - iArr[iC], e0Var, z6);
        e0Var.f16428c += i8;
        if (z6) {
            Object obj = this.l[iC];
            Object obj2 = e0Var.f16427b;
            obj2.getClass();
            e0Var.f16427b = Pair.create(obj, obj2);
        }
        return e0Var;
    }

    @Override // t2.h0
    public final t2.e0 g(Object obj, t2.e0 e0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f450m.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i7 = this.f448j[iIntValue];
        this.f449k[iIntValue].g(obj3, e0Var);
        e0Var.f16428c += i7;
        e0Var.f16427b = obj;
        return e0Var;
    }

    @Override // t2.h0
    public final int h() {
        return this.h;
    }

    @Override // t2.h0
    public final int k(int i7, int i8, boolean z6) {
        int[] iArr = this.f448j;
        int iC = w2.t.c(iArr, i7 + 1, false, false);
        int i9 = iArr[iC];
        t2.h0[] h0VarArr = this.f449k;
        int iK = h0VarArr[iC].k(i7 - i9, i8 != 2 ? i8 : 0, z6);
        if (iK != -1) {
            return i9 + iK;
        }
        int iR = r(iC, z6);
        while (iR != -1 && h0VarArr[iR].p()) {
            iR = r(iR, z6);
        }
        if (iR != -1) {
            return h0VarArr[iR].c(z6) + iArr[iR];
        }
        if (i8 == 2) {
            return c(z6);
        }
        return -1;
    }

    @Override // t2.h0
    public final Object l(int i7) {
        int[] iArr = this.f447i;
        int iC = w2.t.c(iArr, i7 + 1, false, false);
        return Pair.create(this.l[iC], this.f449k[iC].l(i7 - iArr[iC]));
    }

    @Override // t2.h0
    public final t2.g0 m(int i7, t2.g0 g0Var, long j3) {
        int[] iArr = this.f448j;
        int iC = w2.t.c(iArr, i7 + 1, false, false);
        int i8 = iArr[iC];
        int i9 = this.f447i[iC];
        this.f449k[iC].m(i7 - i8, g0Var, j3);
        Object objCreate = this.l[iC];
        if (!t2.g0.f16443p.equals(g0Var.f16454a)) {
            objCreate = Pair.create(objCreate, g0Var.f16454a);
        }
        g0Var.f16454a = objCreate;
        g0Var.f16464m += i9;
        g0Var.f16465n += i9;
        return g0Var;
    }

    @Override // t2.h0
    public final int o() {
        return this.f446g;
    }

    public final int q(int i7, boolean z6) {
        if (!z6) {
            if (i7 < this.f444e - 1) {
                return i7 + 1;
            }
            return -1;
        }
        H2.Y y6 = this.f445f;
        int i8 = y6.f3115c[i7] + 1;
        int[] iArr = y6.f3114b;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    public final int r(int i7, boolean z6) {
        if (!z6) {
            if (i7 > 0) {
                return i7 - 1;
            }
            return -1;
        }
        H2.Y y6 = this.f445f;
        int i8 = y6.f3115c[i7] - 1;
        if (i8 >= 0) {
            return y6.f3114b[i8];
        }
        return -1;
    }

    public t0(t2.h0[] h0VarArr, Object[] objArr, H2.Y y6) {
        this.f445f = y6;
        this.f444e = y6.f3114b.length;
        int length = h0VarArr.length;
        this.f449k = h0VarArr;
        this.f447i = new int[length];
        this.f448j = new int[length];
        this.l = objArr;
        this.f450m = new HashMap();
        int length2 = h0VarArr.length;
        int i7 = 0;
        int iO = 0;
        int iH = 0;
        int i8 = 0;
        while (i7 < length2) {
            t2.h0 h0Var = h0VarArr[i7];
            this.f449k[i8] = h0Var;
            this.f448j[i8] = iO;
            this.f447i[i8] = iH;
            iO += h0Var.o();
            iH += this.f449k[i8].h();
            this.f450m.put(objArr[i8], Integer.valueOf(i8));
            i7++;
            i8++;
        }
        this.f446g = iO;
        this.h = iH;
    }
}
