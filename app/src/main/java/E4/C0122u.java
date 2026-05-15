package E4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: E4.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0122u extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final Object f1985x = new Object();

    /* JADX INFO: renamed from: o */
    public transient Object f1986o;

    /* JADX INFO: renamed from: p */
    public transient int[] f1987p;

    /* JADX INFO: renamed from: q */
    public transient Object[] f1988q;

    /* JADX INFO: renamed from: r */
    public transient Object[] f1989r;

    /* JADX INFO: renamed from: s */
    public transient int f1990s;

    /* JADX INFO: renamed from: t */
    public transient int f1991t;

    /* JADX INFO: renamed from: u */
    public transient C0120s f1992u;

    /* JADX INFO: renamed from: v */
    public transient C0120s f1993v;

    /* JADX INFO: renamed from: w */
    public transient C0116n f1994w;

    public static C0122u b() {
        C0122u c0122u = new C0122u();
        c0122u.f1990s = Math.min(Math.max(8, 1), 1073741823);
        return c0122u;
    }

    public final Map c() {
        Object obj = this.f1986o;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f1990s += 32;
        Map mapC = c();
        if (mapC != null) {
            this.f1990s = Math.min(Math.max(size(), 3), 1073741823);
            mapC.clear();
            this.f1986o = null;
            this.f1991t = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f1991t, (Object) null);
        Arrays.fill(l(), 0, this.f1991t, (Object) null);
        Object obj = this.f1986o;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f1991t, 0);
        this.f1991t = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        return mapC != null ? mapC.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f1991t; i7++) {
            if (M3.a.L(obj, l()[i7])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f1990s & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iS = AbstractC0119q.s(obj);
        int iD = d();
        Object obj2 = this.f1986o;
        Objects.requireNonNull(obj2);
        int iT = AbstractC0119q.t(iS & iD, obj2);
        if (iT == 0) {
            return -1;
        }
        int i7 = ~iD;
        int i8 = iS & i7;
        do {
            int i9 = iT - 1;
            int i10 = i()[i9];
            if ((i10 & i7) == i8 && M3.a.L(obj, j()[i9])) {
                return i9;
            }
            iT = i10 & iD;
        } while (iT != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0120s c0120s = this.f1993v;
        if (c0120s != null) {
            return c0120s;
        }
        C0120s c0120s2 = new C0120s(this, 0);
        this.f1993v = c0120s2;
        return c0120s2;
    }

    public final void f(int i7, int i8) {
        Object obj = this.f1986o;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrL = l();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            objArrJ[i7] = null;
            objArrL[i7] = null;
            iArrI[i7] = 0;
            return;
        }
        Object obj2 = objArrJ[i9];
        objArrJ[i7] = obj2;
        objArrL[i7] = objArrL[i9];
        objArrJ[i9] = null;
        objArrL[i9] = null;
        iArrI[i7] = iArrI[i9];
        iArrI[i9] = 0;
        int iS = AbstractC0119q.s(obj2) & i8;
        int iT = AbstractC0119q.t(iS, obj);
        if (iT == size) {
            AbstractC0119q.u(iS, i7 + 1, obj);
            return;
        }
        while (true) {
            int i10 = iT - 1;
            int i11 = iArrI[i10];
            int i12 = i11 & i8;
            if (i12 == size) {
                iArrI[i10] = AbstractC0119q.n(i11, i7 + 1, i8);
                return;
            }
            iT = i12;
        }
    }

    public final boolean g() {
        return this.f1986o == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return l()[iE];
    }

    public final Object h(Object obj) {
        boolean zG = g();
        Object obj2 = f1985x;
        if (!zG) {
            int iD = d();
            Object obj3 = this.f1986o;
            Objects.requireNonNull(obj3);
            int iP = AbstractC0119q.p(obj, null, iD, obj3, i(), j(), null);
            if (iP != -1) {
                Object obj4 = l()[iP];
                f(iP, iD);
                this.f1991t--;
                this.f1990s += 32;
                return obj4;
            }
        }
        return obj2;
    }

    public final int[] i() {
        int[] iArr = this.f1987p;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f1988q;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0120s c0120s = this.f1992u;
        if (c0120s != null) {
            return c0120s;
        }
        C0120s c0120s2 = new C0120s(this, 1);
        this.f1992u = c0120s2;
        return c0120s2;
    }

    public final Object[] l() {
        Object[] objArr = this.f1989r;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i7, int i8, int i9, int i10) {
        Object objE = AbstractC0119q.e(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            AbstractC0119q.u(i9 & i11, i10 + 1, objE);
        }
        Object obj = this.f1986o;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i12 = 0; i12 <= i7; i12++) {
            int iT = AbstractC0119q.t(i12, obj);
            while (iT != 0) {
                int i13 = iT - 1;
                int i14 = iArrI[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int iT2 = AbstractC0119q.t(i16, objE);
                AbstractC0119q.u(i16, iT, objE);
                iArrI[i13] = AbstractC0119q.n(i15, iT2, i11);
                iT = i14 & i7;
            }
        }
        this.f1986o = objE;
        this.f1990s = AbstractC0119q.n(this.f1990s, 32 - Integer.numberOfLeadingZeros(i11), 31);
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0104 -> B:110:0x00ea). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.C0122u.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == f1985x) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f1991t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0116n c0116n = this.f1994w;
        if (c0116n != null) {
            return c0116n;
        }
        C0116n c0116n2 = new C0116n(1, this);
        this.f1994w = c0116n2;
        return c0116n2;
    }
}
