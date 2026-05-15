package B1;

import android.os.Build;
import java.util.Locale;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            a.b(30);
        }
        if (i7 >= 30) {
            a.b(31);
        }
        if (i7 >= 30) {
            a.b(33);
        }
        if (i7 >= 30) {
            a.b(1000000);
        }
    }

    public static final boolean a(String str) {
        String str2 = Build.VERSION.CODENAME;
        AbstractC1209k.f(str2, "buildCodename");
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        AbstractC1209k.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        AbstractC1209k.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            return true;
        }
        if (i7 < 30) {
            return false;
        }
        AbstractC1209k.e(Build.VERSION.CODENAME, "CODENAME");
        return a("S");
    }

    public static final boolean c() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            return true;
        }
        if (i7 < 34) {
            return false;
        }
        AbstractC1209k.e(Build.VERSION.CODENAME, "CODENAME");
        return a("VanillaIceCream");
    }
}
