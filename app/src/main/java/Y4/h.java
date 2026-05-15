package Y4;

import java.io.Serializable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f8726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f8727p;

    public h(Object obj, Object obj2) {
        this.f8726o = obj;
        this.f8727p = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC1209k.a(this.f8726o, hVar.f8726o) && AbstractC1209k.a(this.f8727p, hVar.f8727p);
    }

    public final int hashCode() {
        Object obj = this.f8726o;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8727p;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f8726o + ", " + this.f8727p + ')';
    }
}
