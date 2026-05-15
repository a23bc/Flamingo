package w3;

import android.os.Bundle;
import android.os.SystemClock;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: e */
    public static final String f19430e;

    /* JADX INFO: renamed from: f */
    public static final String f19431f;

    /* JADX INFO: renamed from: g */
    public static final String f19432g;
    public static final String h;

    /* JADX INFO: renamed from: a */
    public final int f19433a;

    /* JADX INFO: renamed from: b */
    public final Bundle f19434b;

    /* JADX INFO: renamed from: c */
    public final long f19435c;

    /* JADX INFO: renamed from: d */
    public final x1 f19436d;

    static {
        int i7 = w2.t.f18881a;
        f19430e = Integer.toString(0, 36);
        f19431f = Integer.toString(1, 36);
        f19432g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public z1(int i7) {
        this(i7, Bundle.EMPTY);
    }

    public static z1 a(Bundle bundle) {
        int i7 = bundle.getInt(f19430e, -1);
        Bundle bundle2 = bundle.getBundle(f19431f);
        long j3 = bundle.getLong(f19432g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        x1 x1VarA = bundle3 != null ? x1.a(bundle3) : i7 != 0 ? new x1(i7) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new z1(i7, bundle2, j3, x1VarA);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f19430e, this.f19433a);
        bundle.putBundle(f19431f, this.f19434b);
        bundle.putLong(f19432g, this.f19435c);
        x1 x1Var = this.f19436d;
        if (x1Var != null) {
            bundle.putBundle(h, x1Var.b());
        }
        return bundle;
    }

    public z1(int i7, Bundle bundle) {
        this(i7, bundle, SystemClock.elapsedRealtime(), null);
    }

    public z1(int i7, Bundle bundle, long j3, x1 x1Var) {
        AbstractC1697a.d(x1Var == null || i7 < 0);
        this.f19433a = i7;
        this.f19434b = new Bundle(bundle);
        this.f19435c = j3;
        if (x1Var == null && i7 < 0) {
            x1Var = new x1(i7);
        }
        this.f19436d = x1Var;
    }
}
