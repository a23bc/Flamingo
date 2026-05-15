package F5;

import java.util.Comparator;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC1209k.f(str, "a");
        AbstractC1209k.f(str2, "b");
        int iMin = Math.min(str.length(), str2.length());
        for (int i7 = 4; i7 < iMin; i7++) {
            char cCharAt = str.charAt(i7);
            char cCharAt2 = str2.charAt(i7);
            if (cCharAt != cCharAt2) {
                return AbstractC1209k.g(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
