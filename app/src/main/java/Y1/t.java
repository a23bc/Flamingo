package Y1;

import androidx.lifecycle.Q;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f8658f = new s(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8659b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8660c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8661d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8662e = false;

    public t(boolean z6) {
    }

    @Override // androidx.lifecycle.Q
    public final void d() {
        if (q.h(3)) {
            toString();
        }
        this.f8662e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f8659b.equals(tVar.f8659b) && this.f8660c.equals(tVar.f8660c) && this.f8661d.equals(tVar.f8661d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8661d.hashCode() + ((this.f8660c.hashCode() + (this.f8659b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f8659b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f8660c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f8661d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
