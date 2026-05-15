package H2;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f3185d = new g0(new t2.i0[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3186e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E4.b0 f3188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3189c;

    static {
        int i7 = w2.t.f18881a;
        f3186e = Integer.toString(0, 36);
    }

    public g0(t2.i0... i0VarArr) {
        this.f3188b = E4.I.q(i0VarArr);
        this.f3187a = i0VarArr.length;
        int i7 = 0;
        while (true) {
            E4.b0 b0Var = this.f3188b;
            if (i7 >= b0Var.f1915r) {
                return;
            }
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < b0Var.f1915r; i9++) {
                if (((t2.i0) b0Var.get(i7)).equals(b0Var.get(i9))) {
                    AbstractC1697a.n("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public final t2.i0 a(int i7) {
        return (t2.i0) this.f3188b.get(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f3187a == g0Var.f3187a && this.f3188b.equals(g0Var.f3188b);
    }

    public final int hashCode() {
        if (this.f3189c == 0) {
            this.f3189c = this.f3188b.hashCode();
        }
        return this.f3189c;
    }
}
