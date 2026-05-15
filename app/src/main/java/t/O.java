package t;

import java.util.List;
import u.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f16029a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1444F f16030b = new C1444F(0);

    public static final void a(int i7, List list) {
        int size = list.size();
        if (i7 < 0 || i7 >= size) {
            AbstractC1525a.d("Index " + i7 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i7, int i8, List list) {
        int size = list.size();
        if (i7 > i8) {
            AbstractC1525a.c("Indices are out of order. fromIndex (" + i7 + ") is greater than toIndex (" + i8 + ").");
            throw null;
        }
        if (i7 < 0) {
            AbstractC1525a.d("fromIndex (" + i7 + ") is less than 0.");
            throw null;
        }
        if (i8 <= size) {
            return;
        }
        AbstractC1525a.d("toIndex (" + i8 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
