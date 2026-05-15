package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC0529b implements RandomAccess {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final V f9424r;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f9425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9426q;

    static {
        V v3 = new V(0, new Object[0]);
        f9424r = v3;
        v3.f9442o = false;
    }

    public V(int i7, Object[] objArr) {
        this.f9425p = objArr;
        this.f9426q = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0529b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i7 = this.f9426q;
        Object[] objArr = this.f9425p;
        if (i7 == objArr.length) {
            this.f9425p = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9425p;
        int i8 = this.f9426q;
        this.f9426q = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 >= this.f9426q) {
            StringBuilder sbV = n1.c.v(i7, "Index:", ", Size:");
            sbV.append(this.f9426q);
            throw new IndexOutOfBoundsException(sbV.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0547u
    public final InterfaceC0547u f(int i7) {
        if (i7 < this.f9426q) {
            throw new IllegalArgumentException();
        }
        return new V(this.f9426q, Arrays.copyOf(this.f9425p, i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        b(i7);
        return this.f9425p[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        b(i7);
        Object[] objArr = this.f9425p;
        Object obj = objArr[i7];
        if (i7 < this.f9426q - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f9426q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        b(i7);
        Object[] objArr = this.f9425p;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9426q;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        a();
        if (i7 >= 0 && i7 <= (i8 = this.f9426q)) {
            Object[] objArr = this.f9425p;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f9425p, i7, objArr2, i7 + 1, this.f9426q - i7);
                this.f9425p = objArr2;
            }
            this.f9425p[i7] = obj;
            this.f9426q++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbV = n1.c.v(i7, "Index:", ", Size:");
        sbV.append(this.f9426q);
        throw new IndexOutOfBoundsException(sbV.toString());
    }
}
