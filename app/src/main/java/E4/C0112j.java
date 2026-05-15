package E4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: E4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0112j extends C0107e implements SortedSet {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W f1952q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0112j(W w7, SortedMap sortedMap) {
        super(w7, sortedMap);
        this.f1952q = w7;
    }

    public SortedMap a() {
        return (SortedMap) this.f1929o;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0112j(this.f1952q, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0112j(this.f1952q, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0112j(this.f1952q, a().tailMap(obj));
    }
}
