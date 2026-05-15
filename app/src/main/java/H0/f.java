package h0;

import Z1.l;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(int i7, List list) {
        int size = list.size();
        if (i7 < 0 || i7 >= size) {
            c(i7, size);
        }
    }

    public static final void b(int i7, int i8, List list) {
        if (i7 > i8) {
            f(i7, i8);
        }
        if (i7 < 0) {
            d(i7);
        }
        if (i8 > list.size()) {
            e(i8, list.size());
        }
    }

    private static final void c(int i7, int i8) {
        throw new IndexOutOfBoundsException("Index " + i7 + " is out of bounds. The list has " + i8 + " elements.");
    }

    private static final void d(int i7) {
        throw new IndexOutOfBoundsException(l.o(i7, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i7, int i8) {
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is more than than the list size (" + i8 + ')');
    }

    private static final void f(int i7, int i8) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i7 + ") is greater than toIndex (" + i8 + ").");
    }
}
