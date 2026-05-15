package w3;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class D1 implements A1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f18958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f18959g;
    public static final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f18960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f18961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f18962k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f18965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f18967e;

    static {
        int i7 = w2.t.f18881a;
        f18958f = Integer.toString(0, 36);
        f18959g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f18960i = Integer.toString(3, 36);
        f18961j = Integer.toString(4, 36);
        f18962k = Integer.toString(5, 36);
    }

    public D1(ComponentName componentName, int i7) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        this.f18963a = i7;
        this.f18964b = 101;
        this.f18965c = componentName;
        this.f18966d = packageName;
        this.f18967e = bundle;
    }

    @Override // w3.A1
    public final int a() {
        return this.f18964b != 101 ? 0 : 2;
    }

    @Override // w3.A1
    public final int b() {
        return this.f18963a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D1)) {
            return false;
        }
        D1 d12 = (D1) obj;
        int i7 = d12.f18964b;
        int i8 = this.f18964b;
        if (i8 != i7) {
            return false;
        }
        if (i8 == 100) {
            int i9 = w2.t.f18881a;
            return true;
        }
        if (i8 != 101) {
            return false;
        }
        return w2.t.a(this.f18965c, d12.f18965c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18964b), this.f18965c, null});
    }

    @Override // w3.A1
    public final Bundle m() {
        return new Bundle(this.f18967e);
    }

    @Override // w3.A1
    public final String n() {
        return this.f18966d;
    }

    @Override // w3.A1
    public final boolean o() {
        return true;
    }

    @Override // w3.A1
    public final ComponentName p() {
        return this.f18965c;
    }

    @Override // w3.A1
    public final Object q() {
        return null;
    }

    @Override // w3.A1
    public final String r() {
        ComponentName componentName = this.f18965c;
        return componentName == null ? "" : componentName.getClassName();
    }

    @Override // w3.A1
    public final int s() {
        return 0;
    }

    @Override // w3.A1
    public final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f18958f, null);
        bundle.putInt(f18959g, this.f18963a);
        bundle.putInt(h, this.f18964b);
        bundle.putParcelable(f18960i, this.f18965c);
        bundle.putString(f18961j, this.f18966d);
        bundle.putBundle(f18962k, this.f18967e);
        return bundle;
    }

    public final String toString() {
        return "SessionToken {legacyToken=null}";
    }
}
