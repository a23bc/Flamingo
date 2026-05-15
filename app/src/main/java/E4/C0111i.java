package E4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: E4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0111i extends C0106d implements SortedMap {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SortedSet f1949s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f1950t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0111i(W w7, SortedMap sortedMap) {
        super(w7, sortedMap);
        this.f1950t = w7;
    }

    public SortedSet c() {
        return new C0112j(this.f1950t, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // E4.C0106d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f1949s;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.f1949s = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.f1923q;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0111i(this.f1950t, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0111i(this.f1950t, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0111i(this.f1950t, e().tailMap(obj));
    }
}
