package a5;

import java.util.Map;
import m5.AbstractC1209k;
import n5.InterfaceC1240d;

/* JADX INFO: renamed from: a5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0524d implements Map.Entry, InterfaceC1240d {

    /* JADX INFO: renamed from: o */
    public final C0525e f8860o;

    /* JADX INFO: renamed from: p */
    public final int f8861p;

    public C0524d(C0525e c0525e, int i7) {
        AbstractC1209k.f(c0525e, "map");
        this.f8860o = c0525e;
        this.f8861p = i7;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC1209k.a(entry.getKey(), getKey()) && AbstractC1209k.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8860o.f8864o[this.f8861p];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f8860o.f8865p;
        AbstractC1209k.c(objArr);
        return objArr[this.f8861p];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0525e c0525e = this.f8860o;
        c0525e.c();
        Object[] objArr = c0525e.f8865p;
        if (objArr == null) {
            int length = c0525e.f8864o.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c0525e.f8865p = objArr;
        }
        int i7 = this.f8861p;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
