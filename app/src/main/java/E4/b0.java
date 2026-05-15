package E4;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends I {

    /* JADX INFO: renamed from: s */
    public static final b0 f1913s = new b0(0, new Object[0]);

    /* JADX INFO: renamed from: q */
    public final transient Object[] f1914q;

    /* JADX INFO: renamed from: r */
    public final transient int f1915r;

    public b0(int i7, Object[] objArr) {
        this.f1914q = objArr;
        this.f1915r = i7;
    }

    @Override // E4.I, E4.D
    public final int b(int i7, Object[] objArr) {
        Object[] objArr2 = this.f1914q;
        int i8 = this.f1915r;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // E4.D
    public final Object[] c() {
        return this.f1914q;
    }

    @Override // E4.D
    public final int e() {
        return this.f1915r;
    }

    @Override // E4.D
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        N5.d.p(i7, this.f1915r);
        Object obj = this.f1914q[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // E4.D
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1915r;
    }
}
