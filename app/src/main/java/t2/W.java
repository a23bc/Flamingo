package t2;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: j */
    public static final String f16357j;

    /* JADX INFO: renamed from: k */
    public static final String f16358k;
    public static final String l;

    /* JADX INFO: renamed from: m */
    public static final String f16359m;

    /* JADX INFO: renamed from: n */
    public static final String f16360n;

    /* JADX INFO: renamed from: o */
    public static final String f16361o;

    /* JADX INFO: renamed from: p */
    public static final String f16362p;

    /* JADX INFO: renamed from: a */
    public final Object f16363a;

    /* JADX INFO: renamed from: b */
    public final int f16364b;

    /* JADX INFO: renamed from: c */
    public final G f16365c;

    /* JADX INFO: renamed from: d */
    public final Object f16366d;

    /* JADX INFO: renamed from: e */
    public final int f16367e;

    /* JADX INFO: renamed from: f */
    public final long f16368f;

    /* JADX INFO: renamed from: g */
    public final long f16369g;
    public final int h;

    /* JADX INFO: renamed from: i */
    public final int f16370i;

    static {
        int i7 = w2.t.f18881a;
        f16357j = Integer.toString(0, 36);
        f16358k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        f16359m = Integer.toString(3, 36);
        f16360n = Integer.toString(4, 36);
        f16361o = Integer.toString(5, 36);
        f16362p = Integer.toString(6, 36);
    }

    public W(Object obj, int i7, G g6, Object obj2, int i8, long j3, long j7, int i9, int i10) {
        this.f16363a = obj;
        this.f16364b = i7;
        this.f16365c = g6;
        this.f16366d = obj2;
        this.f16367e = i8;
        this.f16368f = j3;
        this.f16369g = j7;
        this.h = i9;
        this.f16370i = i10;
    }

    public static W c(Bundle bundle) {
        int i7 = bundle.getInt(f16357j, 0);
        Bundle bundle2 = bundle.getBundle(f16358k);
        return new W(null, i7, bundle2 == null ? null : G.a(bundle2), null, bundle.getInt(l, 0), bundle.getLong(f16359m, 0L), bundle.getLong(f16360n, 0L), bundle.getInt(f16361o, -1), bundle.getInt(f16362p, -1));
    }

    public final boolean a(W w7) {
        return this.f16364b == w7.f16364b && this.f16367e == w7.f16367e && this.f16368f == w7.f16368f && this.f16369g == w7.f16369g && this.h == w7.h && this.f16370i == w7.f16370i && M3.a.L(this.f16365c, w7.f16365c);
    }

    public final W b(boolean z6, boolean z7) {
        if (z6 && z7) {
            return this;
        }
        return new W(this.f16363a, z7 ? this.f16364b : 0, z6 ? this.f16365c : null, this.f16366d, z7 ? this.f16367e : 0, z6 ? this.f16368f : 0L, z6 ? this.f16369g : 0L, z6 ? this.h : -1, z6 ? this.f16370i : -1);
    }

    public final Bundle d(int i7) {
        Bundle bundle = new Bundle();
        int i8 = this.f16364b;
        if (i7 < 3 || i8 != 0) {
            bundle.putInt(f16357j, i8);
        }
        G g6 = this.f16365c;
        if (g6 != null) {
            bundle.putBundle(f16358k, g6.b(false));
        }
        int i9 = this.f16367e;
        if (i7 < 3 || i9 != 0) {
            bundle.putInt(l, i9);
        }
        long j3 = this.f16368f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f16359m, j3);
        }
        long j7 = this.f16369g;
        if (i7 < 3 || j7 != 0) {
            bundle.putLong(f16360n, j7);
        }
        int i10 = this.h;
        if (i10 != -1) {
            bundle.putInt(f16361o, i10);
        }
        int i11 = this.f16370i;
        if (i11 != -1) {
            bundle.putInt(f16362p, i11);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W.class == obj.getClass()) {
            W w7 = (W) obj;
            if (a(w7) && M3.a.L(this.f16363a, w7.f16363a) && M3.a.L(this.f16366d, w7.f16366d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16363a, Integer.valueOf(this.f16364b), this.f16365c, this.f16366d, Integer.valueOf(this.f16367e), Long.valueOf(this.f16368f), Long.valueOf(this.f16369g), Integer.valueOf(this.h), Integer.valueOf(this.f16370i)});
    }
}
