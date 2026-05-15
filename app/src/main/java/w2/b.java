package w2;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f18831a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f18832b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f18833c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f18834d;

    static {
        HashMap map = new HashMap();
        f18834d = map;
        n1.c.y(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        n1.c.y(-983041, map, "azure", -657956, "beige");
        n1.c.y(-6972, map, "bisque", -16777216, "black");
        n1.c.y(-5171, map, "blanchedalmond", -16776961, "blue");
        n1.c.y(-7722014, map, "blueviolet", -5952982, "brown");
        n1.c.y(-2180985, map, "burlywood", -10510688, "cadetblue");
        n1.c.y(-8388864, map, "chartreuse", -2987746, "chocolate");
        n1.c.y(-32944, map, "coral", -10185235, "cornflowerblue");
        n1.c.y(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        n1.c.y(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        n1.c.y(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        n1.c.y(-29696, map, "darkorange", -6737204, "darkorchid");
        n1.c.y(-7667712, map, "darkred", -1468806, "darksalmon");
        n1.c.y(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        n1.c.y(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        n1.c.y(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        n1.c.y(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        n1.c.y(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        n1.c.y(-38476, map, "hotpink", -3318692, "indianred");
        n1.c.y(-11861886, map, "indigo", -16, "ivory");
        n1.c.y(-989556, map, "khaki", -1644806, "lavender");
        n1.c.y(-3851, map, "lavenderblush", -8586240, "lawngreen");
        n1.c.y(-1331, map, "lemonchiffon", -5383962, "lightblue");
        n1.c.y(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        n1.c.y(-18751, map, "lightpink", -24454, "lightsalmon");
        n1.c.y(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        n1.c.y(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        n1.c.y(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        n1.c.y(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        n1.c.y(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        n1.c.y(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        n1.c.y(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        n1.c.y(-15132304, map, "midnightblue", -655366, "mintcream");
        n1.c.y(-6943, map, "mistyrose", -6987, "moccasin");
        n1.c.y(-8531, map, "navajowhite", -16777088, "navy");
        n1.c.y(-133658, map, "oldlace", -8355840, "olive");
        n1.c.y(-9728477, map, "olivedrab", -23296, "orange");
        n1.c.y(-47872, map, "orangered", -2461482, "orchid");
        n1.c.y(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        n1.c.y(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        n1.c.y(-4139, map, "papayawhip", -9543, "peachpuff");
        n1.c.y(-3308225, map, "peru", -16181, "pink");
        n1.c.y(-2252579, map, "plum", -5185306, "powderblue");
        n1.c.y(-8388480, map, "purple", -10079335, "rebeccapurple");
        n1.c.y(-65536, map, "red", -4419697, "rosybrown");
        n1.c.y(-12490271, map, "royalblue", -7650029, "saddlebrown");
        n1.c.y(-360334, map, "salmon", -744352, "sandybrown");
        n1.c.y(-13726889, map, "seagreen", -2578, "seashell");
        n1.c.y(-6270419, map, "sienna", -4144960, "silver");
        n1.c.y(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        n1.c.y(-12156236, map, "steelblue", -2968436, "tan");
        n1.c.y(-16744320, map, "teal", -2572328, "thistle");
        n1.c.y(-40121, map, "tomato", 0, "transparent");
        n1.c.y(-12525360, map, "turquoise", -1146130, "violet");
        n1.c.y(-663885, map, "wheat", -1, "white");
        n1.c.y(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z6) {
        int i7;
        AbstractC1697a.d(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i8 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i8;
            }
            if (strReplace.length() == 9) {
                return ((i8 & 255) << 24) | (i8 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z6 ? f18833c : f18832b).matcher(strReplace);
            if (matcher.matches()) {
                if (z6) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i7 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i7 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i9 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i10 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i7, i9, i10, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f18831a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i11 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i12 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i11, i12, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f18834d.get(I0.c.V(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
