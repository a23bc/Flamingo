package Z4;

import java.util.Collection;
import java.util.Iterator;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends s {
    public static void l0(Collection collection, Iterable iterable) {
        AbstractC1209k.f(collection, "<this>");
        AbstractC1209k.f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
