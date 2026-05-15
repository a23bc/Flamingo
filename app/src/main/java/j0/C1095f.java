package j0;

import Z4.C0508b;
import Z4.l;
import f0.AbstractC0908q0;
import j5.AbstractC1107a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import l5.InterfaceC1182c;
import m0.C1190b;
import m5.AbstractC1209k;
import n5.InterfaceC1238b;

/* JADX INFO: renamed from: j0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1095f extends Z4.g implements Collection, InterfaceC1238b {

    /* JADX INFO: renamed from: o */
    public AbstractC1092c f13628o;

    /* JADX INFO: renamed from: p */
    public Object[] f13629p;

    /* JADX INFO: renamed from: q */
    public Object[] f13630q;

    /* JADX INFO: renamed from: r */
    public int f13631r;

    /* JADX INFO: renamed from: s */
    public C1190b f13632s = new C1190b();

    /* JADX INFO: renamed from: t */
    public Object[] f13633t;

    /* JADX INFO: renamed from: u */
    public Object[] f13634u;

    /* JADX INFO: renamed from: v */
    public int f13635v;

    public C1095f(AbstractC1092c abstractC1092c, Object[] objArr, Object[] objArr2, int i7) {
        this.f13628o = abstractC1092c;
        this.f13629p = objArr;
        this.f13630q = objArr2;
        this.f13631r = i7;
        this.f13633t = objArr;
        this.f13634u = objArr2;
        this.f13635v = abstractC1092c.b();
    }

    public static void g(Object[] objArr, int i7, Iterator it) {
        while (i7 < 32 && it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
    }

    public final Object[] A(Object[] objArr, int i7, Object[][] objArr2) {
        C0508b c0508bJ = AbstractC1209k.j(objArr2);
        int i8 = i7 >> 5;
        int i9 = this.f13631r;
        Object[] objArrZ = i8 < (1 << i9) ? z(objArr, i7, i9, c0508bJ) : s(objArr);
        while (c0508bJ.hasNext()) {
            this.f13631r += 5;
            objArrZ = v(objArrZ);
            int i10 = this.f13631r;
            z(objArrZ, 1 << i10, i10, c0508bJ);
        }
        return objArrZ;
    }

    public final void B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f13635v;
        int i8 = i7 >> 5;
        int i9 = this.f13631r;
        if (i8 > (1 << i9)) {
            this.f13633t = C(this.f13631r + 5, v(objArr), objArr2);
            this.f13634u = objArr3;
            this.f13631r += 5;
            this.f13635v++;
            return;
        }
        if (objArr == null) {
            this.f13633t = objArr2;
            this.f13634u = objArr3;
            this.f13635v = i7 + 1;
        } else {
            this.f13633t = C(i9, objArr, objArr2);
            this.f13634u = objArr3;
            this.f13635v++;
        }
    }

    public final Object[] C(int i7, Object[] objArr, Object[] objArr2) {
        int iW = k.w(b() - 1, i7);
        Object[] objArrS = s(objArr);
        if (i7 == 5) {
            objArrS[iW] = objArr2;
            return objArrS;
        }
        objArrS[iW] = C(i7 - 5, (Object[]) objArrS[iW], objArr2);
        return objArrS;
    }

    public final int D(InterfaceC1182c interfaceC1182c, Object[] objArr, int i7, int i8, U0.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (q(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f7026a;
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrU = objArr2;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj2 = objArr[i9];
            if (!((Boolean) interfaceC1182c.b(obj2)).booleanValue()) {
                if (i8 == 32) {
                    objArrU = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : u();
                    i8 = 0;
                }
                objArrU[i8] = obj2;
                i8++;
            }
        }
        aVar.f7026a = objArrU;
        if (objArr2 != objArrU) {
            arrayList2.add(objArr2);
        }
        return i8;
    }

    public final int E(InterfaceC1182c interfaceC1182c, Object[] objArr, int i7, U0.a aVar) {
        Object[] objArrS = objArr;
        int i8 = i7;
        boolean z6 = false;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (((Boolean) interfaceC1182c.b(obj)).booleanValue()) {
                if (!z6) {
                    objArrS = s(objArr);
                    z6 = true;
                    i8 = i9;
                }
            } else if (z6) {
                objArrS[i8] = obj;
                i8++;
            }
        }
        aVar.f7026a = objArrS;
        return i8;
    }

    public final int F(InterfaceC1182c interfaceC1182c, int i7, U0.a aVar) {
        int iE = E(interfaceC1182c, this.f13634u, i7, aVar);
        if (iE == i7) {
            return i7;
        }
        Object obj = aVar.f7026a;
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iE, i7, (Object) null);
        this.f13634u = objArr;
        this.f13635v -= i7 - iE;
        return iE;
    }

    public final boolean G(InterfaceC1182c interfaceC1182c) {
        Object[] objArrZ;
        int i7;
        InterfaceC1182c interfaceC1182c2 = interfaceC1182c;
        int iM = M();
        Object[] objArrW = null;
        U0.a aVar = new U0.a(null);
        boolean z6 = false;
        if (this.f13633t != null) {
            AbstractC1090a abstractC1090aR = r(0);
            int iE = 32;
            while (iE == 32 && abstractC1090aR.hasNext()) {
                iE = E(interfaceC1182c2, (Object[]) abstractC1090aR.next(), 32, aVar);
            }
            if (iE == 32) {
                int iF = F(interfaceC1182c2, iM, aVar);
                if (iF == 0) {
                    y(this.f13633t, this.f13635v, this.f13631r);
                }
                if (iF != iM) {
                }
            } else {
                int i8 = (abstractC1090aR.f13618o - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iD = iE;
                while (abstractC1090aR.hasNext()) {
                    iD = D(interfaceC1182c2, (Object[]) abstractC1090aR.next(), 32, iD, aVar, arrayList2, arrayList);
                    interfaceC1182c2 = interfaceC1182c;
                }
                int iD2 = D(interfaceC1182c, this.f13634u, iM, iD, aVar, arrayList2, arrayList);
                Object obj = aVar.f7026a;
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iD2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrZ = this.f13633t;
                    AbstractC1209k.c(objArrZ);
                } else {
                    objArrZ = z(this.f13633t, i8, this.f13631r, arrayList.iterator());
                }
                int size = i8 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC0908q0.a("invalid size");
                }
                if (size == 0) {
                    this.f13631r = 0;
                } else {
                    int i9 = size - 1;
                    while (true) {
                        i7 = this.f13631r;
                        if ((i9 >> i7) != 0) {
                            break;
                        }
                        this.f13631r = i7 - 5;
                        Object[] objArr2 = objArrZ[0];
                        AbstractC1209k.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrZ = objArr2;
                    }
                    objArrW = w(objArrZ, i9, i7);
                }
                this.f13633t = objArrW;
                this.f13634u = objArr;
                this.f13635v = size + iD2;
            }
            z6 = true;
        } else if (F(interfaceC1182c2, iM, aVar) != iM) {
            z6 = true;
        }
        if (z6) {
            ((AbstractList) this).modCount++;
        }
        return z6;
    }

    public final Object[] H(Object[] objArr, int i7, int i8, U0.a aVar) {
        int iW = k.w(i8, i7);
        if (i7 == 0) {
            Object obj = objArr[iW];
            Object[] objArrS = s(objArr);
            l.W(iW, iW + 1, 32, objArr, objArrS);
            objArrS[31] = aVar.f7026a;
            aVar.f7026a = obj;
            return objArrS;
        }
        int iW2 = objArr[31] == null ? k.w(J() - 1, i7) : 31;
        Object[] objArrS2 = s(objArr);
        int i9 = i7 - 5;
        int i10 = iW + 1;
        if (i10 <= iW2) {
            while (true) {
                Object obj2 = objArrS2[iW2];
                AbstractC1209k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrS2[iW2] = H((Object[]) obj2, i9, 0, aVar);
                if (iW2 == i10) {
                    break;
                }
                iW2--;
            }
        }
        Object obj3 = objArrS2[iW];
        AbstractC1209k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrS2[iW] = H((Object[]) obj3, i9, i8, aVar);
        return objArrS2;
    }

    public final Object I(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f13635v - i7;
        if (i10 == 1) {
            Object obj = this.f13634u[0];
            y(objArr, i7, i8);
            return obj;
        }
        Object[] objArr2 = this.f13634u;
        Object obj2 = objArr2[i9];
        Object[] objArrS = s(objArr2);
        l.W(i9, i9 + 1, i10, objArr2, objArrS);
        objArrS[i10 - 1] = null;
        this.f13633t = objArr;
        this.f13634u = objArrS;
        this.f13635v = (i7 + i10) - 1;
        this.f13631r = i8;
        return obj2;
    }

    public final int J() {
        int i7 = this.f13635v;
        if (i7 <= 32) {
            return 0;
        }
        return (i7 - 1) & (-32);
    }

    public final Object[] K(Object[] objArr, int i7, int i8, Object obj, U0.a aVar) {
        int iW = k.w(i8, i7);
        Object[] objArrS = s(objArr);
        if (i7 != 0) {
            Object obj2 = objArrS[iW];
            AbstractC1209k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrS[iW] = K((Object[]) obj2, i7 - 5, i8, obj, aVar);
            return objArrS;
        }
        if (objArrS != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.f7026a = objArrS[iW];
        objArrS[iW] = obj;
        return objArrS;
    }

    public final void L(Collection collection, int i7, Object[] objArr, int i8, Object[][] objArr2, int i9, Object[] objArr3) {
        Object[] objArrU;
        if (i9 < 1) {
            AbstractC0908q0.a("requires at least one nullBuffer");
        }
        Object[] objArrS = s(objArr);
        objArr2[0] = objArrS;
        int i10 = i7 & 31;
        int size = ((collection.size() + i7) - 1) & 31;
        int i11 = (i8 - i10) + size;
        if (i11 < 32) {
            l.W(size + 1, i10, i8, objArrS, objArr3);
        } else {
            int i12 = i11 - 31;
            if (i9 == 1) {
                objArrU = objArrS;
            } else {
                objArrU = u();
                i9--;
                objArr2[i9] = objArrU;
            }
            int i13 = i8 - i12;
            l.W(0, i13, i8, objArrS, objArr3);
            l.W(size + 1, i10, i13, objArrS, objArrU);
            objArr3 = objArrU;
        }
        Iterator it = collection.iterator();
        g(objArrS, i10, it);
        for (int i14 = 1; i14 < i9; i14++) {
            Object[] objArrU2 = u();
            g(objArrU2, 0, it);
            objArr2[i14] = objArrU2;
        }
        g(objArr3, 0, it);
    }

    public final int M() {
        int i7 = this.f13635v;
        return i7 <= 32 ? i7 : i7 - ((i7 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        AbstractC1107a.k(i7, b());
        if (i7 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (i7 >= iJ) {
            p(i7 - iJ, obj, this.f13633t);
            return;
        }
        U0.a aVar = new U0.a(null);
        Object[] objArr = this.f13633t;
        AbstractC1209k.c(objArr);
        p(0, aVar.f7026a, o(objArr, this.f13631r, i7, obj, aVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        Collection collection2;
        C1095f c1095f;
        Object[] objArrU;
        AbstractC1107a.k(i7, this.f13635v);
        if (i7 == this.f13635v) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i8 = (i7 >> 5) << 5;
        int size = ((collection.size() + (this.f13635v - i8)) - 1) / 32;
        if (size == 0) {
            int i9 = i7 & 31;
            int size2 = ((collection.size() + i7) - 1) & 31;
            Object[] objArr = this.f13634u;
            Object[] objArrS = s(objArr);
            l.W(size2 + 1, i9, M(), objArr, objArrS);
            g(objArrS, i9, collection.iterator());
            this.f13634u = objArrS;
            this.f13635v = collection.size() + this.f13635v;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM = M();
        int size3 = collection.size() + this.f13635v;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i7 >= J()) {
            objArrU = u();
            collection2 = collection;
            L(collection2, i7, this.f13634u, iM, objArr2, size, objArrU);
            c1095f = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            c1095f = this;
            if (size3 > iM) {
                int i10 = size3 - iM;
                Object[] objArrT = t(i10, c1095f.f13634u);
                c1095f.n(collection2, i7, i10, objArr2, size, objArrT);
                objArr2 = objArr2;
                objArrU = objArrT;
            } else {
                Object[] objArr3 = c1095f.f13634u;
                objArrU = u();
                int i11 = iM - size3;
                l.W(0, i11, iM, objArr3, objArrU);
                int i12 = 32 - i11;
                Object[] objArrT2 = t(i12, c1095f.f13634u);
                int i13 = size - 1;
                objArr2[i13] = objArrT2;
                c1095f.n(collection2, i7, i12, objArr2, i13, objArrT2);
                collection2 = collection2;
            }
        }
        c1095f.f13633t = A(c1095f.f13633t, i8, objArr2);
        c1095f.f13634u = objArrU;
        c1095f.f13635v = collection2.size() + c1095f.f13635v;
        return true;
    }

    @Override // Z4.g
    public final int b() {
        return this.f13635v;
    }

    @Override // Z4.g
    public final Object c(int i7) {
        AbstractC1107a.j(i7, b());
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (i7 >= iJ) {
            return I(this.f13633t, iJ, this.f13631r, i7 - iJ);
        }
        U0.a aVar = new U0.a(this.f13634u[0]);
        Object[] objArr = this.f13633t;
        AbstractC1209k.c(objArr);
        I(H(objArr, this.f13631r, i7, aVar), iJ, this.f13631r, 0);
        return aVar.f7026a;
    }

    public final AbstractC1092c e() {
        AbstractC1092c c1094e;
        Object[] objArr = this.f13633t;
        if (objArr == this.f13629p && this.f13634u == this.f13630q) {
            c1094e = this.f13628o;
        } else {
            this.f13632s = new C1190b();
            this.f13629p = objArr;
            Object[] objArr2 = this.f13634u;
            this.f13630q = objArr2;
            if (objArr != null) {
                c1094e = new C1094e(objArr, objArr2, this.f13635v, this.f13631r);
            } else if (objArr2.length == 0) {
                c1094e = i.f13642p;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f13635v);
                AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
                c1094e = new i(objArrCopyOf);
            }
        }
        this.f13628o = c1094e;
        return c1094e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        AbstractC1107a.j(i7, b());
        if (J() <= i7) {
            objArr = this.f13634u;
        } else {
            objArr = this.f13633t;
            AbstractC1209k.c(objArr);
            for (int i8 = this.f13631r; i8 > 0; i8 -= 5) {
                Object obj = objArr[k.w(i7, i8)];
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        AbstractC1107a.k(i7, this.f13635v);
        return new C1097h(this, i7);
    }

    public final void n(Collection collection, int i7, int i8, Object[][] objArr, int i9, Object[] objArr2) {
        if (this.f13633t == null) {
            throw new IllegalStateException("root is null");
        }
        int i10 = i7 >> 5;
        AbstractC1090a abstractC1090aR = r(J() >> 5);
        int i11 = i9;
        Object[] objArrT = objArr2;
        while (abstractC1090aR.f13618o - 1 != i10) {
            Object[] objArr3 = (Object[]) abstractC1090aR.previous();
            l.W(0, 32 - i8, 32, objArr3, objArrT);
            objArrT = t(i8, objArr3);
            i11--;
            objArr[i11] = objArrT;
        }
        Object[] objArr4 = (Object[]) abstractC1090aR.previous();
        int iJ = i9 - (((J() >> 5) - 1) - i10);
        if (iJ < i9) {
            objArr2 = objArr[iJ];
            AbstractC1209k.c(objArr2);
        }
        L(collection, i7, objArr4, 32, objArr, iJ, objArr2);
    }

    public final Object[] o(Object[] objArr, int i7, int i8, Object obj, U0.a aVar) {
        Object obj2;
        int iW = k.w(i8, i7);
        if (i7 == 0) {
            aVar.f7026a = objArr[31];
            Object[] objArrS = s(objArr);
            l.W(iW + 1, iW, 31, objArr, objArrS);
            objArrS[iW] = obj;
            return objArrS;
        }
        Object[] objArrS2 = s(objArr);
        int i9 = i7 - 5;
        Object obj3 = objArrS2[iW];
        AbstractC1209k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrS2[iW] = o((Object[]) obj3, i9, i8, obj, aVar);
        while (true) {
            iW++;
            if (iW >= 32 || (obj2 = objArrS2[iW]) == null) {
                break;
            }
            objArrS2[iW] = o((Object[]) obj2, i9, 0, aVar.f7026a, aVar);
        }
        return objArrS2;
    }

    public final void p(int i7, Object obj, Object[] objArr) {
        int iM = M();
        Object[] objArrS = s(this.f13634u);
        if (iM >= 32) {
            Object[] objArr2 = this.f13634u;
            Object obj2 = objArr2[31];
            l.W(i7 + 1, i7, 31, objArr2, objArrS);
            objArrS[i7] = obj;
            B(objArr, objArrS, v(obj2));
            return;
        }
        l.W(i7 + 1, i7, iM, this.f13634u, objArrS);
        objArrS[i7] = obj;
        this.f13633t = objArr;
        this.f13634u = objArrS;
        this.f13635v++;
    }

    public final boolean q(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f13632s;
    }

    public final AbstractC1090a r(int i7) {
        Object[] objArr = this.f13633t;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iJ = J() >> 5;
        AbstractC1107a.k(i7, iJ);
        int i8 = this.f13631r;
        return i8 == 0 ? new C1093d(i7, objArr) : new j(objArr, i7, iJ, i8 / 5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return G(new C1091b(1, collection));
    }

    public final Object[] s(Object[] objArr) {
        if (objArr == null) {
            return u();
        }
        if (q(objArr)) {
            return objArr;
        }
        Object[] objArrU = u();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        l.a0(0, length, 6, objArr, objArrU);
        return objArrU;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        AbstractC1107a.j(i7, b());
        if (J() > i7) {
            U0.a aVar = new U0.a(null);
            Object[] objArr = this.f13633t;
            AbstractC1209k.c(objArr);
            this.f13633t = K(objArr, this.f13631r, i7, obj, aVar);
            return aVar.f7026a;
        }
        Object[] objArrS = s(this.f13634u);
        if (objArrS != this.f13634u) {
            ((AbstractList) this).modCount++;
        }
        int i8 = i7 & 31;
        Object obj2 = objArrS[i8];
        objArrS[i8] = obj;
        this.f13634u = objArrS;
        return obj2;
    }

    public final Object[] t(int i7, Object[] objArr) {
        if (q(objArr)) {
            l.W(i7, 0, 32 - i7, objArr, objArr);
            return objArr;
        }
        Object[] objArrU = u();
        l.W(i7, 0, 32 - i7, objArr, objArrU);
        return objArrU;
    }

    public final Object[] u() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f13632s;
        return objArr;
    }

    public final Object[] v(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f13632s;
        return objArr;
    }

    public final Object[] w(Object[] objArr, int i7, int i8) {
        if (i8 < 0) {
            AbstractC0908q0.a("shift should be positive");
        }
        if (i8 == 0) {
            return objArr;
        }
        int iW = k.w(i7, i8);
        Object obj = objArr[iW];
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objW = w((Object[]) obj, i7, i8 - 5);
        if (iW < 31) {
            int i9 = iW + 1;
            if (objArr[i9] != null) {
                if (q(objArr)) {
                    Arrays.fill(objArr, i9, 32, (Object) null);
                }
                Object[] objArrU = u();
                l.W(0, 0, i9, objArr, objArrU);
                objArr = objArrU;
            }
        }
        if (objW == objArr[iW]) {
            return objArr;
        }
        Object[] objArrS = s(objArr);
        objArrS[iW] = objW;
        return objArrS;
    }

    public final Object[] x(Object[] objArr, int i7, int i8, U0.a aVar) {
        Object[] objArrX;
        int iW = k.w(i8 - 1, i7);
        if (i7 == 5) {
            aVar.f7026a = objArr[iW];
            objArrX = null;
        } else {
            Object obj = objArr[iW];
            AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrX = x((Object[]) obj, i7 - 5, i8, aVar);
        }
        if (objArrX == null && iW == 0) {
            return null;
        }
        Object[] objArrS = s(objArr);
        objArrS[iW] = objArrX;
        return objArrS;
    }

    public final void y(Object[] objArr, int i7, int i8) {
        if (i8 == 0) {
            this.f13633t = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f13634u = objArr;
            this.f13635v = i7;
            this.f13631r = i8;
            return;
        }
        U0.a aVar = new U0.a(null);
        AbstractC1209k.c(objArr);
        Object[] objArrX = x(objArr, i8, i7, aVar);
        AbstractC1209k.c(objArrX);
        Object obj = aVar.f7026a;
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f13634u = (Object[]) obj;
        this.f13635v = i7;
        if (objArrX[1] == null) {
            this.f13633t = (Object[]) objArrX[0];
            this.f13631r = i8 - 5;
        } else {
            this.f13633t = objArrX;
            this.f13631r = i8;
        }
    }

    public final Object[] z(Object[] objArr, int i7, int i8, Iterator it) {
        if (!it.hasNext()) {
            AbstractC0908q0.a("invalid buffersIterator");
        }
        if (!(i8 >= 0)) {
            AbstractC0908q0.a("negative shift");
        }
        if (i8 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrS = s(objArr);
        int iW = k.w(i7, i8);
        int i9 = i8 - 5;
        objArrS[iW] = z((Object[]) objArrS[iW], i7, i9, it);
        while (true) {
            iW++;
            if (iW >= 32 || !it.hasNext()) {
                break;
            }
            objArrS[iW] = z((Object[]) objArrS[iW], 0, i9, it);
        }
        return objArrS;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM = M();
        if (iM < 32) {
            Object[] objArrS = s(this.f13634u);
            objArrS[iM] = obj;
            this.f13634u = objArrS;
            this.f13635v = b() + 1;
        } else {
            B(this.f13633t, this.f13634u, v(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM = M();
        Iterator it = collection.iterator();
        if (32 - iM >= collection.size()) {
            Object[] objArrS = s(this.f13634u);
            g(objArrS, iM, it);
            this.f13634u = objArrS;
            this.f13635v = collection.size() + this.f13635v;
            return true;
        }
        int size = ((collection.size() + iM) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrS2 = s(this.f13634u);
        g(objArrS2, iM, it);
        objArr[0] = objArrS2;
        for (int i7 = 1; i7 < size; i7++) {
            Object[] objArrU = u();
            g(objArrU, 0, it);
            objArr[i7] = objArrU;
        }
        this.f13633t = A(this.f13633t, J(), objArr);
        Object[] objArrU2 = u();
        g(objArrU2, 0, it);
        this.f13634u = objArrU2;
        this.f13635v = collection.size() + this.f13635v;
        return true;
    }
}
