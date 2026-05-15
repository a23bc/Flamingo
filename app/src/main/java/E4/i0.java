package E4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends Z implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z f1951o;

    public i0(Z z6) {
        this.f1951o = z6;
    }

    @Override // E4.Z
    public final Z a() {
        return this.f1951o;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f1951o.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            return this.f1951o.equals(((i0) obj).f1951o);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f1951o.hashCode();
    }

    public final String toString() {
        return this.f1951o + ".reverse()";
    }
}
