package y0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: y0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1980m {

    /* JADX INFO: renamed from: a */
    public final ColorFilter f20246a;

    /* JADX INFO: renamed from: b */
    public final long f20247b;

    /* JADX INFO: renamed from: c */
    public final int f20248c;

    public C1980m(long j3, int i7) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1968a.e();
            porterDuffColorFilter = AbstractC1968a.d(AbstractC1959I.x(j3), AbstractC1959I.s(i7));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC1959I.x(j3), AbstractC1959I.B(i7));
        }
        this.f20246a = porterDuffColorFilter;
        this.f20247b = j3;
        this.f20248c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1980m)) {
            return false;
        }
        C1980m c1980m = (C1980m) obj;
        if (C1987t.c(this.f20247b, c1980m.f20247b)) {
            return this.f20248c == c1980m.f20248c;
        }
        return false;
    }

    public final int hashCode() {
        return (C1987t.i(this.f20247b) * 31) + this.f20248c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        n1.c.z(this.f20247b, sb, ", blendMode=");
        sb.append((Object) AbstractC1959I.C(this.f20248c));
        sb.append(')');
        return sb.toString();
    }
}
