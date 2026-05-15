package F5;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f2368j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f2369k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f2370m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2377g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2378i;

    public j(String str, String str2, long j3, String str3, String str4, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f2371a = str;
        this.f2372b = str2;
        this.f2373c = j3;
        this.f2374d = str3;
        this.f2375e = str4;
        this.f2376f = z6;
        this.f2377g = z7;
        this.h = z8;
        this.f2378i = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC1209k.a(jVar.f2371a, this.f2371a) && AbstractC1209k.a(jVar.f2372b, this.f2372b) && jVar.f2373c == this.f2373c && AbstractC1209k.a(jVar.f2374d, this.f2374d) && AbstractC1209k.a(jVar.f2375e, this.f2375e) && jVar.f2376f == this.f2376f && jVar.f2377g == this.f2377g && jVar.h == this.h && jVar.f2378i == this.f2378i;
    }

    public final int hashCode() {
        int iC = A0.e.C(this.f2372b, A0.e.C(this.f2371a, 527, 31), 31);
        long j3 = this.f2373c;
        return ((((((A0.e.C(this.f2375e, A0.e.C(this.f2374d, (iC + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31), 31) + (this.f2376f ? 1231 : 1237)) * 31) + (this.f2377g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.f2378i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2371a);
        sb.append('=');
        sb.append(this.f2372b);
        if (this.h) {
            long j3 = this.f2373c;
            if (j3 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) K5.d.f4074a.get()).format(new Date(j3));
                AbstractC1209k.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f2378i) {
            sb.append("; domain=");
            sb.append(this.f2374d);
        }
        sb.append("; path=");
        sb.append(this.f2375e);
        if (this.f2376f) {
            sb.append("; secure");
        }
        if (this.f2377g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "toString()");
        return string;
    }
}
