package B1;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f721b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f722a;

    public g(i iVar) {
        this.f722a = iVar;
    }

    public static g a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new g(new j(f.a(localeArr))) : new g(new h(localeArr));
    }

    public static g b(String str) {
        if (str == null || str.isEmpty()) {
            return f721b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArrSplit[i7];
            int i8 = e.f720a;
            localeArr[i7] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f722a.equals(((g) obj).f722a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f722a.hashCode();
    }

    public final String toString() {
        return this.f722a.toString();
    }
}
