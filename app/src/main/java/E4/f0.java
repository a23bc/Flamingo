package E4;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends I {

    /* JADX INFO: renamed from: q */
    public final transient Object[] f1934q;

    /* JADX INFO: renamed from: r */
    public final transient int f1935r;

    /* JADX INFO: renamed from: s */
    public final transient int f1936s;

    public f0(Object[] objArr, int i7, int i8) {
        this.f1934q = objArr;
        this.f1935r = i7;
        this.f1936s = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        N5.d.p(i7, this.f1936s);
        Object obj = this.f1934q[(i7 * 2) + this.f1935r];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // E4.D
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1936s;
    }
}
