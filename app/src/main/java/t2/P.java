package t2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class P extends Exception {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f16336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f16337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f16338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f16339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f16340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f16341w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f16342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f16343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bundle f16344q;

    static {
        int i7 = w2.t.f18881a;
        f16336r = Integer.toString(0, 36);
        f16337s = Integer.toString(1, 36);
        f16338t = Integer.toString(2, 36);
        f16339u = Integer.toString(3, 36);
        f16340v = Integer.toString(4, 36);
        f16341w = Integer.toString(5, 36);
    }

    public P(String str, Throwable th, int i7, Bundle bundle, long j3) {
        super(str, th);
        this.f16342o = i7;
        this.f16344q = bundle;
        this.f16343p = j3;
    }

    public boolean a(P p7) {
        if (this == p7) {
            return true;
        }
        if (p7 != null && getClass() == p7.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = p7.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!w2.t.a(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.f16342o == p7.f16342o && w2.t.a(getMessage(), p7.getMessage()) && this.f16343p == p7.f16343p) {
                return true;
            }
        }
        return false;
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16336r, this.f16342o);
        bundle.putLong(f16337s, this.f16343p);
        bundle.putString(f16338t, getMessage());
        bundle.putBundle(f16341w, this.f16344q);
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f16339u, cause.getClass().getName());
            bundle.putString(f16340v, cause.getMessage());
        }
        return bundle;
    }
}
