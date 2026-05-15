package W3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f7790b;

    public c(String str, long j3) {
        this.f7789a = str;
        this.f7790b = Long.valueOf(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f7789a.equals(cVar.f7789a)) {
            return false;
        }
        Long l = cVar.f7790b;
        Long l7 = this.f7790b;
        return l7 != null ? l7.equals(l) : l == null;
    }

    public final int hashCode() {
        int iHashCode = this.f7789a.hashCode() * 31;
        Long l = this.f7790b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
