package p4;

import Z4.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: p */
    public static final m f15090p = new m(w.f8819o);

    /* JADX INFO: renamed from: o */
    public final Map f15091o;

    public m(Map map) {
        this.f15091o = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return AbstractC1209k.a(this.f15091o, ((m) obj).f15091o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15091o.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f15091o;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new Y4.h(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f15091o + ')';
    }
}
