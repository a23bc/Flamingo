package t;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public class T {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f16034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f16035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16036q;

    public T(int i7) {
        this.f16034o = i7 == 0 ? AbstractC1525a.f17126a : new int[i7];
        this.f16035p = i7 == 0 ? AbstractC1525a.f17128c : new Object[i7 << 1];
    }

    public final int b(Object obj) {
        int i7 = this.f16036q * 2;
        Object[] objArr = this.f16035p;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final int c(int i7, Object obj) {
        int i8 = this.f16036q;
        if (i8 == 0) {
            return -1;
        }
        int iA = AbstractC1525a.a(i8, i7, this.f16034o);
        if (iA < 0 || AbstractC1209k.a(obj, this.f16035p[iA << 1])) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.f16034o[i9] == i7) {
            if (AbstractC1209k.a(obj, this.f16035p[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f16034o[i10] == i7; i10--) {
            if (AbstractC1209k.a(obj, this.f16035p[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final void clear() {
        if (this.f16036q > 0) {
            this.f16034o = AbstractC1525a.f17126a;
            this.f16035p = AbstractC1525a.f17128c;
            this.f16036q = 0;
        }
        if (this.f16036q > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i7 = this.f16036q;
        if (i7 == 0) {
            return -1;
        }
        int iA = AbstractC1525a.a(i7, 0, this.f16034o);
        if (iA < 0 || this.f16035p[iA << 1] == null) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.f16034o[i8] == 0) {
            if (this.f16035p[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.f16034o[i9] == 0; i9--) {
            if (this.f16035p[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof T) {
                int i7 = this.f16036q;
                if (i7 != ((T) obj).f16036q) {
                    return false;
                }
                T t7 = (T) obj;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object objF = f(i8);
                    Object objI = i(i8);
                    Object obj2 = t7.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !t7.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f16036q != ((Map) obj).size()) {
                return false;
            }
            int i9 = this.f16036q;
            for (int i10 = 0; i10 < i9; i10++) {
                Object objF2 = f(i10);
                Object objI2 = i(i10);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 < this.f16036q) {
            z6 = true;
        }
        if (z6) {
            return this.f16035p[i7 << 1];
        }
        AbstractC1525a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final Object g(int i7) {
        if (!(i7 >= 0 && i7 < this.f16036q)) {
            AbstractC1525a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        Object[] objArr = this.f16035p;
        int i8 = i7 << 1;
        Object obj = objArr[i8 + 1];
        int i9 = this.f16036q;
        if (i9 <= 1) {
            clear();
            return obj;
        }
        int i10 = i9 - 1;
        int[] iArr = this.f16034o;
        if (iArr.length <= 8 || i9 >= iArr.length / 3) {
            if (i7 < i10) {
                int i11 = i7 + 1;
                Z4.l.V(i7, i11, i9, iArr, iArr);
                Object[] objArr2 = this.f16035p;
                Z4.l.W(i8, i11 << 1, i9 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f16035p;
            int i12 = i10 << 1;
            objArr3[i12] = null;
            objArr3[i12 + 1] = null;
        } else {
            int i13 = i9 > 8 ? i9 + (i9 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f16034o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16035p, i13 << 1);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f16035p = objArrCopyOf;
            if (i9 != this.f16036q) {
                throw new ConcurrentModificationException();
            }
            if (i7 > 0) {
                Z4.l.V(0, 0, i7, iArr, this.f16034o);
                Z4.l.W(0, 0, i8, objArr, this.f16035p);
            }
            if (i7 < i10) {
                int i14 = i7 + 1;
                Z4.l.V(i7, i14, i9, iArr, this.f16034o);
                Z4.l.W(i8, i14 << 1, i9 << 1, objArr, this.f16035p);
            }
        }
        if (i9 != this.f16036q) {
            throw new ConcurrentModificationException();
        }
        this.f16036q = i10;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f16035p[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f16035p[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i7, Object obj) {
        boolean z6 = false;
        if (i7 >= 0 && i7 < this.f16036q) {
            z6 = true;
        }
        if (!z6) {
            AbstractC1525a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f16035p;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f16034o;
        Object[] objArr = this.f16035p;
        int i7 = this.f16036q;
        int i8 = 1;
        int i9 = 0;
        int iHashCode = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 < this.f16036q) {
            z6 = true;
        }
        if (z6) {
            return this.f16035p[(i7 << 1) + 1];
        }
        AbstractC1525a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f16036q <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i7 = this.f16036q;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i8 = (iC << 1) + 1;
            Object[] objArr = this.f16035p;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~iC;
        int[] iArr = this.f16034o;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f16034o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16035p, i10 << 1);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f16035p = objArrCopyOf;
            if (i7 != this.f16036q) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr2 = this.f16034o;
            int i11 = i9 + 1;
            Z4.l.V(i11, i9, i7, iArr2, iArr2);
            Object[] objArr2 = this.f16035p;
            Z4.l.W(i11 << 1, i9 << 1, this.f16036q << 1, objArr2, objArr2);
        }
        int i12 = this.f16036q;
        if (i7 == i12) {
            int[] iArr3 = this.f16034o;
            if (i9 < iArr3.length) {
                iArr3[i9] = iHashCode;
                Object[] objArr3 = this.f16035p;
                int i13 = i9 << 1;
                objArr3[i13] = obj;
                objArr3[i13 + 1] = obj2;
                this.f16036q = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f16036q;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16036q * 28);
        sb.append('{');
        int i7 = this.f16036q;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object objF = f(i8);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i8);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !AbstractC1209k.a(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !AbstractC1209k.a(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }
}
