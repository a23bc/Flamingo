package j0;

import Z4.l;
import f0.AbstractC0908q0;
import j5.AbstractC1107a;
import java.util.Arrays;
import java.util.ListIterator;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: j0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1094e extends AbstractC1092c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object[] f13624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object[] f13625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13627r;

    public C1094e(Object[] objArr, Object[] objArr2, int i7, int i8) {
        this.f13624o = objArr;
        this.f13625p = objArr2;
        this.f13626q = i7;
        this.f13627r = i8;
        if (!(b() > 32)) {
            AbstractC0908q0.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] q(Object[] objArr, int i7, int i8, Object obj, U0.a aVar) {
        Object[] objArrCopyOf;
        int iW = k.w(i8, i7);
        if (i7 == 0) {
            if (iW == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            }
            l.W(iW + 1, iW, 31, objArr, objArrCopyOf);
            aVar.f7026a = objArr[31];
            objArrCopyOf[iW] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC1209k.e(objArrCopyOf2, "copyOf(...)");
        int i9 = i7 - 5;
        Object obj2 = objArr[iW];
        AbstractC1209k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iW] = q((Object[]) obj2, i9, i8, obj, aVar);
        while (true) {
            iW++;
            if (iW >= 32 || objArrCopyOf2[iW] == null) {
                break;
            }
            Object obj3 = objArr[iW];
            AbstractC1209k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iW] = q((Object[]) obj3, i9, 0, aVar.f7026a, aVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] s(Object[] objArr, int i7, int i8, U0.a aVar) {
        Object[] objArrS;
        int iW = k.w(i8, i7);
        if (i7 == 5) {
            aVar.f7026a = objArr[iW];
            objArrS = null;
        } else {
            Object obj = objArr[iW];
            AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrS = s((Object[]) obj, i7 - 5, i8, aVar);
        }
        if (objArrS == null && iW == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iW] = objArrS;
        return objArrCopyOf;
    }

    public static Object[] y(Object[] objArr, int i7, int i8, Object obj) {
        int iW = k.w(i8, i7);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        if (i7 == 0) {
            objArrCopyOf[iW] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iW];
        AbstractC1209k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iW] = y((Object[]) obj2, i7 - 5, i8, obj);
        return objArrCopyOf;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        return this.f13626q;
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c c(int i7, Object obj) {
        int i8 = this.f13626q;
        AbstractC1107a.k(i7, i8);
        if (i7 == i8) {
            return e(obj);
        }
        int iX = x();
        Object[] objArr = this.f13624o;
        if (i7 >= iX) {
            return r(i7 - iX, obj, objArr);
        }
        U0.a aVar = new U0.a(null);
        return r(0, aVar.f7026a, q(objArr, this.f13627r, i7, obj, aVar));
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c e(Object obj) {
        int iX = x();
        int i7 = this.f13626q;
        int i8 = i7 - iX;
        Object[] objArr = this.f13624o;
        Object[] objArr2 = this.f13625p;
        if (i8 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return t(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i8] = obj;
        return new C1094e(objArr, objArrCopyOf, i7 + 1, this.f13627r);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        AbstractC1107a.j(i7, b());
        if (x() <= i7) {
            objArr = this.f13625p;
        } else {
            objArr = this.f13624o;
            for (int i8 = this.f13627r; i8 > 0; i8 -= 5) {
                Object obj = objArr[k.w(i7, i8)];
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // j0.AbstractC1092c
    public final C1095f i() {
        return new C1095f(this, this.f13624o, this.f13625p, this.f13627r);
    }

    @Override // Z4.e, java.util.List
    public final ListIterator listIterator(int i7) {
        AbstractC1107a.k(i7, this.f13626q);
        return new C1096g(i7, this.f13626q, (this.f13627r / 5) + 1, this.f13624o, this.f13625p);
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c n(C1091b c1091b) {
        C1095f c1095f = new C1095f(this, this.f13624o, this.f13625p, this.f13627r);
        c1095f.G(c1091b);
        return c1095f.e();
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c o(int i7) {
        AbstractC1107a.j(i7, this.f13626q);
        int iX = x();
        Object[] objArr = this.f13624o;
        int i8 = this.f13627r;
        return i7 >= iX ? w(objArr, iX, i8, i7 - iX) : w(v(objArr, i8, i7, new U0.a(this.f13625p[0])), iX, i8, 0);
    }

    @Override // j0.AbstractC1092c
    public final AbstractC1092c p(int i7, Object obj) {
        int i8 = this.f13626q;
        AbstractC1107a.j(i7, i8);
        int iX = x();
        Object[] objArr = this.f13624o;
        Object[] objArr2 = this.f13625p;
        int i9 = this.f13627r;
        if (iX > i7) {
            return new C1094e(y(objArr, i9, i7, obj), objArr2, i8, i9);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i7 & 31] = obj;
        return new C1094e(objArr, objArrCopyOf, i8, i9);
    }

    public final C1094e r(int i7, Object obj, Object[] objArr) {
        int iX = x();
        int i8 = this.f13626q;
        int i9 = i8 - iX;
        Object[] objArr2 = this.f13625p;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        if (i9 < 32) {
            l.W(i7 + 1, i7, i9, objArr2, objArrCopyOf);
            objArrCopyOf[i7] = obj;
            return new C1094e(objArr, objArrCopyOf, i8 + 1, this.f13627r);
        }
        Object obj2 = objArr2[31];
        l.W(i7 + 1, i7, i9 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return t(objArr, objArrCopyOf, objArr3);
    }

    public final C1094e t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f13626q;
        int i8 = i7 >> 5;
        int i9 = this.f13627r;
        if (i8 <= (1 << i9)) {
            return new C1094e(u(i9, objArr, objArr2), objArr3, i7 + 1, i9);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i10 = i9 + 5;
        return new C1094e(u(i10, objArr4, objArr2), objArr3, i7 + 1, i10);
    }

    public final Object[] u(int i7, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iW = k.w(b() - 1, i7);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i7 == 5) {
            objArrCopyOf[iW] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iW] = u(i7 - 5, (Object[]) objArrCopyOf[iW], objArr2);
        return objArrCopyOf;
    }

    public final Object[] v(Object[] objArr, int i7, int i8, U0.a aVar) {
        Object[] objArrCopyOf;
        int iW = k.w(i8, i7);
        if (i7 == 0) {
            if (iW == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            }
            l.W(iW, iW + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = aVar.f7026a;
            aVar.f7026a = objArr[iW];
            return objArrCopyOf;
        }
        int iW2 = objArr[31] == null ? k.w(x() - 1, i7) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC1209k.e(objArrCopyOf2, "copyOf(...)");
        int i9 = i7 - 5;
        int i10 = iW + 1;
        if (i10 <= iW2) {
            while (true) {
                Object obj = objArrCopyOf2[iW2];
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iW2] = v((Object[]) obj, i9, 0, aVar);
                if (iW2 == i10) {
                    break;
                }
                iW2--;
            }
        }
        Object obj2 = objArrCopyOf2[iW];
        AbstractC1209k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iW] = v((Object[]) obj2, i9, i8, aVar);
        return objArrCopyOf2;
    }

    public final AbstractC1092c w(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f13626q - i7;
        if (i10 != 1) {
            Object[] objArr2 = this.f13625p;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            int i11 = i10 - 1;
            if (i9 < i11) {
                l.W(i9, i9 + 1, i10, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i11] = null;
            return new C1094e(objArr, objArrCopyOf, (i7 + i10) - 1, i8);
        }
        if (i8 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC1209k.e(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        U0.a aVar = new U0.a(null);
        Object[] objArrS = s(objArr, i8, i7 - 1, aVar);
        AbstractC1209k.c(objArrS);
        Object obj = aVar.f7026a;
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrS[1] != null) {
            return new C1094e(objArrS, objArr3, i7, i8);
        }
        Object obj2 = objArrS[0];
        AbstractC1209k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new C1094e((Object[]) obj2, objArr3, i7, i8 - 5);
    }

    public final int x() {
        return (this.f13626q - 1) & (-32);
    }
}
