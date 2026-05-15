package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: o */
    public final Comparable f9445o;

    /* JADX INFO: renamed from: p */
    public Object f9446p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Z f9447q;

    public c0(Z z6, Comparable comparable, Object obj) {
        this.f9447q = z6;
        this.f9445o = comparable;
        this.f9446p = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9445o.compareTo(((c0) obj).f9445o);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9445o;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f9446p;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9445o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9446p;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9445o;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9446p;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9447q.c();
        Object obj2 = this.f9446p;
        this.f9446p = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9445o + "=" + this.f9446p;
    }
}
