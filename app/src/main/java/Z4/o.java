package Z4;

import java.util.ArrayList;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends I0.c {
    public static ArrayList b0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    public static int c0(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        AbstractC1209k.f(arrayList, "<this>");
        h0(arrayList.size(), size);
        int i7 = size - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int iR = N5.l.r((Comparable) arrayList.get(i9), comparable);
            if (iR < 0) {
                i8 = i9 + 1;
            } else {
                if (iR <= 0) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static int d0(List list) {
        AbstractC1209k.f(list, "<this>");
        return list.size() - 1;
    }

    public static List e0(Object... objArr) {
        AbstractC1209k.f(objArr, "elements");
        return objArr.length > 0 ? l.S(objArr) : v.f8818o;
    }

    public static ArrayList f0(Object... objArr) {
        AbstractC1209k.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    public static final List g0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : I0.c.G(list.get(0)) : v.f8818o;
    }

    public static final void h0(int i7, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(Z1.l.o(i8, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i8 <= i7) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i7 + ").");
    }

    public static void i0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
