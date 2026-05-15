package k;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static B1.g b(Configuration configuration) {
        return B1.g.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(B1.g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f722a.a()));
    }

    public static void d(Configuration configuration, B1.g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(gVar.f722a.a()));
    }
}
