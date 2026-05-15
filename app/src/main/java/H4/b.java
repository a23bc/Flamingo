package H4;

import N5.d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f3251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3253q;

    public b(int i7, int i8, int[] iArr) {
        this.f3251o = iArr;
        this.f3252p = i7;
        this.f3253q = i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f3252p;
        while (true) {
            if (i7 >= this.f3253q) {
                i7 = -1;
                break;
            }
            if (this.f3251o[i7] == iIntValue) {
                break;
            }
            i7++;
        }
        return i7 != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f3251o[this.f3252p + i7] != bVar.f3251o[bVar.f3252p + i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        d.p(i7, size());
        return Integer.valueOf(this.f3251o[this.f3252p + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = this.f3252p; i8 < this.f3253q; i8++) {
            i7 = (i7 * 31) + this.f3251o[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i7 = this.f3252p;
            int i8 = i7;
            while (true) {
                if (i8 >= this.f3253q) {
                    i8 = -1;
                    break;
                }
                if (this.f3251o[i8] == iIntValue) {
                    break;
                }
                i8++;
            }
            if (i8 >= 0) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i8 = this.f3253q;
            while (true) {
                i8--;
                i7 = this.f3252p;
                if (i8 < i7) {
                    i8 = -1;
                    break;
                }
                if (this.f3251o[i8] == iIntValue) {
                    break;
                }
            }
            if (i8 >= 0) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        d.p(i7, size());
        int i8 = this.f3252p + i7;
        int[] iArr = this.f3251o;
        int i9 = iArr[i8];
        num.getClass();
        iArr[i8] = num.intValue();
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3253q - this.f3252p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        d.t(i7, i8, size());
        if (i7 == i8) {
            return Collections.EMPTY_LIST;
        }
        int i9 = this.f3252p;
        return new b(i7 + i9, i9 + i8, this.f3251o);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f3251o;
        int i7 = this.f3252p;
        sb.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 >= this.f3253q) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i7]);
        }
    }
}
