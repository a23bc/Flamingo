package t2;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16722e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16724c;

    static {
        int i7 = w2.t.f18881a;
        f16721d = Integer.toString(1, 36);
        f16722e = Integer.toString(2, 36);
    }

    public r() {
        this.f16723b = false;
        this.f16724c = false;
    }

    @Override // t2.Y
    public final boolean b() {
        return this.f16723b;
    }

    @Override // t2.Y
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(Y.f16371a, 0);
        bundle.putBoolean(f16721d, this.f16723b);
        bundle.putBoolean(f16722e, this.f16724c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f16724c == rVar.f16724c && this.f16723b == rVar.f16723b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f16723b), Boolean.valueOf(this.f16724c)});
    }

    public r(boolean z6) {
        this.f16723b = true;
        this.f16724c = z6;
    }
}
