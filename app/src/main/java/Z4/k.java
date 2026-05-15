package Z4;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class k extends g {

    /* JADX INFO: renamed from: r */
    public static final Object[] f8811r = new Object[0];

    /* JADX INFO: renamed from: o */
    public int f8812o;

    /* JADX INFO: renamed from: p */
    public Object[] f8813p;

    /* JADX INFO: renamed from: q */
    public int f8814q;

    public k() {
        this.f8813p = f8811r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int length;
        int i8 = this.f8814q;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(Z1.l.p("index: ", i7, i8, ", size: "));
        }
        if (i7 == i8) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        s();
        g(this.f8814q + 1);
        int iR = r(this.f8812o + i7);
        int i9 = this.f8814q;
        if (i7 < ((i9 + 1) >> 1)) {
            if (iR == 0) {
                Object[] objArr = this.f8813p;
                AbstractC1209k.f(objArr, "<this>");
                iR = objArr.length;
            }
            int i10 = iR - 1;
            int i11 = this.f8812o;
            if (i11 == 0) {
                Object[] objArr2 = this.f8813p;
                AbstractC1209k.f(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i11 - 1;
            }
            int i12 = this.f8812o;
            if (i10 >= i12) {
                Object[] objArr3 = this.f8813p;
                objArr3[length] = objArr3[i12];
                l.W(i12, i12 + 1, i10 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f8813p;
                l.W(i12 - 1, i12, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f8813p;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.W(0, 1, i10 + 1, objArr5, objArr5);
            }
            this.f8813p[i10] = obj;
            this.f8812o = length;
        } else {
            int iR2 = r(i9 + this.f8812o);
            if (iR < iR2) {
                Object[] objArr6 = this.f8813p;
                l.W(iR + 1, iR, iR2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f8813p;
                l.W(1, 0, iR2, objArr7, objArr7);
                Object[] objArr8 = this.f8813p;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.W(iR + 1, iR, objArr8.length - 1, objArr8, objArr8);
            }
            this.f8813p[iR] = obj;
        }
        this.f8814q++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        AbstractC1209k.f(collection, "elements");
        int i8 = this.f8814q;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(Z1.l.p("index: ", i7, i8, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == this.f8814q) {
            return addAll(collection);
        }
        s();
        g(collection.size() + this.f8814q);
        int iR = r(this.f8814q + this.f8812o);
        int iR2 = r(this.f8812o + i7);
        int size = collection.size();
        if (i7 >= ((this.f8814q + 1) >> 1)) {
            int i9 = iR2 + size;
            if (iR2 < iR) {
                int i10 = size + iR;
                Object[] objArr = this.f8813p;
                if (i10 <= objArr.length) {
                    l.W(i9, iR2, iR, objArr, objArr);
                } else if (i9 >= objArr.length) {
                    l.W(i9 - objArr.length, iR2, iR, objArr, objArr);
                } else {
                    int length = iR - (i10 - objArr.length);
                    l.W(0, length, iR, objArr, objArr);
                    Object[] objArr2 = this.f8813p;
                    l.W(i9, iR2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f8813p;
                l.W(size, 0, iR, objArr3, objArr3);
                Object[] objArr4 = this.f8813p;
                if (i9 >= objArr4.length) {
                    l.W(i9 - objArr4.length, iR2, objArr4.length, objArr4, objArr4);
                } else {
                    l.W(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f8813p;
                    l.W(i9, iR2, objArr5.length - size, objArr5, objArr5);
                }
            }
            e(iR2, collection);
            return true;
        }
        int i11 = this.f8812o;
        int length2 = i11 - size;
        if (iR2 < i11) {
            Object[] objArr6 = this.f8813p;
            l.W(length2, i11, objArr6.length, objArr6, objArr6);
            if (size >= iR2) {
                Object[] objArr7 = this.f8813p;
                l.W(objArr7.length - size, 0, iR2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f8813p;
                l.W(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f8813p;
                l.W(0, size, iR2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f8813p;
            l.W(length2, i11, iR2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f8813p;
            length2 += objArr11.length;
            int i12 = iR2 - i11;
            int length3 = objArr11.length - length2;
            if (length3 >= i12) {
                l.W(length2, i11, iR2, objArr11, objArr11);
            } else {
                l.W(length2, i11, i11 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f8813p;
                l.W(0, this.f8812o + length3, iR2, objArr12, objArr12);
            }
        }
        this.f8812o = length2;
        e(p(iR2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        s();
        g(this.f8814q + 1);
        int length = this.f8812o;
        if (length == 0) {
            Object[] objArr = this.f8813p;
            AbstractC1209k.f(objArr, "<this>");
            length = objArr.length;
        }
        int i7 = length - 1;
        this.f8812o = i7;
        this.f8813p[i7] = obj;
        this.f8814q++;
    }

    public final void addLast(Object obj) {
        s();
        g(b() + 1);
        this.f8813p[r(b() + this.f8812o)] = obj;
        this.f8814q = b() + 1;
    }

    @Override // Z4.g
    public final int b() {
        return this.f8814q;
    }

    @Override // Z4.g
    public final Object c(int i7) {
        int i8 = this.f8814q;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(Z1.l.p("index: ", i7, i8, ", size: "));
        }
        if (i7 == o.d0(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        s();
        int iR = r(this.f8812o + i7);
        Object[] objArr = this.f8813p;
        Object obj = objArr[iR];
        if (i7 < (this.f8814q >> 1)) {
            int i9 = this.f8812o;
            if (iR >= i9) {
                l.W(i9 + 1, i9, iR, objArr, objArr);
            } else {
                l.W(1, 0, iR, objArr, objArr);
                Object[] objArr2 = this.f8813p;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i10 = this.f8812o;
                l.W(i10 + 1, i10, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f8813p;
            int i11 = this.f8812o;
            objArr3[i11] = null;
            this.f8812o = n(i11);
        } else {
            int iR2 = r(o.d0(this) + this.f8812o);
            if (iR <= iR2) {
                Object[] objArr4 = this.f8813p;
                l.W(iR, iR + 1, iR2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f8813p;
                l.W(iR, iR + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f8813p;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.W(0, 1, iR2 + 1, objArr6, objArr6);
            }
            this.f8813p[iR2] = null;
        }
        this.f8814q--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            s();
            q(this.f8812o, r(b() + this.f8812o));
        }
        this.f8812o = 0;
        this.f8814q = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f8813p.length;
        while (i7 < length && it.hasNext()) {
            this.f8813p[i7] = it.next();
            i7++;
        }
        int i8 = this.f8812o;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f8813p[i9] = it.next();
        }
        this.f8814q = collection.size() + this.f8814q;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f8813p[this.f8812o];
    }

    public final void g(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f8813p;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f8811r) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f8813p = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i8 = length + (length >> 1);
        if (i8 - i7 < 0) {
            i8 = i7;
        }
        if (i8 - 2147483639 > 0) {
            i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i8];
        l.W(0, this.f8812o, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f8813p;
        int length2 = objArr3.length;
        int i9 = this.f8812o;
        l.W(length2 - i9, 0, i9, objArr3, objArr2);
        this.f8812o = 0;
        this.f8813p = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int iB = b();
        if (i7 < 0 || i7 >= iB) {
            throw new IndexOutOfBoundsException(Z1.l.p("index: ", i7, iB, ", size: "));
        }
        return this.f8813p[r(this.f8812o + i7)];
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.f8813p[this.f8812o];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int iR = r(b() + this.f8812o);
        int length = this.f8812o;
        if (length < iR) {
            while (length < iR) {
                if (AbstractC1209k.a(obj, this.f8813p[length])) {
                    i7 = this.f8812o;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iR) {
            return -1;
        }
        int length2 = this.f8813p.length;
        while (true) {
            if (length >= length2) {
                for (int i8 = 0; i8 < iR; i8++) {
                    if (AbstractC1209k.a(obj, this.f8813p[i8])) {
                        length = i8 + this.f8813p.length;
                        i7 = this.f8812o;
                    }
                }
                return -1;
            }
            if (AbstractC1209k.a(obj, this.f8813p[length])) {
                i7 = this.f8812o;
                break;
            }
            length++;
        }
        return length - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f8813p[r(o.d0(this) + this.f8812o)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int iR = r(this.f8814q + this.f8812o);
        int i8 = this.f8812o;
        if (i8 < iR) {
            length = iR - 1;
            if (i8 <= length) {
                while (!AbstractC1209k.a(obj, this.f8813p[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i7 = this.f8812o;
                return length - i7;
            }
            return -1;
        }
        if (i8 > iR) {
            int i9 = iR - 1;
            while (true) {
                if (-1 >= i9) {
                    Object[] objArr = this.f8813p;
                    AbstractC1209k.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f8812o;
                    if (i10 <= length) {
                        while (!AbstractC1209k.a(obj, this.f8813p[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i7 = this.f8812o;
                    }
                } else {
                    if (AbstractC1209k.a(obj, this.f8813p[i9])) {
                        length = i9 + this.f8813p.length;
                        i7 = this.f8812o;
                        break;
                    }
                    i9--;
                }
            }
            return length - i7;
        }
        return -1;
    }

    public final int n(int i7) {
        AbstractC1209k.f(this.f8813p, "<this>");
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final Object o() {
        if (isEmpty()) {
            return null;
        }
        return this.f8813p[r(o.d0(this) + this.f8812o)];
    }

    public final int p(int i7) {
        return i7 < 0 ? i7 + this.f8813p.length : i7;
    }

    public final void q(int i7, int i8) {
        if (i7 < i8) {
            l.d0(this.f8813p, i7, i8);
            return;
        }
        Object[] objArr = this.f8813p;
        l.d0(objArr, i7, objArr.length);
        l.d0(this.f8813p, 0, i8);
    }

    public final int r(int i7) {
        Object[] objArr = this.f8813p;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iR;
        AbstractC1209k.f(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f8813p.length != 0) {
            int iR2 = r(this.f8814q + this.f8812o);
            int i7 = this.f8812o;
            if (i7 < iR2) {
                iR = i7;
                while (i7 < iR2) {
                    Object obj = this.f8813p[i7];
                    if (collection.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f8813p[iR] = obj;
                        iR++;
                    }
                    i7++;
                }
                l.d0(this.f8813p, iR, iR2);
            } else {
                int length = this.f8813p.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f8813p;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        z7 = true;
                    } else {
                        this.f8813p[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                iR = r(i8);
                for (int i9 = 0; i9 < iR2; i9++) {
                    Object[] objArr2 = this.f8813p;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        z7 = true;
                    } else {
                        this.f8813p[iR] = obj3;
                        iR = n(iR);
                    }
                }
                z6 = z7;
            }
            if (z6) {
                s();
                this.f8814q = p(iR - this.f8812o);
            }
        }
        return z6;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        Object[] objArr = this.f8813p;
        int i7 = this.f8812o;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f8812o = n(i7);
        this.f8814q = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        int iR = r(o.d0(this) + this.f8812o);
        Object[] objArr = this.f8813p;
        Object obj = objArr[iR];
        objArr[iR] = null;
        this.f8814q = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        android.support.v4.media.session.b.g(i7, i8, this.f8814q);
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f8814q) {
            clear();
            return;
        }
        if (i9 == 1) {
            c(i7);
            return;
        }
        s();
        if (i7 < this.f8814q - i8) {
            int iR = r((i7 - 1) + this.f8812o);
            int iR2 = r((i8 - 1) + this.f8812o);
            while (i7 > 0) {
                int i10 = iR + 1;
                int iMin = Math.min(i7, Math.min(i10, iR2 + 1));
                Object[] objArr = this.f8813p;
                int i11 = iR2 - iMin;
                int i12 = iR - iMin;
                l.W(i11 + 1, i12 + 1, i10, objArr, objArr);
                iR = p(i12);
                iR2 = p(i11);
                i7 -= iMin;
            }
            int iR3 = r(this.f8812o + i9);
            q(this.f8812o, iR3);
            this.f8812o = iR3;
        } else {
            int iR4 = r(this.f8812o + i8);
            int iR5 = r(this.f8812o + i7);
            int i13 = this.f8814q;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f8813p;
                i8 = Math.min(i13, Math.min(objArr2.length - iR4, objArr2.length - iR5));
                Object[] objArr3 = this.f8813p;
                int i14 = iR4 + i8;
                l.W(iR5, iR4, i14, objArr3, objArr3);
                iR4 = r(i14);
                iR5 = r(iR5 + i8);
            }
            int iR6 = r(this.f8814q + this.f8812o);
            q(p(iR6 - i9), iR6);
        }
        this.f8814q -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iR;
        AbstractC1209k.f(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f8813p.length != 0) {
            int iR2 = r(this.f8814q + this.f8812o);
            int i7 = this.f8812o;
            if (i7 < iR2) {
                iR = i7;
                while (i7 < iR2) {
                    Object obj = this.f8813p[i7];
                    if (collection.contains(obj)) {
                        this.f8813p[iR] = obj;
                        iR++;
                    } else {
                        z6 = true;
                    }
                    i7++;
                }
                l.d0(this.f8813p, iR, iR2);
            } else {
                int length = this.f8813p.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f8813p;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f8813p[i8] = obj2;
                        i8++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                iR = r(i8);
                for (int i9 = 0; i9 < iR2; i9++) {
                    Object[] objArr2 = this.f8813p;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f8813p[iR] = obj3;
                        iR = n(iR);
                    } else {
                        z7 = true;
                    }
                }
                z6 = z7;
            }
            if (z6) {
                s();
                this.f8814q = p(iR - this.f8812o);
            }
        }
        return z6;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int iB = b();
        if (i7 < 0 || i7 >= iB) {
            throw new IndexOutOfBoundsException(Z1.l.p("index: ", i7, iB, ", size: "));
        }
        int iR = r(this.f8812o + i7);
        Object[] objArr = this.f8813p;
        Object obj2 = objArr[iR];
        objArr[iR] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    public k(int i7) {
        Object[] objArr;
        if (i7 == 0) {
            objArr = f8811r;
        } else if (i7 > 0) {
            objArr = new Object[i7];
        } else {
            throw new IllegalArgumentException(n1.c.s(i7, "Illegal Capacity: "));
        }
        this.f8813p = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1209k.f(objArr, "array");
        int length = objArr.length;
        int i7 = this.f8814q;
        if (length < i7) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
            AbstractC1209k.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iR = r(this.f8814q + this.f8812o);
        int i8 = this.f8812o;
        if (i8 < iR) {
            l.a0(i8, iR, 2, this.f8813p, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f8813p;
            l.W(0, this.f8812o, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f8813p;
            l.W(objArr3.length - this.f8812o, 0, iR, objArr3, objArr);
        }
        int i9 = this.f8814q;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        s();
        g(collection.size() + b());
        e(r(b() + this.f8812o), collection);
        return true;
    }
}
