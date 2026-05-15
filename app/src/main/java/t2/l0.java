package t2;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f16515d = new l0(new k0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16518g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16521c;

    static {
        int i7 = w2.t.f18881a;
        f16516e = Integer.toString(1, 36);
        f16517f = Integer.toString(2, 36);
        f16518g = Integer.toString(3, 36);
    }

    public l0(k0 k0Var) {
        this.f16519a = k0Var.f16507a;
        this.f16520b = k0Var.f16508b;
        this.f16521c = k0Var.f16509c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f16519a == l0Var.f16519a && this.f16520b == l0Var.f16520b && this.f16521c == l0Var.f16521c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f16519a + 31) * 31) + (this.f16520b ? 1 : 0)) * 31) + (this.f16521c ? 1 : 0);
    }
}
