package Y;

import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8383a = C1987t.f20262j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return C1987t.c(this.f8383a, ((l) obj).f8383a);
        }
        return false;
    }

    public final int hashCode() {
        return C1987t.i(this.f8383a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C1987t.j(this.f8383a)) + ", rippleAlpha=null)";
    }
}
