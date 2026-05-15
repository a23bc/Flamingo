package K4;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n implements Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f4064o = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof m) && ((m) obj).f4064o.equals(this.f4064o);
        }
        return true;
    }

    public final int hashCode() {
        return this.f4064o.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4064o.iterator();
    }
}
