package s;

import java.util.Map;

/* JADX INFO: renamed from: s.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1426c implements Map.Entry {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f15809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f15810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1426c f15811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1426c f15812r;

    public C1426c(Object obj, Object obj2) {
        this.f15809o = obj;
        this.f15810p = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1426c)) {
            return false;
        }
        C1426c c1426c = (C1426c) obj;
        return this.f15809o.equals(c1426c.f15809o) && this.f15810p.equals(c1426c.f15810p);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15809o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15810p;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15809o.hashCode() ^ this.f15810p.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15809o + "=" + this.f15810p;
    }
}
