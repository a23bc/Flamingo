package A2;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0 f453c = new u0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f455b;

    public u0(int i7, boolean z6) {
        this.f454a = i7;
        this.f455b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f454a == u0Var.f454a && this.f455b == u0Var.f455b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f454a << 1) + (this.f455b ? 1 : 0);
    }
}
