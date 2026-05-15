package t;

import h0.C0994b;
import java.util.List;
import m5.AbstractC1209k;
import r5.C1423d;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1444F {

    /* JADX INFO: renamed from: a */
    public Object[] f15983a;

    /* JADX INFO: renamed from: b */
    public int f15984b;

    /* JADX INFO: renamed from: c */
    public C0994b f15985c;

    public C1444F(int i7) {
        this.f15983a = i7 == 0 ? O.f16029a : new Object[i7];
    }

    public final void a(Object obj) {
        int i7 = this.f15984b + 1;
        Object[] objArr = this.f15983a;
        if (objArr.length < i7) {
            l(i7, objArr);
        }
        Object[] objArr2 = this.f15983a;
        int i8 = this.f15984b;
        objArr2[i8] = obj;
        this.f15984b = i8 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i7 = this.f15984b;
        int size = list.size() + i7;
        Object[] objArr = this.f15983a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.f15983a;
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            objArr2[i8 + i7] = list.get(i8);
        }
        this.f15984b = list.size() + this.f15984b;
    }

    public final void c() {
        Z4.l.d0(this.f15983a, 0, this.f15984b);
        this.f15984b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f15983a[0];
        }
        AbstractC1525a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i7) {
        if (i7 >= 0 && i7 < this.f15984b) {
            return this.f15983a[i7];
        }
        m(i7);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1444F) {
            C1444F c1444f = (C1444F) obj;
            int i7 = c1444f.f15984b;
            int i8 = this.f15984b;
            if (i7 == i8) {
                Object[] objArr = this.f15983a;
                Object[] objArr2 = c1444f.f15983a;
                C1423d c1423dM = i6.h.M(0, i8);
                int i9 = c1423dM.f15781o;
                int i10 = c1423dM.f15782p;
                if (i9 > i10) {
                    return true;
                }
                while (AbstractC1209k.a(objArr[i9], objArr2[i9])) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i7 = 0;
        if (obj == null) {
            Object[] objArr = this.f15983a;
            int i8 = this.f15984b;
            while (i7 < i8) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        Object[] objArr2 = this.f15983a;
        int i9 = this.f15984b;
        while (i7 < i9) {
            if (obj.equals(objArr2[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f15984b == 0;
    }

    public final boolean h() {
        return this.f15984b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f15983a;
        int i7 = this.f15984b;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[i8];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        j(iF);
        return true;
    }

    public final Object j(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f15984b)) {
            m(i7);
            throw null;
        }
        Object[] objArr = this.f15983a;
        Object obj = objArr[i7];
        if (i7 != i8 - 1) {
            Z4.l.W(i7, i7 + 1, i8, objArr, objArr);
        }
        int i9 = this.f15984b - 1;
        this.f15984b = i9;
        objArr[i9] = null;
        return obj;
    }

    public final void k(int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 > (i9 = this.f15984b) || i8 < 0 || i8 > i9) {
            AbstractC1525a.d("Start (" + i7 + ") and end (" + i8 + ") must be in 0.." + this.f15984b);
            throw null;
        }
        if (i8 < i7) {
            AbstractC1525a.c("Start (" + i7 + ") is more than end (" + i8 + ')');
            throw null;
        }
        if (i8 != i7) {
            if (i8 < i9) {
                Object[] objArr = this.f15983a;
                Z4.l.W(i7, i8, i9, objArr, objArr);
            }
            int i10 = this.f15984b;
            int i11 = i10 - (i8 - i7);
            Z4.l.d0(this.f15983a, i11, i10);
            this.f15984b = i11;
        }
    }

    public final void l(int i7, Object[] objArr) {
        AbstractC1209k.f(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i7, (length * 3) / 2)];
        Z4.l.W(0, 0, length, objArr, objArr2);
        this.f15983a = objArr2;
    }

    public final void m(int i7) {
        StringBuilder sbV = n1.c.v(i7, "Index ", " must be in 0..");
        sbV.append(this.f15984b - 1);
        AbstractC1525a.d(sbV.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f15983a;
        int i7 = this.f15984b;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i8++;
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C1444F() {
        this(16);
    }
}
