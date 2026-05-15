package E4;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a0 f1906w = new a0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient Object f1907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient Object[] f1908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f1909t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f1910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient a0 f1911v;

    public a0() {
        this.f1907r = null;
        this.f1908s = new Object[0];
        this.f1909t = 0;
        this.f1910u = 0;
        this.f1911v = this;
    }

    @Override // E4.K
    public final d0 c() {
        return new d0(this, this.f1908s, this.f1909t, this.f1910u);
    }

    @Override // E4.K
    public final e0 d() {
        return new e0(this, new f0(this.f1908s, this.f1909t, this.f1910u));
    }

    @Override // E4.K, java.util.Map
    public final Object get(Object obj) {
        Object objH = g0.h(this.f1907r, this.f1908s, this.f1910u, this.f1909t, obj);
        if (objH == null) {
            return null;
        }
        return objH;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1910u;
    }

    public a0(int i7, Object[] objArr) {
        this.f1908s = objArr;
        this.f1910u = i7;
        this.f1909t = 0;
        int iN = i7 >= 2 ? M.n(i7) : 0;
        Object objG = g0.g(objArr, i7, iN, 0);
        if (!(objG instanceof Object[])) {
            this.f1907r = objG;
            Object objG2 = g0.g(objArr, i7, iN, 1);
            if (!(objG2 instanceof Object[])) {
                this.f1911v = new a0(objG2, objArr, i7, this);
                return;
            }
            throw ((J) ((Object[]) objG2)[2]).a();
        }
        throw ((J) ((Object[]) objG)[2]).a();
    }

    public a0(Object obj, Object[] objArr, int i7, a0 a0Var) {
        this.f1907r = obj;
        this.f1908s = objArr;
        this.f1909t = 1;
        this.f1910u = i7;
        this.f1911v = a0Var;
    }
}
