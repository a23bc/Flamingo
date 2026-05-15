package E4;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient K f1931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient f0 f1932s;

    public e0(K k7, f0 f0Var) {
        this.f1931r = k7;
        this.f1932s = f0Var;
    }

    @Override // E4.M, E4.D
    public final I a() {
        return this.f1932s;
    }

    @Override // E4.D
    public final int b(int i7, Object[] objArr) {
        return this.f1932s.b(i7, objArr);
    }

    @Override // E4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1931r.get(obj) != null;
    }

    @Override // E4.D
    public final boolean i() {
        return true;
    }

    @Override // E4.D
    /* JADX INFO: renamed from: k */
    public final p0 iterator() {
        return this.f1932s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1931r.size();
    }
}
