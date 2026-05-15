package f0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class K0 {
    public static final int a(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i7, int i8) {
        int iE = e(arrayList, i7, i8);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int c(int[] iArr, int i7) {
        int i8 = i7 * 5;
        return Integer.bitCount(iArr[i8 + 1] >> 28) + iArr[i8 + 4];
    }

    public static final void d(int i7, int i8, int[] iArr) {
        if (i8 >= 0) {
        }
        int i9 = (i7 * 5) + 1;
        iArr[i9] = i8 | (iArr[i9] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i7, int i8) {
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int i11 = ((C0877b) arrayList.get(i10)).f11789a;
            if (i11 < 0) {
                i11 += i8;
            }
            int iG = AbstractC1209k.g(i11, i7);
            if (iG < 0) {
                i9 = i10 + 1;
            } else {
                if (iG <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
