package t2;

import android.os.Bundle;
import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class O extends Y {

    /* JADX INFO: renamed from: c */
    public static final String f16334c;

    /* JADX INFO: renamed from: b */
    public final float f16335b;

    static {
        int i7 = w2.t.f18881a;
        f16334c = Integer.toString(1, 36);
    }

    public O() {
        this.f16335b = -1.0f;
    }

    @Override // t2.Y
    public final boolean b() {
        return this.f16335b != -1.0f;
    }

    @Override // t2.Y
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(Y.f16371a, 1);
        bundle.putFloat(f16334c, this.f16335b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            return this.f16335b == ((O) obj).f16335b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f16335b)});
    }

    public O(float f7) {
        AbstractC1697a.c("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f16335b = f7;
    }
}
