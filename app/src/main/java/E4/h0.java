package E4;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends M {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object[] f1942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h0 f1943x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient Object[] f1944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f1945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient Object[] f1946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f1947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f1948v;

    static {
        Object[] objArr = new Object[0];
        f1942w = objArr;
        f1943x = new h0(0, 0, 0, objArr, objArr);
    }

    public h0(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        this.f1944r = objArr;
        this.f1945s = i7;
        this.f1946t = objArr2;
        this.f1947u = i8;
        this.f1948v = i9;
    }

    @Override // E4.D
    public final int b(int i7, Object[] objArr) {
        Object[] objArr2 = this.f1944r;
        int i8 = this.f1948v;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // E4.D
    public final Object[] c() {
        return this.f1944r;
    }

    @Override // E4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f1946t;
            if (objArr.length != 0) {
                int iS = AbstractC0119q.s(obj);
                while (true) {
                    int i7 = iS & this.f1947u;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iS = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // E4.D
    public final int e() {
        return this.f1948v;
    }

    @Override // E4.D
    public final int g() {
        return 0;
    }

    @Override // E4.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f1945s;
    }

    @Override // E4.D
    public final boolean i() {
        return false;
    }

    @Override // E4.D
    /* JADX INFO: renamed from: k */
    public final p0 iterator() {
        return a().listIterator(0);
    }

    @Override // E4.M
    public final I q() {
        return I.n(this.f1948v, this.f1944r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1948v;
    }
}
