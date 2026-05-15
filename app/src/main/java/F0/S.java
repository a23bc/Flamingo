package f0;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11740b;

    public S(Object obj, Object obj2) {
        this.f11739a = obj;
        this.f11740b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s7 = (S) obj;
        return AbstractC1209k.a(this.f11739a, s7.f11739a) && AbstractC1209k.a(this.f11740b, s7.f11740b);
    }

    public final int hashCode() {
        Object obj = this.f11739a;
        int iOrdinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) * 31;
        Object obj2 = this.f11740b;
        return (obj2 instanceof Enum ? ((Enum) obj2).ordinal() : obj2 != null ? obj2.hashCode() : 0) + iOrdinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f11739a + ", right=" + this.f11740b + ')';
    }
}
