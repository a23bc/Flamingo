package E4;

import java.io.Serializable;

/* JADX INFO: renamed from: E4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0123v extends Z implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1.b f1995o;

    public C0123v(C1.b bVar) {
        this.f1995o = bVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f1995o.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0123v) {
            return this.f1995o.equals(((C0123v) obj).f1995o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1995o.hashCode();
    }

    public final String toString() {
        return this.f1995o.toString();
    }
}
