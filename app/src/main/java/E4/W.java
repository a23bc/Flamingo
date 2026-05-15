package E4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC0117o implements Serializable {

    /* JADX INFO: renamed from: r */
    public transient Map f1895r;

    /* JADX INFO: renamed from: s */
    public transient int f1896s;

    /* JADX INFO: renamed from: t */
    public transient V f1897t;

    @Override // E4.AbstractC0117o
    public final C0106d a() {
        C0106d c0106d = this.f1969q;
        if (c0106d != null) {
            return c0106d;
        }
        Map map = this.f1895r;
        C0106d c0108f = map instanceof NavigableMap ? new C0108f(this, (NavigableMap) map) : map instanceof SortedMap ? new C0111i(this, (SortedMap) map) : new C0106d(this, map);
        this.f1969q = c0108f;
        return c0108f;
    }

    public final void b() {
        Map map = this.f1895r;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f1896s = 0;
    }
}
