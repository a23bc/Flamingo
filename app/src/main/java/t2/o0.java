package t2;

import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16642g;
    public static final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f16643i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f16645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f16647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f16648e;

    static {
        int i7 = w2.t.f18881a;
        f16641f = Integer.toString(0, 36);
        f16642g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f16643i = Integer.toString(4, 36);
    }

    public o0(i0 i0Var, boolean z6, int[] iArr, boolean[] zArr) {
        int i7 = i0Var.f16490a;
        this.f16644a = i7;
        boolean z7 = false;
        AbstractC1697a.d(i7 == iArr.length && i7 == zArr.length);
        this.f16645b = i0Var;
        if (z6 && i7 > 1) {
            z7 = true;
        }
        this.f16646c = z7;
        this.f16647d = (int[]) iArr.clone();
        this.f16648e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (this.f16646c == o0Var.f16646c && this.f16645b.equals(o0Var.f16645b) && Arrays.equals(this.f16647d, o0Var.f16647d) && Arrays.equals(this.f16648e, o0Var.f16648e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16648e) + ((Arrays.hashCode(this.f16647d) + (((this.f16645b.hashCode() * 31) + (this.f16646c ? 1 : 0)) * 31)) * 31);
    }
}
