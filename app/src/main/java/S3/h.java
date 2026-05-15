package s3;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.AbstractC1113a;
import w2.AbstractC1697a;
import w2.m;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f15908a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f15909b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f15910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f15911d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f15910c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f15911d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i7;
        int length;
        int i8;
        int i9;
        int i10;
        int i11;
        i7 = eVar.f15893b;
        length = spannableStringBuilder.length();
        String str2 = eVar.f15892a;
        str2.getClass();
        i8 = -1;
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i7, length, 33);
                break;
            case "c":
                for (String str3 : eVar.f15895d) {
                    Map map = f15910c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i7, length, 33);
                    } else {
                        Map map2 = f15911d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i7, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i7, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f15889c);
                int i12 = eVar.f15893b;
                int i13 = 0;
                int length2 = 0;
                while (i13 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i13)).f15890a.f15892a)) {
                        d dVar = (d) arrayList.get(i13);
                        int iC2 = c(list2, str, dVar.f15890a);
                        if (iC2 == i8) {
                            iC2 = iC != i8 ? iC : 1;
                        }
                        int i14 = dVar.f15890a.f15893b - length2;
                        int i15 = dVar.f15891b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i14, i15);
                        spannableStringBuilder.delete(i14, i15);
                        spannableStringBuilder.setSpan(new v2.f(charSequenceSubSequence.toString(), iC2), i12, i14, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i12 = i14;
                    }
                    i13++;
                    i8 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, eVar);
        for (int i16 = 0; i16 < arrayListB.size(); i16++) {
            C1432b c1432b = ((f) arrayListB.get(i16)).f15897p;
            int i17 = c1432b.l;
            if (i17 == -1 && c1432b.f15881m == -1) {
                i9 = -1;
            } else {
                i9 = (c1432b.f15881m == 1 ? (char) 2 : (char) 0) | (i17 == 1 ? (char) 1 : (char) 0);
            }
            if (i9 != -1) {
                int i18 = c1432b.l;
                if (i18 == -1 && c1432b.f15881m == -1) {
                    i11 = -1;
                    i10 = 1;
                } else {
                    i10 = 1;
                    i11 = (i18 == 1 ? 1 : 0) | (c1432b.f15881m == 1 ? 2 : 0);
                }
                AbstractC1113a.s(spannableStringBuilder, new StyleSpan(i11), i7, length);
            } else {
                i10 = 1;
            }
            if (c1432b.f15879j == i10) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i7, length, 33);
            }
            if (c1432b.f15880k == i10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
            }
            if (c1432b.f15877g) {
                if (!c1432b.f15877g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC1113a.s(spannableStringBuilder, new ForegroundColorSpan(c1432b.f15876f), i7, length);
            }
            if (c1432b.f15878i) {
                if (!c1432b.f15878i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC1113a.s(spannableStringBuilder, new BackgroundColorSpan(c1432b.h), i7, length);
            }
            if (c1432b.f15875e != null) {
                AbstractC1113a.s(spannableStringBuilder, new TypefaceSpan(c1432b.f15875e), i7, length);
            }
            int i19 = c1432b.f15882n;
            if (i19 == 1) {
                AbstractC1113a.s(spannableStringBuilder, new AbsoluteSizeSpan((int) c1432b.f15883o, true), i7, length);
            } else if (i19 == 2) {
                AbstractC1113a.s(spannableStringBuilder, new RelativeSizeSpan(c1432b.f15883o), i7, length);
            } else if (i19 == 3) {
                AbstractC1113a.s(spannableStringBuilder, new RelativeSizeSpan(c1432b.f15883o / 100.0f), i7, length);
            }
            if (c1432b.f15885q) {
                spannableStringBuilder.setSpan(new v2.e(), i7, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList b(java.util.List r8, java.lang.String r9, s3.e r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            s3.b r3 = (s3.C1432b) r3
            java.lang.String r4 = r10.f15892a
            java.lang.String r5 = r3.f15871a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f15872b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set r5 = r3.f15873c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f15874d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.f15871a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = s3.C1432b.a(r5, r1, r6, r9)
            java.lang.String r6 = r3.f15872b
            r7 = 2
            int r4 = s3.C1432b.a(r6, r5, r7, r4)
            java.lang.String r5 = r3.f15874d
            java.lang.String r6 = r10.f15894c
            r7 = 4
            int r4 = s3.C1432b.a(r5, r4, r7, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set r5 = r3.f15873c
            java.util.Set r6 = r10.f15895d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set r5 = r3.f15873c
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 <= 0) goto L74
            s3.f r5 = new s3.f
            r5.<init>(r4, r3)
            r0.add(r5)
        L74:
            int r2 = r2 + 1
            goto L7
        L77:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.h.b(java.util.List, java.lang.String, s3.e):java.util.ArrayList");
    }

    public static int c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i7 = 0; i7 < arrayListB.size(); i7++) {
            int i8 = ((f) arrayListB.get(i7)).f15897p.f15884p;
            if (i8 != -1) {
                return i8;
            }
        }
        return -1;
    }

    public static C1433c d(String str, Matcher matcher, m mVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            gVar.f15898a = i.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            gVar.f15899b = i.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, gVar);
            StringBuilder sb = new StringBuilder();
            mVar.getClass();
            String strH = mVar.h(D4.d.f1569c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = mVar.h(D4.d.f1569c);
            }
            gVar.f15900c = f(str, sb.toString(), arrayList);
            return new C1433c(gVar.a().a(), gVar.f15898a, gVar.f15899b);
        } catch (NumberFormatException unused) {
            AbstractC1697a.w("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, g gVar) {
        int i7;
        String strSubstring;
        int i8;
        int i9;
        Matcher matcher = f15909b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, gVar);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i7 = 2;
                            break;
                        case "end":
                            i7 = 3;
                            break;
                        case "left":
                            i7 = 4;
                            break;
                        case "right":
                            i7 = 5;
                            break;
                        case "start":
                            i7 = 1;
                            break;
                        default:
                            AbstractC1697a.w("Invalid alignment value: ".concat(strGroup2));
                            i7 = 2;
                            break;
                    }
                    gVar.f15901d = i7;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "line-left":
                            case "start":
                                i8 = 0;
                                break;
                            case "center":
                            case "middle":
                                i8 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i8 = 2;
                                break;
                            default:
                                AbstractC1697a.w("Invalid anchor value: ".concat(strSubstring));
                                i8 = Integer.MIN_VALUE;
                                break;
                        }
                        gVar.f15905i = i8;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    gVar.h = i.a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    gVar.f15906j = i.a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i9 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i9 = 1;
                    } else {
                        AbstractC1697a.w("Invalid 'vertical' value: ".concat(strGroup2));
                        i9 = Integer.MIN_VALUE;
                    }
                    gVar.f15907k = i9;
                } else {
                    AbstractC1697a.w("Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                AbstractC1697a.w("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0105. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SpannedString f(String str, String str2, List list) {
        String strSubstring;
        int i7;
        char c7;
        int i8 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (true) {
            String strTrim = "";
            if (i9 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i9);
            if (cCharAt == '&') {
                i9++;
                int iIndexOf = str2.indexOf(59, i9);
                int iIndexOf2 = str2.indexOf(32, i9);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(i9, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC1697a.w("ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i9 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i9++;
            } else {
                int length = i9 + 1;
                if (length < str2.length()) {
                    boolean z6 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i10 = length - 2;
                    boolean z7 = str2.charAt(i10) == '/';
                    int i11 = i9 + (z6 ? i8 : 1);
                    if (!z7) {
                        i10 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i11, i10);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        AbstractC1697a.d(!strTrim2.isEmpty());
                        int i12 = t.f18881a;
                        String str3 = strTrim2.split("[ \\.]", i8)[0];
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case 98:
                                i7 = str3.equals("b") ? 0 : -1;
                                break;
                            case 99:
                                i7 = str3.equals("c") ? 1 : -1;
                                break;
                            case 105:
                                i7 = str3.equals("i") ? i8 : -1;
                                break;
                            case 117:
                                i7 = str3.equals("u") ? 3 : -1;
                                break;
                            case 118:
                                i7 = str3.equals("v") ? 4 : -1;
                                break;
                            case 3650:
                                i7 = str3.equals("rt") ? 5 : -1;
                                break;
                            case 3314158:
                                i7 = str3.equals("lang") ? 6 : -1;
                                break;
                            case 3511770:
                                i7 = str3.equals("ruby") ? 7 : -1;
                                break;
                            default:
                                i7 = -1;
                                break;
                        }
                        switch (i7) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z6) {
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.f15892a.equals(str3)) {
                                            break;
                                        }
                                    }
                                } else if (!z7) {
                                    int length2 = spannableStringBuilder.length();
                                    String strTrim3 = strSubstring2.trim();
                                    AbstractC1697a.d(!strTrim3.isEmpty());
                                    int iIndexOf4 = strTrim3.indexOf(" ");
                                    if (iIndexOf4 == -1) {
                                        c7 = 0;
                                    } else {
                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                        c7 = 0;
                                        strTrim3 = strTrim3.substring(0, iIndexOf4);
                                    }
                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                    String str4 = strArrSplit[c7];
                                    HashSet hashSet = new HashSet();
                                    for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                                        hashSet.add(strArrSplit[i13]);
                                    }
                                    arrayDeque.push(new e(str4, length2, strTrim, hashSet));
                                }
                                break;
                        }
                    }
                    i9 = length;
                }
                i9 = length;
            }
            i8 = 2;
        }
    }

    public static void g(String str, g gVar) {
        String strSubstring;
        int i7 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i7 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i7 = 0;
                    break;
                default:
                    AbstractC1697a.w("Invalid anchor value: ".concat(strSubstring));
                    i7 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f15904g = i7;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            gVar.f15902e = i.a(str);
            gVar.f15903f = 0;
        } else {
            gVar.f15902e = Integer.parseInt(str);
            gVar.f15903f = 1;
        }
    }
}
