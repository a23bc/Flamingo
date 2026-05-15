package A2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f217c;

    public Z(Y y6) {
        this.f215a = y6.f212a;
        this.f216b = y6.f213b;
        this.f217c = y6.f214c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return this.f215a == z6.f215a && this.f216b == z6.f216b && this.f217c == z6.f217c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f215a), Float.valueOf(this.f216b), Long.valueOf(this.f217c)});
    }
}
