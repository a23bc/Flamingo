package w3;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class C1 implements A1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f18937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f18938k;
    public static final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f18939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f18940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f18941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f18942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f18943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f18944r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComponentName f18951g;
    public final IBinder h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f18952i;

    static {
        int i7 = w2.t.f18881a;
        f18937j = Integer.toString(0, 36);
        f18938k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        f18939m = Integer.toString(3, 36);
        f18940n = Integer.toString(4, 36);
        f18941o = Integer.toString(5, 36);
        f18942p = Integer.toString(6, 36);
        f18943q = Integer.toString(7, 36);
        f18944r = Integer.toString(8, 36);
    }

    public C1(int i7, int i8, int i9, int i10, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle) {
        this.f18945a = i7;
        this.f18946b = i8;
        this.f18947c = i9;
        this.f18948d = i10;
        this.f18949e = str;
        this.f18950f = str2;
        this.f18951g = componentName;
        this.h = iBinder;
        this.f18952i = bundle;
    }

    @Override // w3.A1
    public final int a() {
        return this.f18946b;
    }

    @Override // w3.A1
    public final int b() {
        return this.f18945a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1)) {
            return false;
        }
        C1 c12 = (C1) obj;
        return this.f18945a == c12.f18945a && this.f18946b == c12.f18946b && this.f18947c == c12.f18947c && this.f18948d == c12.f18948d && TextUtils.equals(this.f18949e, c12.f18949e) && TextUtils.equals(this.f18950f, c12.f18950f) && w2.t.a(this.f18951g, c12.f18951g) && w2.t.a(this.h, c12.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18945a), Integer.valueOf(this.f18946b), Integer.valueOf(this.f18947c), Integer.valueOf(this.f18948d), this.f18949e, this.f18950f, this.f18951g, this.h});
    }

    @Override // w3.A1
    public final Bundle m() {
        return new Bundle(this.f18952i);
    }

    @Override // w3.A1
    public final String n() {
        return this.f18949e;
    }

    @Override // w3.A1
    public final boolean o() {
        return false;
    }

    @Override // w3.A1
    public final ComponentName p() {
        return this.f18951g;
    }

    @Override // w3.A1
    public final Object q() {
        return this.h;
    }

    @Override // w3.A1
    public final String r() {
        return this.f18950f;
    }

    @Override // w3.A1
    public final int s() {
        return this.f18948d;
    }

    @Override // w3.A1
    public final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putInt(f18937j, this.f18945a);
        bundle.putInt(f18938k, this.f18946b);
        bundle.putInt(l, this.f18947c);
        bundle.putString(f18939m, this.f18949e);
        bundle.putString(f18940n, this.f18950f);
        bundle.putBinder(f18942p, this.h);
        bundle.putParcelable(f18941o, this.f18951g);
        bundle.putBundle(f18943q, this.f18952i);
        bundle.putInt(f18944r, this.f18948d);
        return bundle;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.f18949e + " type=" + this.f18946b + " libraryVersion=" + this.f18947c + " interfaceVersion=" + this.f18948d + " service=" + this.f18950f + " IMediaSession=" + this.h + " extras=" + this.f18952i + "}";
    }
}
