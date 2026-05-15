package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0552z extends AbstractC0529b implements A, RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f9550p;

    static {
        new C0552z(10).f9442o = false;
    }

    public C0552z(int i7) {
        this(new ArrayList(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        a();
        this.f9550p.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0529b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f9550p.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0529b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f9550p.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0547u
    public final InterfaceC0547u f(int i7) {
        ArrayList arrayList = this.f9550p;
        if (i7 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i7);
        arrayList2.addAll(arrayList);
        return new C0552z(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        String str;
        ArrayList arrayList = this.f9550p;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C0533f)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC0548v.f9521a);
            M m7 = r0.f9520a;
            if (r0.f9520a.i(bArr, 0, bArr.length) == 0) {
                arrayList.set(i7, str2);
            }
            return str2;
        }
        C0533f c0533f = (C0533f) obj;
        c0533f.getClass();
        Charset charset = AbstractC0548v.f9521a;
        if (c0533f.size() == 0) {
            str = "";
        } else {
            str = new String(c0533f.f9462p, c0533f.b(), c0533f.size(), charset);
        }
        int iB = c0533f.b();
        if (r0.f9520a.i(c0533f.f9462p, iB, c0533f.size() + iB) == 0) {
            arrayList.set(i7, str);
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final void h(C0533f c0533f) {
        a();
        this.f9550p.add(c0533f);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final A j() {
        return this.f9442o ? new j0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final Object l(int i7) {
        return this.f9550p.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final List m() {
        return Collections.unmodifiableList(this.f9550p);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        Object objRemove = this.f9550p.remove(i7);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0533f)) {
            return new String((byte[]) objRemove, AbstractC0548v.f9521a);
        }
        C0533f c0533f = (C0533f) objRemove;
        c0533f.getClass();
        Charset charset = AbstractC0548v.f9521a;
        if (c0533f.size() == 0) {
            return "";
        }
        return new String(c0533f.f9462p, c0533f.b(), c0533f.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        Object obj2 = this.f9550p.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0533f)) {
            return new String((byte[]) obj2, AbstractC0548v.f9521a);
        }
        C0533f c0533f = (C0533f) obj2;
        c0533f.getClass();
        Charset charset = AbstractC0548v.f9521a;
        if (c0533f.size() == 0) {
            return "";
        }
        return new String(c0533f.f9462p, c0533f.b(), c0533f.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9550p.size();
    }

    public C0552z(ArrayList arrayList) {
        this.f9550p = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0529b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        a();
        if (collection instanceof A) {
            collection = ((A) collection).m();
        }
        boolean zAddAll = this.f9550p.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
