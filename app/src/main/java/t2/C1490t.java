package t2;

/* JADX INFO: renamed from: t2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1490t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16734d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16736b;

    static {
        int i7 = w2.t.f18881a;
        f16733c = Integer.toString(0, 36);
        f16734d = Integer.toString(1, 36);
    }

    public C1490t(String str, String str2) {
        this.f16735a = w2.t.E(str);
        this.f16736b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1490t.class == obj.getClass()) {
            C1490t c1490t = (C1490t) obj;
            if (w2.t.a(this.f16735a, c1490t.f16735a) && w2.t.a(this.f16736b, c1490t.f16736b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f16736b.hashCode() * 31;
        String str = this.f16735a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
