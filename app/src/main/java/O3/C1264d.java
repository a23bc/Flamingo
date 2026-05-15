package o3;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: renamed from: o3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1264d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f14683a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f14684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f14685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f14686d;

    static {
        int i7 = t.f18881a;
        Locale locale = Locale.US;
        f14684b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f14685c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f14686d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f14684b.matcher(str);
        Matcher matcher2 = f14685c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AbstractC1697a.q("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f7 = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f7, Float.parseFloat(strGroup2.trim()));
    }
}
