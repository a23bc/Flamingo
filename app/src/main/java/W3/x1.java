package w3;

import android.os.Bundle;
import java.util.Objects;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f19391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f19392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f19393f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f19396c;

    static {
        int i7 = w2.t.f18881a;
        f19391d = Integer.toString(0, 36);
        f19392e = Integer.toString(1, 36);
        f19393f = Integer.toString(2, 36);
    }

    public x1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public static x1 a(Bundle bundle) {
        int i7 = bundle.getInt(f19391d, 1000);
        String string = bundle.getString(f19392e, "");
        Bundle bundle2 = bundle.getBundle(f19393f);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new x1(string, i7, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f19391d, this.f19394a);
        bundle.putString(f19392e, this.f19395b);
        Bundle bundle2 = this.f19396c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f19393f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.f19394a == x1Var.f19394a && Objects.equals(this.f19395b, x1Var.f19395b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f19394a), this.f19395b);
    }

    public x1(String str, int i7, Bundle bundle) {
        boolean z6 = true;
        if (i7 >= 0 && i7 != 1) {
            z6 = false;
        }
        AbstractC1697a.d(z6);
        this.f19394a = i7;
        this.f19395b = str;
        this.f19396c = bundle;
    }
}
