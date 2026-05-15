package A2;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f458c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f460b;

    static {
        v0 v0Var = new v0(0L, 0L);
        new v0(Long.MAX_VALUE, Long.MAX_VALUE);
        new v0(Long.MAX_VALUE, 0L);
        new v0(0L, Long.MAX_VALUE);
        f458c = v0Var;
    }

    public v0(long j3, long j7) {
        AbstractC1697a.d(j3 >= 0);
        AbstractC1697a.d(j7 >= 0);
        this.f459a = j3;
        this.f460b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f459a == v0Var.f459a && this.f460b == v0Var.f460b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f459a) * 31) + ((int) this.f460b);
    }
}
