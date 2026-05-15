package Z4;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class B extends N5.d {
    public static LinkedHashSet Z(Set set, Object obj) {
        AbstractC1209k.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.k0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set a0(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return x.f8820o;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            AbstractC1209k.e(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.k0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
