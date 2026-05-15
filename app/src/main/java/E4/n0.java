package E4;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient Object f1966r;

    public n0(Object obj) {
        obj.getClass();
        this.f1966r = obj;
    }

    @Override // E4.M, E4.D
    public final I a() {
        return I.t(this.f1966r);
    }

    @Override // E4.D
    public final int b(int i7, Object[] objArr) {
        objArr[i7] = this.f1966r;
        return i7 + 1;
    }

    @Override // E4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1966r.equals(obj);
    }

    @Override // E4.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f1966r.hashCode();
    }

    @Override // E4.D
    public final boolean i() {
        return false;
    }

    @Override // E4.D
    /* JADX INFO: renamed from: k */
    public final p0 iterator() {
        P p7 = new P();
        p7.f1887o = this.f1966r;
        return p7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f1966r.toString() + ']';
    }
}
