package t2;

import android.util.SparseBooleanArray;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: t2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1485n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f16552a;

    public C1485n(SparseBooleanArray sparseBooleanArray) {
        this.f16552a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i7 : iArr) {
            if (this.f16552a.get(i7)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i7) {
        SparseBooleanArray sparseBooleanArray = this.f16552a;
        AbstractC1697a.f(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1485n)) {
            return false;
        }
        C1485n c1485n = (C1485n) obj;
        int i7 = w2.t.f18881a;
        SparseBooleanArray sparseBooleanArray = this.f16552a;
        if (i7 >= 24) {
            return sparseBooleanArray.equals(c1485n.f16552a);
        }
        if (sparseBooleanArray.size() != c1485n.f16552a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
            if (b(i8) != c1485n.b(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = w2.t.f18881a;
        SparseBooleanArray sparseBooleanArray = this.f16552a;
        if (i7 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
            size = (size * 31) + b(i8);
        }
        return size;
    }
}
