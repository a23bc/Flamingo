package w2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f18835o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f18836p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Set f18837q = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f18838r = Collections.EMPTY_LIST;

    public final int a(D2.n nVar) {
        int iIntValue;
        synchronized (this.f18835o) {
            try {
                iIntValue = this.f18836p.containsKey(nVar) ? ((Integer) this.f18836p.get(nVar)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final void b(D2.n nVar) {
        synchronized (this.f18835o) {
            try {
                Integer num = (Integer) this.f18836p.get(nVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f18838r);
                arrayList.remove(nVar);
                this.f18838r = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f18836p.remove(nVar);
                    HashSet hashSet = new HashSet(this.f18837q);
                    hashSet.remove(nVar);
                    this.f18837q = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f18836p.put(nVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f18835o) {
            it = this.f18838r.iterator();
        }
        return it;
    }
}
