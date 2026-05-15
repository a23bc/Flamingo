package D4;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f1573o;

    public g(List list) {
        this.f1573o = list;
    }

    @Override // D4.f
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f1573o;
            if (i7 >= list.size()) {
                return true;
            }
            if (!((f) list.get(i7)).apply(obj)) {
                return false;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f1573o.equals(((g) obj).f1573o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1573o.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z6 = true;
        for (Object obj : this.f1573o) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
