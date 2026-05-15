package w3;

import android.os.Bundle;

/* JADX INFO: renamed from: w3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1726g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f19194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f19195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f19196g;
    public static final String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f19197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19200d;

    static {
        int i7 = w2.t.f18881a;
        f19194e = Integer.toString(0, 36);
        f19195f = Integer.toString(1, 36);
        f19196g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public C1726g0(Bundle bundle, boolean z6, boolean z7, boolean z8) {
        this.f19197a = new Bundle(bundle);
        this.f19198b = z6;
        this.f19199c = z7;
        this.f19200d = z8;
    }

    public static C1726g0 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f19194e);
        boolean z6 = bundle.getBoolean(f19195f, false);
        boolean z7 = bundle.getBoolean(f19196g, false);
        boolean z8 = bundle.getBoolean(h, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new C1726g0(bundle2, z6, z7, z8);
    }
}
