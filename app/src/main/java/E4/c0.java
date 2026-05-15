package E4;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends I {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d0 f1920q;

    public c0(d0 d0Var) {
        this.f1920q = d0Var;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        d0 d0Var = this.f1920q;
        N5.d.p(i7, d0Var.f1928u);
        int i8 = i7 * 2;
        int i9 = d0Var.f1927t;
        Object[] objArr = d0Var.f1926s;
        Object obj = objArr[i8 + i9];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i8 + (i9 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // E4.D
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1920q.f1928u;
    }
}
