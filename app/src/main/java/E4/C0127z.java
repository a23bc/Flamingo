package E4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: E4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0127z extends Z implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Comparator[] f2000o;

    public C0127z(C0118p c0118p, C0118p c0118p2) {
        this.f2000o = new Comparator[]{c0118p, c0118p2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f2000o;
            if (i7 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i7].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i7++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0127z) {
            return Arrays.equals(this.f2000o, ((C0127z) obj).f2000o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2000o);
    }

    public final String toString() {
        return Z1.l.t(new StringBuilder("Ordering.compound("), Arrays.toString(this.f2000o), ")");
    }
}
