package w3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: c */
    public static final l1 f19247c = new l1(false, false);

    /* JADX INFO: renamed from: d */
    public static final String f19248d;

    /* JADX INFO: renamed from: e */
    public static final String f19249e;

    /* JADX INFO: renamed from: a */
    public final boolean f19250a;

    /* JADX INFO: renamed from: b */
    public final boolean f19251b;

    static {
        int i7 = w2.t.f18881a;
        f19248d = Integer.toString(0, 36);
        f19249e = Integer.toString(1, 36);
    }

    public l1(boolean z6, boolean z7) {
        this.f19250a = z6;
        this.f19251b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f19250a == l1Var.f19250a && this.f19251b == l1Var.f19251b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19250a), Boolean.valueOf(this.f19251b)});
    }
}
