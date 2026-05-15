package m1;

import h1.AbstractC0996a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f14333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f14334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f14335d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14336a;

    static {
        a(0.0f);
        a(0.5f);
        f14333b = 0.5f;
        a(-1.0f);
        f14334c = -1.0f;
        a(1.0f);
        f14335d = 1.0f;
    }

    public static void a(float f7) {
        if ((0.0f > f7 || f7 > 1.0f) && f7 != -1.0f) {
            AbstractC0996a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f7) {
        if (f7 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f7 == f14333b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f7 == f14334c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f7 == f14335d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f14336a, ((f) obj).f14336a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14336a);
    }

    public final String toString() {
        return b(this.f14336a);
    }
}
