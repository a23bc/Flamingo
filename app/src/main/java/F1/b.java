package F1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2176b;

    public b(Object obj, Object obj2) {
        this.f2175a = obj;
        this.f2176b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f2175a, this.f2175a) && Objects.equals(bVar.f2176b, this.f2176b);
    }

    public final int hashCode() {
        Object obj = this.f2175a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2176b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f2175a + " " + this.f2176b + "}";
    }
}
