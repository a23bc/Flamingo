package t2;

import android.os.Bundle;
import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends Y {

    /* JADX INFO: renamed from: d */
    public static final String f16372d;

    /* JADX INFO: renamed from: e */
    public static final String f16373e;

    /* JADX INFO: renamed from: b */
    public final int f16374b;

    /* JADX INFO: renamed from: c */
    public final float f16375c;

    static {
        int i7 = w2.t.f18881a;
        f16372d = Integer.toString(1, 36);
        f16373e = Integer.toString(2, 36);
    }

    public Z(int i7) {
        AbstractC1697a.c("maxStars must be a positive integer", i7 > 0);
        this.f16374b = i7;
        this.f16375c = -1.0f;
    }

    @Override // t2.Y
    public final boolean b() {
        return this.f16375c != -1.0f;
    }

    @Override // t2.Y
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(Y.f16371a, 2);
        bundle.putInt(f16372d, this.f16374b);
        bundle.putFloat(f16373e, this.f16375c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return this.f16374b == z6.f16374b && this.f16375c == z6.f16375c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16374b), Float.valueOf(this.f16375c)});
    }

    public Z(int i7, float f7) {
        boolean z6 = false;
        AbstractC1697a.c("maxStars must be a positive integer", i7 > 0);
        if (f7 >= 0.0f && f7 <= i7) {
            z6 = true;
        }
        AbstractC1697a.c("starRating is out of range [0, maxStars]", z6);
        this.f16374b = i7;
        this.f16375c = f7;
    }
}
