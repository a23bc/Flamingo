package t2;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Y {

    /* JADX INFO: renamed from: d */
    public static final String f16408d;

    /* JADX INFO: renamed from: e */
    public static final String f16409e;

    /* JADX INFO: renamed from: b */
    public final boolean f16410b;

    /* JADX INFO: renamed from: c */
    public final boolean f16411c;

    static {
        int i7 = w2.t.f18881a;
        f16408d = Integer.toString(1, 36);
        f16409e = Integer.toString(2, 36);
    }

    public b0() {
        this.f16410b = false;
        this.f16411c = false;
    }

    @Override // t2.Y
    public final boolean b() {
        return this.f16410b;
    }

    @Override // t2.Y
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(Y.f16371a, 3);
        bundle.putBoolean(f16408d, this.f16410b);
        bundle.putBoolean(f16409e, this.f16411c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f16411c == b0Var.f16411c && this.f16410b == b0Var.f16410b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f16410b), Boolean.valueOf(this.f16411c)});
    }

    public b0(boolean z6) {
        this.f16410b = true;
        this.f16411c = z6;
    }
}
