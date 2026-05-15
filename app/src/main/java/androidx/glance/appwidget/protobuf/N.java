package androidx.glance.appwidget.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0554b implements RandomAccess {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final N f9584r = new N(new Object[0], 0, false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f9585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9586q;

    public N(Object[] objArr, int i7, boolean z6) {
        this.f9610o = z6;
        this.f9585p = objArr;
        this.f9586q = i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i7 = this.f9586q;
        Object[] objArr = this.f9585p;
        if (i7 == objArr.length) {
            this.f9585p = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9585p;
        int i8 = this.f9586q;
        this.f9586q = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 >= this.f9586q) {
            StringBuilder sbV = n1.c.v(i7, "Index:", ", Size:");
            sbV.append(this.f9586q);
            throw new IndexOutOfBoundsException(sbV.toString());
        }
    }

    public final N c(int i7) {
        if (i7 >= this.f9586q) {
            return new N(Arrays.copyOf(this.f9585p, i7), this.f9586q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        b(i7);
        return this.f9585p[i7];
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0554b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        b(i7);
        Object[] objArr = this.f9585p;
        Object obj = objArr[i7];
        if (i7 < this.f9586q - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f9586q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        b(i7);
        Object[] objArr = this.f9585p;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9586q;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        a();
        if (i7 >= 0 && i7 <= (i8 = this.f9586q)) {
            Object[] objArr = this.f9585p;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f9585p, i7, objArr2, i7 + 1, this.f9586q - i7);
                this.f9585p = objArr2;
            }
            this.f9585p[i7] = obj;
            this.f9586q++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbV = n1.c.v(i7, "Index:", ", Size:");
        sbV.append(this.f9586q);
        throw new IndexOutOfBoundsException(sbV.toString());
    }
}
