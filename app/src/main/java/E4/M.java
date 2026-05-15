package E4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends D implements Set {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f1877q = 0;

    /* JADX INFO: renamed from: p */
    public transient I f1878p;

    public static int n(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static M o(int i7, Object... objArr) {
        if (i7 == 0) {
            return h0.f1943x;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new n0(obj);
        }
        int iN = n(i7);
        Object[] objArr2 = new Object[iN];
        int i8 = iN - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                throw new NullPointerException(n1.c.s(i11, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iR = AbstractC0119q.r(iHashCode);
            while (true) {
                int i12 = iR & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += iHashCode;
                    i10++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iR++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new n0(obj4);
        }
        if (n(i10) < iN / 2) {
            return o(i10, objArr);
        }
        int length = objArr.length;
        if (i10 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new h0(i9, i8, i10, objArr, objArr2);
    }

    public static M p(Collection collection) {
        if ((collection instanceof M) && !(collection instanceof SortedSet)) {
            M m7 = (M) collection;
            if (!m7.i()) {
                return m7;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    @Override // E4.D
    public I a() {
        I i7 = this.f1878p;
        if (i7 != null) {
            return i7;
        }
        I iQ = q();
        this.f1878p = iQ;
        return iQ;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof M) && (this instanceof h0)) {
            M m7 = (M) obj;
            m7.getClass();
            if ((m7 instanceof h0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC0119q.h(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0119q.l(this);
    }

    public I q() {
        Object[] array = toArray(D.f1861o);
        G g6 = I.f1870p;
        return I.n(array.length, array);
    }
}
