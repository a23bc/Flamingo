package h0;

import Z4.o;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements RandomAccess {

    /* JADX INFO: renamed from: o */
    public Object[] f12546o;

    /* JADX INFO: renamed from: p */
    public C0994b f12547p;

    /* JADX INFO: renamed from: q */
    public int f12548q = 0;

    public e(Object[] objArr) {
        this.f12546o = objArr;
    }

    public final void a(int i7, Object obj) {
        int i8 = this.f12548q + 1;
        if (this.f12546o.length < i8) {
            n(i8);
        }
        Object[] objArr = this.f12546o;
        int i9 = this.f12548q;
        if (i7 != i9) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i9 - i7);
        }
        objArr[i7] = obj;
        this.f12548q++;
    }

    public final void b(Object obj) {
        int i7 = this.f12548q + 1;
        if (this.f12546o.length < i7) {
            n(i7);
        }
        Object[] objArr = this.f12546o;
        int i8 = this.f12548q;
        objArr[i8] = obj;
        this.f12548q = i8 + 1;
    }

    public final void c(int i7, e eVar) {
        int i8 = eVar.f12548q;
        if (i8 == 0) {
            return;
        }
        int i9 = this.f12548q + i8;
        if (this.f12546o.length < i9) {
            n(i9);
        }
        Object[] objArr = this.f12546o;
        int i10 = this.f12548q;
        if (i7 != i10) {
            System.arraycopy(objArr, i7, objArr, i7 + i8, i10 - i7);
        }
        System.arraycopy(eVar.f12546o, 0, objArr, i7, i8);
        this.f12548q += i8;
    }

    public final void d(int i7, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i8 = this.f12548q + size;
        if (this.f12546o.length < i8) {
            n(i8);
        }
        Object[] objArr = this.f12546o;
        int i9 = this.f12548q;
        if (i7 != i9) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i9 - i7);
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr[i7 + i10] = list.get(i10);
        }
        this.f12548q += size;
    }

    public final boolean e(int i7, Collection collection) {
        int i8 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i9 = this.f12548q + size;
        if (this.f12546o.length < i9) {
            n(i9);
        }
        Object[] objArr = this.f12546o;
        int i10 = this.f12548q;
        if (i7 != i10) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i10 - i7);
        }
        for (Object obj : collection) {
            int i11 = i8 + 1;
            if (i8 < 0) {
                o.i0();
                throw null;
            }
            objArr[i8 + i7] = obj;
            i8 = i11;
        }
        this.f12548q += size;
        return true;
    }

    public final List g() {
        C0994b c0994b = this.f12547p;
        if (c0994b != null) {
            return c0994b;
        }
        C0994b c0994b2 = new C0994b(this);
        this.f12547p = c0994b2;
        return c0994b2;
    }

    public final void h() {
        Object[] objArr = this.f12546o;
        int i7 = this.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f12548q = 0;
    }

    public final boolean i(Object obj) {
        int i7 = this.f12548q - 1;
        if (i7 >= 0) {
            for (int i8 = 0; !AbstractC1209k.a(this.f12546o[i8], obj); i8++) {
                if (i8 != i7) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.f12546o;
        int i7 = this.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            if (AbstractC1209k.a(obj, objArr[i8])) {
                return i8;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        l(iJ);
        return true;
    }

    public final Object l(int i7) {
        Object[] objArr = this.f12546o;
        Object obj = objArr[i7];
        int i8 = this.f12548q;
        if (i7 != i8 - 1) {
            int i9 = i7 + 1;
            System.arraycopy(objArr, i9, objArr, i7, i8 - i9);
        }
        int i10 = this.f12548q - 1;
        this.f12548q = i10;
        objArr[i10] = null;
        return obj;
    }

    public final void m(int i7, int i8) {
        if (i8 > i7) {
            int i9 = this.f12548q;
            if (i8 < i9) {
                Object[] objArr = this.f12546o;
                System.arraycopy(objArr, i8, objArr, i7, i9 - i8);
            }
            int i10 = this.f12548q;
            int i11 = i10 - (i8 - i7);
            int i12 = i10 - 1;
            if (i11 <= i12) {
                int i13 = i11;
                while (true) {
                    this.f12546o[i13] = null;
                    if (i13 == i12) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f12548q = i11;
        }
    }

    public final void n(int i7) {
        Object[] objArr = this.f12546o;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i7, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f12546o = objArr2;
    }
}
