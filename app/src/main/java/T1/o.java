package T1;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6874p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6875q = -1;

    public o(int i7) {
        this.f6873o = i7;
    }

    @Override // T1.n
    public final boolean a(CharSequence charSequence, int i7, int i8, v vVar) {
        int i9 = this.f6873o;
        if (i7 > i9 || i9 >= i8) {
            return i8 <= i9;
        }
        this.f6874p = i7;
        this.f6875q = i8;
        return false;
    }

    @Override // T1.n
    public final Object b() {
        return this;
    }
}
