package y3;

import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y1.s f20436c = new Y1.s(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f20437b = new LinkedHashMap();

    @Override // androidx.lifecycle.Q
    public final void d() {
        LinkedHashMap linkedHashMap = this.f20437b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((X) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f20437b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        AbstractC1209k.e(string, "sb.toString()");
        return string;
    }
}
