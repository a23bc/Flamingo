package j0;

import Z4.l;
import j5.AbstractC1107a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1092c {

    /* JADX INFO: renamed from: p */
    public static final i f13642p = new i(new Object[0]);

    /* JADX INFO: renamed from: o */
    public final Object[] f13643o;

    public i(Object[] objArr) {
        this.f13643o = objArr;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        return this.f13643o.length;
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c c(int i7, Object obj) {
        Object[] objArr = this.f13643o;
        AbstractC1107a.k(i7, objArr.length);
        if (i7 == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.a0(0, i7, 6, objArr, objArr2);
            l.W(i7 + 1, i7, objArr.length, objArr, objArr2);
            objArr2[i7] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        l.W(i7 + 1, i7, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C1094e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c e(Object obj) {
        Object[] objArr = this.f13643o;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new C1094e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c g(Collection collection) {
        Object[] objArr = this.f13643o;
        if (collection.size() + objArr.length > 32) {
            C1095f c1095fI = i();
            c1095fI.addAll(collection);
            return c1095fI.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC1107a.j(i7, b());
        return this.f13643o[i7];
    }

    @Override // j0.AbstractC1092c
    public final C1095f i() {
        return new C1095f(this, null, this.f13643o, 0);
    }

    @Override // Z4.e, java.util.List
    public final int indexOf(Object obj) {
        return l.l0(this.f13643o, obj);
    }

    @Override // Z4.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f13643o;
        AbstractC1209k.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i7 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i8 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    length2 = i8;
                }
            }
        }
        return -1;
    }

    @Override // Z4.e, java.util.List
    public final ListIterator listIterator(int i7) {
        Object[] objArr = this.f13643o;
        AbstractC1107a.k(i7, objArr.length);
        return new C1093d(objArr, i7, objArr.length);
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c n(C1091b c1091b) {
        Object[] objArr = this.f13643o;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z6 = false;
        for (int i7 = 0; i7 < length2; i7++) {
            Object obj = objArr[i7];
            if (((Boolean) c1091b.b(obj)).booleanValue()) {
                if (!z6) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
                    z6 = true;
                    length = i7;
                }
            } else if (z6) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f13642p : new i(l.c0(objArrCopyOf, 0, length));
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c o(int i7) {
        Object[] objArr = this.f13643o;
        AbstractC1107a.j(i7, objArr.length);
        if (objArr.length == 1) {
            return f13642p;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        l.W(i7, i7 + 1, objArr.length, objArr, objArrCopyOf);
        return new i(objArrCopyOf);
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c p(int i7, Object obj) {
        Object[] objArr = this.f13643o;
        AbstractC1107a.j(i7, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i7] = obj;
        return new i(objArrCopyOf);
    }
}
