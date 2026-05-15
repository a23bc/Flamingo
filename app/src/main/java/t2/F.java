package t2;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class F {
    public static final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f16206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f16207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16208k;
    public static final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f16209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f16210n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f16211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16217g;

    static {
        int i7 = w2.t.f18881a;
        h = Integer.toString(0, 36);
        f16206i = Integer.toString(1, 36);
        f16207j = Integer.toString(2, 36);
        f16208k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        f16209m = Integer.toString(5, 36);
        f16210n = Integer.toString(6, 36);
    }

    public F(E e7) {
        this.f16211a = (Uri) e7.f16202r;
        this.f16212b = e7.f16199o;
        this.f16213c = (String) e7.f16203s;
        this.f16214d = e7.f16200p;
        this.f16215e = e7.f16201q;
        this.f16216f = (String) e7.f16204t;
        this.f16217g = (String) e7.f16205u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f7 = (F) obj;
        return this.f16211a.equals(f7.f16211a) && w2.t.a(this.f16212b, f7.f16212b) && w2.t.a(this.f16213c, f7.f16213c) && this.f16214d == f7.f16214d && this.f16215e == f7.f16215e && w2.t.a(this.f16216f, f7.f16216f) && w2.t.a(this.f16217g, f7.f16217g);
    }

    public final int hashCode() {
        int iHashCode = this.f16211a.hashCode() * 31;
        String str = this.f16212b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16213c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f16214d) * 31) + this.f16215e) * 31;
        String str3 = this.f16216f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16217g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
