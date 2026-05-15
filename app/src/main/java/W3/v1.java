package w3;

import E4.AbstractC0119q;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: d */
    public static final E4.b0 f19378d = E4.I.t(40010);

    /* JADX INFO: renamed from: e */
    public static final E4.b0 f19379e;

    /* JADX INFO: renamed from: f */
    public static final String f19380f;

    /* JADX INFO: renamed from: g */
    public static final String f19381g;
    public static final String h;

    /* JADX INFO: renamed from: a */
    public final int f19382a;

    /* JADX INFO: renamed from: b */
    public final String f19383b;

    /* JADX INFO: renamed from: c */
    public final Bundle f19384c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        AbstractC0119q.c(7, objArr);
        f19379e = E4.I.n(7, objArr);
        int i7 = w2.t.f18881a;
        f19380f = Integer.toString(0, 36);
        f19381g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public v1(int i7) {
        AbstractC1697a.c("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f19382a = i7;
        this.f19383b = "";
        this.f19384c = Bundle.EMPTY;
    }

    public static v1 a(Bundle bundle) {
        int i7 = bundle.getInt(f19380f, 0);
        if (i7 != 0) {
            return new v1(i7);
        }
        String string = bundle.getString(f19381g);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new v1(string, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f19380f, this.f19382a);
        bundle.putString(f19381g, this.f19383b);
        bundle.putBundle(h, this.f19384c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f19382a == v1Var.f19382a && TextUtils.equals(this.f19383b, v1Var.f19383b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19383b, Integer.valueOf(this.f19382a)});
    }

    public v1(String str, Bundle bundle) {
        this.f19382a = 0;
        str.getClass();
        this.f19383b = str;
        bundle.getClass();
        this.f19384c = new Bundle(bundle);
    }
}
