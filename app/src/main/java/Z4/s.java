package Z4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends r {
    public static void k0(List list, Comparator comparator) {
        AbstractC1209k.f(list, "<this>");
        AbstractC1209k.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
