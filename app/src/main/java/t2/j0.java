package t2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16496d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f16497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E4.I f16498b;

    static {
        int i7 = w2.t.f18881a;
        f16495c = Integer.toString(0, 36);
        f16496d = Integer.toString(1, 36);
    }

    public j0(i0 i0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= i0Var.f16490a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f16497a = i0Var;
        this.f16498b = E4.I.p(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (this.f16497a.equals(j0Var.f16497a) && this.f16498b.equals(j0Var.f16498b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16498b.hashCode() * 31) + this.f16497a.hashCode();
    }
}
