package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import t.C1448c;
import t.C1450e;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends AbstractSet {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f9457o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Map f9458p;

    public /* synthetic */ e0(Map map, int i7) {
        this.f9457o = i7;
        this.f9458p = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f9457o) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((Z) this.f9458p).g((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f9457o) {
            case 0:
                ((Z) this.f9458p).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f9457o) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((Z) this.f9458p).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f9457o) {
            case 0:
                return new d0((Z) this.f9458p);
            default:
                return new C1448c((C1450e) this.f9458p);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f9457o) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((Z) this.f9458p).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9457o) {
            case 0:
                return ((Z) this.f9458p).size();
            default:
                return ((C1450e) this.f9458p).f16036q;
        }
    }
}
