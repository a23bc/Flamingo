package F5;

import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f2324n = new c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f2325o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2332g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2335k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2336m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC1209k.f(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f2325o = new c(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public c(boolean z6, boolean z7, int i7, int i8, boolean z8, boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, String str) {
        this.f2326a = z6;
        this.f2327b = z7;
        this.f2328c = i7;
        this.f2329d = i8;
        this.f2330e = z8;
        this.f2331f = z9;
        this.f2332g = z10;
        this.h = i9;
        this.f2333i = i10;
        this.f2334j = z11;
        this.f2335k = z12;
        this.l = z13;
        this.f2336m = str;
    }

    public final String toString() {
        String str = this.f2336m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2326a) {
            sb.append("no-cache, ");
        }
        if (this.f2327b) {
            sb.append("no-store, ");
        }
        int i7 = this.f2328c;
        if (i7 != -1) {
            sb.append("max-age=");
            sb.append(i7);
            sb.append(", ");
        }
        int i8 = this.f2329d;
        if (i8 != -1) {
            sb.append("s-maxage=");
            sb.append(i8);
            sb.append(", ");
        }
        if (this.f2330e) {
            sb.append("private, ");
        }
        if (this.f2331f) {
            sb.append("public, ");
        }
        if (this.f2332g) {
            sb.append("must-revalidate, ");
        }
        int i9 = this.h;
        if (i9 != -1) {
            sb.append("max-stale=");
            sb.append(i9);
            sb.append(", ");
        }
        int i10 = this.f2333i;
        if (i10 != -1) {
            sb.append("min-fresh=");
            sb.append(i10);
            sb.append(", ");
        }
        if (this.f2334j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2335k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        AbstractC1209k.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f2336m = string;
        return string;
    }
}
