package N2;

import b3.C0689e;
import b3.C0695k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t2.L;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f5082c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5083a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5084b = -1;

    public final boolean a(String str) {
        Matcher matcher = f5082c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i7 = w2.t.f18881a;
            int i8 = Integer.parseInt(strGroup, 16);
            int i9 = Integer.parseInt(matcher.group(2), 16);
            if (i8 <= 0 && i9 <= 0) {
                return false;
            }
            this.f5083a = i8;
            this.f5084b = i9;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(L l) {
        int i7 = 0;
        while (true) {
            t2.K[] kArr = l.f16328o;
            if (i7 >= kArr.length) {
                return;
            }
            t2.K k7 = kArr[i7];
            if (k7 instanceof C0689e) {
                C0689e c0689e = (C0689e) k7;
                if ("iTunSMPB".equals(c0689e.f10374q) && a(c0689e.f10375r)) {
                    return;
                }
            } else if (k7 instanceof C0695k) {
                C0695k c0695k = (C0695k) k7;
                if ("com.apple.iTunes".equals(c0695k.f10387p) && "iTunSMPB".equals(c0695k.f10388q) && a(c0695k.f10389r)) {
                    return;
                }
            } else {
                continue;
            }
            i7++;
        }
    }
}
