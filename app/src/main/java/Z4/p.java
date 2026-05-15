package Z4;

import java.util.Collection;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {
    public static int j0(Iterable iterable) {
        AbstractC1209k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
