package B1;

import Z1.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: c */
    public static final Locale[] f723c = new Locale[0];

    /* JADX INFO: renamed from: a */
    public final Locale[] f724a;

    /* JADX INFO: renamed from: b */
    public final String f725b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f724a = f723c;
            this.f725b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < localeArr.length; i7++) {
            Locale locale = localeArr[i7];
            if (locale == null) {
                throw new NullPointerException(l.o(i7, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i7 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f724a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f725b = sb.toString();
    }

    @Override // B1.i
    public final String a() {
        return this.f725b;
    }

    @Override // B1.i
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f724a;
        Locale[] localeArr2 = this.f724a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < localeArr2.length; i7++) {
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // B1.i
    public final Locale get(int i7) {
        if (i7 < 0) {
            return null;
        }
        Locale[] localeArr = this.f724a;
        if (i7 < localeArr.length) {
            return localeArr[i7];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f724a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // B1.i
    public final boolean isEmpty() {
        return this.f724a.length == 0;
    }

    @Override // B1.i
    public final int size() {
        return this.f724a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f724a;
            if (i7 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i7]);
            if (i7 < localeArr.length - 1) {
                sb.append(',');
            }
            i7++;
        }
    }
}
