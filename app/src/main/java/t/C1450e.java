package t;

import androidx.datastore.preferences.protobuf.e0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: t.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1450e extends T implements Map {

    /* JADX INFO: renamed from: r */
    public e0 f16062r;

    /* JADX INFO: renamed from: s */
    public C1447b f16063s;

    /* JADX INFO: renamed from: t */
    public C1449d f16064t;

    @Override // java.util.Map
    public final Set entrySet() {
        e0 e0Var = this.f16062r;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this, 1);
        this.f16062r = e0Var2;
        return e0Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1447b c1447b = this.f16063s;
        if (c1447b != null) {
            return c1447b;
        }
        C1447b c1447b2 = new C1447b(this);
        this.f16063s = c1447b2;
        return c1447b2;
    }

    public final boolean l(Collection collection) {
        int i7 = this.f16036q;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i7 != this.f16036q;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f16036q;
        int i7 = this.f16036q;
        int[] iArr = this.f16034o;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f16034o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16035p, size * 2);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f16035p = objArrCopyOf;
        }
        if (this.f16036q != i7) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1449d c1449d = this.f16064t;
        if (c1449d != null) {
            return c1449d;
        }
        C1449d c1449d2 = new C1449d(this);
        this.f16064t = c1449d2;
        return c1449d2;
    }
}
