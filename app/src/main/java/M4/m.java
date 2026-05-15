package M4;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Map.Entry {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f4802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f4803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m f4804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f4805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f4806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4807t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f4808u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f4809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4810w;

    public m(boolean z6) {
        this.f4807t = null;
        this.f4808u = z6;
        this.f4806s = this;
        this.f4805r = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f4807t;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f4809v;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4807t;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4809v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f4807t;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f4809v;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f4808u) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f4809v;
        this.f4809v = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4807t + "=" + this.f4809v;
    }

    public m(boolean z6, m mVar, Object obj, m mVar2, m mVar3) {
        this.f4802o = mVar;
        this.f4807t = obj;
        this.f4808u = z6;
        this.f4810w = 1;
        this.f4805r = mVar2;
        this.f4806s = mVar3;
        mVar3.f4805r = this;
        mVar2.f4806s = this;
    }
}
