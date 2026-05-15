package t2;

import java.util.Locale;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f16345d = new Q(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16347f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16350c;

    static {
        int i7 = w2.t.f18881a;
        f16346e = Integer.toString(0, 36);
        f16347f = Integer.toString(1, 36);
    }

    public Q(float f7) {
        this(f7, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class == obj.getClass()) {
            Q q7 = (Q) obj;
            if (this.f16348a == q7.f16348a && this.f16349b == q7.f16349b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f16349b) + ((Float.floatToRawIntBits(this.f16348a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f16348a), Float.valueOf(this.f16349b)};
        int i7 = w2.t.f18881a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public Q(float f7, float f8) {
        AbstractC1697a.d(f7 > 0.0f);
        AbstractC1697a.d(f8 > 0.0f);
        this.f16348a = f7;
        this.f16349b = f8;
        this.f16350c = Math.round(f7 * 1000.0f);
    }
}
